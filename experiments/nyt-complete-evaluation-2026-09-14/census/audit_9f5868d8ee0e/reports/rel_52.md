# audit_9f5868d8ee0e — rel_52: owns organization or asset

Predicate ID: owns

Person or organization X owns or owned some or all of organization, business, team or property Y.

Includes: owner/co-owner/owns; explicit ownership interest or stated share; corporate parent; completed acquisition with ownership attachment; historical ownership. Excludes: management or leadership alone; publishing or distribution alone; mere collaboration; proposed or rejected acquisition. Ambiguous unless resolved by case-local evidence: merger without clear ownership direction; a possessive alone. This states ownership interest, not necessarily complete ownership or control. An explicit partial stake qualifies here but not automatically as subsidiary_of in reverse.

Complete census: 20 supported, 2 incorrect, 0 ambiguous; N=22. Precision 20/22=90.91% to 20/22=90.91%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 16 | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 14 | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| 8 | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| 7 | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 7 | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 7 | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| 6 | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |
| 4 | appos\|-&gt;appos-&gt;company-&gt;poss-&gt;\|poss |
| 4 | appos\|-&gt;appos-&gt;owner-&gt;nn-&gt;\|nn |
| 4 | nsubj\|&lt;-nsubj&lt;-acquire-&gt;dobj-&gt;\|dobj |
| 4 | poss\|&lt;-poss&lt;-network-&gt;nn-&gt;\|nn |
| 3 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| 3 | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | poss\|&lt;-poss&lt;-unit-&gt;nn-&gt;\|nn |
| 3 | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;company-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| 2 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | dobj\|&lt;-dobj&lt;-keep-&gt;prep-&gt;in-&gt;pobj-&gt;control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-reign-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| 2 | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |
| 2 | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;run-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;company-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;parent-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;impresario-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;oilman-&gt;rcmod-&gt;buy-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;publisher-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;showman-restaurateur-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;son-&gt;rcmod-&gt;responsible-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;strongman-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-book&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-hostess-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-lawsuit&lt;-pobj&lt;-of&lt;-prep&lt;-face&lt;-pobj&lt;-in&lt;-prep&lt;-defiant-&gt;nsubj-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-owner-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| 1 | appos\|&lt;-appos&lt;-plaintiff-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dep\|-&gt;dep-&gt;own-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-announce-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-cradle&lt;-dep&lt;-reality-&gt;rcmod-&gt;seem-&gt;prep-&gt;like-&gt;pobj-&gt;flashback-&gt;prep-&gt;for-&gt;pobj-&gt;owner-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-devise-&gt;dobj-&gt;strategy-&gt;prep-&gt;for-&gt;pobj-&gt;future-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-merge-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-person-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-reject-&gt;dobj-&gt;deal-&gt;rcmod-&gt;acquire-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-relinquish-&gt;dobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say&lt;-dep&lt;-down-&gt;dep-&gt;encouraged-&gt;prep-&gt;about-&gt;pobj-&gt;future-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-see-&gt;dobj-&gt;game-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-stir-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;by-&gt;pobj-&gt;jostler-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-write&lt;-rcmod&lt;-critic-&gt;prep-&gt;in-&gt;pobj-&gt;review-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-elate-&gt;prep-&gt;with-&gt;pobj-&gt;success-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;run-&gt;dobj-&gt;kitchen-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;undergo-&gt;nsubj-&gt;\|nsubj |
| 1 | partmod\|-&gt;partmod-&gt;welcome-&gt;prep-&gt;to-&gt;pobj-&gt;camp-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-after&lt;-prep&lt;-make-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-control&lt;-rcmod&lt;-company&lt;-nsubj&lt;-report-&gt;dobj-&gt;profit-&gt;prep-&gt;for-&gt;pobj-&gt;network-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-suggestion-&gt;dep-&gt;call-&gt;nsubjpass-&gt;team-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-work-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-chairman&lt;-nsubj&lt;-tell-&gt;dobj-&gt;meeting-&gt;prep-&gt;of-&gt;pobj-&gt;executive-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ouster-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-president-&gt;dep-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-reign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-representative&lt;-pobj&lt;-with&lt;-prep&lt;-negotiate-&gt;prep-&gt;for-&gt;pobj-&gt;purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-saga&lt;-nsubj&lt;-end-&gt;prep-&gt;with-&gt;pobj-&gt;suspension-&gt;prep-&gt;of-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-merger-&gt;rcmod-&gt;get-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-channel-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-division-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-empire-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-face&lt;-nsubj&lt;-hang-&gt;prep-&gt;over-&gt;pobj-&gt;dugout-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-hurrah&lt;-pobj&lt;-in&lt;-prep&lt;-win-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-marriage-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;property-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-studio-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-subsidiary-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-takeover-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-unhappiness-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;buy-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;co-owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;consider-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;have-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;miss-&gt;nsubjpass-&gt;presence-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;open-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;restaurant-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;preside-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;undermine-&gt;dobj-&gt;position-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;undermine-&gt;dobj-&gt;position-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;prep-&gt;of-&gt;pobj-&gt;team-&gt;nn-&gt;\|nn |
| 1 | tmod\|&lt;-tmod&lt;-suspend-&gt;prep-&gt;from-&gt;pobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_52__ent_1033__ent_1004

