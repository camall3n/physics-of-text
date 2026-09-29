# audit_d0f63db2a21a — rel_47: owns organization or asset

Predicate ID: owns

Person or organization X owns or owned some or all of organization, business, team or property Y.

Includes: owner/co-owner/owns; explicit ownership interest or stated share; corporate parent; completed acquisition with ownership attachment; historical ownership. Excludes: management or leadership alone; publishing or distribution alone; mere collaboration; proposed or rejected acquisition. Ambiguous unless resolved by case-local evidence: merger without clear ownership direction; a possessive alone. This states ownership interest, not necessarily complete ownership or control. An explicit partial stake qualifies here but not automatically as subsidiary_of in reverse.

Complete census: 21 supported, 21 incorrect, 1 ambiguous; N=43. Precision 21/43=48.84% to 22/43=51.16%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 15 | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 9 | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| 8 | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| 7 | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 7 | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| 6 | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |
| 5 | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 4 | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| 4 | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| 3 | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| 3 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | nsubj\|&lt;-nsubj&lt;-acquire-&gt;dobj-&gt;\|dobj |
| 3 | poss\|&lt;-poss&lt;-network-&gt;nn-&gt;\|nn |
| 3 | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | poss\|&lt;-poss&lt;-unit-&gt;nn-&gt;\|nn |
| 3 | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;company-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;company-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| 2 | appos\|-&gt;appos-&gt;front-runner-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;nominee-&gt;amod-&gt;\|amod |
| 2 | appos\|-&gt;appos-&gt;owner-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;research-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;senator-&gt;amod-&gt;\|amod |
| 2 | nsubj\|&lt;-nsubj&lt;-criticize-&gt;dobj-&gt;\|dobj |
| 2 | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | amod\|&lt;-amod&lt;-counterpart-&gt;appos-&gt;\|appos |
| 1 | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;majority-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;majority-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;negotiator-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;oilman-&gt;rcmod-&gt;buy-&gt;dobj-&gt;\|dobj |
| 1 | appos\|&lt;-appos&lt;-hostess-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-owner-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| 1 | appos\|&lt;-appos&lt;-warning&lt;-pobj&lt;-in&lt;-prep&lt;-workshop&lt;-pobj&lt;-after&lt;-prep&lt;-say-&gt;nsubj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dep\|-&gt;dep-&gt;publisher-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-join-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-keep-&gt;prep-&gt;in-&gt;pobj-&gt;control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-make-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;senator-&gt;amod-&gt;\|amod |
| 1 | nn\|&lt;-nn&lt;-commissioner&lt;-dobj&lt;-elect&lt;-dep&lt;-have-&gt;nsubj-&gt;\|nsubj |
| 1 | nn\|&lt;-nn&lt;-president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-representative&lt;-nsubj&lt;-come-&gt;prep-&gt;with-&gt;pobj-&gt;letter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-announce-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-call-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-convert-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-cradle&lt;-dep&lt;-reality-&gt;rcmod-&gt;seem-&gt;prep-&gt;like-&gt;pobj-&gt;flashback-&gt;prep-&gt;for-&gt;pobj-&gt;owner-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-devise-&gt;dobj-&gt;strategy-&gt;prep-&gt;for-&gt;pobj-&gt;future-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-merge-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-person-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-presence-&gt;amod-&gt;\|amod |
| 1 | nsubj\|&lt;-nsubj&lt;-reject-&gt;dobj-&gt;deal-&gt;rcmod-&gt;acquire-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-relinquish-&gt;dobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-replace-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-rest-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-retain-&gt;dobj-&gt;control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;advmod-&gt;well-&gt;dep-&gt;as-&gt;pobj-&gt;publisher-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;nsubj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say&lt;-dep&lt;-down-&gt;dep-&gt;encouraged-&gt;prep-&gt;about-&gt;pobj-&gt;future-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-see-&gt;dobj-&gt;game-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-share-&gt;dobj-&gt;view-&gt;dep-&gt;unlike-&gt;pobj-&gt;predecessor-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-speak-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-watch-&gt;dobj-&gt;\|dobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-call-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-charge-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-depose-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;amod-&gt;\|amod |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-pull-&gt;prep-&gt;for-&gt;pobj-&gt;violation-&gt;prep-&gt;in-&gt;pobj-&gt;section-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;undergo-&gt;nsubj-&gt;\|nsubj |
| 1 | pobj\|&lt;-pobj&lt;-after&lt;-prep&lt;-make-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-transcript-&gt;prep-&gt;for-&gt;pobj-&gt;response-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-money&lt;-dobj&lt;-raise-&gt;prep-&gt;than-&gt;pobj-&gt;candidate-&gt;prep-&gt;except-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-propose-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-chairman&lt;-nsubj&lt;-tell-&gt;dobj-&gt;meeting-&gt;prep-&gt;of-&gt;pobj-&gt;executive-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ouster-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-representative&lt;-pobj&lt;-with&lt;-prep&lt;-negotiate-&gt;prep-&gt;for-&gt;pobj-&gt;purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-saga&lt;-nsubj&lt;-end-&gt;prep-&gt;with-&gt;pobj-&gt;suspension-&gt;prep-&gt;of-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-go-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-bodyguard&lt;-nsubjpass&lt;-shoot-&gt;prep-&gt;outside-&gt;pobj-&gt;warehouse-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-channel-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-division-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-hurrah&lt;-pobj&lt;-in&lt;-prep&lt;-win-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-man-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-marriage-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;property-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-statement&lt;-nsubj&lt;-look-&gt;prep-&gt;like-&gt;pobj-&gt;reward-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-studio-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-subsidiary-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-takeover-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;co-owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;consider-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;father-&gt;prep-&gt;to-&gt;pobj-&gt;son-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;miss-&gt;nsubjpass-&gt;presence-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;negotiate-&gt;dobj-&gt;salary-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;own-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;preside-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;talk-&gt;prep-&gt;about-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;undermine-&gt;dobj-&gt;position-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;prep-&gt;of-&gt;pobj-&gt;team-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;vote-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_47__ent_459__ent_1154

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

