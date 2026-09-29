# audit_e318fe663470 — rel_95: has member

Predicate ID: has_member

Organization, organized group, team, or institutional body X has or had entity Y as a member.

Includes: explicit membership or being included as a group member; a clearly established office or athlete role that entails membership of the stated group; historical membership. Excludes: corporate subsidiary ownership without membership in an explicitly identified group; a geographic area containing a place; ordinary accompaniment or a meeting; planned membership without established admission. Ambiguous unless resolved by case-local evidence: generic include or join without group-membership context; unclear group versus geographic or corporate containment; proposed admission or unresolved member identity. Inverse of member_of. A leader belongs to the stated group when local evidence establishes that institutional role; mere political support or family relation is insufficient.

Complete census: 6 supported, 4 incorrect, 1 ambiguous; N=11. Precision 6/11=54.55% to 7/11=63.64%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 9 | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| 4 | partmod\|-&gt;partmod-&gt;lead-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-need-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-seat-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-state-&gt;partmod-&gt;lead-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-state-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-go-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-welcome-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-production&lt;-nsubjpass&lt;-broadcast-&gt;prep-&gt;at-&gt;pobj-&gt;p.m.-&gt;prep-&gt;on-&gt;pobj-&gt;wliw-tv-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-blizzard&lt;-nsubj&lt;-close-&gt;dobj-&gt;exchange-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-many-&gt;prep-&gt;include-&gt;pobj-&gt;many-&gt;prep-&gt;of-&gt;pobj-&gt;friend-&gt;poss-&gt;\|poss |
| 1 | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;area-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;support-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;vote-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_95__ent_966__ent_843

**All observed names:** Northeast → New York (6)

Ordered IDs: Ent[ent_966] → Ent[ent_843]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7596](../raw_map.tsv:7596) | Northeast | New York | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [7597](../raw_map.tsv:7597) | Northeast | New York | partmod\|-&gt;partmod-&gt;lead-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [7598](../raw_map.tsv:7598) | Northeast | New York | nn\|&lt;-nn&lt;-state-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [7599](../raw_map.tsv:7599) | Northeast | New York | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;area-&gt;nn-&gt;\|nn |
| [7604](../raw_map.tsv:7604) | Northeast | New York | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-blizzard&lt;-nsubj&lt;-close-&gt;dobj-&gt;exchange-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7605](../raw_map.tsv:7605) | Northeast | New York | nn\|&lt;-nn&lt;-state-&gt;partmod-&gt;lead-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Northeast → New York: Geographic inclusion, person-to-company inclusion or merely needing something from a player does not establish the declared group membership.

Cited evidence lines: [7596](../raw_map.tsv:7596), [7597](../raw_map.tsv:7597), [7598](../raw_map.tsv:7598), [7599](../raw_map.tsv:7599), [7604](../raw_map.tsv:7604), [7605](../raw_map.tsv:7605).




### rel_95__ent_819__ent_828

**All observed names:** Democrats → Clinton (4)

Ordered IDs: Ent[ent_819] → Ent[ent_828]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7576](../raw_map.tsv:7576) | Democrats | Clinton | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [7580](../raw_map.tsv:7580) | Democrats | Clinton | partmod\|-&gt;partmod-&gt;lead-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [7582](../raw_map.tsv:7582) | Democrats | Clinton | nsubj\|&lt;-nsubj&lt;-welcome-&gt;dobj-&gt;\|dobj |
| [7583](../raw_map.tsv:7583) | Democrats | Clinton | rcmod\|-&gt;rcmod-&gt;support-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Democrats → Clinton: Local group-include or institutional leadership evidence identifies the person as a member of the named party/team.

Cited evidence lines: [7576](../raw_map.tsv:7576), [7580](../raw_map.tsv:7580), [7582](../raw_map.tsv:7582), [7583](../raw_map.tsv:7583).


Issue tags: mixed_evidence

### rel_95__ent_308__ent_1437

**All observed names:** Knicks → Ewing (3)

Ordered IDs: Ent[ent_308] → Ent[ent_1437]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3431](../raw_map.tsv:3431) | Knicks | Ewing | nsubj\|&lt;-nsubj&lt;-need-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4926](../raw_map.tsv:4926) | Knicks | Ewing | nsubj\|&lt;-nsubj&lt;-go-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4935](../raw_map.tsv:4935) | Knicks | Ewing | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Knicks → Ewing: Local group-include or institutional leadership evidence identifies the person as a member of the named party/team.

Cited evidence lines: [3431](../raw_map.tsv:3431), [4926](../raw_map.tsv:4926), [4935](../raw_map.tsv:4935).


Issue tags: mixed_evidence

### rel_95__ent_723__ent_965

**All observed names:** Public Broadcasting Service → Channel (2)