**All observed names:** George Steinbrenner → Yankees (10)

Ordered IDs: Ent[ent_1033] → Ent[ent_1004]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1415](../raw_map.tsv:1415) | George Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1416](../raw_map.tsv:1416) | George Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1417](../raw_map.tsv:1417) | George Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;nn-&gt;\|nn |
| [1418](../raw_map.tsv:1418) | George Steinbrenner | Yankees | poss\|&lt;-poss&lt;-reign-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| [1419](../raw_map.tsv:1419) | George Steinbrenner | Yankees | dobj\|&lt;-dobj&lt;-keep-&gt;prep-&gt;in-&gt;pobj-&gt;control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1420](../raw_map.tsv:1420) | George Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| [1421](../raw_map.tsv:1421) | George Steinbrenner | Yankees | poss\|&lt;-poss&lt;-unhappiness-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [1422](../raw_map.tsv:1422) | George Steinbrenner | Yankees | poss\|&lt;-poss&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1423](../raw_map.tsv:1423) | George Steinbrenner | Yankees | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ouster-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| [1424](../raw_map.tsv:1424) | George Steinbrenner | Yankees | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-suggestion-&gt;dep-&gt;call-&gt;nsubjpass-&gt;team-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). George Steinbrenner → Yankees: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [1415](../raw_map.tsv:1415), [1416](../raw_map.tsv:1416), [1417](../raw_map.tsv:1417), [1418](../raw_map.tsv:1418), [1419](../raw_map.tsv:1419), [1420](../raw_map.tsv:1420), [1421](../raw_map.tsv:1421), [1422](../raw_map.tsv:1422), [1423](../raw_map.tsv:1423), [1424](../raw_map.tsv:1424).


Issue tags: mixed_evidence

### rel_52__ent_1037__ent_1038

**All observed names:** Jerry Jones → Dallas Cowboys (10)

Ordered IDs: Ent[ent_1037] → Ent[ent_1038]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1455](../raw_map.tsv:1455) | Jerry Jones | Dallas Cowboys | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1456](../raw_map.tsv:1456) | Jerry Jones | Dallas Cowboys | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1457](../raw_map.tsv:1457) | Jerry Jones | Dallas Cowboys | appos\|-&gt;appos-&gt;owner-&gt;nn-&gt;\|nn |
| [1458](../raw_map.tsv:1458) | Jerry Jones | Dallas Cowboys | pobj\|&lt;-pobj&lt;-after&lt;-prep&lt;-make-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1459](../raw_map.tsv:1459) | Jerry Jones | Dallas Cowboys | nsubj\|&lt;-nsubj&lt;-say&lt;-dep&lt;-down-&gt;dep-&gt;encouraged-&gt;prep-&gt;about-&gt;pobj-&gt;future-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1460](../raw_map.tsv:1460) | Jerry Jones | Dallas Cowboys | nsubj\|&lt;-nsubj&lt;-cradle&lt;-dep&lt;-reality-&gt;rcmod-&gt;seem-&gt;prep-&gt;like-&gt;pobj-&gt;flashback-&gt;prep-&gt;for-&gt;pobj-&gt;owner-&gt;nn-&gt;\|nn |
| [1461](../raw_map.tsv:1461) | Jerry Jones | Dallas Cowboys | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| [1462](../raw_map.tsv:1462) | Jerry Jones | Dallas Cowboys | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1463](../raw_map.tsv:1463) | Jerry Jones | Dallas Cowboys | appos\|-&gt;appos-&gt;oilman-&gt;rcmod-&gt;buy-&gt;dobj-&gt;\|dobj |
| [1464](../raw_map.tsv:1464) | Jerry Jones | Dallas Cowboys | appos\|&lt;-appos&lt;-lawsuit&lt;-pobj&lt;-of&lt;-prep&lt;-face&lt;-pobj&lt;-in&lt;-prep&lt;-defiant-&gt;nsubj-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Jerry Jones → Dallas Cowboys: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [1455](../raw_map.tsv:1455), [1456](../raw_map.tsv:1456), [1457](../raw_map.tsv:1457), [1458](../raw_map.tsv:1458), [1459](../raw_map.tsv:1459), [1460](../raw_map.tsv:1460), [1461](../raw_map.tsv:1461), [1462](../raw_map.tsv:1462), [1463](../raw_map.tsv:1463), [1464](../raw_map.tsv:1464).


Issue tags: mixed_evidence

### rel_52__ent_350__ent_592

**All observed names:** Marge Schott → Cincinnati Reds (10)