**Judgment: supported** (primary). Texas Air Corporation → Eastern: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5970](../raw_map.tsv:5970), [5971](../raw_map.tsv:5971), [5972](../raw_map.tsv:5972), [5973](../raw_map.tsv:5973), [5974](../raw_map.tsv:5974), [5975](../raw_map.tsv:5975), [5976](../raw_map.tsv:5976), [5977](../raw_map.tsv:5977), [5978](../raw_map.tsv:5978), [5979](../raw_map.tsv:5979).


Issue tags: mixed_evidence

### rel_47__ent_1153__ent_458

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

**Judgment: supported** (primary). Cablevision → Garden: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5990](../raw_map.tsv:5990), [5991](../raw_map.tsv:5991), [5992](../raw_map.tsv:5992), [5993](../raw_map.tsv:5993), [5994](../raw_map.tsv:5994), [5995](../raw_map.tsv:5995), [5996](../raw_map.tsv:5996), [5997](../raw_map.tsv:5997), [5998](../raw_map.tsv:5998), [5999](../raw_map.tsv:5999).


Issue tags: mixed_evidence

### rel_47__ent_174__ent_1038

**All observed names:** Jerry Jones → Dallas Cowboys (9)

Ordered IDs: Ent[ent_174] → Ent[ent_1038]; 9 rows.

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

**Judgment: supported** (primary). Jerry Jones → Dallas Cowboys: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [1455](../raw_map.tsv:1455), [1456](../raw_map.tsv:1456), [1457](../raw_map.tsv:1457), [1458](../raw_map.tsv:1458), [1459](../raw_map.tsv:1459), [1460](../raw_map.tsv:1460), [1461](../raw_map.tsv:1461), [1462](../raw_map.tsv:1462), [1463](../raw_map.tsv:1463).


Issue tags: mixed_evidence

### rel_47__ent_1153__ent_1144

**All observed names:** Cablevision → Madison Square Garden (9)

Ordered IDs: Ent[ent_1153] → Ent[ent_1144]; 9 rows.

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

**Judgment: supported** (primary). Cablevision → Madison Square Garden: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5920](../raw_map.tsv:5920), [5921](../raw_map.tsv:5921), [5922](../raw_map.tsv:5922), [5923](../raw_map.tsv:5923), [5924](../raw_map.tsv:5924), [5925](../raw_map.tsv:5925), [5926](../raw_map.tsv:5926), [5927](../raw_map.tsv:5927), [5928](../raw_map.tsv:5928).




### rel_47__ent_101__ent_881

**All observed names:** Walt Disney Company → ABC (9)

Ordered IDs: Ent[ent_101] → Ent[ent_881]; 9 rows.

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

**Judgment: supported** (primary). Walt Disney Company → ABC: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5930](../raw_map.tsv:5930), [5931](../raw_map.tsv:5931), [5932](../raw_map.tsv:5932), [5933](../raw_map.tsv:5933), [5934](../raw_map.tsv:5934), [5935](../raw_map.tsv:5935), [5936](../raw_map.tsv:5936), [5937](../raw_map.tsv:5937), [5938](../raw_map.tsv:5938).




### rel_47__ent_339__ent_1036

**All observed names:** Bud Selig → Milwaukee Brewers (8)

Ordered IDs: Ent[ent_339] → Ent[ent_1036]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1445](../raw_map.tsv:1445) | Bud Selig | Milwaukee Brewers | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1446](../raw_map.tsv:1446) | Bud Selig | Milwaukee Brewers | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1447](../raw_map.tsv:1447) | Bud Selig | Milwaukee Brewers | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1449](../raw_map.tsv:1449) | Bud Selig | Milwaukee Brewers | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1451](../raw_map.tsv:1451) | Bud Selig | Milwaukee Brewers | nsubj\|&lt;-nsubj&lt;-watch-&gt;dobj-&gt;\|dobj |
| [1452](../raw_map.tsv:1452) | Bud Selig | Milwaukee Brewers | nsubj\|&lt;-nsubj&lt;-person-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1453](../raw_map.tsv:1453) | Bud Selig | Milwaukee Brewers | nn\|&lt;-nn&lt;-commissioner&lt;-dobj&lt;-elect&lt;-dep&lt;-have-&gt;nsubj-&gt;\|nsubj |
| [1454](../raw_map.tsv:1454) | Bud Selig | Milwaukee Brewers | dobj\|&lt;-dobj&lt;-join-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Bud Selig → Milwaukee Brewers: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [1445](../raw_map.tsv:1445), [1446](../raw_map.tsv:1446), [1447](../raw_map.tsv:1447), [1449](../raw_map.tsv:1449), [1451](../raw_map.tsv:1451), [1452](../raw_map.tsv:1452), [1453](../raw_map.tsv:1453), [1454](../raw_map.tsv:1454).


