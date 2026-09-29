# audit_9c88162c7b22 — rel_8: wins or holds sporting championship

Predicate ID: sporting_champion_of

Entity X won sporting competition Y or held an explicitly Y-designated sporting championship or title.

Includes: sport win/champion/title/clinch-title; sporting league/division or explicitly title-designating body; historical sporting title. Excludes: non-sport honorary awards; political election or control; participation; single stage without overall title; coaching or team membership alone. Ambiguous unless resolved by case-local evidence: medal without a winning championship; unclear title attachment. Retains the original sports-only relation separately from winner_of; do not silently extend it to Nobel or political examples.

Complete census: 4 supported, 0 incorrect, 0 ambiguous; N=4. Precision 4/4=100.00% to 4/4=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| 4 | nsubj\|&lt;-nsubj&lt;-retain-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| 2 | poss\|&lt;-poss&lt;-defense-&gt;prep-&gt;of-&gt;pobj-&gt;title-&gt;nn-&gt;\|nn |
| 2 | prep\|-&gt;prep-&gt;for-&gt;pobj-&gt;title-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;champion-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;king-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-fighter&lt;-nsubj&lt;-retain-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-fight-&gt;prep-&gt;for-&gt;pobj-&gt;title-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-hold-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-before&lt;-prep&lt;-lose-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-suffer-&gt;prep-&gt;force-&gt;dobj-&gt;postponement-&gt;prep-&gt;of-&gt;pobj-&gt;defense-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-nunn-curry-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;during-&gt;pobj-&gt;bout-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;hold-&gt;dobj-&gt;\|dobj |

## Every evaluated fact

### rel_8__ent_993__ent_509

**All observed names:** Michael Nunn → International Boxing Federation (9)

Ordered IDs: Ent[ent_993] → Ent[ent_509]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8020](../raw_map.tsv:8020) | Michael Nunn | International Boxing Federation | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [8021](../raw_map.tsv:8021) | Michael Nunn | International Boxing Federation | poss\|&lt;-poss&lt;-defense-&gt;prep-&gt;of-&gt;pobj-&gt;title-&gt;nn-&gt;\|nn |
| [8022](../raw_map.tsv:8022) | Michael Nunn | International Boxing Federation | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-suffer-&gt;prep-&gt;force-&gt;dobj-&gt;postponement-&gt;prep-&gt;of-&gt;pobj-&gt;defense-&gt;nn-&gt;\|nn |
| [8023](../raw_map.tsv:8023) | Michael Nunn | International Boxing Federation | nsubj\|&lt;-nsubj&lt;-retain-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| [8024](../raw_map.tsv:8024) | Michael Nunn | International Boxing Federation | prep\|-&gt;prep-&gt;for-&gt;pobj-&gt;title-&gt;nn-&gt;\|nn |
| [8025](../raw_map.tsv:8025) | Michael Nunn | International Boxing Federation | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-nunn-curry-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [8026](../raw_map.tsv:8026) | Michael Nunn | International Boxing Federation | pobj\|&lt;-pobj&lt;-before&lt;-prep&lt;-lose-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| [8027](../raw_map.tsv:8027) | Michael Nunn | International Boxing Federation | dobj\|&lt;-dobj&lt;-fight-&gt;prep-&gt;for-&gt;pobj-&gt;title-&gt;nn-&gt;\|nn |
| [8028](../raw_map.tsv:8028) | Michael Nunn | International Boxing Federation | appos\|&lt;-appos&lt;-fighter&lt;-nsubj&lt;-retain-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Michael Nunn → International Boxing Federation: Explicit champion or retaining/holding the body-designated boxing title establishes the sporting championship.

Cited evidence lines: [8020](../raw_map.tsv:8020), [8021](../raw_map.tsv:8021), [8022](../raw_map.tsv:8022), [8023](../raw_map.tsv:8023), [8024](../raw_map.tsv:8024), [8025](../raw_map.tsv:8025), [8026](../raw_map.tsv:8026), [8027](../raw_map.tsv:8027), [8028](../raw_map.tsv:8028).


Issue tags: mixed_evidence, broad_predicate

### rel_8__ent_994__ent_737

**All observed names:** Oscar De La Hoya → World Boxing Council (5)

Ordered IDs: Ent[ent_994] → Ent[ent_737]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8004](../raw_map.tsv:8004) | Oscar De La Hoya | World Boxing Council | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [8005](../raw_map.tsv:8005) | Oscar De La Hoya | World Boxing Council | poss\|&lt;-poss&lt;-defense-&gt;prep-&gt;of-&gt;pobj-&gt;title-&gt;nn-&gt;\|nn |
| [8007](../raw_map.tsv:8007) | Oscar De La Hoya | World Boxing Council | prep\|-&gt;prep-&gt;for-&gt;pobj-&gt;title-&gt;nn-&gt;\|nn |
| [8008](../raw_map.tsv:8008) | Oscar De La Hoya | World Boxing Council | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;during-&gt;pobj-&gt;bout-&gt;nn-&gt;\|nn |
| [8013](../raw_map.tsv:8013) | Oscar De La Hoya | World Boxing Council | nsubj\|&lt;-nsubj&lt;-retain-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Oscar De La Hoya → World Boxing Council: Explicit champion or retaining/holding the body-designated boxing title establishes the sporting championship.

Cited evidence lines: [8004](../raw_map.tsv:8004), [8005](../raw_map.tsv:8005), [8007](../raw_map.tsv:8007), [8008](../raw_map.tsv:8008), [8013](../raw_map.tsv:8013).


Issue tags: mixed_evidence, broad_predicate

### rel_8__ent_738__ent_737

**All observed names:** Lennox Lewis → World Boxing Council (4)

Ordered IDs: Ent[ent_738] → Ent[ent_737]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7955](../raw_map.tsv:7955) | Lennox Lewis | World Boxing Council | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [7957](../raw_map.tsv:7957) | Lennox Lewis | World Boxing Council | nsubj\|&lt;-nsubj&lt;-retain-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| [7961](../raw_map.tsv:7961) | Lennox Lewis | World Boxing Council | appos\|-&gt;appos-&gt;champion-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7963](../raw_map.tsv:7963) | Lennox Lewis | World Boxing Council | rcmod\|-&gt;rcmod-&gt;hold-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Lennox Lewis → World Boxing Council: Explicit champion or retaining/holding the body-designated boxing title establishes the sporting championship.

Cited evidence lines: [7955](../raw_map.tsv:7955), [7957](../raw_map.tsv:7957), [7961](../raw_map.tsv:7961), [7963](../raw_map.tsv:7963).


Issue tags: broad_predicate

### rel_8__ent_508__ent_737

**All observed names:** Lewis → World Boxing Council (4)

Ordered IDs: Ent[ent_508] → Ent[ent_737]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8029](../raw_map.tsv:8029) | Lewis | World Boxing Council | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [8031](../raw_map.tsv:8031) | Lewis | World Boxing Council | nsubj\|&lt;-nsubj&lt;-hold-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| [8034](../raw_map.tsv:8034) | Lewis | World Boxing Council | nsubj\|&lt;-nsubj&lt;-retain-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| [8035](../raw_map.tsv:8035) | Lewis | World Boxing Council | appos\|-&gt;appos-&gt;king-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Lewis → World Boxing Council: Explicit champion or retaining/holding the body-designated boxing title establishes the sporting championship.

Cited evidence lines: [8029](../raw_map.tsv:8029), [8031](../raw_map.tsv:8031), [8034](../raw_map.tsv:8034), [8035](../raw_map.tsv:8035).


Issue tags: broad_predicate