Ordered IDs: Ent[ent_350] → Ent[ent_592]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1465](../raw_map.tsv:1465) | Marge Schott | Cincinnati Reds | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1466](../raw_map.tsv:1466) | Marge Schott | Cincinnati Reds | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1467](../raw_map.tsv:1467) | Marge Schott | Cincinnati Reds | appos\|-&gt;appos-&gt;owner-&gt;nn-&gt;\|nn |
| [1468](../raw_map.tsv:1468) | Marge Schott | Cincinnati Reds | nsubj\|&lt;-nsubj&lt;-relinquish-&gt;dobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1469](../raw_map.tsv:1469) | Marge Schott | Cincinnati Reds | rcmod\|-&gt;rcmod-&gt;undermine-&gt;dobj-&gt;position-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1470](../raw_map.tsv:1470) | Marge Schott | Cincinnati Reds | tmod\|&lt;-tmod&lt;-suspend-&gt;prep-&gt;from-&gt;pobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1471](../raw_map.tsv:1471) | Marge Schott | Cincinnati Reds | rcmod\|-&gt;rcmod-&gt;undermine-&gt;dobj-&gt;position-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;prep-&gt;of-&gt;pobj-&gt;team-&gt;nn-&gt;\|nn |
| [1472](../raw_map.tsv:1472) | Marge Schott | Cincinnati Reds | poss\|&lt;-poss&lt;-face&lt;-nsubj&lt;-hang-&gt;prep-&gt;over-&gt;pobj-&gt;dugout-&gt;poss-&gt;\|poss |
| [1473](../raw_map.tsv:1473) | Marge Schott | Cincinnati Reds | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-saga&lt;-nsubj&lt;-end-&gt;prep-&gt;with-&gt;pobj-&gt;suspension-&gt;prep-&gt;of-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| [1474](../raw_map.tsv:1474) | Marge Schott | Cincinnati Reds | partmod\|-&gt;partmod-&gt;welcome-&gt;prep-&gt;to-&gt;pobj-&gt;camp-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Marge Schott → Cincinnati Reds: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [1465](../raw_map.tsv:1465), [1466](../raw_map.tsv:1466), [1467](../raw_map.tsv:1467), [1468](../raw_map.tsv:1468), [1469](../raw_map.tsv:1469), [1470](../raw_map.tsv:1470), [1471](../raw_map.tsv:1471), [1472](../raw_map.tsv:1472), [1473](../raw_map.tsv:1473), [1474](../raw_map.tsv:1474).


Issue tags: mixed_evidence

### rel_52__ent_591__ent_110

**All observed names:** John McMullen → Devils (10)

Ordered IDs: Ent[ent_591] → Ent[ent_110]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1475](../raw_map.tsv:1475) | John McMullen | Devils | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1476](../raw_map.tsv:1476) | John McMullen | Devils | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1477](../raw_map.tsv:1477) | John McMullen | Devils | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1478](../raw_map.tsv:1478) | John McMullen | Devils | rcmod\|-&gt;rcmod-&gt;miss-&gt;nsubjpass-&gt;presence-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| [1479](../raw_map.tsv:1479) | John McMullen | Devils | rcmod\|-&gt;rcmod-&gt;buy-&gt;dobj-&gt;\|dobj |
| [1480](../raw_map.tsv:1480) | John McMullen | Devils | poss\|&lt;-poss&lt;-hurrah&lt;-pobj&lt;-in&lt;-prep&lt;-win-&gt;nsubj-&gt;\|nsubj |
| [1481](../raw_map.tsv:1481) | John McMullen | Devils | partmod\|-&gt;partmod-&gt;undergo-&gt;nsubj-&gt;\|nsubj |
| [1482](../raw_map.tsv:1482) | John McMullen | Devils | nsubjpass\|&lt;-nsubjpass&lt;-elate-&gt;prep-&gt;with-&gt;pobj-&gt;success-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1483](../raw_map.tsv:1483) | John McMullen | Devils | nsubj\|&lt;-nsubj&lt;-see-&gt;dobj-&gt;game-&gt;nn-&gt;\|nn |
| [1484](../raw_map.tsv:1484) | John McMullen | Devils | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). John McMullen → Devils: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [1475](../raw_map.tsv:1475), [1476](../raw_map.tsv:1476), [1477](../raw_map.tsv:1477), [1478](../raw_map.tsv:1478), [1479](../raw_map.tsv:1479), [1480](../raw_map.tsv:1480), [1481](../raw_map.tsv:1481), [1482](../raw_map.tsv:1482), [1483](../raw_map.tsv:1483), [1484](../raw_map.tsv:1484).


Issue tags: mixed_evidence

### rel_52__ent_351__ent_1004

**All observed names:** Steinbrenner → Yankees (10)

Ordered IDs: Ent[ent_351] → Ent[ent_1004]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1495](../raw_map.tsv:1495) | Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1496](../raw_map.tsv:1496) | Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1497](../raw_map.tsv:1497) | Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;nn-&gt;\|nn |
| [1498](../raw_map.tsv:1498) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| [1499](../raw_map.tsv:1499) | Steinbrenner | Yankees | poss\|&lt;-poss&lt;-reign-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| [1500](../raw_map.tsv:1500) | Steinbrenner | Yankees | dobj\|&lt;-dobj&lt;-keep-&gt;prep-&gt;in-&gt;pobj-&gt;control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1501](../raw_map.tsv:1501) | Steinbrenner | Yankees | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1502](../raw_map.tsv:1502) | Steinbrenner | Yankees | rcmod\|-&gt;rcmod-&gt;have-&gt;nsubj-&gt;\|nsubj |
| [1503](../raw_map.tsv:1503) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [1504](../raw_map.tsv:1504) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Steinbrenner → Yankees: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [1495](../raw_map.tsv:1495), [1496](../raw_map.tsv:1496), [1497](../raw_map.tsv:1497), [1498](../raw_map.tsv:1498), [1499](../raw_map.tsv:1499), [1500](../raw_map.tsv:1500), [1501](../raw_map.tsv:1501), [1502](../raw_map.tsv:1502), [1503](../raw_map.tsv:1503), [1504](../raw_map.tsv:1504).


