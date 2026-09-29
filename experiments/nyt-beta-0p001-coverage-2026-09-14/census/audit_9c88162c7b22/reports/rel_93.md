# audit_9c88162c7b22 — rel_93: met or encountered

Predicate ID: met_with

Person, group, institution, or sports team X actually met or encountered Y.

Includes: explicit actual meet or meet-with encounter; a meeting between representatives clearly attributed to the named institutions; actual meeting of opposing sports teams. Excludes: communication alone without an encounter; a proposed or scheduled meeting not established as occurring; physical confluence of rivers or geographic features; mere co-occurrence or comparison. Ambiguous unless resolved by case-local evidence: future or planned meeting when occurrence is unresolved; meeting versus satisfying an abstract requirement; unclear representatives or participants. The primary direction follows the extracted arguments, although an encounter is semantically mutual. Team meetings include competitive encounters but do not imply a result.

Complete census: 1 supported, 1 incorrect, 0 ambiguous; N=2. Precision 1/2=50.00% to 1/2=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | nsubj\|&lt;-nsubj&lt;-meet-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;minister-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;secretary-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-prepare-&gt;prep-&gt;for-&gt;pobj-&gt;meeting-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-protect-&gt;dobj-&gt;flag-burning-&gt;dep-&gt;defile-&gt;nsubj-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-receive-&gt;dobj-&gt;minister-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-visit&lt;-rcmod&lt;-time-&gt;rcmod-&gt;new-&gt;nsubj-&gt;\|nsubj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-provide-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of-&gt;dep-&gt;clause-&gt;partmod-&gt;grant-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-provision-&gt;partmod-&gt;give-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-make-&gt;prep-&gt;by-&gt;pobj-&gt;minister-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-amendment&lt;-pobj&lt;-as&lt;-prep&lt;-law&lt;-nsubj&lt;-raise-&gt;csubj-&gt;restrict-&gt;dobj-&gt;authority-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_93__ent_512__ent_754

**All observed names:** George P. Shultz → Eduard A. Shevardnadze (7)

Ordered IDs: Ent[ent_512] → Ent[ent_754]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8253](../raw_map.tsv:8253) | George P. Shultz | Eduard A. Shevardnadze | nsubj\|&lt;-nsubj&lt;-meet-&gt;dobj-&gt;\|dobj |
| [8254](../raw_map.tsv:8254) | George P. Shultz | Eduard A. Shevardnadze | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-make-&gt;prep-&gt;by-&gt;pobj-&gt;minister-&gt;appos-&gt;\|appos |
| [8255](../raw_map.tsv:8255) | George P. Shultz | Eduard A. Shevardnadze | nsubj\|&lt;-nsubj&lt;-visit&lt;-rcmod&lt;-time-&gt;rcmod-&gt;new-&gt;nsubj-&gt;\|nsubj |
| [8258](../raw_map.tsv:8258) | George P. Shultz | Eduard A. Shevardnadze | nsubj\|&lt;-nsubj&lt;-receive-&gt;dobj-&gt;minister-&gt;appos-&gt;\|appos |
| [8259](../raw_map.tsv:8259) | George P. Shultz | Eduard A. Shevardnadze | nsubj\|&lt;-nsubj&lt;-prepare-&gt;prep-&gt;for-&gt;pobj-&gt;meeting-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [8260](../raw_map.tsv:8260) | George P. Shultz | Eduard A. Shevardnadze | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;secretary-&gt;appos-&gt;\|appos |
| [8261](../raw_map.tsv:8261) | George P. Shultz | Eduard A. Shevardnadze | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;minister-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). George P. Shultz → Eduard A. Shevardnadze: Actual meet and meet-with paths, together with receiving the named minister, establish an encounter despite another row about preparation.

Cited evidence lines: [8253](../raw_map.tsv:8253), [8254](../raw_map.tsv:8254), [8255](../raw_map.tsv:8255), [8258](../raw_map.tsv:8258), [8259](../raw_map.tsv:8259), [8260](../raw_map.tsv:8260), [8261](../raw_map.tsv:8261).


Issue tags: mixed_evidence

### rel_93__ent_663__ent_189

**All observed names:** Constitution → Congress (5)

Ordered IDs: Ent[ent_663] → Ent[ent_189]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4242](../raw_map.tsv:4242) | Constitution | Congress | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-provision-&gt;partmod-&gt;give-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4243](../raw_map.tsv:4243) | Constitution | Congress | poss\|&lt;-poss&lt;-amendment&lt;-pobj&lt;-as&lt;-prep&lt;-law&lt;-nsubj&lt;-raise-&gt;csubj-&gt;restrict-&gt;dobj-&gt;authority-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4245](../raw_map.tsv:4245) | Constitution | Congress | pobj\|&lt;-pobj&lt;-of-&gt;dep-&gt;clause-&gt;partmod-&gt;grant-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4246](../raw_map.tsv:4246) | Constitution | Congress | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-provide-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [4247](../raw_map.tsv:4247) | Constitution | Congress | nsubj\|&lt;-nsubj&lt;-protect-&gt;dobj-&gt;flag-burning-&gt;dep-&gt;defile-&gt;nsubj-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Constitution → Congress: Constitutional grants and limits on Congress concern a document and institution, not an actual meeting.

Cited evidence lines: [4242](../raw_map.tsv:4242), [4243](../raw_map.tsv:4243), [4245](../raw_map.tsv:4245), [4246](../raw_map.tsv:4246), [4247](../raw_map.tsv:4247).