Issue tags: mixed_evidence

### rel_47__ent_1359__ent_110

**All observed names:** John McMullen → Devils (8)

Ordered IDs: Ent[ent_1359] → Ent[ent_110]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1475](../raw_map.tsv:1475) | John McMullen | Devils | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1476](../raw_map.tsv:1476) | John McMullen | Devils | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1477](../raw_map.tsv:1477) | John McMullen | Devils | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1478](../raw_map.tsv:1478) | John McMullen | Devils | rcmod\|-&gt;rcmod-&gt;miss-&gt;nsubjpass-&gt;presence-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| [1480](../raw_map.tsv:1480) | John McMullen | Devils | poss\|&lt;-poss&lt;-hurrah&lt;-pobj&lt;-in&lt;-prep&lt;-win-&gt;nsubj-&gt;\|nsubj |
| [1481](../raw_map.tsv:1481) | John McMullen | Devils | partmod\|-&gt;partmod-&gt;undergo-&gt;nsubj-&gt;\|nsubj |
| [1483](../raw_map.tsv:1483) | John McMullen | Devils | nsubj\|&lt;-nsubj&lt;-see-&gt;dobj-&gt;game-&gt;nn-&gt;\|nn |
| [1484](../raw_map.tsv:1484) | John McMullen | Devils | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). John McMullen → Devils: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [1475](../raw_map.tsv:1475), [1476](../raw_map.tsv:1476), [1477](../raw_map.tsv:1477), [1478](../raw_map.tsv:1478), [1480](../raw_map.tsv:1480), [1481](../raw_map.tsv:1481), [1483](../raw_map.tsv:1483), [1484](../raw_map.tsv:1484).


Issue tags: mixed_evidence

### rel_47__ent_351__ent_1004

**All observed names:** Steinbrenner → Yankees (8)

Ordered IDs: Ent[ent_351] → Ent[ent_1004]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1495](../raw_map.tsv:1495) | Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1496](../raw_map.tsv:1496) | Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1497](../raw_map.tsv:1497) | Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;nn-&gt;\|nn |
| [1498](../raw_map.tsv:1498) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| [1500](../raw_map.tsv:1500) | Steinbrenner | Yankees | dobj\|&lt;-dobj&lt;-keep-&gt;prep-&gt;in-&gt;pobj-&gt;control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1501](../raw_map.tsv:1501) | Steinbrenner | Yankees | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1503](../raw_map.tsv:1503) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [1504](../raw_map.tsv:1504) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Steinbrenner → Yankees: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [1495](../raw_map.tsv:1495), [1496](../raw_map.tsv:1496), [1497](../raw_map.tsv:1497), [1498](../raw_map.tsv:1498), [1500](../raw_map.tsv:1500), [1501](../raw_map.tsv:1501), [1503](../raw_map.tsv:1503), [1504](../raw_map.tsv:1504).


Issue tags: mixed_evidence

### rel_47__ent_1388__ent_867

**All observed names:** General Electric Company → NBC (8)

Ordered IDs: Ent[ent_1388] → Ent[ent_867]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5962](../raw_map.tsv:5962) | General Electric Company | NBC | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |
| [5963](../raw_map.tsv:5963) | General Electric Company | NBC | poss\|&lt;-poss&lt;-unit-&gt;nn-&gt;\|nn |
| [5964](../raw_map.tsv:5964) | General Electric Company | NBC | poss\|&lt;-poss&lt;-subsidiary-&gt;nn-&gt;\|nn |
| [5965](../raw_map.tsv:5965) | General Electric Company | NBC | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5966](../raw_map.tsv:5966) | General Electric Company | NBC | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-chairman&lt;-nsubj&lt;-tell-&gt;dobj-&gt;meeting-&gt;prep-&gt;of-&gt;pobj-&gt;executive-&gt;nn-&gt;\|nn |
| [5967](../raw_map.tsv:5967) | General Electric Company | NBC | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5968](../raw_map.tsv:5968) | General Electric Company | NBC | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5969](../raw_map.tsv:5969) | General Electric Company | NBC | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). General Electric Company → NBC: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5962](../raw_map.tsv:5962), [5963](../raw_map.tsv:5963), [5964](../raw_map.tsv:5964), [5965](../raw_map.tsv:5965), [5966](../raw_map.tsv:5966), [5967](../raw_map.tsv:5967), [5968](../raw_map.tsv:5968), [5969](../raw_map.tsv:5969).


Issue tags: mixed_evidence

### rel_47__ent_216__ent_867

**All observed names:** General Electric → NBC (8)

