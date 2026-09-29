# What could explain the NYT precision gap?

This analysis distinguishes implementation correctness, a mismatch with the paper's stated model, underspecified choices, and evaluation differences. It concerns the existing corrected NYT run and the separately isolated experiments in this directory. The raw source and outputs remain; the baseline’s semantic grades and derived precision calculations were subsequently retired.

Sources: [the paper](../../../resources/russell-2016-the-physics-of-text.pdf), especially pp. 3–5; the [frozen source snapshot](../baseline/src/main/java/org/ucb/generative_ie/); the [retirement record for the baseline evaluation](../../../reports/buggy-evaluation-cleanup-2026-09-28/README.md). The relevant PDF pages were read as text and visually inspected. Statements below about the paper describe what it specifies, not a claim to have recovered its unpublished experimental configuration.

## What the 95% comparison can and cannot establish

The paper reports approximately 8,500 NYT sentences chosen to contain relatively few distinct entity mentions, about ten minutes of smart–dumb/dumb–smart MCMC, inspection of its most likely sampled world, roughly 200 inferred relations, and manual verification of all facts for its 20 most common relations. It reports roughly 95% precision. It gives one subsidiary dictionary, two example facts, and a count of 60 subsidiary facts. It does not provide the complete 20-relation judgment set, the precise denominator, reviewer instructions, treatment of doubtful facts, seed, chain length in proposals, or numeric Dirichlet/Beta hyperparameters.

## Literal entities versus an inferred noun-emission model

The paper's elementary model, p. 3, says that the arguments are mentioned verbatim as named entities. It explicitly defers generative named-entity mention models to later versions; p. 5 again lists entity-reference machinery among extensions. The implemented NYT experiment instead has a noun dictionary for each latent entity and performs entity inference.

Let \(V\) be the number of literal names and \(\alpha\) the concentration **per name**. The implemented dictionary is

\[
L_e\sim\operatorname{Dirichlet}(\alpha,\ldots,\alpha),\qquad A=V\alpha,
\]

and, after integrating it out, its ordered-mention likelihood is

\[
\ell(n_e)=\frac{\Gamma(A)}{\Gamma(A+n_e)}
\prod_{v=1}^{V}\frac{\Gamma(\alpha+n_{ev})}{\Gamma(\alpha)}.
\]

No multinomial coefficient belongs here: the individual mention positions are observed, not just an unordered count event. With the current settings, \(V=1199\), \(\alpha=0.001\), hence \(A=1.199\). A small per-name alpha therefore does not make a new name impossible for an entity.

For two different names occurring only once each, compare two separate pure entities to one merged entity. The noun-likelihood Bayes factor is

\[
\frac{\ell(1,1)}{\ell(1)\ell(1)}
=\frac{A}{A+1}=0.54525.
\]

The noun likelihood opposes merging, but by less than a factor of two. For pure entities with different names repeated \(r\) and \(s\) times, the factor becomes

\[
\mathrm{BF}_{\rm noun}(r,s)
=\frac{\Gamma(A+r)\Gamma(A+s)}{\Gamma(A)\Gamma(A+r+s)}.
\]

For \(r=s=2,5,10\) it is about 0.1963, 0.005364 and 0.000008261. Rare names are much less protected against mergers than common names.

The preliminary entity phase further assumes uniform choice among \(N\) entities for each of the \(M=17,032\) mentions. Its likelihood contains \(N^{-M}\). A merge from \(N=1199\) to 1198 multiplies this term by

\[
\left(\frac{1199}{1198}\right)^{17032}\approx1{,}485{,}256.
\]

Even in an all-occupied example including the unlabelled count factor \(N!/(N-K)!\), whose merge ratio is \(1/1199\), the combined target ratio for two distinct singleton names is about 676 after the nearly neutral count prior. This is an illustrative **target-density ratio under those assumptions, not a Metropolis–Hastings acceptance probability**. Actual acceptance additionally includes the forward/reverse proposal ratio. The smart entity samplers use labelled-state ratios and separate proposal bookkeeping; their comments state that the permutation factor cancels. Correct treatment of those measures is a separate kernel audit, and the calculation here does not establish their stationary distribution. The mechanism requiring attention is the strong count preference together with weak noun evidence for rare names.

There is another mismatch: the preliminary entity phase targets a model using \(N^{-M}\) while relation inference targets a fact-based model using \(F^{-S}\). Entity births/splits occur in the first phase, while the later phase keeps the entity count fixed. The whole two-phase procedure is not one stationary sampler for the stated full joint; the first phase acts as a model-dependent initialization and can leave an incorrect entity count for the relation phase to work with.

