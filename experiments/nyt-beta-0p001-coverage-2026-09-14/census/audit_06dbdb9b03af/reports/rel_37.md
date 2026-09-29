# audit_06dbdb9b03af — rel_37: broadcasts or carries program

Predicate ID: broadcasts_program

Broadcaster X is explicitly identified as broadcasting, carrying, or having program Y in its programming.

Includes: explicit airing or broadcasting of Y; Y identified as the program or show of broadcaster X; historical programming affiliation. Excludes: ownership of a network or production company alone; an ordinary press interaction or meeting; a person appearing on a program without broadcaster-program identification. Ambiguous unless resolved by case-local evidence: an incomplete program title such as Press with unresolved referent; unclear broadcaster versus guest role; program versus generic activity attachment unresolved. Programming affiliation does not imply ownership or production. Embedded title verbs such as Meet must not be interpreted as an ordinary interpersonal meeting.

Complete census: 0 supported, 1 incorrect, 2 ambiguous; N=3. Precision 0/3=0.00% to 2/3=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ratio-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 2 | nn\|&lt;-nn&lt;-program-&gt;dep-&gt;\|dep |
| 2 | nn\|&lt;-nn&lt;-program-&gt;dep-&gt;meet-&gt;dobj-&gt;\|dobj |
| 2 | nn\|&lt;-nn&lt;-program&lt;-pobj&lt;-on&lt;-prep&lt;-meet-&gt;dobj-&gt;\|dobj |
| 1 | nn\|&lt;-nn&lt;-program&lt;-pobj&lt;-on&lt;-prep&lt;-appearance-&gt;dep-&gt;meet-&gt;dobj-&gt;\|dobj |
| 1 | nn\|&lt;-nn&lt;-program&lt;-pobj&lt;-on&lt;-prep&lt;-comment&lt;-nsubj&lt;-meet-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-program-&gt;dep-&gt;meet-&gt;dobj-&gt;\|dobj |

## Every evaluated fact

### rel_37__ent_218__ent_1156

**All observed names:** NBC News → Press (5)

Ordered IDs: Ent[ent_218] → Ent[ent_1156]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6030](../raw_map.tsv:6030) | NBC News | Press | nn\|&lt;-nn&lt;-program-&gt;dep-&gt;meet-&gt;dobj-&gt;\|dobj |
| [6032](../raw_map.tsv:6032) | NBC News | Press | nn\|&lt;-nn&lt;-program&lt;-pobj&lt;-on&lt;-prep&lt;-meet-&gt;dobj-&gt;\|dobj |
| [6033](../raw_map.tsv:6033) | NBC News | Press | nn\|&lt;-nn&lt;-program-&gt;dep-&gt;\|dep |
| [6036](../raw_map.tsv:6036) | NBC News | Press | nn\|&lt;-nn&lt;-program&lt;-pobj&lt;-on&lt;-prep&lt;-appearance-&gt;dep-&gt;meet-&gt;dobj-&gt;\|dobj |
| [6038](../raw_map.tsv:6038) | NBC News | Press | nn\|&lt;-nn&lt;-program&lt;-pobj&lt;-on&lt;-prep&lt;-comment&lt;-nsubj&lt;-meet-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). NBC News → Press: The broadcaster-program attachment is plausible, but Press is an incomplete program title with unresolved exact referent.

Cited evidence lines: [6030](../raw_map.tsv:6030), [6032](../raw_map.tsv:6032), [6033](../raw_map.tsv:6033), [6036](../raw_map.tsv:6036), [6038](../raw_map.tsv:6038).

**Review question:** Does Press refer to the full Meet the Press program in these rows?
Issue tags: title_fragment

### rel_37__ent_867__ent_1156

**All observed names:** NBC → Press (4)

Ordered IDs: Ent[ent_867] → Ent[ent_1156]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6021](../raw_map.tsv:6021) | NBC | Press | nn\|&lt;-nn&lt;-program-&gt;dep-&gt;meet-&gt;dobj-&gt;\|dobj |
| [6024](../raw_map.tsv:6024) | NBC | Press | nn\|&lt;-nn&lt;-program&lt;-pobj&lt;-on&lt;-prep&lt;-meet-&gt;dobj-&gt;\|dobj |
| [6025](../raw_map.tsv:6025) | NBC | Press | nn\|&lt;-nn&lt;-program-&gt;dep-&gt;\|dep |
| [6026](../raw_map.tsv:6026) | NBC | Press | poss\|&lt;-poss&lt;-program-&gt;dep-&gt;meet-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). NBC → Press: The broadcaster-program attachment is plausible, but Press is an incomplete program title with unresolved exact referent.

Cited evidence lines: [6021](../raw_map.tsv:6021), [6024](../raw_map.tsv:6024), [6025](../raw_map.tsv:6025), [6026](../raw_map.tsv:6026).

**Review question:** Does Press refer to the full Meet the Press program in these rows?
Issue tags: title_fragment

### rel_37__ent_819__ent_816

**All observed names:** Democrats → Republicans (3)

Ordered IDs: Ent[ent_819] → Ent[ent_816]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1915](../raw_map.tsv:1915) | Democrats | Republicans | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ratio-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5468](../raw_map.tsv:5468) | Democrats | Republicans | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ratio-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5913](../raw_map.tsv:5913) | Democrats | Republicans | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ratio-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Democrats → Republicans: A ratio of political groups is not broadcaster-program affiliation.

Cited evidence lines: [1915](../raw_map.tsv:1915), [5468](../raw_map.tsv:5468), [5913](../raw_map.tsv:5913).



