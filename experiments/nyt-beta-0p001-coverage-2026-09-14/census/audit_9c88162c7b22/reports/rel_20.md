# audit_9c88162c7b22 — rel_20: director of organization

Predicate ID: director_of

Person X holds or held an explicit director office of, for or at organization or institution Y.

Includes: explicit director/co-director; functional directorship such as communications or research director within Y; historical office. Excludes: head/president/chair/executive alone; spokesperson/adviser/publisher/professor/member alone; performing or authorship alone. Ambiguous unless resolved by case-local evidence: personal principal with omitted organization; abstract topic in place of the actual institution. Does not require sole chief control of the entire institution.

Complete census: 2 supported, 1 incorrect, 1 ambiguous; N=4. Precision 2/4=50.00% to 3/4=75.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;counselor-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;direction-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | dep\|&lt;-dep&lt;-surplus&lt;-amod&lt;-president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-say-&gt;dep-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;director-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;retire-&gt;prep-&gt;as-&gt;pobj-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;stomp-&gt;nsubj-&gt;\|nsubj |

## Every evaluated fact

### rel_20__ent_389__ent_146

**All observed names:** Stanley Hill → District Council (5)

Ordered IDs: Ent[ent_389] → Ent[ent_146]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [170](../raw_map.tsv:170) | Stanley Hill | District Council | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [173](../raw_map.tsv:173) | Stanley Hill | District Council | dep\|&lt;-dep&lt;-surplus&lt;-amod&lt;-president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [175](../raw_map.tsv:175) | Stanley Hill | District Council | rcmod\|-&gt;rcmod-&gt;stomp-&gt;nsubj-&gt;\|nsubj |
| [176](../raw_map.tsv:176) | Stanley Hill | District Council | rcmod\|-&gt;rcmod-&gt;retire-&gt;prep-&gt;as-&gt;pobj-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [178](../raw_map.tsv:178) | Stanley Hill | District Council | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-say-&gt;dep-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Stanley Hill → District Council: Directorship is explicit but the specific District Council is not fully identified.

Cited evidence lines: [170](../raw_map.tsv:170), [173](../raw_map.tsv:173), [175](../raw_map.tsv:175), [176](../raw_map.tsv:176), [178](../raw_map.tsv:178).

**Review question:** Which complete District Council is Stanley Hill director of?
Issue tags: incomplete_argument

### rel_20__ent_773__ent_523

**All observed names:** Donald Ratajczak → Georgia State University (3)

Ordered IDs: Ent[ent_773] → Ent[ent_523]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [537](../raw_map.tsv:537) | Donald Ratajczak | Georgia State University | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [539](../raw_map.tsv:539) | Donald Ratajczak | Georgia State University | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [540](../raw_map.tsv:540) | Donald Ratajczak | Georgia State University | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Donald Ratajczak → Georgia State University: Explicit director-of or director title establishes the institutional directorship.

Cited evidence lines: [537](../raw_map.tsv:537), [539](../raw_map.tsv:539), [540](../raw_map.tsv:540).


Issue tags: mixed_evidence

### rel_20__ent_916__ent_586

**All observed names:** Dan Bartlett → White House (3)

Ordered IDs: Ent[ent_916] → Ent[ent_586]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8434](../raw_map.tsv:8434) | Dan Bartlett | White House | appos\|-&gt;appos-&gt;counselor-&gt;nn-&gt;\|nn |
| [8435](../raw_map.tsv:8435) | Dan Bartlett | White House | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [8441](../raw_map.tsv:8441) | Dan Bartlett | White House | appos\|-&gt;appos-&gt;direction-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Dan Bartlett → White House: Counselor, speaking-at and the word direction do not supply the specific director title.

Cited evidence lines: [8434](../raw_map.tsv:8434), [8435](../raw_map.tsv:8435), [8441](../raw_map.tsv:8441).


Issue tags: wrong_occupation

### rel_20__ent_914__ent_586

**All observed names:** Douglas Sosnik → White House (3)

Ordered IDs: Ent[ent_914] → Ent[ent_586]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8507](../raw_map.tsv:8507) | Douglas Sosnik | White House | rcmod\|-&gt;rcmod-&gt;director-&gt;nn-&gt;\|nn |
| [8508](../raw_map.tsv:8508) | Douglas Sosnik | White House | appos\|-&gt;appos-&gt;counselor-&gt;nn-&gt;\|nn |
| [8512](../raw_map.tsv:8512) | Douglas Sosnik | White House | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Douglas Sosnik → White House: Explicit director-of or director title establishes the institutional directorship.

Cited evidence lines: [8507](../raw_map.tsv:8507), [8508](../raw_map.tsv:8508), [8512](../raw_map.tsv:8512).


Issue tags: mixed_evidence
