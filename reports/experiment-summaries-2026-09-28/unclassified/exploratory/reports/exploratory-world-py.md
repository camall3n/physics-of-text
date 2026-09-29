# Exploratory world generation in world.py

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Reviewed 2026-09-28 from source only. The script was not executed.

## Purpose and design

[world.py](../../../../../world.py) is a small Python exploration of the paper's sparse binary-fact generative model. It samples a dense fact tensor and compares realized per-relation density with the probability used to generate that relation.

The source sets N=1,000 objects, K=100 relations and NumPy `default_rng(seed=42)`. For each relation k it samples sigma_k ~ Beta(1,100), then N×N independent Bernoulli(sigma_k) entries, including diagonal object pairs. The fact tensor has shape [100,1000,1000]. It computes the observed density divided by sigma_k and prints the first ten sigma values and ratios, followed by the minimum, maximum, mean and median ratio.

A second diagnostic calculates the theoretical binomial standard deviation and flags density ratios lying outside 1 ± 2×standard deviation of the ratio. The printed label says “95% CI violations”; the implemented interval is a conditional normal approximation around the known generating probability, not an exact binomial interval or a confidence interval for an estimated unknown parameter.

Finally, after `main()`, the source calls Seaborn on one 50-dimensional Dirichlet draw with every concentration 1/50 (total concentration 1), using the same RNG after the world draws. This is a lexical-weight illustration with no sentence generation or inference.

## Saved results and reproducibility

Only the script is identifiable as evidence for this exploration. No corresponding saved sigma values, fact tensor, terminal transcript, figure, metrics or run manifest was found in the repository-level evidence. Consequently there is no empirical result or successful-execution claim to report. Seed 42 records the intended RNG initialization, but the exact NumPy/Seaborn versions of any past execution are unknown.

[pyproject.toml](../../../../../pyproject.toml) declares Python >=3.9 but has an empty dependency list, while the script imports NumPy and Seaborn. It executes `main()` on import; it is not a passive reusable library. The dense default float64 fact tensor alone would contain 100 million entries (approximately 800 MB), which describes the implementation's allocation, not observed runtime memory.

## Correctness status and relation to the paper

No run-specific defect audit or sampler validation is attached. The explicit Beta(1,100) parameter differs from setting its second parameter to N²=1,000,000; this is a visible experimental choice, not evidence of an implementation bug. The script illustrates sparsity and dictionary probability behavior, but does not infer latent entities, relations or sentence origins, and does not evaluate Figure 1 or the NYT precision claim. No topic-model fit is present.

Its later-review role is an exploratory, seeded source-level demonstration of generative assumptions with no identified saved outcome. It should not be counted as a completed scientific inference run. No deletion decision is made.
