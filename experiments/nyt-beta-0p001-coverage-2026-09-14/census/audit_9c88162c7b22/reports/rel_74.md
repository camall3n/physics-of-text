# audit_9c88162c7b22 — rel_74: spokesperson for

Predicate ID: spokesperson_for

Person X serves or served as spokesperson for principal Y, which may be a person, organization or public office.

Includes: explicit spokesman/spokeswoman/spokesperson; expressly speaking for principal; representation through an identified principal office. Excludes: director/president/adviser/aide/lobbyist/secretary alone; communicating to rather than for Y; forward principal-to-person direction. Ambiguous unless resolved by case-local evidence: geographic dateline replacing the person; unclear represented principal.

Complete census: 0 supported, 2 incorrect, 1 ambiguous; N=3. Precision 0/3=0.00% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;secretary-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-secretary-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-thursday-&gt;appos-&gt;secretary-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-offer-&gt;prep-&gt;in-&gt;pobj-&gt;security-&gt;rcmod-&gt;back-&gt;prep-&gt;by-&gt;pobj-&gt;security-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;tmod-&gt;review-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;corps-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-president-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-issue&lt;-partmod&lt;-security-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-lead&lt;-partmod&lt;-institution-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;into-&gt;pobj-&gt;room-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;acknowledge-&gt;nsubj-&gt;spokesman-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_74__ent_1039__ent_586

**All observed names:** Scott McClellan → White House (6)

Ordered IDs: Ent[ent_1039] → Ent[ent_586]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1347](../raw_map.tsv:1347) | Scott McClellan | White House | appos\|-&gt;appos-&gt;secretary-&gt;nn-&gt;\|nn |
| [1350](../raw_map.tsv:1350) | Scott McClellan | White House | appos\|&lt;-appos&lt;-thursday-&gt;appos-&gt;secretary-&gt;nn-&gt;\|nn |
| [1351](../raw_map.tsv:1351) | Scott McClellan | White House | rcmod\|-&gt;rcmod-&gt;acknowledge-&gt;nsubj-&gt;spokesman-&gt;nn-&gt;\|nn |
| [1352](../raw_map.tsv:1352) | Scott McClellan | White House | prep\|-&gt;prep-&gt;into-&gt;pobj-&gt;room-&gt;nn-&gt;\|nn |
| [1354](../raw_map.tsv:1354) | Scott McClellan | White House | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;corps-&gt;nn-&gt;\|nn |
| [1355](../raw_map.tsv:1355) | Scott McClellan | White House | nsubj\|&lt;-nsubj&lt;-secretary-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Scott McClellan → White House: Secretary and a relative clause about a White House spokesman do not clearly attach the spokesman role to Scott McClellan himself.

Cited evidence lines: [1347](../raw_map.tsv:1347), [1350](../raw_map.tsv:1350), [1351](../raw_map.tsv:1351), [1352](../raw_map.tsv:1352), [1354](../raw_map.tsv:1354), [1355](../raw_map.tsv:1355).

**Review question:** Does the relative-clause spokesman denote Scott McClellan, or another speaker?
Issue tags: spokesperson_attachment

### rel_74__ent_98__ent_93

**All observed names:** Federal National Mortgage Association → Fannie Mae (5)

Ordered IDs: Ent[ent_98] → Ent[ent_93]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5568](../raw_map.tsv:5568) | Federal National Mortgage Association | Fannie Mae | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-president-&gt;appos-&gt;\|appos |
| [5569](../raw_map.tsv:5569) | Federal National Mortgage Association | Fannie Mae | nsubj\|&lt;-nsubj&lt;-offer-&gt;prep-&gt;in-&gt;pobj-&gt;security-&gt;rcmod-&gt;back-&gt;prep-&gt;by-&gt;pobj-&gt;security-&gt;nn-&gt;\|nn |
| [5571](../raw_map.tsv:5571) | Federal National Mortgage Association | Fannie Mae | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| [5572](../raw_map.tsv:5572) | Federal National Mortgage Association | Fannie Mae | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-lead&lt;-partmod&lt;-institution-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| [5573](../raw_map.tsv:5573) | Federal National Mortgage Association | Fannie Mae | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-issue&lt;-partmod&lt;-security-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Federal National Mortgage Association → Fannie Mae: An institutional alternative name is not a person serving as spokesperson.

Cited evidence lines: [5568](../raw_map.tsv:5568), [5569](../raw_map.tsv:5569), [5571](../raw_map.tsv:5571), [5572](../raw_map.tsv:5572), [5573](../raw_map.tsv:5573).


Issue tags: wrong_argument_type

### rel_74__ent_578__ent_586

**All observed names:** Michael D. McCurry → White House (3)

Ordered IDs: Ent[ent_578] → Ent[ent_586]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1365](../raw_map.tsv:1365) | Michael D. McCurry | White House | appos\|-&gt;appos-&gt;secretary-&gt;nn-&gt;\|nn |
| [1370](../raw_map.tsv:1370) | Michael D. McCurry | White House | nsubj\|&lt;-nsubj&lt;-secretary-&gt;nn-&gt;\|nn |
| [1371](../raw_map.tsv:1371) | Michael D. McCurry | White House | nsubj\|&lt;-nsubj&lt;-say-&gt;tmod-&gt;review-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Michael D. McCurry → White House: Secretary and saying a review alone do not establish the specifically required spokesperson role.

Cited evidence lines: [1365](../raw_map.tsv:1365), [1370](../raw_map.tsv:1370), [1371](../raw_map.tsv:1371).


Issue tags: secretary_only
