# Corrected latent entities, β = 0.001

This family is the saved September 14 `entityfix_latent_beta0001` condition. It retains the latent entity procedure and includes the later entity-count factorial correction. Its configuration differs from the paired fixed-name condition only in `freezeArgumentEntities=false`; its production source differs only in the two entity smart split/merge files. It is a two-phase procedure, so describing it as fully joint entity-count/relation MCMC would overstate what the code does.

| Configuration key | Value | Role |
|---|---:|---|
| `freezeArgumentEntities` | false | Enable entity phase and restricted argument updates in relation phase |
| `numEnts` | 1199 | Initial available entities and entity-count prior centre |
| `numRels`, `maxRels` | 200, 400 | Occupied-relation count factor and fixed pool |
| `alpha`, `beta` | .001, .001 | Noun/path pseudocounts; totals 1.199/4.276 |
| `sparsityA`, `sparsityB` | 1, 1437601 | Same integrated prior in both seeds; b does not track inferred N |
| `sparsity` | .001 | Inactive fallback constant branch |
| `numIterations`, `stepsPerIteration` | 1000, 2000 | Proposal budget schedule |
| `entityFraction` | .02 | First 20 iterations, 40,000 entity proposals |
| Actual relation iterations | 980 | 1,960,000 relation proposals after synchronization |
| `sentenceRelationMoveWeight` | 0 | Optional bridge disabled |
| `checkpointEvery` | 100 | Diagnostic cadence; separate from per-iteration MAP selection |
| `seed` | 20260912 or 20260913 | Recorded independent random streams |

## Entity-only phase and the sixth correction

Let a state z be a partition of the J=17,032 observed mention positions into K_E nonempty entity blocks, plus N−K_E unobserved empty entity objects. For block counts m_e, the intended entity-phase partition weight is

\[
 \pi_E(z,N)\propto
 g_{1199}(N)\,N^{-J}\,
 \frac{N!}{(N-K_E)!}\,
 \prod_{e=1}^{K_E}D_\alpha(m_e;1199).
\]

The uniform N⁻ᴶ term means each mention chooses uniformly among available entities. The falling factorial counts assignments of the nonempty blocks to available labels. `WorldProb.logProbEntityWorld()` represents this partition weight; `logProbLabeledEntityWorld()` omits the falling factorial. The noun predictive used by mention Gibbs is `(m_ev+α)/(m_e+1199α)`, with the current mention removed and weights normalized over the available entity objects.

The earlier smart split/merge acceptance bookkeeping preserved an unintended additional 1/N! penalty on partition states. The [factorial derivation and exact finite-chain tests](../../nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) account for both nonempty daughters and empty-entity multiplicities. The isolated correction adds `log(N+1)` for a split and subtracts `log(N)` for a merge in the stored acceptance components. It does not simply append the raw falling-factorial difference: some empty-object multiplicity is already canceled by the proposal ratio.

The actual corrected lines are [EntitySmartSplitStep.java:368](../../nyt-latent-low-smoothing-2026-09-14/variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java) and [EntitySmartMergeStep.java:370](../../nyt-latent-low-smoothing-2026-09-14/variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java). This is an implementation correction to the intended entity target, rather than a new prior selected to improve manual precision. All earlier five repair families are also retained. [The September 14 source audit](../../nyt-latent-low-smoothing-2026-09-14/analysis/source_audit.md) records 91 passing regression tests and separate-JVM replay, including the independent exact 38-state partition oracle. No new inference or production tests were run for this coverage documentation.

This phase uses **only noun strings** for its entity likelihood. It does not condition count split/merge proposals on relation paths or a fact-world likelihood. `syncFacts()` then removes facts involving deleted entities, creates any missing current sentence-origin facts, and restores the invariants needed by the fact model. This handoff is not a posterior transition for one single joint target; it is a practical initialization procedure.

## Entity behavior during relation inference

The number N is fixed at the entity phase's final value throughout the second phase, but individual sentence argument identities can still change. `SentenceOriginRV` first resamples a relation among existing facts with the current entity pair, then resamples each argument entity among compatible existing facts, using noun predictive weights. Those choices can separate two occurrences of the same literal name or join different literal names. They do not create/delete entity objects and cannot freely assign a mention to any entity if the required fact does not already exist.

| Diagnostic | Seed 20260912 | Seed 20260913 |
|---|---:|---:|
| Available N after entity phase / throughout relation phase | 1180 | 1161 |
| Argument positions differing from initialization after entity phase | 5815 | 6053 |
| Argument positions differing from initialization in selected MAP | 5055 | 5224 |
| Argument positions differing from initialization in final state | 5050 | 5227 |
| Expressed facts in selected MAP | 2773 | 2861 |
| Selected MAP relation iteration | 976 | 973 |

These drift counts compare implementation entity identifiers with the paired initialization; they are diagnostic changes, not coreference errors or accuracy labels. A change can be sensible, mistaken or merely part of entity relabeling. An inferred fact can collect multiple observed literal pairs, and the same literal pair may be spread over several inferred entity-pair facts. Thus latent fact populations are not paired one-to-one with fixed-name fact populations.

## Saved runs and limitations

- Seed 20260912: [configuration](../../nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912/config.json), [run manifest](../../nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912/run.json), [MAP rows](../../nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912/map_world_sentences.tsv).
- Seed 20260913: [configuration](../../nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/config.json), [run manifest](../../nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/run.json), [MAP rows](../../nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/map_world_sentences.tsv).

The new low-β runs were copied from the already validated entity-factorial-corrected variant. Relative to its earlier latent β=.1 condition, only β changed to .001; the same-seed post-entity outputs are unchanged because the noun-only phase uses α, not β. Lower β, the entity correction and fixed-name entity restriction are three separate interventions and should not be conflated.

The model has no semantic entity types, external alias dictionary, document context, temporal representation, negation model or supervised true-fact labels. Evidence consists only of extracted argument strings and dependency paths. The source repair establishes the tested mathematical target, not real-world entity correctness, convergence, or recovery of the paper's claimed precision.
