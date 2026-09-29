# Historical NYTExperimentTest transcript in tmp/results.txt

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Purpose: retained Maven execution and trigger-snapshot evidence from an early NYT experiment.

Artifact: [tmp/results.txt](../../../../../resources/sampler-140626/tmp/results.txt). It begins with `mvn -Dtest=NYTExperimentTest -Dsurefire.useFile=false test`, records 89 nouns, 123 paths and 50 ordered argument pairs, ten checkpoints 0–9000 of 10000, and 800 trigger entries. Maven reports one test, zero failures/errors, 46.217 seconds test elapsed, 47.579 seconds total, finishing **2013-06-06 14:22:42 CEST**.

The inventory matches the 223-sentence McCallum subset-2 inventory, but this transcript does not identify an input filename or its sentence count. Its displayed trigger values differ from [McCallum output-2](../../../../../resources/sampler-140626/results/McCallum-corpus-sub/output-2.txt); it is a separate preserved run transcript, not an exact copy of that stream. The matching inventory alone is not proof of identical corpus bytes.

Seed, full configuration, exact producing revision, initialization/entity policy and proposals per iteration are not recorded. A successful historical test invocation is not evidence of semantic accuracy or of a correct MCMC target. Imported June-2014 archive artifact. Exact producing revision, seed, initialization and entity-freeze policy are not recorded. [CHANGES](../../../../../resources/sampler-140626/CHANGES.md) and [the historical code audit](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) establish bugs in the imported source (including an incomplete relation joint, entity/state defects and proposal/normalization errors), but cannot establish the impact of every bug on this earlier log. The update's later fact-deletion bug and pool/count-prior change did not belong to the original implementation.

There is no complete fact set, row partition, manual judgment set, semantic precision estimate or gold recall. Trigger probabilities are model displays, not precision. The named NYTExperimentTest source is not present at that path in the current source tree, further limiting reconstruction.

Current role: a dated historical execution trace and qualitative trigger record with limited provenance. Its build-success line must not be counted as a current test or corrected rerun. No tests, inference or report regeneration were executed.
