# NYT precision investigation — 12 September 2026

**Evaluation code — 2026-09-29:** maintained algorithms now live in [code/evaluation](../../code/evaluation/README.md); this campaign's scripts are compatible callers. Use preset `sampled-sep12` for read-only checks or a separate rendered review folder. [Selection rules and commands](../../code/evaluation/README.md#selection-is-separate-from-scoring) · [Equivalence evidence](../../reports/evaluation-consolidation-2026-09-29/README.md). Saved judgments and results are unchanged.

This separate research copy investigates the paper’s roughly 95% manual fact precision, entity inference, smoothing and sampler correctness. The two controlled latent baseline evaluations were retired because a confirmed entity factorial defect was active. Raw runs, configurations, source snapshots and tests remain. [Cleanup record](../../reports/buggy-evaluation-cleanup-2026-09-28/README.md).

**The investigation has identified a further entity-sampling defect, a substantive mismatch between the paper’s verbatim entity arguments and the implemented entity model, and a large dictionary-smoothing effect.** Ten controlled NYT runs are complete: two seeds for each of five conditions. Eight manual screens remain after the two active-defect evaluations were retired; their limitations are recorded in [the results table](analysis/experiment_results.md). These are diagnostic experiments, not a claim that the paper’s 95% has been reproduced.

All new code, configurations, runs, tests, judgments and notes are inside this directory. Raw sampler experiments remain intact; evaluation removals are recorded in the cleanup ledger. [Integrity verification](analysis/integrity_verification.json) checks all 1,126 original files fingerprinted at the start, all ten completed runs’ 1,772 recorded output files, the shared corpus/dependency hashes, and the exact two-file production difference for the entity fix. The cited integrity record is historical; current verification accounts for authorized evaluation cleanup.

## Start here

- [Experiment results](analysis/experiment_results.md): both seeds, precision estimates, fact populations, sentence coverage, MAP counts and trace diagnostics; [machine-readable results](analysis/experiment_results.json).
- [User inspection index](manual_review/README.md): each run’s full relation dictionaries, sampled comparisons, individual judgments and ambiguity questions.
- [New entity-count bug](analysis/entity_multiplicity.md): location, derivation, old/new transition probabilities, experimental implication and isolated fix.
- [Kernel audit](analysis/kernel_audit.md): independent probability oracles, normalization and reversibility tests; optional sentence/relation move.
- [Paper and model choices](analysis/paper_model_choices.md): evidence from the article, mathematical alternatives, structural limitations and evaluation ambiguity.
- [Reviewer and predicate caveats](analysis/manual_reviewer_caveats.md): alternative meanings, reviewer assignment and a quantified scope sensitivity.
- [Evaluation cleanup](../../reports/buggy-evaluation-cleanup-2026-09-28/README.md): retired baseline grading and preserved raw evidence.
- [Relation-pool prior](analysis/count_prior_choice.md): why 400 slots are still part of the model; [enumerated checks](analysis/count_prior_check.json).
- [Input data audit](analysis/corpus_audit.md): 30 contaminated dependency paths and other corpus diagnostics.

## What the completed experiments show

All ten raw runs use the same corpus, relation pool and relation-proposal budget. The eight retained screens appear below. Each cell below is the weighted precision screen for **one seed**, with ambiguity counted negatively/positively. Each run has 100 assessed facts; sampling uncertainty and subjective predicate scope extend beyond these endpoints.

| Condition | Seed 20260912 | Seed 20260913 | Top-20 fact population, same seed order |
|---|---:|---:|---:|
| New entity multiplicity fix, beta 0.1 | 46.1–52.1% | 37.3–43.7% | 1184 / 1197 |
| Fixed literal names, beta 0.1 | 74.4–78.9% | 66.7–72.4% | 735 / 715 |
| Fixed literal names, beta 0.001 | 91.9–96.0% | 85.8–93.8% | 384 / 364 |
| Fixed literal names, beta 0.1, extra move | 61.0–67.8% | 64.4–75.2% | 727 / 742 |

