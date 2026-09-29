# audit_e318fe663470 — rel_15: political candidate or nominee for party

Predicate ID: candidate_for

Person X is or was an explicitly identified candidate, contender for nomination, or nominee of political party Y.

Includes: explicit party candidate or nominee; front-runner or contender for the party nomination; historical candidacy or nomination. Excludes: holding an executive or other office without party candidacy; merely supporting or belonging to the party; candidacy for a corporate or sporting appointment. Ambiguous unless resolved by case-local evidence: a constituency or office appears where the political party is omitted; candidate or nomination attachment does not identify whose party nomination is sought; the purported party is materially truncated or unidentified. This is a candidacy relation and does not claim election or actual office. The second role is the political party, not the office being contested. Republican as an identified party label follows the inherited party-label convention.

Complete census: 2 supported, 2 incorrect, 1 ambiguous; N=5. Precision 2/5=40.00% to 3/5=60.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;executive-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;front-runner-&gt;prep-&gt;for-&gt;pobj-&gt;nomination-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;nominee-&gt;amod-&gt;\|amod |
| 2 | appos\|-&gt;appos-&gt;nominee-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;executive-&gt;rcmod-&gt;build-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;front-runner-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to-&gt;appos-&gt;executive-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-rating-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;oust-&gt;prep-&gt;as-&gt;pobj-&gt;chief-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;nomination-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_15__ent_580__ent_341

**All observed names:** Maurice R. Greenberg → American International Group (4)

Ordered IDs: Ent[ent_580] → Ent[ent_341]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1251](../raw_map.tsv:1251) | Maurice R. Greenberg | American International Group | appos\|-&gt;appos-&gt;executive-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1254](../raw_map.tsv:1254) | Maurice R. Greenberg | American International Group | appos\|-&gt;appos-&gt;executive-&gt;rcmod-&gt;build-&gt;dobj-&gt;\|dobj |
| [1256](../raw_map.tsv:1256) | Maurice R. Greenberg | American International Group | rcmod\|-&gt;rcmod-&gt;oust-&gt;prep-&gt;as-&gt;pobj-&gt;chief-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1258](../raw_map.tsv:1258) | Maurice R. Greenberg | American International Group | pobj\|&lt;-pobj&lt;-to-&gt;appos-&gt;executive-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Maurice R. Greenberg → American International Group: Corporate executive office or a sale to a state does not establish party candidacy.

Cited evidence lines: [1251](../raw_map.tsv:1251), [1254](../raw_map.tsv:1254), [1256](../raw_map.tsv:1256), [1258](../raw_map.tsv:1258).




### rel_15__ent_1344__ent_1444

**All observed names:** Bob Dole → Republican (4)

Ordered IDs: Ent[ent_1344] → Ent[ent_1444]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2987](../raw_map.tsv:2987) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;amod-&gt;\|amod |
| [2990](../raw_map.tsv:2990) | Bob Dole | Republican | appos\|-&gt;appos-&gt;front-runner-&gt;nn-&gt;\|nn |
| [2993](../raw_map.tsv:2993) | Bob Dole | Republican | appos\|-&gt;appos-&gt;front-runner-&gt;prep-&gt;for-&gt;pobj-&gt;nomination-&gt;nn-&gt;\|nn |
| [3710](../raw_map.tsv:3710) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bob Dole → Republican: Explicit Republican nominee/front-runner wording establishes candidacy for the party nomination.

Cited evidence lines: [2987](../raw_map.tsv:2987), [2990](../raw_map.tsv:2990), [2993](../raw_map.tsv:2993), [3710](../raw_map.tsv:3710).




### rel_15__ent_261__ent_263

**All observed names:** Bob Dole → Republican (3)

Ordered IDs: Ent[ent_261] → Ent[ent_263]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2986](../raw_map.tsv:2986) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;nn-&gt;\|nn |
| [3711](../raw_map.tsv:3711) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;amod-&gt;\|amod |
| [3717](../raw_map.tsv:3717) | Bob Dole | Republican | appos\|-&gt;appos-&gt;front-runner-&gt;prep-&gt;for-&gt;pobj-&gt;nomination-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bob Dole → Republican: Explicit Republican nominee/front-runner wording establishes candidacy for the party nomination.

Cited evidence lines: [2986](../raw_map.tsv:2986), [3711](../raw_map.tsv:3711), [3717](../raw_map.tsv:3717).




### rel_15__ent_564__ent_500

**All observed names:** Steve Levy → Suffolk County (3)

Ordered IDs: Ent[ent_564] → Ent[ent_500]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8061](../raw_map.tsv:8061) | Steve Levy | Suffolk County | appos\|-&gt;appos-&gt;executive-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [8066](../raw_map.tsv:8066) | Steve Levy | Suffolk County | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;nomination-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [8067](../raw_map.tsv:8067) | Steve Levy | Suffolk County | poss\|&lt;-poss&lt;-rating-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Steve Levy → Suffolk County: The nomination is for Suffolk County with the contested office and political party omitted.

Cited evidence lines: [8061](../raw_map.tsv:8061), [8066](../raw_map.tsv:8066), [8067](../raw_map.tsv:8067).

**Review question:** Which party nomination was sought for which county office?
Issue tags: truncated_argument

### rel_15__ent_537__ent_99

**All observed names:** United States → Iran (1)

Ordered IDs: Ent[ent_537] → Ent[ent_99]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5505](../raw_map.tsv:5505) | United States | Iran | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). United States → Iran: Corporate executive office or a sale to a state does not establish party candidacy.

Cited evidence lines: [5505](../raw_map.tsv:5505).



