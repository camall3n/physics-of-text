# Paper/model comparison: entity, smoothing, sparsity and reporting calculations

Organization: [experiment index](../README.md) · [bug-state definitions](../BUG_CATALOG.md).

This analytic study separates implementation repairs from underspecified or different modeling choices that could affect the paper's approximately 95% precision claim. It records mathematical examples and source interpretation, not a new MCMC trial, selected-seed optimization or independent replication.

## Stated experiment versus archived implementation

The paper describes roughly 8,500 NYT sentences, about ten minutes of MCMC, a most-likely sampled world with about 200 relations, and manual verification of all facts in the 20 most common relations. It omits exact hyperparameters, seeds, proposal budget, complete denominator and reviewer rubric. Its elementary model uses verbatim named arguments and defers entity-reference machinery. The archive can instead infer latent noun-emitting entities; it is not verified as the exact paper implementation. Thus true fixed-name inference is a justified conditional-model comparison, while beta, sparsity, count interpretation and reporting remain modeling decisions.

## Saved calculations

With V=1,199 literal names and per-name alpha=0.001, total noun concentration A=1.199. The collapsed ordered-mention likelihood has no multinomial count coefficient. Merging two distinct singleton names has noun-likelihood factor A/(A+1)=0.54525. For two pure names each repeated 2, 5 or 10 times, the corresponding factors are approximately 0.1963, 0.005364 and 0.000008261; rare names are weakly protected.

For J=17,032 mentions, reducing N from 1,199 to 1,198 improves uniform mention selection N^(−J) by about 1,485,256. In an illustrative fully occupied case, combining its factorial and singleton noun factors gives a target ratio near 676. This is not an MH acceptance probability: actual forward/reverse proposal multiplicities also matter. The separately proven missing factorial is an implementation defect; this target-density illustration alone did not prove it.

| Per-path beta | Total B=4,276 beta | Novel path: join unrelated 1-row relation | Join unrelated 500-row relation |
| --- | --- | --- | --- |
| 0.1 | 427.6 | 0.99767 | 0.46097 |
| 0.01 | 42.76 | 0.97715 | 0.07878 |
| 0.001 | 4.276 | 0.81046 | 0.00848 |
| 0.0001 | 0.4276 | 0.29952 | 0.000854 |
| 0.1/4,276 | 0.1 | 0.09091 | 0.000200 |

These are dictionary factors B/(n+B), not complete posterior odds and not all saved experimental arms. Actual modern runs use only beta=0.1 or 0.001. The historical beta0001 name means 0.001. Categorical dependency paths lack a shared lexical-semantic model, so reduced smoothing can separate unrelated paths and fragment legitimate paraphrases.

The implemented Beta sparsity is a=1,b=1,199²; the nominal constant sparsity=0.001 is inactive. A labeled fact set with f facts has Beta(a+f,b+N²−f)/Beta(a,b) probability, without a count-event binomial coefficient. Uniform reporting contributes F^(−S); at S=8,516,F=1,925, removing one true fact improves this factor by about 83.5. It can reward reusing one pair/relation fact for correlated predicates. The paper acknowledges correlated-relation confusion; correct sampling does not eliminate it.

## Consequences and limitations

Freezing requires skipping entity inference and both later argument Gibbs updates, not merely literal initialization or entityFraction=0. Latent entity initialization targets N^(−J), while relation inference uses fact reporting F^(−S) and fixes entity count, so the full two-phase procedure is not a single stationary sampler. The relation pool changes the occupied-count prior; its exact enumeration is documented separately. MAP inspection follows the paper's stated endpoint but one saved MAP does not establish convergence, and log-joint values under different targets are not accuracy comparisons.

The analytic numbers motivate the controlled experiments; they do not predict precision. The original note's older censuses/screens must be distinguished from the later complete shared-rubric census of retained runs. The strongest claims supported are about model mechanics and missing historical specification, not recovered paper settings or a proven explanation of the entire accuracy gap.

## Evidence and cleanup dependencies

[Full source-linked analysis](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/paper_model_choices.md) · [Paper](../../../resources/russell-2016-the-physics-of-text.pdf) · [Frozen code](../../../experiments/nyt-precision-investigation-2026-09-12/baseline/src) · [Controlled design](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/experiment_design.md) · [Latest complete comparison](../../../experiments/nyt-complete-evaluation-2026-09-14/comparison.json). Preserve paper, imported-source provenance, baseline and exact parameter configurations. This report relies on the saved paper/source analysis; no new web retrieval or PDF audit was performed.

This report summarizes existing evidence only. No calculations, simulations or tests from the experiment were rerun, no scientific outputs were rewritten, and no cleanup/deletion decision was made. Preserve the linked inputs, source, output and interpretation together; a summary cannot replace exact reproducibility artifacts.