**A paper-literal ablation must do two things:** skip the entity phase and prevent argument-entity updates during the relation phase. Merely setting `entityFraction=0` is insufficient: `SentenceOriginRV.sample` resamples the relation and then both argument entities among existing compatible facts. Under literal naming, define a fixed injective map \(h\) from observed names to entities and constrain every origin to \((r,h(a_1),h(a_2))\). The noun likelihood and entity-count prior then stay constant while relation/fact assignments change. This is a justified alternative model, not a correction to the mathematics of the more general noun-emission model.

Relevant locations in the frozen snapshot: `experiments/EntityResolution.java` (two phases), `world/SentenceEvidence.java:evidenceToWorldByNoun` (initial literal mapping), `mcmc/SentenceOriginRV.java:sample` and `entityLogWeights` (later identity changes), `world/WorldProb.java:logProbLabeledEntityWorld`, `logProbEntityWorld`, `logCollapsedNouns` (objectives), and `mh/EntitySmartMergeStep.java:logStateRatio` (labelled-state calculation).

### What the saved errors say about identities

The corrected MAP has 1,007 expressed entity IDs; 440 emit more than one literal name. Multiple names can be legitimate aliases, so this is a flag, not 440 proven errors. Nevertheless there are explicit collisions: an entity mixing MCI, Bush and Futures Group; one combining San Diego Padres with Philadelphia Phillies; and one combining a Knicks team reference with Kidd. Their raw MAP evidence remains; associated semantic grading was retired.

## Per-path versus total Dirichlet concentration

The paper specifies a Dirichlet prior for each relation dictionary without its vector or numeric hyperparameters. The code uses a symmetric prior with `beta` on **every** observed dependency path. Let \(T=4276\), the current path vocabulary, \(b\) the per-path value, \(B=Tb\) its total concentration, and \(n_{rv}\) the counts. The predictive probability is

\[
P(v\mid r,\text{other rows})=\frac{n_{rv}+b}{n_r+B}.
\]

Consequently `beta=0.1` means \(B=427.6\), not 0.1 total prior observations. The parameter is mathematically coherent, but its name and the paper do not tell us which convention the original experimental settings intended.

An exact local calculation illustrates its effect. Suppose a candidate row uses a path unseen in an existing relation containing \(n\) rows. Its dictionary-likelihood factor for joining that relation instead of a separate one-row relation is

\[
\frac{b/(n+B)}{b/B}=\frac{B}{n+B}.
\]

| Per-path `beta` | Total \(B\) | Joining an unrelated one-row relation | Joining an unrelated 500-row relation |
|---:|---:|---:|---:|
| 0.1 | 427.6 | 0.99767 | 0.46097 |
| 0.01 | 42.76 | 0.97715 | 0.07878 |
| 0.001 | 4.276 | 0.81046 | 0.00848 |
| 0.0001 | 0.4276 | 0.29952 | 0.000854 |
| 0.1 / 4276 | 0.1 | 0.09091 | 0.000200 |

These are dictionary factors, not complete posterior odds; fact counts, relation counts, occupancies and reporting all also matter. With the baseline setting, the dictionary alone almost does not penalize merging two different singleton paths. Lowering beta makes clusters with many distinct paths more expensive and may improve semantic concentration. It can also incorrectly fragment genuine paraphrases, especially rare ones. The model treats complete dependency paths as categorical IDs; it has no lexical-semantic similarity, argument types or shared embeddings to distinguish a genuine paraphrase from an unrelated rare expression. The requested frozen-entity `beta=0.001` arm is therefore a diagnostic ablation, not a proven better value or an exact recovery of the paper's setting.

Relevant code: `world/WorldProb.java:logCollapsedTriggers`, `inference/ModelFunctions.java:logBetaProb`, and `mcmc/SentenceOriginRV.java:probTrigGivenRelation` all implement this per-path convention consistently. A global change to total-concentration convention must change the effective value in **every** likelihood, Gibbs conditional and smart-proposal score; changing only a reporting formula would create a sampler bug.

## Sparsity, reporting and correlated predicates

With independent \(\sigma_r\sim\operatorname{Beta}(a,b)\) and \(P=N^2\) potential ordered facts, a particular fact set of size \(f_r\) has probability

\[
\frac{\mathrm B(a+f_r,b+P-f_r)}{\mathrm B(a,b)}.
\]

This is a probability for a specified labelled subset. Multiplying it by \(\binom{P}{f_r}\) would be a bug unless changing the event being scored to fact count alone. The stored corrected NYT parameters are \(a=1\), \(b=1199^2=1{,}437{,}601\). At the initial N, their prior expected count per available relation is \(P a/(a+b)\approx1\), while the nominal constant `sparsity=0.001` is inactive because the Beta prior is enabled. These two numerical settings are radically different; logging both without indicating which is active can mislead readers. The paper requires a small-mean Beta prior but does not specify \(a,b\), and its prose example of effective sparsity near one in ten thousand is not an experimental configuration.