Ordered IDs: Ent[ent_723] → Ent[ent_965]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7524](../raw_map.tsv:7524) | Public Broadcasting Service | Channel | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [7525](../raw_map.tsv:7525) | Public Broadcasting Service | Channel | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-production&lt;-nsubjpass&lt;-broadcast-&gt;prep-&gt;at-&gt;pobj-&gt;p.m.-&gt;prep-&gt;on-&gt;pobj-&gt;wliw-tv-&gt;appos-&gt;\|appos |

**Judgment: ambiguous** (primary). Public Broadcasting Service → Channel: Channel is an incomplete station/member designation, and the PBS programming path does not resolve the actual institutional member.

Cited evidence lines: [7524](../raw_map.tsv:7524), [7525](../raw_map.tsv:7525).

**Review question:** Which station or member organization does Channel identify?
Issue tags: argument_identity

### rel_95__ent_1265__ent_721

**All observed names:** Republicans → John McCain (2)

Ordered IDs: Ent[ent_1265] → Ent[ent_721]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7546](../raw_map.tsv:7546) | Republicans | John McCain | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [7549](../raw_map.tsv:7549) | Republicans | John McCain | rcmod\|-&gt;rcmod-&gt;vote-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Republicans → John McCain: Local group-include or institutional leadership evidence identifies the person as a member of the named party/team.

Cited evidence lines: [7546](../raw_map.tsv:7546), [7549](../raw_map.tsv:7549).


Issue tags: mixed_evidence

### rel_95__ent_816__ent_1278

**All observed names:** Republicans → Bush (2)

Ordered IDs: Ent[ent_816] → Ent[ent_1278]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7556](../raw_map.tsv:7556) | Republicans | Bush | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [7565](../raw_map.tsv:7565) | Republicans | Bush | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-many-&gt;prep-&gt;include-&gt;pobj-&gt;many-&gt;prep-&gt;of-&gt;pobj-&gt;friend-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Republicans → Bush: Local group-include or institutional leadership evidence identifies the person as a member of the named party/team.

Cited evidence lines: [7556](../raw_map.tsv:7556), [7565](../raw_map.tsv:7565).


Issue tags: mixed_evidence

### rel_95__ent_819__ent_967

**All observed names:** Democrats → Edward M. Kennedy (2)

Ordered IDs: Ent[ent_819] → Ent[ent_967]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7566](../raw_map.tsv:7566) | Democrats | Edward M. Kennedy | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [7567](../raw_map.tsv:7567) | Democrats | Edward M. Kennedy | partmod\|-&gt;partmod-&gt;lead-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Democrats → Edward M. Kennedy: Local group-include or institutional leadership evidence identifies the person as a member of the named party/team.

Cited evidence lines: [7566](../raw_map.tsv:7566), [7567](../raw_map.tsv:7567).




### rel_95__ent_537__ent_1401

**All observed names:** United States → New York (2)

Ordered IDs: Ent[ent_537] → Ent[ent_1401]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7608](../raw_map.tsv:7608) | United States | New York | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [7611](../raw_map.tsv:7611) | United States | New York | nn\|&lt;-nn&lt;-seat-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). United States → New York: Geographic inclusion, person-to-company inclusion or merely needing something from a player does not establish the declared group membership.

Cited evidence lines: [7608](../raw_map.tsv:7608), [7611](../raw_map.tsv:7611).




### rel_95__ent_1090__ent_1106

**All observed names:** Ted Turner → CNN (1)

Ordered IDs: Ent[ent_1090] → Ent[ent_1106]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3879](../raw_map.tsv:3879) | Ted Turner | CNN | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Ted Turner → CNN: Geographic inclusion, person-to-company inclusion or merely needing something from a player does not establish the declared group membership.

Cited evidence lines: [3879](../raw_map.tsv:3879).




### rel_95__ent_953__ent_356

**All observed names:** Knicks → Ewing (1)

Ordered IDs: Ent[ent_953] → Ent[ent_356]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4930](../raw_map.tsv:4930) | Knicks | Ewing | nsubj\|&lt;-nsubj&lt;-need-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Knicks → Ewing: Geographic inclusion, person-to-company inclusion or merely needing something from a player does not establish the declared group membership.

Cited evidence lines: [4930](../raw_map.tsv:4930).




### rel_95__ent_1419__ent_545

**All observed names:** Democrats → Hillary Rodham Clinton (1)

Ordered IDs: Ent[ent_1419] → Ent[ent_545]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7587](../raw_map.tsv:7587) | Democrats | Hillary Rodham Clinton | partmod\|-&gt;partmod-&gt;lead-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Democrats → Hillary Rodham Clinton: Local group-include or institutional leadership evidence identifies the person as a member of the named party/team.

Cited evidence lines: [7587](../raw_map.tsv:7587).



