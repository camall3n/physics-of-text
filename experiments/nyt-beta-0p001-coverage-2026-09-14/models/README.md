# The four saved models evaluated at increasing coverage

These documents describe **existing inference outputs**, not newly fitted models. Coverage evaluation changes which of a saved model's relations are manually assessed; it does not change parameters, assignments, inference budgets or source code.

- [Shared target, priors and inference schedule](target_and_inference.md)
- [Fixed literal-name entity model](fixed_name.md)
- [Corrected latent-entity model](latent_entity.md)
- [Exact source/output verification and reproduction](provenance.md), with [machine-readable hashes and measurements](provenance.json)

All four configurations use **β = 0.001**. The historical run-name fragment `beta0001` means 0.001, despite its potentially misleading spelling. It does not mean 0.0001. Seeds are 20260912 and 20260913 for each model.

| Property | Fixed literal names | Corrected latent entities |
|---|---|---|
| Saved experiment | September 12, `verbatim_beta0001` | September 14, `entityfix_latent_beta0001` |
| Entity identity | One entity per distinct exact observed noun string, fixed throughout | Same initial assignment; noun-only entity phase, then restricted argument reassignment in fact inference |
| Available entity objects during relation inference | 1,199 | 1,180 / 1,161, by seed |
| Entity proposals actually executed | 0 | 40,000 |
| Relation proposals actually executed | 1,960,000 | 1,960,000 |
| Active sampling corrections | All applicable corrections from the earlier five-family repair | Earlier five families plus entity-count factorial correction |
| Dormant entity factorial omission in source | Present, but affected kernels are disabled | Corrected |
| Relation pool / count-prior centre | 400 / 200 | 400 / 200 |
| Noun α / path β | 0.001 / 0.001 | 0.001 / 0.001 |
| Sparsity prior | Beta(1, 1,437,601), integrated out | Same fixed hyperparameters |
| Optional sentence/relation bridge | Disabled, weight 0 | Disabled, weight 0 |

The fixed-name model is an explicit entity-model restriction, not a repair to latent entity inference. Likewise β and the 400-slot pool are modeling choices. Correcting acceptance arithmetic does not resolve ambiguity in the paper's modeling choices or establish chain convergence.

Every model uses the same 8,516 ordered argument–dependency-path rows, 1,199 distinct literal nouns, 4,276 paths, and 920 distinct ordered literal argument pairs. These are extracted triples, not complete newspaper sentences. There are 7,732 distinct literal triples, so 784 rows repeat an already occurring exact triple. Repetitions count as separate observations in the fitted likelihood and row coverage. Repeated rows assigned to the same latent fact add evidence rather than extra fact votes, but identical rows can be assigned to different inferred facts. Input-row coverage is therefore not recall against a complete set of true relations, and the evaluated fact populations differ between models.

The two model families differ in production source **only in the two entity smart split/merge files**. Their saved source manifests, archive contents, run parameters, dependency and every recorded output hash were independently verified by [audit_saved_models.mjs](audit_saved_models.mjs). The linked source currently matches each historical per-file manifest; the saved tar archives remain the authoritative source snapshots.