Ordered IDs: Ent[ent_216] → Ent[ent_867]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5981](../raw_map.tsv:5981) | General Electric | NBC | poss\|&lt;-poss&lt;-unit-&gt;nn-&gt;\|nn |
| [5982](../raw_map.tsv:5982) | General Electric | NBC | poss\|&lt;-poss&lt;-division-&gt;nn-&gt;\|nn |
| [5983](../raw_map.tsv:5983) | General Electric | NBC | poss\|&lt;-poss&lt;-network-&gt;nn-&gt;\|nn |
| [5984](../raw_map.tsv:5984) | General Electric | NBC | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [5985](../raw_map.tsv:5985) | General Electric | NBC | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5986](../raw_map.tsv:5986) | General Electric | NBC | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5987](../raw_map.tsv:5987) | General Electric | NBC | nsubj\|&lt;-nsubj&lt;-devise-&gt;dobj-&gt;strategy-&gt;prep-&gt;for-&gt;pobj-&gt;future-&gt;poss-&gt;\|poss |
| [5989](../raw_map.tsv:5989) | General Electric | NBC | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). General Electric → NBC: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5981](../raw_map.tsv:5981), [5982](../raw_map.tsv:5982), [5983](../raw_map.tsv:5983), [5984](../raw_map.tsv:5984), [5985](../raw_map.tsv:5985), [5986](../raw_map.tsv:5986), [5987](../raw_map.tsv:5987), [5989](../raw_map.tsv:5989).


Issue tags: mixed_evidence

### rel_47__ent_1155__ent_219

**All observed names:** Federated Department Stores → Macy (7)

Ordered IDs: Ent[ent_1155] → Ent[ent_219]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6000](../raw_map.tsv:6000) | Federated Department Stores | Macy | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [6001](../raw_map.tsv:6001) | Federated Department Stores | Macy | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6002](../raw_map.tsv:6002) | Federated Department Stores | Macy | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6003](../raw_map.tsv:6003) | Federated Department Stores | Macy | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6004](../raw_map.tsv:6004) | Federated Department Stores | Macy | nsubj\|&lt;-nsubj&lt;-convert-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [6006](../raw_map.tsv:6006) | Federated Department Stores | Macy | nsubj\|&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [6007](../raw_map.tsv:6007) | Federated Department Stores | Macy | rcmod\|-&gt;rcmod-&gt;take-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Federated Department Stores → Macy: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [6000](../raw_map.tsv:6000), [6001](../raw_map.tsv:6001), [6002](../raw_map.tsv:6002), [6003](../raw_map.tsv:6003), [6004](../raw_map.tsv:6004), [6006](../raw_map.tsv:6006), [6007](../raw_map.tsv:6007).


Issue tags: mixed_evidence

### rel_47__ent_151__ent_1232

**All observed names:** Rupert Murdoch → Fox (5); Rupert Murdoch → News Corporation (1)

Ordered IDs: Ent[ent_151] → Ent[ent_1232]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [261](../raw_map.tsv:261) | Rupert Murdoch | News Corporation | rcmod\|-&gt;rcmod-&gt;own-&gt;nsubj-&gt;\|nsubj |
| [6010](../raw_map.tsv:6010) | Rupert Murdoch | Fox | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6011](../raw_map.tsv:6011) | Rupert Murdoch | Fox | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [6012](../raw_map.tsv:6012) | Rupert Murdoch | Fox | poss\|&lt;-poss&lt;-network-&gt;nn-&gt;\|nn |
| [6014](../raw_map.tsv:6014) | Rupert Murdoch | Fox | poss\|&lt;-poss&lt;-channel-&gt;nn-&gt;\|nn |
| [6016](../raw_map.tsv:6016) | Rupert Murdoch | Fox | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Rupert Murdoch → Fox; Rupert Murdoch → News Corporation: News Corporation and Fox are distinct target organizations merged into one fact with Rupert Murdoch; their identity cannot be treated as interchangeable.

Cited evidence lines: [261](../raw_map.tsv:261), [6010](../raw_map.tsv:6010), [6011](../raw_map.tsv:6011), [6012](../raw_map.tsv:6012), [6014](../raw_map.tsv:6014), [6016](../raw_map.tsv:6016).

**Review question:** Should News Corporation and Fox be separate target entities?
Issue tags: merged_identity, mixed_evidence

### rel_47__ent_49__ent_1235

**All observed names:** George J. Mitchell → Democratic (5); Richard A. Gephardt → Democratic (1)

Ordered IDs: Ent[ent_49] → Ent[ent_1235]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3748](../raw_map.tsv:3748) | Richard A. Gephardt | Democratic | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3768](../raw_map.tsv:3768) | George J. Mitchell | Democratic | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3769](../raw_map.tsv:3769) | George J. Mitchell | Democratic | appos\|-&gt;appos-&gt;senator-&gt;amod-&gt;\|amod |
| [3770](../raw_map.tsv:3770) | George J. Mitchell | Democratic | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;majority-&gt;amod-&gt;\|amod |
| [3771](../raw_map.tsv:3771) | George J. Mitchell | Democratic | dobj\|&lt;-dobj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;senator-&gt;amod-&gt;\|amod |
| [3776](../raw_map.tsv:3776) | George J. Mitchell | Democratic | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-transcript-&gt;prep-&gt;for-&gt;pobj-&gt;response-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). George J. Mitchell → Democratic; Richard A. Gephardt → Democratic: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [3748](../raw_map.tsv:3748), [3768](../raw_map.tsv:3768), [3769](../raw_map.tsv:3769), [3770](../raw_map.tsv:3770), [3771](../raw_map.tsv:3771), [3776](../raw_map.tsv:3776).




### rel_47__ent_567__ent_554

**All observed names:** Viacom → CBS (6)

