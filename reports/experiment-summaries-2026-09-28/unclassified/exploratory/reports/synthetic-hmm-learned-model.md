# Archived two-state HMM learning example

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Reviewed 2026-09-28 from saved source and model output. No HMM training or test was run.

## Purpose and source association

[learntHmm.dot](../../../../../resources/sampler-140626/learntHmm.dot) is an eight-line Graphviz model with two states and FIRSTNAME/SURNAME emissions. [HMMTest](../../../../../resources/sampler-140626/src/test/java/org/ucb/generative_ie/util/HMMTest.java) is a Jahmm example that learns a two-state HMM from synthetic sequences and writes that exact filename. Filename, state count and emission labels agree, making this the likely writer; a saved run manifest or exact executable link is absent.

The code generates 200 sequences of length 100 from a known two-state model, then performs ten Baum–Welch iterations. The generating initial probabilities are [0.95,0.05]; transitions are [[0.95,0.05],[0.10,0.90]]; emissions FIRSTNAME/SURNAME are [0.95,0.05] and [0.20,0.80]. The learner starts from initial probabilities [0.5,0.5], transitions [[0.8,0.2],[0.2,0.8]], and emissions [0.8,0.2]/[0.1,0.9]. No explicit seed is supplied.

## Saved outcome

The DOT file preserves rounded learned parameters:

| Quantity | State 0 | State 1 |
|---|---:|---:|
| Initial probability | 0.93 | 0.07 |
| Transition to state 0 | 0.95 | 0.10 |
| Transition to state 1 | 0.05 | 0.90 |
| FIRSTNAME emission | 0.954 | 0.201 |
| SURNAME emission | 0.046 | 0.799 |

These rounded parameters resemble the generating model specified in source. The training sequences, exact learned parameter object, per-iteration KL estimates and probability of the example FIRSTNAME/FIRSTNAME/SURNAME sequence were not saved alongside this file. The source prints those diagnostics, but their values are unavailable; no numerical convergence or generalization conclusion follows from the graph alone.

## Correctness, reproducibility and paper relation

This is a library demonstration, not the relation-discovery sampler or a completed topic-model experiment. There is no run-specific defect evidence or validation transcript. Jahmm versions, historical command, date, random state and source fingerprint are unrecorded. The [sampling-fix notes](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) explicitly exclude archive-only tests requiring unavailable HMM APIs from the cited modern 85-test suite; that suite does not validate this artifact.

The file has no established link to a figure or quantitative claim in The Physics of Text. It documents a small synthetic sequence-model learning example within the archive. Its review role is a saved learned-model diagnostic with plausible source attribution, not evidence for NYT semantic precision. No deletion decision is made.