The largest repeated improvement is associated with literal entities and then a more concentrated dictionary prior. The confirmed entity fix alone does **not** restore high semantic precision in this experiment. Its new target is mathematically correct for the entity phase, while the remaining two-phase/model limitations and finite search budget persist. The extra same-target move also shows no consistent precision improvement in these screens and reaches a lower best joint than its matched literal baseline under the same target; its chosen weight reallocates existing work.

The low-beta result warrants further examination, but does not establish a reproduction of 95%: it has 398/400 expressed relations versus the paper’s roughly 200, and its top 20 cover only 1,824/1,583 observed rows. The original literal beta 0.1 condition covers 5,368/5,096 rows in its top 20. These row fractions describe output coverage; gold-standard fact recall is unknown. The lower-beta model also produces more expressed facts overall (1929/1942 versus 1,244/1,249), consistent with splitting meanings and potentially fragmenting paraphrases. All runs’ last 100 mean joints remain above their previous 100 means. These correlated block comparisons do not prove nonstationarity; convergence has not been established.

The [later complete census](../nyt-complete-evaluation-2026-09-14/comparison.md) covers retained runs. User adjudication and the paper’s missing evaluation details still limit a precise 95% claim. These screens are evidence for the next modeling decision, not an independently validated final accuracy result.

## Changes, with their classification

| Change | Classification | Implemented where | What it does |
|---|---|---|---|
| Explicit independent RNG streams and stable categorical iteration order | Reproducibility plumbing; same transition probabilities | `variants/controlled` | Makes this runner replayable with the recorded Java/dependency versions. It cannot reconstruct an older unseeded trajectory. |
| Freeze argument entities to literal noun strings | Conditional-model choice motivated by the paper | `freezeArgumentEntities=true` in controlled variant | Skips entity inference and disables both argument-entity Gibbs updates in the relation phase. Equal strings stay together; distinct strings cannot become aliases. |
| Lower per-path beta from 0.1 to 0.001 | Dictionary prior choice, not a bug fix | Config files only | Total Dirichlet concentration changes from 427.6 to 4.276. It favors more concentrated dictionaries and can also fragment valid paraphrases. |
| Add an optional sentence/relation birth/death move | Sampling-efficiency choice with the same fact-world target | `SentenceRelationBirthDeathMove.java`, weight 1 arm | Can create a fact while moving one sentence, enabling separation of meanings attached to the same argument pair. At a fixed total budget it receives work otherwise allocated to existing kernels. |
| Correct entity split/merge multiplicity | Confirmed target-distribution defect | Separate `variants/entity-multiplicity-fix` | Adds `log(N+1)` for a split and subtracts `log(N)` for a merge. No other production files differ from controlled. |

The controlled variant retains the entity defect in its latent baseline so that the correction can be compared directly. Frozen conditions never invoke that entity kernel. Source/config snapshots and compiled classes are copied into every run before it starts; rebuilding a variant cannot change a running or saved experiment. [Runner documentation](analysis/runner_changes.md) lists every changed file and the replay limits.

## The central mathematics

### 1. The confirmed entity defect adds an unintended count prior

For `J` mention positions partitioned into `K` nonempty entities out of `N` available objects, the existing entity model assigns

\[
\pi(z,N)\propto g(N)N^{-J}\frac{N!}{(N-K)!}\prod_{k=1}^K D_\alpha(n_k).
\]

Here D_alpha is the Dirichlet-integrated noun likelihood for one entity, and g(N) is the existing count-prior factor.

The smart split/merge kernels in the investigation baseline instead preserve **`pi(z,N)/N!`**. Around `N=1000`, every added entity incurs an extra factor of about `1/1000`, or approximately −6.9 in log probability. The correction restores the missing factorial ratio: multiply the pre-clipping split acceptance ratio by `N+1`, or the merge ratio by `1/N`. Empty entities require careful proposal multiplicity accounting; simply adding a falling-factorial term to a single component is not generally correct.

The fix raises the retained entity count from **1045/1026 to 1180/1161** in the paired NYT runs. That confirms a material count effect, but it does not by itself establish a semantic precision gain: the relation phase can still reassign names, and its joint model differs from the preliminary entity-only phase. See the [proof and exact partition tests](analysis/entity_multiplicity.md).

### 2. Verbatim arguments and latent noun dictionaries are different models

