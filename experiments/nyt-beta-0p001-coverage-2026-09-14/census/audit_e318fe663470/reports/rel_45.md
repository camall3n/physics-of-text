# audit_e318fe663470 — rel_45: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 1 supported, 4 incorrect, 0 ambiguous; N=5. Precision 1/5=20.00% to 1/5=20.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | rcmod\|-&gt;rcmod-&gt;know-&gt;prep-&gt;with-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;aide-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;director-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-deride-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;in-&gt;pobj-&gt;office-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-prepare-&gt;dobj-&gt;bid-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-react-&gt;prep-&gt;with-&gt;pobj-&gt;today-&gt;prep-&gt;to-&gt;pobj-&gt;comment-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-see-&gt;prep-&gt;in-&gt;pobj-&gt;word-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-trounce-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-among&lt;-prep&lt;-be-&gt;nsubj-&gt;\|nsubj |
| 1 | prep\|-&gt;prep-&gt;about-&gt;pobj-&gt;interest-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;issue-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;foray-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_45__ent_279__ent_278

**All observed names:** Bobby Cox → Braves (5)

Ordered IDs: Ent[ent_279] → Ent[ent_278]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3237](../raw_map.tsv:3237) | Bobby Cox | Braves | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;foray-&gt;poss-&gt;\|poss |
| [3239](../raw_map.tsv:3239) | Bobby Cox | Braves | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;\|dobj |
| [3240](../raw_map.tsv:3240) | Bobby Cox | Braves | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |
| [3241](../raw_map.tsv:3241) | Bobby Cox | Braves | rcmod\|-&gt;rcmod-&gt;issue-&gt;nsubj-&gt;\|nsubj |
| [3242](../raw_map.tsv:3242) | Bobby Cox | Braves | prep\|-&gt;prep-&gt;about-&gt;pobj-&gt;interest-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Bobby Cox → Braves: Managing a team, political comments/office or defeating a person does not establish an organization's geographic location.

Cited evidence lines: [3237](../raw_map.tsv:3237), [3239](../raw_map.tsv:3239), [3240](../raw_map.tsv:3240), [3241](../raw_map.tsv:3241), [3242](../raw_map.tsv:3242).




### rel_45__ent_819__ent_964

**All observed names:** Democrats → A. Gephardt (4)

Ordered IDs: Ent[ent_819] → Ent[ent_964]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7537](../raw_map.tsv:7537) | Democrats | A. Gephardt | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;in-&gt;pobj-&gt;office-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7541](../raw_map.tsv:7541) | Democrats | A. Gephardt | pobj\|&lt;-pobj&lt;-among&lt;-prep&lt;-be-&gt;nsubj-&gt;\|nsubj |
| [7542](../raw_map.tsv:7542) | Democrats | A. Gephardt | nsubj\|&lt;-nsubj&lt;-see-&gt;prep-&gt;in-&gt;pobj-&gt;word-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7543](../raw_map.tsv:7543) | Democrats | A. Gephardt | nsubj\|&lt;-nsubj&lt;-react-&gt;prep-&gt;with-&gt;pobj-&gt;today-&gt;prep-&gt;to-&gt;pobj-&gt;comment-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Democrats → A. Gephardt: Managing a team, political comments/office or defeating a person does not establish an organization's geographic location.

Cited evidence lines: [7537](../raw_map.tsv:7537), [7541](../raw_map.tsv:7541), [7542](../raw_map.tsv:7542), [7543](../raw_map.tsv:7543).




### rel_45__ent_910__ent_965

**All observed names:** Patrick J. Buchanan → White House (3)

Ordered IDs: Ent[ent_910] → Ent[ent_965]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8483](../raw_map.tsv:8483) | Patrick J. Buchanan | White House | appos\|-&gt;appos-&gt;director-&gt;nn-&gt;\|nn |
| [8484](../raw_map.tsv:8484) | Patrick J. Buchanan | White House | nsubj\|&lt;-nsubj&lt;-prepare-&gt;dobj-&gt;bid-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [8487](../raw_map.tsv:8487) | Patrick J. Buchanan | White House | appos\|-&gt;appos-&gt;aide-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Patrick J. Buchanan → White House: Managing a team, political comments/office or defeating a person does not establish an organization's geographic location.

Cited evidence lines: [8483](../raw_map.tsv:8483), [8484](../raw_map.tsv:8484), [8487](../raw_map.tsv:8487).




### rel_45__ent_1000__ent_304

**All observed names:** Wal-Mart → Bentonville (2)

Ordered IDs: Ent[ent_1000] → Ent[ent_304]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [814](../raw_map.tsv:814) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;know-&gt;prep-&gt;with-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4360](../raw_map.tsv:4360) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;know-&gt;prep-&gt;with-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Wal-Mart → Bentonville: The local headquarters-in-town construction establishes Wal-Mart's location in Bentonville.

Cited evidence lines: [814](../raw_map.tsv:814), [4360](../raw_map.tsv:4360).




### rel_45__ent_1109__ent_1085

**All observed names:** Mr. Bush → Al Gore (2)

Ordered IDs: Ent[ent_1109] → Ent[ent_1085]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6942](../raw_map.tsv:6942) | Mr. Bush | Al Gore | nsubj\|&lt;-nsubj&lt;-trounce-&gt;dobj-&gt;\|dobj |
| [6946](../raw_map.tsv:6946) | Mr. Bush | Al Gore | nsubj\|&lt;-nsubj&lt;-deride-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Mr. Bush → Al Gore: Managing a team, political comments/office or defeating a person does not establish an organization's geographic location.

Cited evidence lines: [6942](../raw_map.tsv:6942), [6946](../raw_map.tsv:6946).



