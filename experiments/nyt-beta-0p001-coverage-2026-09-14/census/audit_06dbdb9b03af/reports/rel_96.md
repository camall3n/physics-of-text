# audit_06dbdb9b03af — rel_96: director of organization

Predicate ID: director_of

Person X holds or held an explicit director office of, for or at organization or institution Y.

Includes: explicit director/co-director; functional directorship such as communications or research director within Y; historical office. Excludes: head/president/chair/executive alone; spokesperson/adviser/publisher/professor/member alone; performing or authorship alone. Ambiguous unless resolved by case-local evidence: personal principal with omitted organization; abstract topic in place of the actual institution. Does not require sole chief control of the entire institution.

Complete census: 1 supported, 3 incorrect, 0 ambiguous; N=4. Precision 1/4=25.00% to 1/4=25.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;nominee-&gt;amod-&gt;\|amod |
| 2 | appos\|-&gt;appos-&gt;opponent-&gt;amod-&gt;\|amod |
| 2 | nn\|&lt;-nn&lt;-unit-&gt;prep-&gt;of-&gt;pobj-&gt;p.l.c.-&gt;nn-&gt;\|nn |
| 2 | partmod\|-&gt;partmod-&gt;win-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;communication-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;speechwriter-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-prepare-&gt;dobj-&gt;bid-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-weigh-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-as&lt;-prep&lt;-conservative&lt;-pobj&lt;-of&lt;-prep&lt;-support&lt;-dobj&lt;-enlist-&gt;prep-&gt;until-&gt;pobj-&gt;director-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-memorandum&lt;-dobj&lt;-receive-&gt;dobj-&gt;speechwriter-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;work-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_96__ent_910__ent_586

**All observed names:** Patrick J. Buchanan → White House (7)

Ordered IDs: Ent[ent_910] → Ent[ent_586]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8484](../raw_map.tsv:8484) | Patrick J. Buchanan | White House | nsubj\|&lt;-nsubj&lt;-prepare-&gt;dobj-&gt;bid-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [8485](../raw_map.tsv:8485) | Patrick J. Buchanan | White House | appos\|-&gt;appos-&gt;speechwriter-&gt;nn-&gt;\|nn |
| [8486](../raw_map.tsv:8486) | Patrick J. Buchanan | White House | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;communication-&gt;nn-&gt;\|nn |
| [8488](../raw_map.tsv:8488) | Patrick J. Buchanan | White House | rcmod\|-&gt;rcmod-&gt;work-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8490](../raw_map.tsv:8490) | Patrick J. Buchanan | White House | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-memorandum&lt;-dobj&lt;-receive-&gt;dobj-&gt;speechwriter-&gt;nn-&gt;\|nn |
| [8491](../raw_map.tsv:8491) | Patrick J. Buchanan | White House | pobj\|&lt;-pobj&lt;-as&lt;-prep&lt;-conservative&lt;-pobj&lt;-of&lt;-prep&lt;-support&lt;-dobj&lt;-enlist-&gt;prep-&gt;until-&gt;pobj-&gt;director-&gt;nn-&gt;\|nn |
| [8492](../raw_map.tsv:8492) | Patrick J. Buchanan | White House | nsubj\|&lt;-nsubj&lt;-weigh-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Patrick J. Buchanan → White House: An explicit communications-director title establishes a functional directorship in the White House.

Cited evidence lines: [8484](../raw_map.tsv:8484), [8485](../raw_map.tsv:8485), [8486](../raw_map.tsv:8486), [8488](../raw_map.tsv:8488), [8490](../raw_map.tsv:8490), [8491](../raw_map.tsv:8491), [8492](../raw_map.tsv:8492).


Issue tags: mixed_evidence

### rel_96__ent_261__ent_263

**All observed names:** Bob Dole → Republican (4)

Ordered IDs: Ent[ent_261] → Ent[ent_263]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2987](../raw_map.tsv:2987) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;amod-&gt;\|amod |
| [2992](../raw_map.tsv:2992) | Bob Dole | Republican | appos\|-&gt;appos-&gt;opponent-&gt;amod-&gt;\|amod |
| [3711](../raw_map.tsv:3711) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;amod-&gt;\|amod |
| [3716](../raw_map.tsv:3716) | Bob Dole | Republican | appos\|-&gt;appos-&gt;opponent-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Bob Dole → Republican: Political nomination, sporting-event win or corporate subsidiary status does not establish a person directorship.

Cited evidence lines: [2987](../raw_map.tsv:2987), [2992](../raw_map.tsv:2992), [3711](../raw_map.tsv:3711), [3716](../raw_map.tsv:3716).




### rel_96__ent_600__ent_836

**All observed names:** Cubs → World Series (2)

Ordered IDs: Ent[ent_600] → Ent[ent_836]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2276](../raw_map.tsv:2276) | Cubs | World Series | partmod\|-&gt;partmod-&gt;win-&gt;pobj-&gt;\|pobj |
| [7773](../raw_map.tsv:7773) | Cubs | World Series | partmod\|-&gt;partmod-&gt;win-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Cubs → World Series: Political nomination, sporting-event win or corporate subsidiary status does not establish a person directorship.

Cited evidence lines: [2276](../raw_map.tsv:2276), [7773](../raw_map.tsv:7773).




### rel_96__ent_1128__ent_1129

**All observed names:** J. Walter Thompson → WPP Group (2)

Ordered IDs: Ent[ent_1128] → Ent[ent_1129]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4587](../raw_map.tsv:4587) | J. Walter Thompson | WPP Group | nn\|&lt;-nn&lt;-unit-&gt;prep-&gt;of-&gt;pobj-&gt;p.l.c.-&gt;nn-&gt;\|nn |
| [6689](../raw_map.tsv:6689) | J. Walter Thompson | WPP Group | nn\|&lt;-nn&lt;-unit-&gt;prep-&gt;of-&gt;pobj-&gt;p.l.c.-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). J. Walter Thompson → WPP Group: Political nomination, sporting-event win or corporate subsidiary status does not establish a person directorship.

Cited evidence lines: [4587](../raw_map.tsv:4587), [6689](../raw_map.tsv:6689).