The paper’s elementary model mentions entity arguments verbatim and postpones a generative mention model to extensions. The code instead models noun strings emitted by latent entities. Its preliminary entity phase uses `N^(-17032)` and noun likelihoods; the later fact phase uses `F^(-8516)` and never changes the number of entities. Thus the two-phase procedure is an initialization followed by fixed-count inference, not a single sampler for the full joint model.

The literal variant fixes `e_sj=h(name_sj)` throughout. This removes identity errors caused by merging different strings but also gives up resolving genuine aliases. Setting `entityFraction=0` alone would not implement this choice, because ordinary relation-phase sentence-origin updates also change argument entities. The isolated flag blocks both routes. It conditions the existing target on the fixed assignments rather than editing its Gibbs weights inconsistently.

### 3. Beta is per dependency path, not the total prior mass

For `T=4276` path types, a symmetric dictionary prior gives

\[
P(t\mid r,\text{other rows})=\frac{n_{rt}+\beta}{n_r+T\beta}.
\]

At beta 0.1 the total concentration is 427.6. At beta 0.001 it is 4.276. For a previously unseen path, the dictionary factor favoring joining an existing `n`-row relation over a separate one-row relation is

\[
\frac{T\beta}{n+T\beta}.
\]

At `n=500` this is **0.461 versus 0.00848**. The higher setting offers far less resistance to absorbing unrelated expressions. These are dictionary factors, not complete posterior odds: fact and relation priors also contribute. Both settings are mathematically coherent; the paper does not provide the numeric vector needed to identify its setting. The smaller value also appears in an archived NYT-scale configuration, but that does not establish that it produced the paper’s result.

The low-beta runs reach roughly **400 expressed relations**, near the pool limit, and their top 20 cover only **18.6%–21.4% of rows**, compared with **59.8%–63.0%** for literal entities at beta 0.1. Higher precision on that smaller selected population is not a free improvement or a demonstrated recovery of the paper’s roughly 200-relation result.

### 4. Correct inference can still prefer semantically mixed relations

Uniform reporting contributes `F^(-S)`, so explaining several predicates about the same pair with fewer facts can be strongly rewarded. At `S=8516,F=1925`, removing one fact improves that factor by about 83.5. The dictionary model treats complete paths as unrelated categorical values and lacks argument types, temporal scope and semantic similarity. Leadership/employment, residence/birthplace and sports participation/victory can therefore merge even with correct sampling arithmetic.

The existing finite relation-slot prior also induces

\[
P(K\mid N,M)\propto g(K)\binom{M}{K}q^K(1-q)^{M-K},\qquad
q=1-\frac{\mathrm B(a,b+N^2)}{\mathrm B(a,b)}.
\]

All runs retain `M=400`; no prior correction was silently applied. A count-first model needs a choice between counting all real relations, including empty ones, or counting only occupied relations. Those require different state representations/normalization. Even after a count-first correction, truncating a broad prior at 400 remains a substantive assumption. See [the explicit alternatives](analysis/count_prior_choice.md).

## Exact configuration and budget

The initial four-arm/two-seed design was written before full-corpus outcomes: [design](analysis/experiment_design.md), [plan JSON](experiment_plan.json). The newly discovered entity defect motivated a separately documented [two-run follow-up](analysis/manual_followup_protocol.md). No initial arm was removed or replaced.

| Parameter | Value in all runs unless stated |
|---|---|
| Corpus | Original `pluieTriples_2013_01_06_5.json`; 8516 rows, 1199 names, 4276 path types, 920 ordered name pairs |
| Seeds | 20260912 and 20260913 |
| `numRels`, `maxRels` | 200, 400; `numRels` parameterizes the count factor, not a fixed inferred count |
| `numEnts` | 1199 initially; fixed throughout only in literal conditions |
| `numIterations`, `stepsPerIteration`, `entityFraction` | 1000, 2000, 0.02 |
| Executed relation work | 980 iterations × 2000 = 1,960,000 proposals in every run |
| Executed entity work | 20 × 2000 = 40,000 proposals in latent runs; zero in literal runs |
| `alpha` | 0.001 per noun; total concentration 1.199 |
| `beta` | 0.1, except `verbatim_beta0001` uses 0.001 |
| `sparsityA`, `sparsityB` | 1, 1,437,601; active Beta prior |
| `sparsity` | 0.001 remains in config but is inactive once the Beta prior is enabled |
| `sentenceRelationMoveWeight` | 0, except bridge arm uses 1; total scan weight changes 3.4 → 4.4 within the same proposal budget |
| `checkpointEvery` | 100; final iteration also saved |
| Selection for semantic review | Highest recorded fact-world joint (sampled MAP), matching the paper’s stated choice |

