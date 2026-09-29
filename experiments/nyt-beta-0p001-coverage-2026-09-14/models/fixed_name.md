# Fixed literal-name entities, β = 0.001

This family is the saved September 12 `verbatim_beta0001` condition. “Fixed name” means one entity identifier per **exact observed noun string**. It does not mean externally verified real-world identities. Homonymous names cannot be separated, and different strings for the same entity cannot be joined. These restrictions are explicit modeling choices.

| Configuration key | Value | Role |
|---|---:|---|
| `freezeArgumentEntities` | true | Skip entity phase and both sentence-origin argument updates |
| `numEnts` | 1199 | Initial and fixed available entities; equals noun vocabulary |
| `numRels` | 200 | Continuous-mean parameter of the occupied-relation count factor |
| `maxRels` | 400 | Fixed relation slots; affects prior as well as search |
| `alpha` | .001 | Noun dictionary pseudocount, total 1.199; noun likelihood is constant within this family |
| `beta` | .001 | Path dictionary pseudocount, total 4.276 |
| `sparsityA`, `sparsityB` | 1, 1437601 | Integrated Beta prior; overrides constant sparsity |
| `sparsity` | .001 | Retained fallback value; constant branch inactive |
| `numIterations`, `stepsPerIteration` | 1000, 2000 | Nominal schedule |
| `entityFraction` | .02 | Reserves 20 nominal iterations that frozen mode skips |
| Actual entity / relation iterations | 0 / 980 | 0 / 1,960,000 proposal calls |
| `sentenceRelationMoveWeight` | 0 | Optional bridge disabled |
| `checkpointEvery` | 100 | Coarse diagnostic snapshots; MAP checked every iteration |
| `seed` | 20260912 or 20260913 | Independent replayable trials |

The [shared target](target_and_inference.md) is conditioned on the deterministic noun-to-entity assignment and N=1199. Both the entity-count and collapsed noun terms are constants over the accessible relation states; the latter remains in the reported log weight. Fact creation/deletion, relation reassignment and relation split/merge remain active. Multiple relations can express different facts about one literal pair; nothing forces a pair to have only one relation.

The guard in [ControlledNYT.java](../../nyt-precision-investigation-2026-09-12/variants/controlled/src/main/java/org/ucb/generative_ie/experiments/ControlledNYT.java), lines 81–82, requires enough initial entities for all nouns. Lines 98–104 skip entity inference in frozen mode. [SentenceOriginRV.java](../../nyt-precision-investigation-2026-09-12/variants/controlled/src/main/java/org/ucb/generative_ie/mcmc/SentenceOriginRV.java), lines 62–65, skips argument Gibbs updates. The observer throws if any argument entity drifts from initialization. Both saved summaries report zero post-entity and final drift; direct MAP comparisons also find zero changed argument positions.

## Bug-fix status

The saved `controlled` source includes the five earlier repair families: the bounded fact-deletion proposal correction, smart-split reverse-likelihood signs, null aborted-empty splits, stable probability/log-sum handling, and reverse smart-merge normalizers. Their code and regressions remain in the source archive.

**The later entity-count factorial correction is absent from this source.** That remaining defect is in the entity smart split/merge kernels, which these runs never invoke. Neither `MentionRV` nor any entity split/merge step is selected in the frozen relation phase, and argument Gibbs updates are disabled too. The omission is therefore dormant for these saved trajectories. Calling this family “all active sampling bugs corrected” is accurate within the confirmed defect list; calling its complete source universally fixed would not be accurate.

The fixed-name restriction predates the factorial discovery and is not the factorial fix. Other inherited experimental heuristic classes remain in the archive with zero active weight; their presence does not imply they contributed transitions.

## Saved runs and evaluation implications

- Seed 20260912: [configuration](../../nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/config.json), [run manifest](../../nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/run.json), [MAP rows](../../nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/map_world_sentences.tsv).
- Seed 20260913: [configuration](../../nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260913/config.json), [run manifest](../../nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260913/run.json), [MAP rows](../../nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260913/map_world_sentences.tsv).

There are 1,929 and 1,942 expressed facts, respectively, on the same 920 ordered literal pairs. Each expressed fact is a distinct `(relation,entity1,entity2)` triple. Exact repeated rows do not add new facts; placing one literal pair into multiple relations does. The coverage evaluation grades full selected fact populations, using all saved evidence, rather than treating each row as an independently correct extraction.

Low smoothing and fixed names can make some relations lexically clean while leaving near-synonymous predicates fragmented among many slots. Manual precision measures the selected predicate's support in each fact's supplied evidence. It does not directly measure whether every alias was resolved, whether two relation dictionaries should be merged, or how many true facts were missed.