Ordered IDs: Ent[ent_567] → Ent[ent_554]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5940](../raw_map.tsv:5940) | Viacom | CBS | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5942](../raw_map.tsv:5942) | Viacom | CBS | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [5944](../raw_map.tsv:5944) | Viacom | CBS | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5946](../raw_map.tsv:5946) | Viacom | CBS | nsubj\|&lt;-nsubj&lt;-merge-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [5948](../raw_map.tsv:5948) | Viacom | CBS | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5949](../raw_map.tsv:5949) | Viacom | CBS | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Viacom → CBS: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5940](../raw_map.tsv:5940), [5942](../raw_map.tsv:5942), [5944](../raw_map.tsv:5944), [5946](../raw_map.tsv:5946), [5948](../raw_map.tsv:5948), [5949](../raw_map.tsv:5949).


Issue tags: mixed_evidence

### rel_47__ent_350__ent_592

**All observed names:** Marge Schott → Cincinnati Reds (5)

Ordered IDs: Ent[ent_350] → Ent[ent_592]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1465](../raw_map.tsv:1465) | Marge Schott | Cincinnati Reds | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1466](../raw_map.tsv:1466) | Marge Schott | Cincinnati Reds | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1468](../raw_map.tsv:1468) | Marge Schott | Cincinnati Reds | nsubj\|&lt;-nsubj&lt;-relinquish-&gt;dobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1471](../raw_map.tsv:1471) | Marge Schott | Cincinnati Reds | rcmod\|-&gt;rcmod-&gt;undermine-&gt;dobj-&gt;position-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;prep-&gt;of-&gt;pobj-&gt;team-&gt;nn-&gt;\|nn |
| [1473](../raw_map.tsv:1473) | Marge Schott | Cincinnati Reds | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-saga&lt;-nsubj&lt;-end-&gt;prep-&gt;with-&gt;pobj-&gt;suspension-&gt;prep-&gt;of-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Marge Schott → Cincinnati Reds: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [1465](../raw_map.tsv:1465), [1466](../raw_map.tsv:1466), [1468](../raw_map.tsv:1468), [1471](../raw_map.tsv:1471), [1473](../raw_map.tsv:1473).


Issue tags: mixed_evidence

### rel_47__ent_593__ent_112

**All observed names:** Warner LeRoy → Tavern (5)

Ordered IDs: Ent[ent_593] → Ent[ent_112]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1505](../raw_map.tsv:1505) | Warner LeRoy | Tavern | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1506](../raw_map.tsv:1506) | Warner LeRoy | Tavern | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [1508](../raw_map.tsv:1508) | Warner LeRoy | Tavern | rcmod\|-&gt;rcmod-&gt;preside-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| [1513](../raw_map.tsv:1513) | Warner LeRoy | Tavern | appos\|&lt;-appos&lt;-owner-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [1514](../raw_map.tsv:1514) | Warner LeRoy | Tavern | appos\|&lt;-appos&lt;-hostess-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Warner LeRoy → Tavern: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [1505](../raw_map.tsv:1505), [1506](../raw_map.tsv:1506), [1508](../raw_map.tsv:1508), [1513](../raw_map.tsv:1513), [1514](../raw_map.tsv:1514).


Issue tags: mixed_evidence

### rel_47__ent_354__ent_595

**All observed names:** Torre → Williams (5)

Ordered IDs: Ent[ent_354] → Ent[ent_595]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1535](../raw_map.tsv:1535) | Torre | Williams | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1536](../raw_map.tsv:1536) | Torre | Williams | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [1538](../raw_map.tsv:1538) | Torre | Williams | nsubj\|&lt;-nsubj&lt;-speak-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [1541](../raw_map.tsv:1541) | Torre | Williams | nsubj\|&lt;-nsubj&lt;-rest-&gt;dobj-&gt;\|dobj |
| [1543](../raw_map.tsv:1543) | Torre | Williams | nsubj\|&lt;-nsubj&lt;-call-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Torre → Williams: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [1535](../raw_map.tsv:1535), [1536](../raw_map.tsv:1536), [1538](../raw_map.tsv:1538), [1541](../raw_map.tsv:1541), [1543](../raw_map.tsv:1543).




### rel_47__ent_135__ent_377

**All observed names:** Rocco Landesman → Jujamcyn Theaters (4)

Ordered IDs: Ent[ent_135] → Ent[ent_377]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [71](../raw_map.tsv:71) | Rocco Landesman | Jujamcyn Theaters | nsubj\|&lt;-nsubj&lt;-say-&gt;nsubj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [73](../raw_map.tsv:73) | Rocco Landesman | Jujamcyn Theaters | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| [74](../raw_map.tsv:74) | Rocco Landesman | Jujamcyn Theaters | nn\|&lt;-nn&lt;-president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [75](../raw_map.tsv:75) | Rocco Landesman | Jujamcyn Theaters | appos\|&lt;-appos&lt;-warning&lt;-pobj&lt;-in&lt;-prep&lt;-workshop&lt;-pobj&lt;-after&lt;-prep&lt;-say-&gt;nsubj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Rocco Landesman → Jujamcyn Theaters: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [71](../raw_map.tsv:71), [73](../raw_map.tsv:73), [74](../raw_map.tsv:74), [75](../raw_map.tsv:75).


Issue tags: mixed_evidence

### rel_47__ent_446__ent_594

