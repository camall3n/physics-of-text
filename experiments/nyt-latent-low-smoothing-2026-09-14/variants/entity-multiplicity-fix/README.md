# Corrected sampler source compatibility path

The src directory is a symlink to [code/sampler/src](../../../../code/sampler/src), the single maintained corrected implementation. Its 156 source-tree files retain their original bytes.

The study's build_entity_variant.mjs and run_entity_experiment.mjs delegate to shared code while retaining this study's build directory and output boundary. Historical source archives and runtime_classes were not changed.

See [consolidation verification](../../../sampler-consolidation-2026-09-28/README.md) and [maintained sampler instructions](../../../../code/sampler/README.md).
