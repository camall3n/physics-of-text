# audit_dcb746fa83d6 — rel_97: adviser to principal

Predicate ID: adviser_to

Person X explicitly serves or served as an adviser or counselor to principal Y.

Includes: explicit adviser/advisor-to or possessive adviser role; an identified counselor providing advisory service; historical advisory role. Excludes: director, lawyer, or formal leadership title alone; ordinary communication or acquaintance; confidant alone without advisory service; expertise on a topic rather than advice to a principal. Ambiguous unless resolved by case-local evidence: an omitted or materially incomplete principal; counselor versus legal counsel attachment unresolved; advisory topic substituted for principal. The principal may be a person or institution. Advice does not imply formal management or spokesperson authority.

Complete census: 2 supported, 3 incorrect, 0 ambiguous; N=5. Precision 2/5=40.00% to 2/5=40.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;adviser-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;adviser-&gt;rcmod-&gt;director-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-adviser-&gt;rcmod-&gt;aide-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;discussion-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-summon-&gt;prep-&gt;into-&gt;pobj-&gt;chamber-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-work-&gt;prep-&gt;as-&gt;pobj-&gt;director-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-pitch-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-play&lt;-partmod&lt;-pitch-&gt;dobj-&gt;game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-book-&gt;prep-&gt;about-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-book-&gt;prep-&gt;as-&gt;pobj-&gt;account-&gt;prep-&gt;from-&gt;pobj-&gt;insider-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-president&lt;-pobj&lt;-with&lt;-prep&lt;-meet-&gt;dobj-&gt;\|dobj |

## Every evaluated fact

### rel_97__ent_17__ent_1415

**All observed names:** George Stephanopoulos → White House (4)

Ordered IDs: Ent[ent_17] → Ent[ent_1415]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8444](../raw_map.tsv:8444) | George Stephanopoulos | White House | appos\|-&gt;appos-&gt;adviser-&gt;nn-&gt;\|nn |
| [8447](../raw_map.tsv:8447) | George Stephanopoulos | White House | appos\|&lt;-appos&lt;-adviser-&gt;rcmod-&gt;aide-&gt;nn-&gt;\|nn |
| [8450](../raw_map.tsv:8450) | George Stephanopoulos | White House | poss\|&lt;-poss&lt;-book-&gt;prep-&gt;as-&gt;pobj-&gt;account-&gt;prep-&gt;from-&gt;pobj-&gt;insider-&gt;nn-&gt;\|nn |
| [8451](../raw_map.tsv:8451) | George Stephanopoulos | White House | poss\|&lt;-poss&lt;-book-&gt;prep-&gt;about-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). George Stephanopoulos → White House: Explicit institutional adviser apposition establishes advisory service at the White House.

Cited evidence lines: [8444](../raw_map.tsv:8444), [8447](../raw_map.tsv:8447), [8450](../raw_map.tsv:8450), [8451](../raw_map.tsv:8451).


Issue tags: mixed_evidence

### rel_97__ent_914__ent_310

**All observed names:** Douglas Sosnik → White House (3)

Ordered IDs: Ent[ent_914] → Ent[ent_310]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8509](../raw_map.tsv:8509) | Douglas Sosnik | White House | appos\|-&gt;appos-&gt;adviser-&gt;nn-&gt;\|nn |
| [8511](../raw_map.tsv:8511) | Douglas Sosnik | White House | nsubj\|&lt;-nsubj&lt;-work-&gt;prep-&gt;as-&gt;pobj-&gt;director-&gt;nn-&gt;\|nn |
| [8513](../raw_map.tsv:8513) | Douglas Sosnik | White House | appos\|-&gt;appos-&gt;adviser-&gt;rcmod-&gt;director-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Douglas Sosnik → White House: Explicit institutional adviser apposition establishes advisory service at the White House.

Cited evidence lines: [8509](../raw_map.tsv:8509), [8511](../raw_map.tsv:8511), [8513](../raw_map.tsv:8513).


Issue tags: mixed_evidence

### rel_97__ent_318__ent_1289

**All observed names:** Philadelphia Phillies → New York Mets (2)

Ordered IDs: Ent[ent_318] → Ent[ent_1289]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1034](../raw_map.tsv:1034) | Philadelphia Phillies | New York Mets | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-play&lt;-partmod&lt;-pitch-&gt;dobj-&gt;game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| [1035](../raw_map.tsv:1035) | Philadelphia Phillies | New York Mets | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-pitch-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Philadelphia Phillies → New York Mets: Sports competition, meeting a team president or entering a legislative chamber does not establish advisory service.

Cited evidence lines: [1034](../raw_map.tsv:1034), [1035](../raw_map.tsv:1035).




### rel_97__ent_143__ent_590

**All observed names:** Nets → Rod Thorn (2)

Ordered IDs: Ent[ent_143] → Ent[ent_590]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5307](../raw_map.tsv:5307) | Nets | Rod Thorn | poss\|&lt;-poss&lt;-president&lt;-pobj&lt;-with&lt;-prep&lt;-meet-&gt;dobj-&gt;\|dobj |
| [5308](../raw_map.tsv:5308) | Nets | Rod Thorn | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;discussion-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Nets → Rod Thorn: Sports competition, meeting a team president or entering a legislative chamber does not establish advisory service.

Cited evidence lines: [5307](../raw_map.tsv:5307), [5308](../raw_map.tsv:5308).




### rel_97__ent_267__ent_1197

**All observed names:** Trent Lott → Senate (1)

Ordered IDs: Ent[ent_267] → Ent[ent_1197]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3039](../raw_map.tsv:3039) | Trent Lott | Senate | nsubj\|&lt;-nsubj&lt;-summon-&gt;prep-&gt;into-&gt;pobj-&gt;chamber-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Trent Lott → Senate: Sports competition, meeting a team president or entering a legislative chamber does not establish advisory service.

Cited evidence lines: [3039](../raw_map.tsv:3039).



