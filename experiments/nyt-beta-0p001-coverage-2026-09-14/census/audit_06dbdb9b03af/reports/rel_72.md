# audit_06dbdb9b03af — rel_72: organization operates in industry or domain

Predicate ID: organization_operates_in_domain

Organization X is explicitly described as operating in industry, business field, or technological domain Y.

Includes: explicit industry or domain modifier of company, agency, or business; stated operations or business activity in Y; historical business-domain identity. Excludes: nationality or geographic location; corporate parent or corporate family name; a passing reference to users, data, or an unrelated product without business-domain evidence; a person working in a field. Ambiguous unless resolved by case-local evidence: a nominal modifier that could mean owner, place, or industry; unclear organization versus personal referent; generic Internet mention without a business-domain role. A business-field classification, not geographic location and not a generic association with the domain.

Complete census: 1 supported, 2 incorrect, 0 ambiguous; N=3. Precision 1/3=33.33% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;company-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-challenge-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;company-&gt;dep-&gt;spin-&gt;prep-&gt;in-&gt;pobj-&gt;breakup-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;giant-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;largest-&gt;prep-&gt;of-&gt;pobj-&gt;company-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;provider-&gt;prep-&gt;after-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-success&lt;-dobj&lt;-match-&gt;prep-&gt;in-&gt;pobj-&gt;business-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-history&lt;-pobj&lt;-in&lt;-prep&lt;-biggest&lt;-appos&lt;-acquisition&lt;-nsubj&lt;-put-&gt;dobj-&gt;giant-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;search-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;company-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_72__ent_933__ent_936

**All observed names:** Google → Internet (6)

Ordered IDs: Ent[ent_933] → Ent[ent_936]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6835](../raw_map.tsv:6835) | Google | Internet | appos\|-&gt;appos-&gt;company-&gt;nn-&gt;\|nn |
| [6836](../raw_map.tsv:6836) | Google | Internet | appos\|-&gt;appos-&gt;giant-&gt;nn-&gt;\|nn |
| [6837](../raw_map.tsv:6837) | Google | Internet | rcmod\|-&gt;rcmod-&gt;company-&gt;nn-&gt;\|nn |
| [6838](../raw_map.tsv:6838) | Google | Internet | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;search-&gt;nn-&gt;\|nn |
| [6839](../raw_map.tsv:6839) | Google | Internet | poss\|&lt;-poss&lt;-history&lt;-pobj&lt;-in&lt;-prep&lt;-biggest&lt;-appos&lt;-acquisition&lt;-nsubj&lt;-put-&gt;dobj-&gt;giant-&gt;nn-&gt;\|nn |
| [6843](../raw_map.tsv:6843) | Google | Internet | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-success&lt;-dobj&lt;-match-&gt;prep-&gt;in-&gt;pobj-&gt;business-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Google → Internet: Explicit Internet company/giant and business-domain wording establishes operations in that field.

Cited evidence lines: [6835](../raw_map.tsv:6835), [6836](../raw_map.tsv:6836), [6837](../raw_map.tsv:6837), [6838](../raw_map.tsv:6838), [6839](../raw_map.tsv:6839), [6843](../raw_map.tsv:6843).




### rel_72__ent_1083__ent_931

**All observed names:** BellSouth Corporation → Bell (5)

Ordered IDs: Ent[ent_1083] → Ent[ent_931]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6872](../raw_map.tsv:6872) | BellSouth Corporation | Bell | appos\|-&gt;appos-&gt;company-&gt;nn-&gt;\|nn |
| [6873](../raw_map.tsv:6873) | BellSouth Corporation | Bell | appos\|-&gt;appos-&gt;largest-&gt;prep-&gt;of-&gt;pobj-&gt;company-&gt;nn-&gt;\|nn |
| [6874](../raw_map.tsv:6874) | BellSouth Corporation | Bell | appos\|-&gt;appos-&gt;company-&gt;dep-&gt;spin-&gt;prep-&gt;in-&gt;pobj-&gt;breakup-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6875](../raw_map.tsv:6875) | BellSouth Corporation | Bell | appos\|-&gt;appos-&gt;provider-&gt;prep-&gt;after-&gt;pobj-&gt;\|pobj |
| [6876](../raw_map.tsv:6876) | BellSouth Corporation | Bell | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). BellSouth Corporation → Bell: Bell corporate-family membership or political challenge does not establish a business-domain relation.

Cited evidence lines: [6872](../raw_map.tsv:6872), [6873](../raw_map.tsv:6873), [6874](../raw_map.tsv:6874), [6875](../raw_map.tsv:6875), [6876](../raw_map.tsv:6876).




### rel_72__ent_828__ent_189

**All observed names:** Clinton → Congress (2)

Ordered IDs: Ent[ent_828] → Ent[ent_189]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2031](../raw_map.tsv:2031) | Clinton | Congress | nsubj\|&lt;-nsubj&lt;-challenge-&gt;dobj-&gt;\|dobj |
| [7904](../raw_map.tsv:7904) | Clinton | Congress | nsubj\|&lt;-nsubj&lt;-challenge-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Clinton → Congress: Bell corporate-family membership or political challenge does not establish a business-domain relation.

Cited evidence lines: [2031](../raw_map.tsv:2031), [7904](../raw_map.tsv:7904).