Issue tags: mixed_evidence

### rel_52__ent_593__ent_112

**All observed names:** Warner LeRoy → Tavern (10)

Ordered IDs: Ent[ent_593] → Ent[ent_112]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1505](../raw_map.tsv:1505) | Warner LeRoy | Tavern | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1506](../raw_map.tsv:1506) | Warner LeRoy | Tavern | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [1507](../raw_map.tsv:1507) | Warner LeRoy | Tavern | appos\|-&gt;appos-&gt;impresario-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |
| [1508](../raw_map.tsv:1508) | Warner LeRoy | Tavern | rcmod\|-&gt;rcmod-&gt;preside-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| [1509](../raw_map.tsv:1509) | Warner LeRoy | Tavern | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-work-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [1510](../raw_map.tsv:1510) | Warner LeRoy | Tavern | partmod\|-&gt;partmod-&gt;run-&gt;dobj-&gt;kitchen-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1511](../raw_map.tsv:1511) | Warner LeRoy | Tavern | appos\|-&gt;appos-&gt;showman-restaurateur-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [1512](../raw_map.tsv:1512) | Warner LeRoy | Tavern | appos\|&lt;-appos&lt;-plaintiff-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1513](../raw_map.tsv:1513) | Warner LeRoy | Tavern | appos\|&lt;-appos&lt;-owner-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [1514](../raw_map.tsv:1514) | Warner LeRoy | Tavern | appos\|&lt;-appos&lt;-hostess-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Warner LeRoy → Tavern: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [1505](../raw_map.tsv:1505), [1506](../raw_map.tsv:1506), [1507](../raw_map.tsv:1507), [1508](../raw_map.tsv:1508), [1509](../raw_map.tsv:1509), [1510](../raw_map.tsv:1510), [1511](../raw_map.tsv:1511), [1512](../raw_map.tsv:1512), [1513](../raw_map.tsv:1513), [1514](../raw_map.tsv:1514).


Issue tags: mixed_evidence

### rel_52__ent_1153__ent_1144

**All observed names:** Cablevision → Madison Square Garden (10)

Ordered IDs: Ent[ent_1153] → Ent[ent_1144]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5920](../raw_map.tsv:5920) | Cablevision | Madison Square Garden | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5921](../raw_map.tsv:5921) | Cablevision | Madison Square Garden | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5922](../raw_map.tsv:5922) | Cablevision | Madison Square Garden | appos\|-&gt;appos-&gt;company-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5923](../raw_map.tsv:5923) | Cablevision | Madison Square Garden | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5924](../raw_map.tsv:5924) | Cablevision | Madison Square Garden | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [5925](../raw_map.tsv:5925) | Cablevision | Madison Square Garden | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| [5926](../raw_map.tsv:5926) | Cablevision | Madison Square Garden | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5927](../raw_map.tsv:5927) | Cablevision | Madison Square Garden | nsubj\|&lt;-nsubj&lt;-acquire-&gt;dobj-&gt;\|dobj |
| [5928](../raw_map.tsv:5928) | Cablevision | Madison Square Garden | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;property-&gt;nn-&gt;\|nn |
| [5929](../raw_map.tsv:5929) | Cablevision | Madison Square Garden | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Cablevision → Madison Square Garden: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [5920](../raw_map.tsv:5920), [5921](../raw_map.tsv:5921), [5922](../raw_map.tsv:5922), [5923](../raw_map.tsv:5923), [5924](../raw_map.tsv:5924), [5925](../raw_map.tsv:5925), [5926](../raw_map.tsv:5926), [5927](../raw_map.tsv:5927), [5928](../raw_map.tsv:5928), [5929](../raw_map.tsv:5929).




### rel_52__ent_101__ent_881

**All observed names:** Walt Disney Company → ABC (10)

Ordered IDs: Ent[ent_101] → Ent[ent_881]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5930](../raw_map.tsv:5930) | Walt Disney Company | ABC | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5931](../raw_map.tsv:5931) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5932](../raw_map.tsv:5932) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |
| [5933](../raw_map.tsv:5933) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5934](../raw_map.tsv:5934) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [5935](../raw_map.tsv:5935) | Walt Disney Company | ABC | poss\|&lt;-poss&lt;-unit-&gt;nn-&gt;\|nn |
| [5936](../raw_map.tsv:5936) | Walt Disney Company | ABC | poss\|&lt;-poss&lt;-network-&gt;nn-&gt;\|nn |
| [5937](../raw_map.tsv:5937) | Walt Disney Company | ABC | poss\|&lt;-poss&lt;-acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5938](../raw_map.tsv:5938) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5939](../raw_map.tsv:5939) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;company-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Walt Disney Company → ABC: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [5930](../raw_map.tsv:5930), [5931](../raw_map.tsv:5931), [5932](../raw_map.tsv:5932), [5933](../raw_map.tsv:5933), [5934](../raw_map.tsv:5934), [5935](../raw_map.tsv:5935), [5936](../raw_map.tsv:5936), [5937](../raw_map.tsv:5937), [5938](../raw_map.tsv:5938), [5939](../raw_map.tsv:5939).




