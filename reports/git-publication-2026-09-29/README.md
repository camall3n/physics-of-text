# Git publication and upstream merge — 2026-09-29

Destination: `camall3n/physics-of-text`, branch `main`.

Local checkpoint: `54711e003517de27dd2bd1d5ece068f8f7fca025`.
Upstream merged: `5c3c4cdb6bbe386fd9ae79509fe5b9fded36ce54`.

## Included work

The previously uncommitted sampler fixes, canonical sampler/evaluation implementation, experiment outputs, retained judgments, reports and regression evidence are included together. An evaluator-only commit would omit its scientific inputs.

Local editor state, Python environments/caches, Finder metadata and the `ignored_files.txt` line-count export are ignored. The 201 historical files in `target-javac` are explicitly retained because frozen preservation manifests require their exact bytes. Saved runtime snapshots and source symlinks remain unchanged.

Figure 1's tested Python dependencies are recorded in [requirements-figure1.txt](../../requirements-figure1.txt). Node evaluation uses built-in modules. The archived sampler dependency JAR was already tracked.

## Merge resolution

- Retain the newer audited `HANDOFF.md`, including current corrected evaluations and the retirement of bug-affected grading.
- Integrate upstream's optional `self` argument into the archived Java Figure 1 entry point. The maintained corrected sampler source is unchanged.
- Preserve the upstream raw self-pair arrays and paper-reference crop as historical evidence.
- Retire the two incoming before-fix derived plots under the existing cleanup policy; their bytes remain in the upstream commit.
- Mark the upstream comparison in `CHANGES.md` as historical. Its earlier universal agreement-within-0.05 claim is not adopted.

## Validation

An isolated directory was extracted from the staged Git tree, without local untracked files:

- All 129 JavaScript tests passed, including complete census equality, all five CLI presets, 20 coverage views and generated-report/link checks.
- All 12 Figure 1 tests passed.
- The merged Java Figure 1 source compiled in a separate temporary directory; its new boolean self-pair parameter is present. Frozen runtime classes were not rebuilt or changed.

See [Node log](clean_checkout_node.log), [Figure 1 log](clean_checkout_figure1.log), [Java compile log](merged_java_compile.log) and [compiled signature](merged_java_signature.txt).

## Integrity adaptation awaiting approval

Automatic approval review rejected applying changes to integrity controls under the merge/push instruction alone. The [review-only proposal](PROPOSED_INTEGRITY.md) and [patch](proposed_integrity.patch) are prepared, but are not applied.

The proposed scope is exactly three omitted Finder metadata records, two upstream source/documentation hash transitions and the checker implementation's own exact transition. Scientific files and original manifests remain protected. The existing unrelated legacy-integrity proposal from September 28 remains unapplied.

Historical data symlinks and provenance paths retain their original values; some contain absolute local paths. The current evaluation works from the isolated checkout. Historical replay helpers may still require their original environment.

No new inference or grading was performed for publication.
