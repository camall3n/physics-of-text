# Implemented probability target and inference procedure

This is a description of the code that generated the four saved outputs. It distinguishes the target formula from the finite algorithm used to search it. Code references below use the [controlled source](../../nyt-precision-investigation-2026-09-12/variants/controlled/src/main/java/org/ucb/generative_ie); the corresponding [corrected latent source](../../nyt-latent-low-smoothing-2026-09-14/variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie) has identical relation-phase methods.

## Notation and observations

For input row s, observed values are noun strings a_s and b_s and dependency path t_s. Its latent origin is a fact z_s=(r_s,e_s1,e_s2). There are S=8,516 rows and J=2S=17,032 mention positions. V=1,199 is the noun vocabulary and T=4,276 the path vocabulary. N is the current number of entity objects; M=400 is the fixed number of labeled relation slots. Ordered pairs include e1=e2, so each relation has N² potential facts.

Let F_r be the set of true ordered entity-pair facts in relation r, f_r=|F_r|, F=sum_r f_r, and K=number of slots with at least one fact. K includes relations supported only by unreported facts. An expressed relation instead has at least one input row. The two counts need not coincide. The count of expressed facts excludes true facts that no row reports.

n_rt counts rows assigned to relation r with path t; m_ev counts mention positions assigned to entity e with noun v. Write n_r=sum_t n_rt and m_e=sum_v m_ev. For a count vector h over d possible outcomes, define the integrated dictionary likelihood

\[
 D_\eta(h;d)=\frac{\Gamma(d\eta)}{\Gamma(d\eta+\sum_i h_i)}
             \prod_{i=1}^d\frac{\Gamma(\eta+h_i)}{\Gamma(\eta)}.
\]

There is no multinomial coefficient: the observed rows/mentions are individually identified observations. Dictionaries are analytically integrated out, not separately sampled in the active kernels. See `WorldProb.logCollapsedTriggers`, `logCollapsedNouns`, and `ModelFunctions.logBetaProb`.

## Relation-phase target

The unnormalized weight evaluated by [WorldProb.java](../../nyt-precision-investigation-2026-09-12/variants/controlled/src/main/java/org/ucb/generative_ie/world/WorldProb.java), lines 60–81 and 131–233, is

\[
 w(\mathcal F,z\mid a,b,t,N) =
 g_{1199}(N)\,g_{200}(K)
 \prod_{r=1}^{400}\frac{B(1+f_r,\;1437601+N^2-f_r)}{B(1,1437601)}
 F^{-S}
 \prod_rD_\beta(n_r;T)
 \prod_eD_\alpha(m_e;V),
\]

subject to each z_s being an existing fact and all facts using current entities. Here a vector, rather than its scalar sum, is implied in each D term. The entity factor is constant during relation inference because N is fixed in that phase. There is **no entity label-multiplicity factor in this fact-world target**. The separate entity-phase partition target is given in [latent_entity.md](latent_entity.md).

For positive integer k, the code evaluates a continuous log-normal density at k:

\[
 g_c(k)=\frac{1}{k\sqrt{2\pi}}
 \exp\left[-\frac{(\log k-(\log c-1/2))^2}{2}\right],\qquad g_c(0)=0.
\]

This is used as a positive-integer count weight, not as probabilities obtained by integrating the density over integer bins. Its continuous mean parameter is c and log-scale standard deviation is 1. Normalizing the finite/discrete target is unnecessary for its MH ratios; this does not mean that its actual discrete or truncated mean equals c.

The fact term integrates each relation's σ_r under Beta(a=1,b=1,437,601). It is the probability of a **particular labeled fact set**, without a choose(N²,f_r) coefficient. The configured `sparsity=0.001` is the fallback constant-sparsity value; `sparsityA>0` activates the integrated Beta branch instead. The Beta prior's mean is 1/1,437,602, approximately 6.96×10⁻⁷, not 0.001. b=1199² remains fixed after latent N changes. A sigma posterior given one relation's complete facts would be Beta(1+f_r,1437601+N²−f_r).

F⁻ˢ comes from each row choosing uniformly among all true facts. Thus adding an unreported true fact changes the target even though it explains no new observation. Zero-fact worlds have zero weight for this nonempty corpus.

## Predictives and the effect of β

For one held-out row, the relation dictionary predictive is

\[
 p(t_s\mid r,\text{other rows})=
 \frac{n_{rt_s}^{-s}+\beta}{n_r^{-s}+T\beta}.
\]

With β=.001 the total symmetric pseudocount is Tβ=4.276. With the earlier β=.1 it was 427.6. The numerator for an unseen path is correspondingly 100 times smaller, while observed repeated paths become more concentrated within their relation. This can improve path purity and also fragment semantically synonymous rare paths into separate relations. Neither outcome follows monotonically from this formula alone because the fact prior, count prior and search trajectory also change the fitted partition.

For one held-out argument mention with noun v,

\[
 p(v\mid e,\text{other mentions})=
 \frac{m_{ev}^{-j}+\alpha}{m_e^{-j}+V\alpha},\qquad V\alpha=1.199.
\]

These are likelihood factors used to choose a relation/entity, not normalized probabilities over candidate relations/entities. The implementation then normalizes their positive weights over the actual candidate set. `SentenceOriginRV` restricts a relation choice to existing facts with the same entity pair. In latent mode it next chooses the first argument entity among existing facts with that relation and second entity, then the second argument entity among existing facts with the updated relation and first entity. Each step removes only the current row/mention from its own counts. Fixed-name mode skips both argument choices.

## Why the 400-slot pool remains a model choice

All four runs retain the pool-dependent count prior. Let p₀ be the integrated probability that a relation is empty under its Beta–Bernoulli facts, and q=1−p₀. Before observing text, summing over all labeled fact sets with K occupied slots gives