### rel_52__ent_217__ent_554

**All observed names:** Viacom → CBS (10)

Ordered IDs: Ent[ent_217] → Ent[ent_554]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5940](../raw_map.tsv:5940) | Viacom | CBS | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5941](../raw_map.tsv:5941) | Viacom | CBS | poss\|&lt;-poss&lt;-acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5942](../raw_map.tsv:5942) | Viacom | CBS | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [5943](../raw_map.tsv:5943) | Viacom | CBS | nsubj\|&lt;-nsubj&lt;-acquire-&gt;dobj-&gt;\|dobj |
| [5944](../raw_map.tsv:5944) | Viacom | CBS | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5945](../raw_map.tsv:5945) | Viacom | CBS | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |
| [5946](../raw_map.tsv:5946) | Viacom | CBS | nsubj\|&lt;-nsubj&lt;-merge-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [5947](../raw_map.tsv:5947) | Viacom | CBS | dep\|-&gt;dep-&gt;own-&gt;dobj-&gt;\|dobj |
| [5948](../raw_map.tsv:5948) | Viacom | CBS | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5949](../raw_map.tsv:5949) | Viacom | CBS | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Viacom → CBS: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [5940](../raw_map.tsv:5940), [5941](../raw_map.tsv:5941), [5942](../raw_map.tsv:5942), [5943](../raw_map.tsv:5943), [5944](../raw_map.tsv:5944), [5945](../raw_map.tsv:5945), [5946](../raw_map.tsv:5946), [5947](../raw_map.tsv:5947), [5948](../raw_map.tsv:5948), [5949](../raw_map.tsv:5949).


Issue tags: mixed_evidence

### rel_52__ent_393__ent_625

**All observed names:** News Corporation → Fox (10)

Ordered IDs: Ent[ent_393] → Ent[ent_625]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5950](../raw_map.tsv:5950) | News Corporation | Fox | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5951](../raw_map.tsv:5951) | News Corporation | Fox | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |
| [5952](../raw_map.tsv:5952) | News Corporation | Fox | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [5953](../raw_map.tsv:5953) | News Corporation | Fox | appos\|-&gt;appos-&gt;company-&gt;poss-&gt;\|poss |
| [5954](../raw_map.tsv:5954) | News Corporation | Fox | poss\|&lt;-poss&lt;-network-&gt;nn-&gt;\|nn |
| [5955](../raw_map.tsv:5955) | News Corporation | Fox | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5956](../raw_map.tsv:5956) | News Corporation | Fox | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |
| [5957](../raw_map.tsv:5957) | News Corporation | Fox | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5958](../raw_map.tsv:5958) | News Corporation | Fox | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |
| [5959](../raw_map.tsv:5959) | News Corporation | Fox | poss\|&lt;-poss&lt;-studio-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). News Corporation → Fox: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [5950](../raw_map.tsv:5950), [5951](../raw_map.tsv:5951), [5952](../raw_map.tsv:5952), [5953](../raw_map.tsv:5953), [5954](../raw_map.tsv:5954), [5955](../raw_map.tsv:5955), [5956](../raw_map.tsv:5956), [5957](../raw_map.tsv:5957), [5958](../raw_map.tsv:5958), [5959](../raw_map.tsv:5959).




### rel_52__ent_628__ent_867

**All observed names:** General Electric Company → NBC (10)

Ordered IDs: Ent[ent_628] → Ent[ent_867]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5960](../raw_map.tsv:5960) | General Electric Company | NBC | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5961](../raw_map.tsv:5961) | General Electric Company | NBC | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5962](../raw_map.tsv:5962) | General Electric Company | NBC | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |
| [5963](../raw_map.tsv:5963) | General Electric Company | NBC | poss\|&lt;-poss&lt;-unit-&gt;nn-&gt;\|nn |
| [5964](../raw_map.tsv:5964) | General Electric Company | NBC | poss\|&lt;-poss&lt;-subsidiary-&gt;nn-&gt;\|nn |
| [5965](../raw_map.tsv:5965) | General Electric Company | NBC | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5966](../raw_map.tsv:5966) | General Electric Company | NBC | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-chairman&lt;-nsubj&lt;-tell-&gt;dobj-&gt;meeting-&gt;prep-&gt;of-&gt;pobj-&gt;executive-&gt;nn-&gt;\|nn |
| [5967](../raw_map.tsv:5967) | General Electric Company | NBC | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5968](../raw_map.tsv:5968) | General Electric Company | NBC | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5969](../raw_map.tsv:5969) | General Electric Company | NBC | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). General Electric Company → NBC: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [5960](../raw_map.tsv:5960), [5961](../raw_map.tsv:5961), [5962](../raw_map.tsv:5962), [5963](../raw_map.tsv:5963), [5964](../raw_map.tsv:5964), [5965](../raw_map.tsv:5965), [5966](../raw_map.tsv:5966), [5967](../raw_map.tsv:5967), [5968](../raw_map.tsv:5968), [5969](../raw_map.tsv:5969).


