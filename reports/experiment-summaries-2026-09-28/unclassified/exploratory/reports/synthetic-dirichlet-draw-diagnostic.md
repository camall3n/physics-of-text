# Archived Dirichlet draw diagnostic

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Reviewed 2026-09-28 by reading the saved artifact and its likely writer. No new random draws or tests were run.

## Purpose, sources and design

[dirichlet.output](../../../../../resources/sampler-140626/dirichlet.output) contains 100,000 vectors, each of length four. [DirichletDistrTest.testDirichlet](../../../../../resources/sampler-140626/src/test/java/org/ucb/generative_ie/random/DirichletDistrTest.java) writes that exact filename after 100,000 calls with alpha=[0.5,0.5,0.5,1.5]. The matching name, dimensions and count make it a strong producer identification, but no attached command, run date, seed or source fingerprint proves the historical execution.

The likely purpose is inspection of the shared Dirichlet random generator. It is not an MCMC relation-recovery or topic-model experiment. The test also contains analytic density/coefficient checks and a sandbox, but this output file does not establish that those other tests passed.

## Saved outcome

Read-only arithmetic over the stored vectors gives:

| Coordinate | Saved sample mean | Theoretical mean for the indicated alpha |
|---|---:|---:|
| 1 | 0.165712 | 0.166667 |
| 2 | 0.166215 | 0.166667 |
| 3 | 0.168107 | 0.166667 |
| 4 | 0.499967 | 0.500000 |

All 100,000 vectors have four entries. The largest absolute deviation of their sums from one is approximately 3.33×10^-16. These descriptive values concern existing data; they are not newly simulated results or a formal goodness-of-fit test.

## Correctness, provenance and interpretation

[DirichletDistr](../../../../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/random/DirichletDistr.java) uses an external static Gamma RNG rather than receiving the experiment RNG. Its current underflow fallback also constructs a fresh Random. The [documented RNG limitation](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) therefore applies to exact reproducibility of this component. The artifact does not record the RNG state or dependency versions, and current source is not proof of the archived producing code.

No active bug affecting these saved draws is established by the available evidence. Near-theoretical means and normalized rows establish only those descriptive properties; they do not certify all parameter regimes, independence, or end-to-end inference.

The Physics of Text uses probabilistic dictionaries, so this artifact offers component-level development context. There is no evidence that it underlies a published experimental number. Its review role is an archived generator diagnostic with a plausible writer and bounded evidence, without a deletion recommendation.