\[
 p(K\mid N,M)\propto g_{200}(K){M\choose K}q^K(1-q)^{M-K}.
\]

For a=1, p₀=b/(b+N²), so q=N²/(b+N²). At N=1199, q=1/2. Therefore the intended-looking count factor g₂₀₀ is multiplied by a binomial mass induced by the available labels and fact prior. The earlier exact count enumeration gives no-data mean K≈199.25 for M=400 but ≈398.90 for M=800 at this N. These are prior calculations, not predictions of the text-conditioned MAP relation count. Current MAPs use 398–400 occupied relations.

Keeping M=400 ensures comparability here but does not remove this dependence. A count-first replacement would need to specify whether real-but-empty relations exist and normalize the **whole** induced occupancy factor; dividing only by choose(M,K) is insufficient. See [the exact count-prior analysis](../../nyt-precision-investigation-2026-09-12/analysis/count_prior_choice.md). No such alternative is introduced by the coverage evaluation.

## Initialization, phases and budget

[ControlledNYT.java](../../nyt-precision-investigation-2026-09-12/variants/controlled/src/main/java/org/ucb/generative_ie/experiments/ControlledNYT.java), lines 71–116, uses independently seeded initialization, entity proposal, entity scan, relation proposal and relation scan streams; it also seeds research dictionary draws. The run seed is XORed with the fixed constants recorded there. Both families start from the same initialization for a paired seed.

`SentenceEvidence.evidenceToWorldByNoun` assigns each distinct noun to a distinct entity (all 1,199 entities are available), gives each row a uniformly random relation from all 400 slots, and inserts its origin fact if absent. `numRels=200` sets the count-prior centre; it does **not** restrict initialization to 200 slots. No dense N²M fact world is sampled first.

The nominal 1,000 iterations reserve round(1000×.02)=20 for entities and 980 for relations, with 2,000 proposals per iteration. Latent mode executes 40,000 entity proposals, then synchronizes sentence origins and the true-fact set. Fixed-name mode executes zero entity proposals; the reserved entity budget is skipped rather than transferred to relation inference. Both then execute 1,960,000 relation proposals. A proposal can be null or rejected, so these are not counts of accepted changes or full Gibbs sweeps.

In the latent entity phase, `EntityInferSteps` picks mention Gibbs, smart-split/dumb-merge, or dumb-split/smart-merge kernels with weights 1:1:1. Each of the latter two internally chooses split or merge with probability 1/2. All other entity kernels have zero weight.

In the relation phase, [WorldInferSteps.java](../../nyt-precision-investigation-2026-09-12/variants/controlled/src/main/java/org/ucb/generative_ie/mcmc/WorldInferSteps.java), lines 77–84, samples the following kernels:

| Kernel | Weight | Normalized selection probability | Action |
|---|---:|---:|---|
| Fact birth/death | 1 | 5/17 | Equally choose uniform potential-fact birth or bounded-search unreported-fact death, with corrected MH ratio |
| Sentence origin | 1 | 5/17 | Uniformly choose one input row; sequential restricted Gibbs steps described above |
| Fact relation move | 1 | 5/17 | Move one fact, carrying all its rows, to a relation missing that entity-pair fact |
| Smart split / dumb merge | .2 | 1/17 | Split/merge whole relation fact sets using complementary proposals |
| Dumb split / smart merge | .2 | 1/17 | Complementary split/merge kernel |
| Optional sentence/relation bridge | 0 | 0 | Present in the source; never selected in these runs |

Each relation split/merge kernel internally chooses its direction with probability 1/2. Relation merges sharing an entity pair are null because this move's reverse split cannot create overlapping entity-pair facts. This reversible restriction and uniform N²M fact births can slow rearrangement. The optional bridge designed to bypass part of that bottleneck is deliberately disabled here, so these runs do not test its efficacy.

## Which saved state is evaluated

`MCMCInferer` executes all 2,000 proposals in an iteration before observers see the resulting state. `ObserveProb` compares the full collapsed fact-world log weight at **every one of the 980 relation iterations**. It overwrites `map_world*` only for a strictly higher value. Thus “MAP” here means the best of those 980 observed states, with no separate burn-in exclusion; it is neither a proven global maximum nor an average over posterior samples, and it does not inspect every intermediate proposal state.

`checkpointEvery=100` controls a separate diagnostic snapshot series at relation iterations 100,200,…,900,980. It does **not** limit MAP selection to those ten checkpoints. The chosen MAP observations are:

| Model / seed suffix | Chosen relation iteration | Relation proposals elapsed | MAP log weight | Occupied / expressed relations | Expressed facts |
|---|---:|---:|---:|---:|---:|
| Fixed / 12 | 971 | 1,942,000 | −155829.62784747436 | 398 / 398 | 1,929 |
| Fixed / 13 | 972 | 1,944,000 | −156097.55968954047 | 400 / 400 | 1,942 |
| Latent / 12 | 976 | 1,952,000 | −179076.81711886177 | 399 / 399 | 2,773 |
| Latent / 13 | 973 | 1,946,000 | −180697.89208411082 | 399 / 398 | 2,861 |

The saved MAP TSV contains every observed row with its assigned relation/entities. `map_world.txt` and `map_world_mentions.txt` provide descriptions, and coarse checkpoints separately include full fact lists. The MAP TSV is sufficient to evaluate every expressed fact, but it is not a complete restart serialization of unreported facts and RNG state. A faithful rerun starts from the recorded seed/configuration/source rather than resuming the MAP TSV.

MAP scores across the two entity-model restrictions should not be used as semantic-precision estimates or Bayes factors. The trajectories were still improving late in the finite runs; repeated seed outcomes and exact proposal tests do not establish convergence.