Issue tags: mixed_evidence

### rel_52__ent_459__ent_1154

**All observed names:** Texas Air Corporation → Eastern (10)

Ordered IDs: Ent[ent_459] → Ent[ent_1154]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5970](../raw_map.tsv:5970) | Texas Air Corporation | Eastern | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5971](../raw_map.tsv:5971) | Texas Air Corporation | Eastern | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5972](../raw_map.tsv:5972) | Texas Air Corporation | Eastern | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |
| [5973](../raw_map.tsv:5973) | Texas Air Corporation | Eastern | poss\|&lt;-poss&lt;-marriage-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [5974](../raw_map.tsv:5974) | Texas Air Corporation | Eastern | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-representative&lt;-pobj&lt;-with&lt;-prep&lt;-negotiate-&gt;prep-&gt;for-&gt;pobj-&gt;purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5975](../raw_map.tsv:5975) | Texas Air Corporation | Eastern | nsubj\|&lt;-nsubj&lt;-reject-&gt;dobj-&gt;deal-&gt;rcmod-&gt;acquire-&gt;dobj-&gt;\|dobj |
| [5976](../raw_map.tsv:5976) | Texas Air Corporation | Eastern | nsubj\|&lt;-nsubj&lt;-announce-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| [5977](../raw_map.tsv:5977) | Texas Air Corporation | Eastern | appos\|-&gt;appos-&gt;company-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5978](../raw_map.tsv:5978) | Texas Air Corporation | Eastern | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5979](../raw_map.tsv:5979) | Texas Air Corporation | Eastern | appos\|-&gt;appos-&gt;company-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Texas Air Corporation → Eastern: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [5970](../raw_map.tsv:5970), [5971](../raw_map.tsv:5971), [5972](../raw_map.tsv:5972), [5973](../raw_map.tsv:5973), [5974](../raw_map.tsv:5974), [5975](../raw_map.tsv:5975), [5976](../raw_map.tsv:5976), [5977](../raw_map.tsv:5977), [5978](../raw_map.tsv:5978), [5979](../raw_map.tsv:5979).


Issue tags: mixed_evidence

### rel_52__ent_216__ent_867

**All observed names:** General Electric → NBC (10)

Ordered IDs: Ent[ent_216] → Ent[ent_867]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5980](../raw_map.tsv:5980) | General Electric | NBC | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5981](../raw_map.tsv:5981) | General Electric | NBC | poss\|&lt;-poss&lt;-unit-&gt;nn-&gt;\|nn |
| [5982](../raw_map.tsv:5982) | General Electric | NBC | poss\|&lt;-poss&lt;-division-&gt;nn-&gt;\|nn |
| [5983](../raw_map.tsv:5983) | General Electric | NBC | poss\|&lt;-poss&lt;-network-&gt;nn-&gt;\|nn |
| [5984](../raw_map.tsv:5984) | General Electric | NBC | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [5985](../raw_map.tsv:5985) | General Electric | NBC | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5986](../raw_map.tsv:5986) | General Electric | NBC | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5987](../raw_map.tsv:5987) | General Electric | NBC | nsubj\|&lt;-nsubj&lt;-devise-&gt;dobj-&gt;strategy-&gt;prep-&gt;for-&gt;pobj-&gt;future-&gt;poss-&gt;\|poss |
| [5988](../raw_map.tsv:5988) | General Electric | NBC | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5989](../raw_map.tsv:5989) | General Electric | NBC | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). General Electric → NBC: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [5980](../raw_map.tsv:5980), [5981](../raw_map.tsv:5981), [5982](../raw_map.tsv:5982), [5983](../raw_map.tsv:5983), [5984](../raw_map.tsv:5984), [5985](../raw_map.tsv:5985), [5986](../raw_map.tsv:5986), [5987](../raw_map.tsv:5987), [5988](../raw_map.tsv:5988), [5989](../raw_map.tsv:5989).


Issue tags: mixed_evidence

### rel_52__ent_1153__ent_458

**All observed names:** Cablevision → Garden (10)

Ordered IDs: Ent[ent_1153] → Ent[ent_458]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5990](../raw_map.tsv:5990) | Cablevision | Garden | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5991](../raw_map.tsv:5991) | Cablevision | Garden | appos\|-&gt;appos-&gt;company-&gt;poss-&gt;\|poss |
| [5992](../raw_map.tsv:5992) | Cablevision | Garden | nsubj\|&lt;-nsubj&lt;-acquire-&gt;dobj-&gt;\|dobj |
| [5993](../raw_map.tsv:5993) | Cablevision | Garden | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [5994](../raw_map.tsv:5994) | Cablevision | Garden | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5995](../raw_map.tsv:5995) | Cablevision | Garden | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5996](../raw_map.tsv:5996) | Cablevision | Garden | rcmod\|-&gt;rcmod-&gt;co-owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5997](../raw_map.tsv:5997) | Cablevision | Garden | rcmod\|-&gt;rcmod-&gt;consider-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5998](../raw_map.tsv:5998) | Cablevision | Garden | poss\|&lt;-poss&lt;-takeover-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5999](../raw_map.tsv:5999) | Cablevision | Garden | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Cablevision → Garden: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [5990](../raw_map.tsv:5990), [5991](../raw_map.tsv:5991), [5992](../raw_map.tsv:5992), [5993](../raw_map.tsv:5993), [5994](../raw_map.tsv:5994), [5995](../raw_map.tsv:5995), [5996](../raw_map.tsv:5996), [5997](../raw_map.tsv:5997), [5998](../raw_map.tsv:5998), [5999](../raw_map.tsv:5999).


