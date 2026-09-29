# audit_e318fe663470 — rel_22: coach of

Predicate ID: coach_of

Person X coaches or coached sports team or collegiate athletic program Y.

Includes: explicit coach title; direct coaching with correct subject and team; former/dismissed coach with clear office evidence; team/university shorthand when the athletic program role is clear. Excludes: manager/president/player alone; winning with a team alone; vacancy consideration alone; reverse team-to-coach direction. Ambiguous unless resolved by case-local evidence: missing coach subject or team attachment.

Complete census: 1 supported, 2 incorrect, 0 ambiguous; N=3. Precision 1/3=33.33% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | appos\|&lt;-appos&lt;-book&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-coach-&gt;dep-&gt;extend-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-coach&lt;-dep&lt;-defend-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;at-&gt;pobj-&gt;briefing-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-secretary-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-turn-&gt;dobj-&gt;program-&gt;poss-&gt;woman-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-wrap-&gt;prep-&gt;on-&gt;pobj-&gt;policy-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-write&lt;-rcmod&lt;-critic-&gt;prep-&gt;in-&gt;pobj-&gt;review-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;in-&gt;dep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_22__ent_1167__ent_959

**All observed names:** Geno Auriemma → UConn (5)

Ordered IDs: Ent[ent_1167] → Ent[ent_959]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7277](../raw_map.tsv:7277) | Geno Auriemma | UConn | prep\|-&gt;prep-&gt;in-&gt;dep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| [7278](../raw_map.tsv:7278) | Geno Auriemma | UConn | nsubj\|&lt;-nsubj&lt;-turn-&gt;dobj-&gt;program-&gt;poss-&gt;woman-&gt;nn-&gt;\|nn |
| [7279](../raw_map.tsv:7279) | Geno Auriemma | UConn | nsubj\|&lt;-nsubj&lt;-coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7281](../raw_map.tsv:7281) | Geno Auriemma | UConn | dobj\|&lt;-dobj&lt;-coach-&gt;dep-&gt;extend-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7282](../raw_map.tsv:7282) | Geno Auriemma | UConn | dobj\|&lt;-dobj&lt;-coach&lt;-dep&lt;-defend-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Geno Auriemma → UConn: An explicit coached-at or as-coach statement establishes coaching of the UConn athletic program.

Cited evidence lines: [7277](../raw_map.tsv:7277), [7278](../raw_map.tsv:7278), [7279](../raw_map.tsv:7279), [7281](../raw_map.tsv:7281), [7282](../raw_map.tsv:7282).


Issue tags: mixed_evidence

### rel_22__ent_1312__ent_1422

**All observed names:** Michael D. McCurry → White House (4)

Ordered IDs: Ent[ent_1312] → Ent[ent_1422]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1369](../raw_map.tsv:1369) | Michael D. McCurry | White House | nsubj\|&lt;-nsubj&lt;-wrap-&gt;prep-&gt;on-&gt;pobj-&gt;policy-&gt;poss-&gt;\|poss |
| [1370](../raw_map.tsv:1370) | Michael D. McCurry | White House | nsubj\|&lt;-nsubj&lt;-secretary-&gt;nn-&gt;\|nn |
| [1372](../raw_map.tsv:1372) | Michael D. McCurry | White House | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;at-&gt;pobj-&gt;briefing-&gt;nn-&gt;\|nn |
| [1373](../raw_map.tsv:1373) | Michael D. McCurry | White House | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Michael D. McCurry → White House: Press-secretary work or publication writing does not establish coaching.

Cited evidence lines: [1369](../raw_map.tsv:1369), [1370](../raw_map.tsv:1370), [1372](../raw_map.tsv:1372), [1373](../raw_map.tsv:1373).




### rel_22__ent_951__ent_1396

**All observed names:** John Gross → The Times (2)

Ordered IDs: Ent[ent_951] → Ent[ent_1396]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7316](../raw_map.tsv:7316) | John Gross | The Times | nsubj\|&lt;-nsubj&lt;-write&lt;-rcmod&lt;-critic-&gt;prep-&gt;in-&gt;pobj-&gt;review-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7317](../raw_map.tsv:7317) | John Gross | The Times | appos\|&lt;-appos&lt;-book&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). John Gross → The Times: Press-secretary work or publication writing does not establish coaching.

Cited evidence lines: [7316](../raw_map.tsv:7316), [7317](../raw_map.tsv:7317).