**All observed names:** Peter S. Kalikow → The New York Post (4)

Ordered IDs: Ent[ent_446] → Ent[ent_594]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1485](../raw_map.tsv:1485) | Peter S. Kalikow | The New York Post | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1488](../raw_map.tsv:1488) | Peter S. Kalikow | The New York Post | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [1490](../raw_map.tsv:1490) | Peter S. Kalikow | The New York Post | nsubj\|&lt;-nsubj&lt;-say-&gt;advmod-&gt;well-&gt;dep-&gt;as-&gt;pobj-&gt;publisher-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1493](../raw_map.tsv:1493) | Peter S. Kalikow | The New York Post | dep\|-&gt;dep-&gt;publisher-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Peter S. Kalikow → The New York Post: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [1485](../raw_map.tsv:1485), [1488](../raw_map.tsv:1488), [1490](../raw_map.tsv:1490), [1493](../raw_map.tsv:1493).


Issue tags: mixed_evidence

### rel_47__ent_393__ent_1433

**All observed names:** News Corporation → Fox (4)

Ordered IDs: Ent[ent_393] → Ent[ent_1433]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5950](../raw_map.tsv:5950) | News Corporation | Fox | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [5951](../raw_map.tsv:5951) | News Corporation | Fox | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |
| [5957](../raw_map.tsv:5957) | News Corporation | Fox | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5958](../raw_map.tsv:5958) | News Corporation | Fox | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). News Corporation → Fox: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5950](../raw_map.tsv:5950), [5951](../raw_map.tsv:5951), [5957](../raw_map.tsv:5957), [5958](../raw_map.tsv:5958).




### rel_47__ent_393__ent_625

**All observed names:** News Corporation → Fox (4)

Ordered IDs: Ent[ent_393] → Ent[ent_625]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5952](../raw_map.tsv:5952) | News Corporation | Fox | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [5955](../raw_map.tsv:5955) | News Corporation | Fox | appos\|-&gt;appos-&gt;parent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5956](../raw_map.tsv:5956) | News Corporation | Fox | appos\|-&gt;appos-&gt;parent-&gt;poss-&gt;\|poss |
| [5959](../raw_map.tsv:5959) | News Corporation | Fox | poss\|&lt;-poss&lt;-studio-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). News Corporation → Fox: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5952](../raw_map.tsv:5952), [5955](../raw_map.tsv:5955), [5956](../raw_map.tsv:5956), [5959](../raw_map.tsv:5959).




### rel_47__ent_562__ent_1341

**All observed names:** Mr. Smith → Brooklyn (3)

Ordered IDs: Ent[ent_562] → Ent[ent_1341]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [967](../raw_map.tsv:967) | Mr. Smith | Brooklyn | poss\|&lt;-poss&lt;-bodyguard&lt;-nsubjpass&lt;-shoot-&gt;prep-&gt;outside-&gt;pobj-&gt;warehouse-&gt;nn-&gt;\|nn |
| [969](../raw_map.tsv:969) | Mr. Smith | Brooklyn | nsubjpass\|&lt;-nsubjpass&lt;-pull-&gt;prep-&gt;for-&gt;pobj-&gt;violation-&gt;prep-&gt;in-&gt;pobj-&gt;section-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [970](../raw_map.tsv:970) | Mr. Smith | Brooklyn | nsubjpass\|&lt;-nsubjpass&lt;-charge-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Smith → Brooklyn: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [967](../raw_map.tsv:967), [969](../raw_map.tsv:969), [970](../raw_map.tsv:970).




### rel_47__ent_1033__ent_12

**All observed names:** George Steinbrenner → Yankees (3)

Ordered IDs: Ent[ent_1033] → Ent[ent_12]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1415](../raw_map.tsv:1415) | George Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1416](../raw_map.tsv:1416) | George Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1423](../raw_map.tsv:1423) | George Steinbrenner | Yankees | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ouster-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). George Steinbrenner → Yankees: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [1415](../raw_map.tsv:1415), [1416](../raw_map.tsv:1416), [1423](../raw_map.tsv:1423).




### rel_47__ent_261__ent_263

**All observed names:** Bob Dole → Republican (3)

Ordered IDs: Ent[ent_261] → Ent[ent_263]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2984](../raw_map.tsv:2984) | Bob Dole | Republican | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3709](../raw_map.tsv:3709) | Bob Dole | Republican | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| [3711](../raw_map.tsv:3711) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Bob Dole → Republican: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [2984](../raw_map.tsv:2984), [3709](../raw_map.tsv:3709), [3711](../raw_map.tsv:3711).




### rel_47__ent_1344__ent_1269

**All observed names:** Bob Dole → Republican (3)

Ordered IDs: Ent[ent_1344] → Ent[ent_1269]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2987](../raw_map.tsv:2987) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;amod-&gt;\|amod |
| [2990](../raw_map.tsv:2990) | Bob Dole | Republican | appos\|-&gt;appos-&gt;front-runner-&gt;nn-&gt;\|nn |
| [3714](../raw_map.tsv:3714) | Bob Dole | Republican | appos\|-&gt;appos-&gt;front-runner-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Bob Dole → Republican: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [2987](../raw_map.tsv:2987), [2990](../raw_map.tsv:2990), [3714](../raw_map.tsv:3714).




### rel_47__ent_288__ent_321