Issue tags: mixed_evidence

### rel_52__ent_151__ent_625

**All observed names:** Rupert Murdoch → Fox (10)

Ordered IDs: Ent[ent_151] → Ent[ent_625]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6010](../raw_map.tsv:6010) | Rupert Murdoch | Fox | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6011](../raw_map.tsv:6011) | Rupert Murdoch | Fox | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [6012](../raw_map.tsv:6012) | Rupert Murdoch | Fox | poss\|&lt;-poss&lt;-network-&gt;nn-&gt;\|nn |
| [6013](../raw_map.tsv:6013) | Rupert Murdoch | Fox | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;parent-&gt;poss-&gt;\|poss |
| [6014](../raw_map.tsv:6014) | Rupert Murdoch | Fox | poss\|&lt;-poss&lt;-channel-&gt;nn-&gt;\|nn |
| [6015](../raw_map.tsv:6015) | Rupert Murdoch | Fox | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;company-&gt;poss-&gt;\|poss |
| [6016](../raw_map.tsv:6016) | Rupert Murdoch | Fox | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |
| [6017](../raw_map.tsv:6017) | Rupert Murdoch | Fox | poss\|&lt;-poss&lt;-empire-&gt;nn-&gt;\|nn |
| [6018](../raw_map.tsv:6018) | Rupert Murdoch | Fox | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6019](../raw_map.tsv:6019) | Rupert Murdoch | Fox | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-control&lt;-rcmod&lt;-company&lt;-nsubj&lt;-report-&gt;dobj-&gt;profit-&gt;prep-&gt;for-&gt;pobj-&gt;network-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Rupert Murdoch → Fox: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [6010](../raw_map.tsv:6010), [6011](../raw_map.tsv:6011), [6012](../raw_map.tsv:6012), [6013](../raw_map.tsv:6013), [6014](../raw_map.tsv:6014), [6015](../raw_map.tsv:6015), [6016](../raw_map.tsv:6016), [6017](../raw_map.tsv:6017), [6018](../raw_map.tsv:6018), [6019](../raw_map.tsv:6019).


Issue tags: mixed_evidence

### rel_52__ent_689__ent_1144

**All observed names:** James L. Dolan → Madison Square Garden (8)

Ordered IDs: Ent[ent_689] → Ent[ent_1144]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5716](../raw_map.tsv:5716) | James L. Dolan | Madison Square Garden | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5718](../raw_map.tsv:5718) | James L. Dolan | Madison Square Garden | rcmod\|-&gt;rcmod-&gt;run-&gt;dobj-&gt;\|dobj |
| [5719](../raw_map.tsv:5719) | James L. Dolan | Madison Square Garden | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5720](../raw_map.tsv:5720) | James L. Dolan | Madison Square Garden | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |
| [5721](../raw_map.tsv:5721) | James L. Dolan | Madison Square Garden | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-reign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [5722](../raw_map.tsv:5722) | James L. Dolan | Madison Square Garden | nsubj\|&lt;-nsubj&lt;-stir-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;by-&gt;pobj-&gt;jostler-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [5724](../raw_map.tsv:5724) | James L. Dolan | Madison Square Garden | appos\|-&gt;appos-&gt;strongman-&gt;nn-&gt;\|nn |
| [5725](../raw_map.tsv:5725) | James L. Dolan | Madison Square Garden | appos\|-&gt;appos-&gt;son-&gt;rcmod-&gt;responsible-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). James L. Dolan → Madison Square Garden: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [5716](../raw_map.tsv:5716), [5718](../raw_map.tsv:5718), [5719](../raw_map.tsv:5719), [5720](../raw_map.tsv:5720), [5721](../raw_map.tsv:5721), [5722](../raw_map.tsv:5722), [5724](../raw_map.tsv:5724), [5725](../raw_map.tsv:5725).


Issue tags: mixed_evidence

### rel_52__ent_339__ent_1036

**All observed names:** Bud Selig → Milwaukee Brewers (7)

