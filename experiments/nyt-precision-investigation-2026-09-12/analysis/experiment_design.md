# Experiment design, specified before full-corpus outcomes

The previous NYT baseline motivated this controlled design. Its semantic evaluation and grading data were subsequently retired because the entity factorial defect was active. Raw experiments and the original design below remain preserved. [Cleanup record](../../../reports/buggy-evaluation-cleanup-2026-09-28/README.md).

## Four arms, two fixed seeds

Every arm uses all 8,516 original triples, relation pool 400, count-factor parameter 200, alpha 0.001, sparsity prior Beta(1, 1,437,601), 980 relation iterations and 2,000 proposals per iteration. Both seeds, 20260912 and 20260913, are selected before seeing outputs. All arms are retained regardless of results.

| Arm | Argument identities | Per-path beta | Total dictionary concentration, 4,276 paths | New sentence/relation bridge weight |
|---|---|---:|---:|---:|
| latent_beta01 | Inferred: 40,000 entity-phase proposals, then argument Gibbs moves | 0.1 | 427.6 | 0 |
| verbatim_beta01 | Fixed to original noun strings throughout | 0.1 | 427.6 | 0 |
| verbatim_beta0001 | Fixed throughout | 0.001 | 4.276 | 0 |
| verbatim_beta01_bridge | Fixed throughout | 0.1 | 427.6 | 1 |

The runner uses separate seeded streams for initialization, proposal selection and move randomness. The new categorical iteration order makes separate-JVM replay deterministic on the recorded runtime. Thus this is a new controlled baseline, not byte-for-byte replay of the old unseeded NYT run. Pairing seeds across arms shares initialization and RNG stream specifications; different state trajectories consume different random draws, so pairing does not hold every proposal identical.

Disabling entity inference is a model restriction motivated by the paper's verbatim arguments. Setting `entityFraction=0` alone is insufficient: the ordinary relation-phase origin move also changes argument entities. The frozen flag blocks both routes. It retains the same 1.96-million relation proposal budget and simply omits the 40,000 entity proposals. Consequently total computation is slightly smaller in frozen arms. Fixed N also changes the numerical fact prior compared with an inferred N; the full configuration and count effects must accompany any interpretation.

The beta=0.001 arm uses the per-coordinate value in the archived NYT-scale configuration; it is not asserted to be the value used for the paper's final experiment. The model uses Dirichlet(beta,...,beta), not Dirichlet(beta/V,...,beta/V). Altering beta is an explicit prior choice rather than a sampling correction.

The bridge is intended to preserve the same target probability as verbatim_beta01. Its weight changes the proposal mixture from total weight 3.4 to 4.4, reducing the share of other kernels within the same total budget. This comparison tests efficiency of the complete new mixture; it does not isolate the effect of adding extra computation.

## What will count as evidence

- Independent tiny-world probability and transition checks can establish implementation defects or correctness on their tested domain. Higher semantic precision alone cannot establish mathematical correctness.
- Corpus traces, counts, entity drift, accepted moves and shared-pair statistics diagnose changes in inference and mixing. A higher MAP joint is not semantic precision, and scores under different priors should not be used as an accuracy ranking.
- Manual judgment uses explicit directional predicates, source evidence and supported/incorrect/ambiguous categories. Samples are chosen before judgment, without looking at favorable examples. Because the resulting facts and top-20 relations differ, these are comparisons of output populations, not paired judgments of identical propositions.
- Five facts sampled without replacement per top-20 relation (all facts if fewer than five) produce up to 100 judgments per run. Report a relation-size-weighted estimate for fact-level precision: sum_r (N_r / sum_j N_j) (supported_r / sampled_r), and an upper ambiguity endpoint replacing supported with supported+ambiguous. An unweighted sample average instead estimates a different, approximately relation-weighted quantity. Samples are not censuses and have sampling uncertainty beyond ambiguity.
- A second seed checks whether a structural or semantic result repeats. Two seeds and a short chain are still insufficient for a general convergence claim. If evidence motivates a follow-up, record its rationale and parameters separately rather than replacing an unfavorable initial run.

## Preserving earlier work

All new code, snapshots, configuration, test output, run artifacts, annotations and documentation remain below this investigation directory. Original sampler files are read-only. The original dependency JAR and corpus are shared as read-only inputs and fingerprinted. `baseline/` contains the fixed source as it stood at investigation start; `baseline_manifest.json` fingerprints 1,126 original source, script and result files. Final verification must check they remain unchanged.