**All observed names:** Al Harazin → Mets (3)

Ordered IDs: Ent[ent_288] → Ent[ent_321]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3362](../raw_map.tsv:3362) | Al Harazin | Mets | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3367](../raw_map.tsv:3367) | Al Harazin | Mets | appos\|-&gt;appos-&gt;negotiator-&gt;poss-&gt;\|poss |
| [3370](../raw_map.tsv:3370) | Al Harazin | Mets | rcmod\|-&gt;rcmod-&gt;negotiate-&gt;dobj-&gt;salary-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Al Harazin → Mets: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [3362](../raw_map.tsv:3362), [3367](../raw_map.tsv:3367), [3370](../raw_map.tsv:3370).




### rel_47__ent_1214__ent_1322

**All observed names:** Trent Lott → Republican (3)

Ordered IDs: Ent[ent_1214] → Ent[ent_1322]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3759](../raw_map.tsv:3759) | Trent Lott | Republican | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| [3763](../raw_map.tsv:3763) | Trent Lott | Republican | nsubjpass\|&lt;-nsubjpass&lt;-depose-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;amod-&gt;\|amod |
| [3766](../raw_map.tsv:3766) | Trent Lott | Republican | nsubj\|&lt;-nsubj&lt;-presence-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Trent Lott → Republican: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [3759](../raw_map.tsv:3759), [3763](../raw_map.tsv:3763), [3766](../raw_map.tsv:3766).




### rel_47__ent_819__ent_182

**All observed names:** Democrats → Mr. Bush (3)

Ordered IDs: Ent[ent_819] → Ent[ent_182]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5536](../raw_map.tsv:5536) | Democrats | Mr. Bush | nsubj\|&lt;-nsubj&lt;-criticize-&gt;dobj-&gt;\|dobj |
| [5537](../raw_map.tsv:5537) | Democrats | Mr. Bush | rcmod\|-&gt;rcmod-&gt;vote-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [5541](../raw_map.tsv:5541) | Democrats | Mr. Bush | nsubjpass\|&lt;-nsubjpass&lt;-call-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Democrats → Mr. Bush: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [5536](../raw_map.tsv:5536), [5537](../raw_map.tsv:5537), [5541](../raw_map.tsv:5541).




### rel_47__ent_380__ent_205

**All observed names:** Alan Greenspan → Paul A. Volcker (3)

Ordered IDs: Ent[ent_380] → Ent[ent_205]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5881](../raw_map.tsv:5881) | Alan Greenspan | Paul A. Volcker | nsubj\|&lt;-nsubj&lt;-replace-&gt;dobj-&gt;\|dobj |
| [5883](../raw_map.tsv:5883) | Alan Greenspan | Paul A. Volcker | poss\|&lt;-poss&lt;-man-&gt;appos-&gt;\|appos |
| [5885](../raw_map.tsv:5885) | Alan Greenspan | Paul A. Volcker | nsubj\|&lt;-nsubj&lt;-share-&gt;dobj-&gt;view-&gt;dep-&gt;unlike-&gt;pobj-&gt;predecessor-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Alan Greenspan → Paul A. Volcker: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [5881](../raw_map.tsv:5881), [5883](../raw_map.tsv:5883), [5885](../raw_map.tsv:5885).




### rel_47__ent_567__ent_1238

**All observed names:** Viacom → CBS (3)

Ordered IDs: Ent[ent_567] → Ent[ent_1238]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5941](../raw_map.tsv:5941) | Viacom | CBS | poss\|&lt;-poss&lt;-acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5943](../raw_map.tsv:5943) | Viacom | CBS | nsubj\|&lt;-nsubj&lt;-acquire-&gt;dobj-&gt;\|dobj |
| [5945](../raw_map.tsv:5945) | Viacom | CBS | rcmod\|-&gt;rcmod-&gt;own-&gt;dobj-&gt;network-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Viacom → CBS: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [5941](../raw_map.tsv:5941), [5943](../raw_map.tsv:5943), [5945](../raw_map.tsv:5945).




### rel_47__ent_1400__ent_438

**All observed names:** Torre → Wells (2)

Ordered IDs: Ent[ent_1400] → Ent[ent_438]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1569](../raw_map.tsv:1569) | Torre | Wells | rcmod\|-&gt;rcmod-&gt;talk-&gt;prep-&gt;about-&gt;pobj-&gt;\|pobj |
| [1573](../raw_map.tsv:1573) | Torre | Wells | rcmod\|-&gt;rcmod-&gt;father-&gt;prep-&gt;to-&gt;pobj-&gt;son-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Torre → Wells: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [1569](../raw_map.tsv:1569), [1573](../raw_map.tsv:1573).




### rel_47__ent_1298__ent_1440

**All observed names:** Joseph L. Bruno → Senate (2)

Ordered IDs: Ent[ent_1298] → Ent[ent_1440]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3014](../raw_map.tsv:3014) | Joseph L. Bruno | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| [3018](../raw_map.tsv:3018) | Joseph L. Bruno | Senate | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;majority-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Joseph L. Bruno → Senate: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [3014](../raw_map.tsv:3014), [3018](../raw_map.tsv:3018).




### rel_47__ent_268__ent_263

**All observed names:** Joseph L. Bruno → Republican (2)