## Evaluation and uncertainty

Each retained sampled evaluation has **100 manually reasoned assistant judgments**, sampled as five facts without replacement from each of its 20 most frequent relations. These are evidence-based screening assessments for user review, not independent human adjudication. Different runs produce different facts and predicates; the samples are not paired sets of identical propositions. Relation-size weights estimate micro precision:

\[
\widehat P=\sum_{r=1}^{20}\frac{N_r}{\sum_jN_j}\frac{s_r}{n_r}.
\]

Replace `s_r` by `s_r+a_r` for the optimistic ambiguity endpoint. Both endpoints have sampling uncertainty beyond their separation. The per-audit reports include conservative finite-population bounds; five cases per relation can leave these very wide. Two seeds do not establish generalization or convergence.

Variant names were kept outside the annotation folders during grading where feasible. Full dictionaries determine an explicit directional predicate; competing meanings are not automatically credited as an arbitrary union. Nevertheless choosing the dominant predicate is itself subjective, especially for `lead`, director/spokesperson and partly extracted political entities. Each relation records scope notes, and ambiguous cases have a concrete user question. The earlier full census and the paper’s unavailable human judgments use different evidence/protocols, so direct equality of percentages should not be assumed.

The baseline-only weighting, ranking and selective-filtering calculations were retired with that run’s grading data. Retained evaluations report their full selected populations. Selecting favorable subsets changes the evaluation question.

## Validation and reproduction

The corrected variant passes **91 JUnit tests** and independent-JVM replay checks. Additional independent audits cover 1,020 fact worlds, 9,216 sentence alternatives, exhaustive new-move reversals, exact entity partition transition matrices, and 2.4 million relation split/merge draws. Probability sums include null moves and rejections. The manual sampling/reporting pipeline passes **12 tests**, including finite-population coverage and the fact that five successes out of five do not eliminate sampling uncertainty. No new arithmetic error was found in the tested active relation kernels; that is bounded test evidence, not a proof over all possible states.

Run commands from this directory, using a new output folder each time:

```sh
node scripts/build_controlled.mjs
node scripts/test_controlled.mjs
node scripts/run_experiment.mjs configs/verbatim_beta01_seed20260912.json runs/replay_verbatim_beta01_seed20260912

node scripts/build_entity_variant.mjs
node scripts/test_entity_variant.mjs
node scripts/run_entity_experiment.mjs configs/entityfix_latent_beta01_seed20260912.json runs/replay_entityfix_latent_beta01_seed20260912

node --test tests/manual_sampling.test.mjs tests/manual_report.test.mjs
node scripts/summarize_experiments.mjs
node scripts/verify_integrity.mjs
```

The runners refuse existing output directories. Recorded source archives, copied runtime classes, configuration, Java version, dependency SHA and corpus SHA support restarting a run. Periodic snapshots are inspection artifacts, not resumable RNG checkpoints. See [runner details](analysis/runner_changes.md) and [entity variant](variants/entity-multiplicity-fix/README.md). Existing raw `runs/` and retained `manual_review/` folders should be preserved; retired evaluations must not be recreated. New repetitions need distinct names.

## Decisions for the next stage

Retain the entity multiplicity correction when studying the latent-entity algorithm, regardless of whether a particular finite run scores better. Treat verbatim arguments as a separate paper-oriented model. Before selecting a beta or changing the relation pool, agree on the intended count prior and evaluate precision together with fragmentation and coverage. A full census of the strongest screened outputs and user adjudication of their scope ambiguities should precede any claim of 95% replication. Longer chains and more seeds should retain the same target and report convergence diagnostics; increasing a logged joint alone is not evidence of higher semantic accuracy.
