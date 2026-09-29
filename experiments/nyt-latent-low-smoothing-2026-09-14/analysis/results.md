# Lower smoothing with corrected latent entity inference

The new runs retain all confirmed sampling corrections and inferred entity identities. Only beta changes from 0.1 to 0.001 versus the paired corrected-latent reference. The fixed-name low-beta condition is a second, differently constrained model comparison. Every precision entry below is a 100-fact stratified screen, weighted by each relation’s complete fact population; ambiguity endpoints are not confidence intervals. Sampling and predicate-choice uncertainty are additional.

| Condition | Seed | Precision screen | Available entities | Expressed relations | Expressed facts | Top-20 facts | Top-20 rows |
|---|---:|---|---:|---:|---:|---:|---:|
| Corrected latent entities, beta=0.1 (previous) | 20260912 | 46.1%–52.1% | 1180 | 275 | 2113 | 1184 | 5299 (62.2%) |
| Corrected latent entities, beta=0.001 (new) | 20260912 | 76.2%–84.5% | 1180 | 399 | 2773 | 421 | 1546 (18.2%) |
| Fixed literal names, beta=0.001 (previous) | 20260912 | 91.9%–96.0% | 1199 | 398 | 1929 | 384 | 1824 (21.4%) |
| Corrected latent entities, beta=0.1 (previous) | 20260913 | 37.3%–43.7% | 1161 | 288 | 2195 | 1197 | 5303 (62.3%) |
| Corrected latent entities, beta=0.001 (new) | 20260913 | 85.0%–91.1% | 1161 | 398 | 2861 | 436 | 1521 (17.9%) |
| Fixed literal names, beta=0.001 (previous) | 20260913 | 85.8%–93.8% | 1199 | 400 | 1942 | 364 | 1583 (18.6%) |

Both new runs have exactly the same initialized sentence assignments and exactly the same post-entity-phase assignments as their paired beta 0.1 references. Their source manifests also match. Thus beta begins changing the observed trajectory during relation inference, where it can subsequently affect argument Gibbs reassignment. Identical post-entity states isolate the smoothing change more cleanly than simply sharing a seed.

The relation pool remains 400. Any near-cap relation counts, changed fact populations and lower sentence coverage must accompany interpretation of precision. Coverage means the fraction of corpus rows assigned to the selected 20 relations; gold-standard fact recall is unknown. No convergence claim follows from two short seeded runs. Joint scores under different beta values or entity constraints are not accuracy rankings.

## New-run diagnostics

| Seed | MAP iteration /980 | Mixed-name expressed IDs | Single-row expressed facts | Changed argument IDs /17032 | Final100 iterations with >=399 occupied relations | Last100 vs prior100 mean-joint difference |
|---|---:|---:|---:|---:|---:|---:|
| 20260912 | 976 | 481 | 773 | 5055 | 66 | 1299.4 |
| 20260913 | 973 | 511 | 855 | 5224 | 78 | 946.9 |

Mixed names can be legitimate aliases, and changed implementation IDs do not measure entity-resolution accuracy. Positive block differences are descriptive and do not prove nonstationarity. [Full machine-readable results](results.json), [manual review index](../manual_review/README.md), and [earlier ten-run comparison](../../nyt-precision-investigation-2026-09-12/analysis/experiment_results.md).
