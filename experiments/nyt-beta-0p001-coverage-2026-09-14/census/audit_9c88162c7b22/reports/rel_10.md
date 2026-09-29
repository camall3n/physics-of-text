# audit_9c88162c7b22 — rel_10: president of institution

Predicate ID: president_of

Person X holds or held an explicitly identified president office in organization, team, public body, or institution Y.

Includes: explicit president office; a functional or departmental president role within Y; historical or former presidency. Excludes: manager, director, chairman, head, or executive alone without a president title; ordinary employment or membership; candidate or nomination alone. Ambiguous unless resolved by case-local evidence: president-elect or unresolved tenure without evidence of holding office; an incomplete institution or personal principal; unclear holder or title attachment. This specific title is separate from president_or_manager_of and managerial_office_in. It does not require that the officeholder be the sole head of Y.

Complete census: 1 supported, 2 incorrect, 0 ambiguous; N=3. Precision 1/3=33.33% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | poss\|&lt;-poss&lt;-campus-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dep\|-&gt;dep-&gt;divine-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-elect-&gt;prep-&gt;as-&gt;pobj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-call&lt;-partmod&lt;-guards-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-dep&lt;-accord&lt;-prep&lt;-president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-dep&lt;-from&lt;-prep&lt;-official-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-university&lt;-nsubj&lt;-reopen-&gt;prep-&gt;except-&gt;dep-&gt;for-&gt;pobj-&gt;campus-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;by-&gt;pobj-&gt;partner-&gt;prep-&gt;at-&gt;pobj-&gt;firm-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_10__ent_374__ent_372

**All observed names:** Sandra Feldman → United Federation of Teachers (5)

Ordered IDs: Ent[ent_374] → Ent[ent_372]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [20](../raw_map.tsv:20) | Sandra Feldman | United Federation of Teachers | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [22](../raw_map.tsv:22) | Sandra Feldman | United Federation of Teachers | pobj\|&lt;-pobj&lt;-to&lt;-dep&lt;-from&lt;-prep&lt;-official-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [23](../raw_map.tsv:23) | Sandra Feldman | United Federation of Teachers | pobj\|&lt;-pobj&lt;-to&lt;-dep&lt;-accord&lt;-prep&lt;-president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [25](../raw_map.tsv:25) | Sandra Feldman | United Federation of Teachers | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-call&lt;-partmod&lt;-guards-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [26](../raw_map.tsv:26) | Sandra Feldman | United Federation of Teachers | nsubjpass\|&lt;-nsubjpass&lt;-elect-&gt;prep-&gt;as-&gt;pobj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Sandra Feldman → United Federation of Teachers: President-of title appositions and attributed statements establish actual presidency of the United Federation of Teachers beyond the election row.

Cited evidence lines: [20](../raw_map.tsv:20), [22](../raw_map.tsv:22), [23](../raw_map.tsv:23), [25](../raw_map.tsv:25), [26](../raw_map.tsv:26).




### rel_10__ent_888__ent_333

**All observed names:** John → Manhattan (4)

Ordered IDs: Ent[ent_888] → Ent[ent_333]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3968](../raw_map.tsv:3968) | John | Manhattan | dep\|-&gt;dep-&gt;divine-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [3969](../raw_map.tsv:3969) | John | Manhattan | poss\|&lt;-poss&lt;-campus-&gt;nn-&gt;\|nn |
| [3973](../raw_map.tsv:3973) | John | Manhattan | prep\|-&gt;prep-&gt;by-&gt;pobj-&gt;partner-&gt;prep-&gt;at-&gt;pobj-&gt;firm-&gt;nn-&gt;\|nn |
| [3974](../raw_map.tsv:3974) | John | Manhattan | poss\|&lt;-poss&lt;-university&lt;-nsubj&lt;-reopen-&gt;prep-&gt;except-&gt;dep-&gt;for-&gt;pobj-&gt;campus-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). John → Manhattan: Campus, university, firm, and place fragments do not identify a presidency of Manhattan.

Cited evidence lines: [3968](../raw_map.tsv:3968), [3969](../raw_map.tsv:3969), [3973](../raw_map.tsv:3973), [3974](../raw_map.tsv:3974).




### rel_10__ent_786__ent_305

**All observed names:** Apple → Cupertino (2)

Ordered IDs: Ent[ent_786] → Ent[ent_305]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [794](../raw_map.tsv:794) | Apple | Cupertino | poss\|&lt;-poss&lt;-campus-&gt;nn-&gt;\|nn |
| [4350](../raw_map.tsv:4350) | Apple | Cupertino | poss\|&lt;-poss&lt;-campus-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Apple → Cupertino: A company’s Cupertino campus is a location relationship, not a person holding president office.

Cited evidence lines: [794](../raw_map.tsv:794), [4350](../raw_map.tsv:4350).



