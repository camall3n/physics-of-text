# Proposed legacy integrity compatibility update

This patch is prepared for review and has **not been applied**. The September 12 and latent September 14 integrity scripts remain unchanged.

The original manifests remain byte-for-byte unchanged. The proposed adapters keep every original entry, original expected hash, symlink check, saved-run output hash check, and paired-configuration check. An exception is admitted only for one exact repository-relative path in `maintenance_changes.json`, where that manifest's expected SHA-256 is explicitly in `previous_sha256` and the file's actual SHA-256 equals `current_sha256`; a null current hash requires the artifact to be absent. Reappearance of a deliberately deleted file is a failure. No directory, run, or missing file is skipped wholesale.

The September 12 baseline has 1,126 hash-only entries; the latent baseline has 6,062 entries with hashes or a symlink target. Neither recorded file byte lengths. The helper adjustment preserves their original SHA-256 checks while continuing to require byte equality whenever a manifest supplies a byte count. Both adapters add `--check` to avoid writing verification reports during read-only checks.

Automatic approval review rejected applying this change, stating that permission to remove buggy evaluations does not itself authorize changing historical integrity controls to accept maintenance exceptions. Applying this reviewable patch therefore requires explicit user approval. The exact maintenance ledger should be reviewed with the patch; it records each authorized before/after hash and deletion separately.