The probability of a previously absent labelled fact, conditional on the other potential facts of a relation, is \((a+f_r)/(a+b+P-1)\). The corresponding odds of adding one fact to a specified configuration with \(f_r\) facts are

\[
\frac{p(F_r\cup\{u\})}{p(F_r)}=\frac{a+f_r}{b+P-f_r-1}.
\]

This is a strong cost for explaining the same argument pair with an additional relation. Uniform reporting creates another incentive to reuse facts: for \(S\) observed rows and \(F\) true facts, \(P(\text{origins}\mid F)=F^{-S}\). At \(S=8516,F=1925\), reducing F by one improves this factor by about 83.5. An inferred relation can therefore absorb semantically different predicates about the same pair because that saves a fact; dictionary evidence must resist this pressure.

The paper itself acknowledges this structural problem on p. 4: correlated predicates, including a more specific and a more general relation, can be mistaken for one relation. Our audit sees examples such as leadership versus employment, residence versus birthplace/travel, coach versus other team affiliation, and wins versus broader participation. A correct implementation of this simple model can still produce such errors. Allowing arbitrary union predicates after seeing them would make evaluation easier without solving the extraction problem.

A principled extension would model reporting frequencies with a nonuniform fact distribution, correlated relations, argument types, temporal scope, or a background component for uninterpretable paths. Each changes the model. In particular, merely raising or lowering sparsity is not a universal fix: lower sparsity strengthens reuse and can merge correlated predicates; higher sparsity may separate them but also weaken legitimate bootstrapping. Such changes should be independently named, tested against their own joint distributions, and evaluated with a fixed rubric.

## The relation pool is part of the prior

The current objective multiplies a broad count factor \(g(K_{\rm occupied})\) by independent fact priors across M available relation slots. For fixed N, let

\[
p_0=\frac{\mathrm B(a,b+N^2)}{\mathrm B(a,b)},\quad q=1-p_0.
\]

After summing over every fact arrangement, the no-data occupied-count distribution is

\[
P(K\mid N,M)\propto g(K)\binom{M}{K}q^K(1-q)^{M-K}.
\]

Thus the slots are not a neutral memory capacity. With \(a=1,b=N^2\), q=1/2; doubling M roughly doubles the preferred count before considering text. `maxRels=400` preserves an old choice; it does not repair the count model. Keeping this parameter fixed in the present ablations prevents it from silently changing the comparison.

There are at least two defensible count-first interpretations, which should not be conflated:

1. **K is the total number of real relations, including relations with no facts.** Sample K from g, choose active labels among M, then draw their fact sets without conditioning on nonemptiness. This needs a distinction between inactive slots and active empty relations. It is closer to the paper's unrestricted count of binary relations, but not the same latent state representation as the current implementation.
2. **K counts occupied relations.** Sample K from g, choose K labels uniformly from M, and give each occupied relation its fact prior conditional on nonemptiness. Then a labelled state's correction to the present product target is proportional to the reciprocal of \(\binom{M}{K}q^K(1-q)^{M-K}\). Dividing by only \(\binom{M}{K}\) does not remove the whole induced count prior. If N changes, q changes too and that dependence must enter entity moves.

The paper does not resolve these finite-slot implementation details. Neither correction is applied by this analysis; they require an explicit theoretical choice and matching proposal/target regression tests.

## MAP, mixing and the most promising controlled comparisons

The paper explicitly inspected its most likely sampled world, so using a sampled MAP is consistent with its stated evaluation. Reporting posterior-confidence-filtered facts would be a different endpoint. Relation and entity labels can permute between samples; posterior facts need a stable query or careful alignment before averaging. A raw relation ID is not a meaningful posterior identity across chains.

The corrected reference run reached its highest recorded joint at the final observation, and its last-100 mean joint was still increasing strongly. This establishes no convergence. Ten minutes in the paper cannot be translated to a move count without its hardware and implementation. Better proposal connectivity and longer runs can be meaningful implementation improvements, but a larger joint probability is not evidence of higher semantic precision, and target scores from different hyperparameters or models are not directly comparable.

The isolated study therefore compares two independent seeds for each of four predefined arms: (1) current latent-entity model at beta 0.1, (2) truly fixed literal entities at beta 0.1, (3) fixed literal entities at beta 0.001, and (4) fixed literal entities at beta 0.1 with the separately audited additional move. The fourth arm must retain the same target; its purpose is to distinguish sampling access from a model change. Keep corpus, relation pool and proposal budget explicit. More details and the frozen review protocol are in [the manual protocol](manual_protocol.md).

The right success criterion is an independently judged increase for a declared fact population, repeated across seeds, accompanied by coverage and relation/fact counts. The present evidence supports testing these causes; it does not establish that any one will recover the paper's 95%.
