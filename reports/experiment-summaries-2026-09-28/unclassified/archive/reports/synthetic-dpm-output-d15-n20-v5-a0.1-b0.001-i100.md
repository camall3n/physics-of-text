# Archived Bernoulli-mixture configuration: output-d15-n20-v5-a0.1-b0.001-i100

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Reviewed 2026-09-28 from saved files and source only; no sampler or test was run.

## Purpose and identity

This directory is a synthetic Bernoulli-mixture sampler diagnostic, exploring component inference under different sampling kernels, data sizes and smoothing. It is not an NYT extraction or a fitted text-topic-model result. The identifying parameters are encoded by [MixtureInference.run](../../../../../resources/sampler-140626/src/main/java/org/ucb/dpm/MixtureInference.java), whose directory-name construction matches this folder.

Primary evidence: [likelihood values](../../../../../resources/sampler-140626/output-d15-n20-v5-a0.1-b0.001-i100/likelihood.txt), [sorted component shares](../../../../../resources/sampler-140626/output-d15-n20-v5-a0.1-b0.001-i100/JN-diagram-all.txt), and [cumulative top-five shares](../../../../../resources/sampler-140626/output-d15-n20-v5-a0.1-b0.001-i100/JN-diagram-top5.txt). These are the three saved files in the directory.

## Design recovered from the directory and code

The configuration encodes dimension=15 binary coordinates, data size=20, sampler version=5, alpha=0.1, beta=0.001, and a nominal 100 iterations. Alpha is the mixture-assignment concentration; beta is the symmetric Beta(beta,beta) prior for each component's Bernoulli coordinate. Version 5 chooses among smart-split/dumb-merge, smart-merge/dumb-split, and a component Gibbs update, each with nominal probability one third. A component Gibbs update selects an occupied component and updates its observations.

[MixtureDistributions](../../../../../resources/sampler-140626/src/main/java/org/ucb/dpm/MixtureDistributions.java) generates binary vectors from a JSON mixture specification, assigns fixed blocks of observations to generating components, and initializes all inferred assignments in component 1. Its block generator uses component count rather than drawing mixture IDs from the stored mixture probabilities. The saved initial share vector [1.0] is consistent with that initialization.

The historical [BernoulliExperimentTest](../../../../../resources/sampler-140626/src/test/java/org/ucb/dpm/BernoulliExperimentTest.java) references an external `mixture-dist-c5-d15.json` under an author's /home/wei directory, with n=1000/version=5/alpha=0.1/beta=0.001/100 iterations. That is relevant family evidence, not proof that every directory used that same five-component input. The mixture specification and generated vectors for this directory are absent. Its exact generating probabilities, seed, date, command, executable version and environment are not recorded. [BernoulliExperiment.main](../../../../../resources/sampler-140626/src/main/java/org/ucb/dpm/BernoulliExperiment.java) and the historical test construct unseeded Random instances.

## Saved outcomes and trajectory boundaries

Read-only parsing found 404 numeric likelihood values, 404 component-share rows, and 404 top-five rows. The files agree in observation count. [MixtureObsever](../../../../../resources/sampler-140626/src/main/java/org/ucb/dpm/MixtureObsever.java) observes once before inference and once per iteration, using append writes.

The 404 observations exceed the 101 expected for a single complete 100-iteration invocation. The append-based writer and repeated single-component states are consistent with repeated or partial invocations being concatenated. Exact run boundaries and completion status are not recorded; this report treats the folder as a configuration-level archive, not one 403-iteration chain.

| Descriptive property of saved sequence | Value |
|---|---:|
| First log likelihood | -314.562069 |
| Last log likelihood | -134.914203 |
| Minimum saved log likelihood | -314.659971 |
| Maximum saved log likelihood | -118.710530 |
| Occupied components in first row | 1 |
| Occupied components in last row | 6 |
| Range of occupied-component counts | 1–7 |

Last-row sorted shares: 25%, 20%, 20%, 15%, 15%, 5%. The top-five file contains cumulative sums of sorted shares, not five separate mixture weights.

The observer writes `worldLikelihood()`, the sum of collapsed component Bernoulli log likelihoods, without the assignment prior. Therefore these values are not full posterior scores or semantic precision. They are also not comparable across sample sizes or different generated datasets as a controlled kernel-quality test. Final cluster count or equal-sized shares do not establish recovery of the true assignments because vectors and labels were not saved.

## Correctness and reproducibility status

This archival DPM path has no run-specific correctness audit, convergence diagnostic, acceptance log, truth comparison or paired seed record. It uses shared LogProbMap and Util helpers that have [documented historical normalization defects and later corrections](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md). That establishes a potentially relevant dependency in the code, not a measured failure in this saved trajectory; the producing executable is not fingerprinted. The 2026 NYT entity/fact proposal corrections do not automatically validate this separate DPM implementation. Current source should not be assumed byte-identical to the producer.

The three saved diagnostics preserve likelihood and cluster-size behavior but cannot reconstruct the observations or the exact chain. No missing input was regenerated during this review.

## Relation to the paper and later review

This is sampler-development evidence for Bernoulli mixture split/merge methods. Source comments connect it to Jain–Neal-style work; no saved provenance establishes that this configuration produced a figure or numerical claim in The Physics of Text. It supplies historical context for inference machinery, distinct from the Figure 1 same-relation experiment and real-corpus semantic audits.

For later review, its interpretive role is a configuration-specific archive of sampler behavior with unresolved concatenation boundaries. This report makes no deletion recommendation or unsupported quality label.