Ordered IDs: Ent[ent_268] → Ent[ent_263]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3026](../raw_map.tsv:3026) | Joseph L. Bruno | Republican | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3032](../raw_map.tsv:3032) | Joseph L. Bruno | Republican | appos\|-&gt;appos-&gt;senator-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Joseph L. Bruno → Republican: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [3026](../raw_map.tsv:3026), [3032](../raw_map.tsv:3032).




### rel_47__ent_1147__ent_209

**All observed names:** Yankee Group → Boston (2)

Ordered IDs: Ent[ent_1147] → Ent[ent_209]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5770](../raw_map.tsv:5770) | Yankee Group | Boston | appos\|-&gt;appos-&gt;research-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7094](../raw_map.tsv:7094) | Yankee Group | Boston | appos\|-&gt;appos-&gt;research-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Yankee Group → Boston: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [5770](../raw_map.tsv:5770), [7094](../raw_map.tsv:7094).




### rel_47__ent_1075__ent_521

**All observed names:** Bosnian → Alija Izetbegovic (2)

Ordered IDs: Ent[ent_1075] → Ent[ent_521]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6792](../raw_map.tsv:6792) | Bosnian | Alija Izetbegovic | amod\|&lt;-amod&lt;-counterpart-&gt;appos-&gt;\|appos |
| [6793](../raw_map.tsv:6793) | Bosnian | Alija Izetbegovic | nn\|&lt;-nn&lt;-representative&lt;-nsubj&lt;-come-&gt;prep-&gt;with-&gt;pobj-&gt;letter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Bosnian → Alija Izetbegovic: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [6792](../raw_map.tsv:6792), [6793](../raw_map.tsv:6793).




### rel_47__ent_424__ent_724

**All observed names:** Democrats → Hillary Rodham Clinton (2)

Ordered IDs: Ent[ent_424] → Ent[ent_724]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7591](../raw_map.tsv:7591) | Democrats | Hillary Rodham Clinton | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-go-&gt;dobj-&gt;\|dobj |
| [7594](../raw_map.tsv:7594) | Democrats | Hillary Rodham Clinton | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-money&lt;-dobj&lt;-raise-&gt;prep-&gt;than-&gt;pobj-&gt;candidate-&gt;prep-&gt;except-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Democrats → Hillary Rodham Clinton: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [7591](../raw_map.tsv:7591), [7594](../raw_map.tsv:7594).




### rel_47__ent_142__ent_519

**All observed names:** Mr. Bush → Mr. Arafat (2)

Ordered IDs: Ent[ent_142] → Ent[ent_519]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8244](../raw_map.tsv:8244) | Mr. Bush | Mr. Arafat | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [8247](../raw_map.tsv:8247) | Mr. Bush | Mr. Arafat | poss\|&lt;-poss&lt;-statement&lt;-nsubj&lt;-look-&gt;prep-&gt;like-&gt;pobj-&gt;reward-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Bush → Mr. Arafat: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [8244](../raw_map.tsv:8244), [8247](../raw_map.tsv:8247).




### rel_47__ent_1034__ent_1213

**All observed names:** Danny Meyer → Union Square Cafe (1)

Ordered IDs: Ent[ent_1034] → Ent[ent_1213]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1435](../raw_map.tsv:1435) | Danny Meyer | Union Square Cafe | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Danny Meyer → Union Square Cafe: Explicit owner/owns, corporate parent, ownership interest or acquisition evidence establishes present or historical ownership.

Cited evidence lines: [1435](../raw_map.tsv:1435).




### rel_47__ent_1449__ent_1046

**All observed names:** Senate → House (1)

Ordered IDs: Ent[ent_1449] → Ent[ent_1046]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1937](../raw_map.tsv:1937) | Senate | House | dobj\|&lt;-dobj&lt;-make-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Senate → House: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [1937](../raw_map.tsv:1937).




### rel_47__ent_9__ent_211

**All observed names:** Aristide → Haiti (1)

Ordered IDs: Ent[ent_9] → Ent[ent_211]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5258](../raw_map.tsv:5258) | Aristide | Haiti | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Aristide → Haiti: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [5258](../raw_map.tsv:5258).




### rel_47__ent_1296__ent_827

**All observed names:** Republicans → Mr. Clinton (1)

Ordered IDs: Ent[ent_1296] → Ent[ent_827]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5516](../raw_map.tsv:5516) | Republicans | Mr. Clinton | nsubj\|&lt;-nsubj&lt;-criticize-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Republicans → Mr. Clinton: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [5516](../raw_map.tsv:5516).




### rel_47__ent_1213__ent_1087

**All observed names:** Republicans → Congress (1)

Ordered IDs: Ent[ent_1213] → Ent[ent_1087]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6392](../raw_map.tsv:6392) | Republicans | Congress | nsubj\|&lt;-nsubj&lt;-retain-&gt;dobj-&gt;control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Republicans → Congress: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [6392](../raw_map.tsv:6392).




### rel_47__ent_1321__ent_261

**All observed names:** Senate → Bob Dole (1)

Ordered IDs: Ent[ent_1321] → Ent[ent_261]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7633](../raw_map.tsv:7633) | Senate | Bob Dole | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-propose-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Senate → Bob Dole: The supplied evidence concerns leadership, political control, employment, residence/travel, commentary or other associations without an ownership interest.

Cited evidence lines: [7633](../raw_map.tsv:7633).