Ordered IDs: Ent[ent_339] → Ent[ent_1036]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1445](../raw_map.tsv:1445) | Bud Selig | Milwaukee Brewers | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1446](../raw_map.tsv:1446) | Bud Selig | Milwaukee Brewers | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1447](../raw_map.tsv:1447) | Bud Selig | Milwaukee Brewers | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1448](../raw_map.tsv:1448) | Bud Selig | Milwaukee Brewers | rcmod\|-&gt;rcmod-&gt;run-&gt;dobj-&gt;\|dobj |
| [1449](../raw_map.tsv:1449) | Bud Selig | Milwaukee Brewers | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1450](../raw_map.tsv:1450) | Bud Selig | Milwaukee Brewers | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-president-&gt;dep-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1452](../raw_map.tsv:1452) | Bud Selig | Milwaukee Brewers | nsubj\|&lt;-nsubj&lt;-person-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Bud Selig → Milwaukee Brewers: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [1445](../raw_map.tsv:1445), [1446](../raw_map.tsv:1446), [1447](../raw_map.tsv:1447), [1448](../raw_map.tsv:1448), [1449](../raw_map.tsv:1449), [1450](../raw_map.tsv:1450), [1452](../raw_map.tsv:1452).


Issue tags: mixed_evidence

### rel_52__ent_1155__ent_219

**All observed names:** Federated Department Stores → Macy (6)

Ordered IDs: Ent[ent_1155] → Ent[ent_219]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6000](../raw_map.tsv:6000) | Federated Department Stores | Macy | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [6001](../raw_map.tsv:6001) | Federated Department Stores | Macy | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6002](../raw_map.tsv:6002) | Federated Department Stores | Macy | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6003](../raw_map.tsv:6003) | Federated Department Stores | Macy | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6005](../raw_map.tsv:6005) | Federated Department Stores | Macy | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-merger-&gt;rcmod-&gt;get-&gt;dobj-&gt;\|dobj |
| [6007](../raw_map.tsv:6007) | Federated Department Stores | Macy | rcmod\|-&gt;rcmod-&gt;take-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Federated Department Stores → Macy: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [6000](../raw_map.tsv:6000), [6001](../raw_map.tsv:6001), [6002](../raw_map.tsv:6002), [6003](../raw_map.tsv:6003), [6005](../raw_map.tsv:6005), [6007](../raw_map.tsv:6007).


Issue tags: mixed_evidence

### rel_52__ent_352__ent_594

**All observed names:** Peter S. Kalikow → The New York Post (5)

Ordered IDs: Ent[ent_352] → Ent[ent_594]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1485](../raw_map.tsv:1485) | Peter S. Kalikow | The New York Post | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1486](../raw_map.tsv:1486) | Peter S. Kalikow | The New York Post | appos\|-&gt;appos-&gt;publisher-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1488](../raw_map.tsv:1488) | Peter S. Kalikow | The New York Post | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [1489](../raw_map.tsv:1489) | Peter S. Kalikow | The New York Post | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [1492](../raw_map.tsv:1492) | Peter S. Kalikow | The New York Post | nsubj\|&lt;-nsubj&lt;-acquire-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Peter S. Kalikow → The New York Post: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [1485](../raw_map.tsv:1485), [1486](../raw_map.tsv:1486), [1488](../raw_map.tsv:1488), [1489](../raw_map.tsv:1489), [1492](../raw_map.tsv:1492).


Issue tags: mixed_evidence

### rel_52__ent_1034__ent_1035

**All observed names:** Danny Meyer → Union Square Cafe (4)

Ordered IDs: Ent[ent_1034] → Ent[ent_1035]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1435](../raw_map.tsv:1435) | Danny Meyer | Union Square Cafe | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1436](../raw_map.tsv:1436) | Danny Meyer | Union Square Cafe | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [1440](../raw_map.tsv:1440) | Danny Meyer | Union Square Cafe | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;restaurant-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [1441](../raw_map.tsv:1441) | Danny Meyer | Union Square Cafe | rcmod\|-&gt;rcmod-&gt;open-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Danny Meyer → Union Square Cafe: The case has a direct owner/owns, ownership or parent construction linking the first person or company to the second asset or organization.

Cited evidence lines: [1435](../raw_map.tsv:1435), [1436](../raw_map.tsv:1436), [1440](../raw_map.tsv:1440), [1441](../raw_map.tsv:1441).




### rel_52__ent_951__ent_325

**All observed names:** John Gross → The Times (3)

Ordered IDs: Ent[ent_951] → Ent[ent_325]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7315](../raw_map.tsv:7315) | John Gross | The Times | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7316](../raw_map.tsv:7316) | John Gross | The Times | nsubj\|&lt;-nsubj&lt;-write&lt;-rcmod&lt;-critic-&gt;prep-&gt;in-&gt;pobj-&gt;review-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7317](../raw_map.tsv:7317) | John Gross | The Times | appos\|&lt;-appos&lt;-book&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). John Gross → The Times: Writing or being quoted in The Times does not establish ownership of the newspaper.

Cited evidence lines: [7315](../raw_map.tsv:7315), [7316](../raw_map.tsv:7316), [7317](../raw_map.tsv:7317).


Issue tags: other_predicate

### rel_52__ent_1054__ent_118

**All observed names:** Raul A. Campanioni → St. Vincent 's Hospital (1)

Ordered IDs: Ent[ent_1054] → Ent[ent_118]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1777](../raw_map.tsv:1777) | Raul A. Campanioni | St. Vincent 's Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Raul A. Campanioni → St. Vincent 's Hospital: Dying at a hospital does not establish ownership of it.

Cited evidence lines: [1777](../raw_map.tsv:1777).


Issue tags: other_predicate
