# audit_06dbdb9b03af — rel_40: manager of institution

Predicate ID: manager_of

Person X holds or held an explicitly identified manager office in organization, team, business, or public institution Y.

Includes: explicit manager or general manager; a functional or departmental managerial office within Y; historical managerial office. Excludes: president, director, head, executive, or coach alone without a manager title; ordinary employment or membership; candidate or proposed appointment alone. Ambiguous unless resolved by case-local evidence: a personal principal standing for an omitted institution or campaign; unclear manager or institutional attachment; appointment without established tenure. This specific title is separate from president_or_manager_of and managerial_office_in. A sports manager qualifies; merely coaching does not prove the manager title.

Complete census: 1 supported, 0 incorrect, 1 ambiguous; N=2. Precision 1/2=50.00% to 2/2=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-gather-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-bring-&gt;dobj-&gt;home-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;struggle-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-use-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;fight-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-dismissal-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-contract-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-tenure-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;determine-&gt;dobj-&gt;scheme-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;dismiss-&gt;nsubj-&gt;\|nsubj |

## Every evaluated fact

### rel_40__ent_283__ent_321

**All observed names:** Dave Johnson → Mets (8)

Ordered IDs: Ent[ent_283] → Ent[ent_321]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3334](../raw_map.tsv:3334) | Dave Johnson | Mets | poss\|&lt;-poss&lt;-tenure-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |
| [3335](../raw_map.tsv:3335) | Dave Johnson | Mets | nsubj\|&lt;-nsubj&lt;-gather-&gt;dobj-&gt;\|dobj |
| [3336](../raw_map.tsv:3336) | Dave Johnson | Mets | nsubj\|&lt;-nsubj&lt;-bring-&gt;dobj-&gt;home-&gt;nn-&gt;\|nn |
| [3337](../raw_map.tsv:3337) | Dave Johnson | Mets | rcmod\|-&gt;rcmod-&gt;dismiss-&gt;nsubj-&gt;\|nsubj |
| [3338](../raw_map.tsv:3338) | Dave Johnson | Mets | rcmod\|-&gt;rcmod-&gt;determine-&gt;dobj-&gt;scheme-&gt;poss-&gt;\|poss |
| [3339](../raw_map.tsv:3339) | Dave Johnson | Mets | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-dismissal-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |
| [3340](../raw_map.tsv:3340) | Dave Johnson | Mets | partmod\|-&gt;partmod-&gt;fight-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| [3341](../raw_map.tsv:3341) | Dave Johnson | Mets | nsubj\|&lt;-nsubj&lt;-use-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dave Johnson → Mets: Explicit tenure as manager and dismissal as manager establish the manager office.

Cited evidence lines: [3334](../raw_map.tsv:3334), [3335](../raw_map.tsv:3335), [3336](../raw_map.tsv:3336), [3337](../raw_map.tsv:3337), [3338](../raw_map.tsv:3338), [3339](../raw_map.tsv:3339), [3340](../raw_map.tsv:3340), [3341](../raw_map.tsv:3341).


Issue tags: mixed_evidence

### rel_40__ent_273__ent_1004

**All observed names:** Joe Torre → Yankees (3)

Ordered IDs: Ent[ent_273] → Ent[ent_1004]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3177](../raw_map.tsv:3177) | Joe Torre | Yankees | nsubj\|&lt;-nsubj&lt;-gather-&gt;dobj-&gt;\|dobj |
| [3179](../raw_map.tsv:3179) | Joe Torre | Yankees | poss\|&lt;-poss&lt;-contract-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3183](../raw_map.tsv:3183) | Joe Torre | Yankees | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;struggle-&gt;poss-&gt;\|poss |

**Judgment: ambiguous** (primary). Joe Torre → Yankees: Gathering the team, a contract and comments on struggles do not specify whether the person held the manager title.

Cited evidence lines: [3177](../raw_map.tsv:3177), [3179](../raw_map.tsv:3179), [3183](../raw_map.tsv:3183).

**Review question:** Does the source identify Joe Torre as Yankees manager, rather than another contracted team role?
Issue tags: omitted_role
