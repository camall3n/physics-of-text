# Proposed publication integrity adaptation — NOT APPLIED

Automatic approval review rejected changing the integrity checker under the merge/push authorization. This directory contains a **review-only patch**. It has not changed or executed the evaluator, protection rules, maintenance ledger, or frozen manifests. Applying it requires explicit approval.

## Why this is proposed

A clean Git checkout intentionally excludes Finder metadata. Three such files were accidentally captured as preserved entries in the evaluation-consolidation baseline. In addition, merging the existing upstream branch changes two archived source/documentation files that older preservation manifests fingerprint. The proposal records those exact transitions without treating any scientific data as replaceable.

## Exact scope

The patch permits omission of only these three paths. Their original byte counts and hashes must match the frozen baseline declaration; a present copy must still match its original bytes:

- `experiments/nyt-beta-0p001-coverage-2026-09-14/.DS_Store`
- `experiments/nyt-beta-0p001-coverage-2026-09-14/census/.DS_Store`
- `experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_06dbdb9b03af/.DS_Store`

Only these two source/documentation paths may be added as exact old-to-new hash transitions in the current maintenance ledger:

- `resources/sampler-140626/CHANGES.md`
- `resources/sampler-140626/src/main/java/org/ucb/generative_ie/experiments/LexicalEntropyExperiment.java`

The pre-merge ledger stays archived unchanged. Existing refactor verification continues to validate that snapshot against its original baseline. A separate publication check proves that the live ledger differs only at the two specified entries, retaining previous hashes, reasons and historical authorization. No new data or deletion exceptions are admitted.

The final-source check permits exactly one documented implementation transition:

- `code/evaluation/tests/migration/verify_baseline.mjs`

Its previous hash and byte count must match the frozen `after_source_manifest.json`; its new hash and byte count must match the actual proposed checker. The other 172 entries remain exact. The canonical evaluator inventory cannot grow or shrink.

The reusable helper and 15 fixture-only tests would be added under `code/maintenance/`, outside the frozen evaluator inventory. No code in `code/evaluation/verify_preservation.mjs`, either legacy integrity script, either historical protected manifest, the original baseline, or the final-source manifest is changed.

## Record contract, after approval

The proposed checker recognizes only `reports/git-publication-2026-09-29/verification.json`. Without that file it retains the previous strict behavior.

```text
schema_version: 1
authorization: nonempty description of explicit approval
pre_merge_maintenance_ledger:
  path: reports/git-publication-2026-09-29/pre_merge_maintenance_changes.json
  sha256: exact archived ledger hash
omitted_os_metadata:
  [exactly three {path, bytes, sha256} records from before_manifest.json]
maintenance_transitions:
  [exactly two {path, previous_sha256, current_sha256, reason} records]
source_transitions:
  [exactly one {path, previous_sha256, previous_bytes,
                current_sha256, current_bytes, reason} record]
```

The prior source hashes are anchored in frozen manifests. Transition reasons must equal the corresponding live ledger entries. The current ledger must otherwise equal the archived ledger, allowing only an appended authorization explanation.

## Proposed validation

The patch includes tests for accepted exact records, metadata omission and present-file checks, rejected symlinks, attempts to omit scientific data, changed old hashes, extra ledger/data/deletion exceptions, altered historical authorization, snapshot tampering, missing/current source mismatches, mismatched reasons, additional evaluator exceptions, and checker tampering.

These tests have **not been run**: the proposed implementation has not been applied. After approval, run the fixture tests and the existing scientific and preservation checks before publication. This patch does not itself update `verification.json` or the maintenance ledger; exact hashes must be recorded only after the approved source changes exist.
