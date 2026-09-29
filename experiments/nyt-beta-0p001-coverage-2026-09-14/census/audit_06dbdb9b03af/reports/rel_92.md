# audit_06dbdb9b03af — rel_92: has spokesperson

Predicate ID: has_spokesperson

Organization or principal X has person Y serving as its spokesperson.

Includes: inverse spokesperson_for with correct attachment; organization-modifying spokesman and appositive person. Excludes: leader/president/lawyer/secretary alone; speaking at a building; spokesperson-to-principal forward direction. Ambiguous unless resolved by case-local evidence: dateline/location replacing the principal or person.

Complete census: 1 supported, 1 incorrect, 0 ambiguous; N=2. Precision 1/2=50.00% to 1/2=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | nn\|&lt;-nn&lt;-briefing&lt;-pobj&lt;-at&lt;-prep&lt;-find-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-meeting&lt;-pobj&lt;-of&lt;-prep&lt;-speak&lt;-dep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| 1 | nn\|&lt;-nn&lt;-spokesman&lt;-pobj&lt;-in&lt;-prep&lt;-describe-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-charge-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-pull-&gt;prep-&gt;for-&gt;pobj-&gt;violation-&gt;prep-&gt;in-&gt;pobj-&gt;section-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-make-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-bodyguard&lt;-nsubjpass&lt;-shoot-&gt;prep-&gt;outside-&gt;pobj-&gt;warehouse-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-grandfather&lt;-nsubj&lt;-breeder&lt;-nsubj&lt;-pitcher-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-voice-&gt;appos-&gt;\|appos |
| 1 | rcmod\|-&gt;rcmod-&gt;accuse-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |
| 1 | rcmod\|-&gt;rcmod-&gt;await-&gt;dobj-&gt;arraignment-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;begin-&gt;prep-&gt;as-&gt;pobj-&gt;usher-&gt;prep-&gt;in-&gt;pobj-&gt;theater-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_92__ent_562__ent_323

**All observed names:** Mr. Smith → Brooklyn (6)

Ordered IDs: Ent[ent_562] → Ent[ent_323]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [963](../raw_map.tsv:963) | Mr. Smith | Brooklyn | rcmod\|-&gt;rcmod-&gt;begin-&gt;prep-&gt;as-&gt;pobj-&gt;usher-&gt;prep-&gt;in-&gt;pobj-&gt;theater-&gt;nn-&gt;\|nn |
| [965](../raw_map.tsv:965) | Mr. Smith | Brooklyn | rcmod\|-&gt;rcmod-&gt;await-&gt;dobj-&gt;arraignment-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [966](../raw_map.tsv:966) | Mr. Smith | Brooklyn | poss\|&lt;-poss&lt;-grandfather&lt;-nsubj&lt;-breeder&lt;-nsubj&lt;-pitcher-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [967](../raw_map.tsv:967) | Mr. Smith | Brooklyn | poss\|&lt;-poss&lt;-bodyguard&lt;-nsubjpass&lt;-shoot-&gt;prep-&gt;outside-&gt;pobj-&gt;warehouse-&gt;nn-&gt;\|nn |
| [969](../raw_map.tsv:969) | Mr. Smith | Brooklyn | nsubjpass\|&lt;-nsubjpass&lt;-pull-&gt;prep-&gt;for-&gt;pobj-&gt;violation-&gt;prep-&gt;in-&gt;pobj-&gt;section-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [970](../raw_map.tsv:970) | Mr. Smith | Brooklyn | nsubjpass\|&lt;-nsubjpass&lt;-charge-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Smith → Brooklyn: Person crime/location and family descriptions do not establish a principal having a named spokesperson.

Cited evidence lines: [963](../raw_map.tsv:963), [965](../raw_map.tsv:965), [966](../raw_map.tsv:966), [967](../raw_map.tsv:967), [969](../raw_map.tsv:969), [970](../raw_map.tsv:970).




### rel_92__ent_536__ent_577

**All observed names:** State Department → Nicholas Burns (6)

Ordered IDs: Ent[ent_536] → Ent[ent_577]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5428](../raw_map.tsv:5428) | State Department | Nicholas Burns | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-make-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |
| [5429](../raw_map.tsv:5429) | State Department | Nicholas Burns | rcmod\|-&gt;rcmod-&gt;accuse-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |
| [5430](../raw_map.tsv:5430) | State Department | Nicholas Burns | poss\|&lt;-poss&lt;-voice-&gt;appos-&gt;\|appos |
| [5432](../raw_map.tsv:5432) | State Department | Nicholas Burns | nn\|&lt;-nn&lt;-spokesman&lt;-pobj&lt;-in&lt;-prep&lt;-describe-&gt;nsubj-&gt;\|nsubj |
| [5433](../raw_map.tsv:5433) | State Department | Nicholas Burns | nn\|&lt;-nn&lt;-meeting&lt;-pobj&lt;-of&lt;-prep&lt;-speak&lt;-dep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [5435](../raw_map.tsv:5435) | State Department | Nicholas Burns | nn\|&lt;-nn&lt;-briefing&lt;-pobj&lt;-at&lt;-prep&lt;-find-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). State Department → Nicholas Burns: Explicit institutional spokesman apposition identifies Nicholas Burns as State Department spokesperson.

Cited evidence lines: [5428](../raw_map.tsv:5428), [5429](../raw_map.tsv:5429), [5430](../raw_map.tsv:5430), [5432](../raw_map.tsv:5432), [5433](../raw_map.tsv:5433), [5435](../raw_map.tsv:5435).


Issue tags: mixed_evidence
