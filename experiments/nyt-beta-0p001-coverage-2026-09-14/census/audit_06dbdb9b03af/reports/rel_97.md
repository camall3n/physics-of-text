# audit_06dbdb9b03af — rel_97: coach of

Predicate ID: coach_of

Person X coaches or coached sports team or collegiate athletic program Y.

Includes: explicit coach title; direct coaching with correct subject and team; former/dismissed coach with clear office evidence; team/university shorthand when the athletic program role is clear. Excludes: manager/president/player alone; winning with a team alone; vacancy consideration alone; reverse team-to-coach direction. Ambiguous unless resolved by case-local evidence: missing coach subject or team attachment.

Complete census: 1 supported, 0 incorrect, 1 ambiguous; N=2. Precision 1/2=50.00% to 2/2=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;behind-&gt;pobj-&gt;bench-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-good-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-help-&gt;dobj-&gt;transform-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;for-&gt;pobj-&gt;perception-&gt;prep-&gt;of-&gt;pobj-&gt;football-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-since&lt;-prep&lt;-meet&lt;-nsubjpass&lt;-dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;begin-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;football-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;obtain-&gt;prep-&gt;in-&gt;pobj-&gt;trade-&gt;prep-&gt;for-&gt;pobj-&gt;pick-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_97__ent_282__ent_347

**All observed names:** Phil Esposito → Rangers (6)

Ordered IDs: Ent[ent_282] → Ent[ent_347]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3400](../raw_map.tsv:3400) | Phil Esposito | Rangers | nsubj\|&lt;-nsubj&lt;-help-&gt;dobj-&gt;transform-&gt;dobj-&gt;\|dobj |
| [3401](../raw_map.tsv:3401) | Phil Esposito | Rangers | nsubj\|&lt;-nsubj&lt;-good-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3402](../raw_map.tsv:3402) | Phil Esposito | Rangers | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| [3403](../raw_map.tsv:3403) | Phil Esposito | Rangers | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;behind-&gt;pobj-&gt;bench-&gt;poss-&gt;\|poss |
| [3404](../raw_map.tsv:3404) | Phil Esposito | Rangers | rcmod\|-&gt;rcmod-&gt;obtain-&gt;prep-&gt;in-&gt;pobj-&gt;trade-&gt;prep-&gt;for-&gt;pobj-&gt;pick-&gt;poss-&gt;\|poss |
| [3405](../raw_map.tsv:3405) | Phil Esposito | Rangers | pobj\|&lt;-pobj&lt;-since&lt;-prep&lt;-meet&lt;-nsubjpass&lt;-dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |

**Judgment: ambiguous** (primary). Phil Esposito → Rangers: Being behind the bench and helping transform the team do not resolve coaching service, while the explicit dismissal title is manager.

Cited evidence lines: [3400](../raw_map.tsv:3400), [3401](../raw_map.tsv:3401), [3402](../raw_map.tsv:3402), [3403](../raw_map.tsv:3403), [3404](../raw_map.tsv:3404), [3405](../raw_map.tsv:3405).

**Review question:** Was Phil Esposito actually coaching the Rangers in the bench reference, or present as manager or in another role?
Issue tags: role_boundary

### rel_97__ent_1096__ent_718

**All observed names:** Joe Paterno → Penn State (4)

Ordered IDs: Ent[ent_1096] → Ent[ent_718]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7268](../raw_map.tsv:7268) | Joe Paterno | Penn State | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;for-&gt;pobj-&gt;perception-&gt;prep-&gt;of-&gt;pobj-&gt;football-&gt;nn-&gt;\|nn |
| [7269](../raw_map.tsv:7269) | Joe Paterno | Penn State | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| [7270](../raw_map.tsv:7270) | Joe Paterno | Penn State | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;football-&gt;nn-&gt;\|nn |
| [7271](../raw_map.tsv:7271) | Joe Paterno | Penn State | rcmod\|-&gt;rcmod-&gt;begin-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Joe Paterno → Penn State: An explicit began-as-coach row establishes coaching at the collegiate football program.

Cited evidence lines: [7268](../raw_map.tsv:7268), [7269](../raw_map.tsv:7269), [7270](../raw_map.tsv:7270), [7271](../raw_map.tsv:7271).


Issue tags: mixed_evidence
