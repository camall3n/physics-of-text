# Unattributed archived log-probability trace

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Reviewed 2026-09-28 from saved numeric evidence and source references. No inference or plotting was run.

## Identity and available evidence

[logprobs.data](../../../../../resources/sampler-140626/logprobs.data) is a JSON object containing six sequences of 10,000 numeric entries: total, trigs, lex, facts, args and origin. It sits at the sampler directory root, without a colocated run manifest, configuration or final world.

The historic [graph_logprobs.py](../../../../../resources/sampler-140626/scripts/graph_logprobs.py) can read a caller-supplied JSON trace and plot every series, but does not identify the producer. The [current ObserveProb writer](../../../../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/inference/ObserveProb.java) writes logprobs.txt with a different schema. Consequently this artifact is not assigned to a named synthetic or NYT experiment on filename or trace magnitude alone.

## Descriptive saved outcome

| Series | Entries | First | Last | Minimum | Maximum |
|---|---:|---:|---:|---:|---:|
| total | 10,000 | -1,966,645.498425 | -1,964,643.998433 | -1,966,645.498425 | -1,964,408.267502 |
| trigs | 10,000 | -18,477.042459 | -16,839.384558 | -18,477.042459 | -16,638.720615 |
| lex | 10,000 | 19,350.650962 | 19,721.413572 | 19,350.650962 | 19,838.777076 |
| facts | 10,000 | -1,925,877.306231 | -1,925,884.212986 | -1,926,105.229139 | -1,925,787.518419 |
| args | 10,000 | 0 | 0 | 0 | 0 |
| origin | 10,000 | -41,641.800697 | -41,641.814461 | -41,642.254893 | -41,641.621754 |

These values were summarized from the existing file. Their names suggest a historical generative-model probability decomposition, but the exact definitions and normalization cannot be inferred from the labels alone. A likelihood improvement is not semantic accuracy; the highest total entry is not proof that the chain converged or that a corresponding MAP world survives.

## Missing design and correctness evidence

The corpus or synthetic generator, entity/relation counts, concentration and sparsity parameters, initialization, seed, burn-in, move budget, date, source version and environment are unknown. Ten thousand observations do not prove ten thousand full inference iterations, because the observer schedule is not identified. It is also not established whether entries span a single invocation.

No active bug can responsibly be attributed to this trace without identifying the producing implementation and exercised path. Known archive and later-source defects elsewhere cannot be applied to an unnamed run merely because it has a low or high numerical score. The original data are readable, but exact reproduction and a paper-level interpretation are unsupported.

## Relation to the paper and later review

This preserves an historical numerical trace potentially relevant to sampler development. There is no established link to Figure 1, the paper's NYT claims, or a text-topic-model experiment. Its review role is explicitly unresolved provenance: it should not silently be counted as a confirmed replication, merged with a known run, or given an unsupported quality label. No deletion or retention decision is made.
