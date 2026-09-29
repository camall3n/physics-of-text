# audit_06dbdb9b03af — rel_1: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 3 supported, 0 incorrect, 1 ambiguous; N=4. Precision 3/4=75.00% to 4/4=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;concern-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-division-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;working-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;bank-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-company-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-bank-&gt;prep-&gt;across-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;company-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_1__ent_462__ent_683

**All observed names:** Mcorp → Texas (5)

Ordered IDs: Ent[ent_462] → Ent[ent_683]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5795](../raw_map.tsv:5795) | Mcorp | Texas | nsubj\|&lt;-nsubj&lt;-company-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5796](../raw_map.tsv:5796) | Mcorp | Texas | appos\|-&gt;appos-&gt;bank-&gt;nn-&gt;\|nn |
| [5799](../raw_map.tsv:5799) | Mcorp | Texas | appos\|-&gt;appos-&gt;concern-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5801](../raw_map.tsv:5801) | Mcorp | Texas | rcmod\|-&gt;rcmod-&gt;company-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5802](../raw_map.tsv:5802) | Mcorp | Texas | poss\|&lt;-poss&lt;-bank-&gt;prep-&gt;across-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mcorp → Texas: Explicit concern/company/bank location, local division or working-in premises establishes organizational physical location.

Cited evidence lines: [5795](../raw_map.tsv:5795), [5796](../raw_map.tsv:5796), [5799](../raw_map.tsv:5799), [5801](../raw_map.tsv:5801), [5802](../raw_map.tsv:5802).




### rel_1__ent_464__ent_221

**All observed names:** International Data Corporation → Framingham (4)

Ordered IDs: Ent[ent_464] → Ent[ent_221]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5816](../raw_map.tsv:5816) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;concern-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5817](../raw_map.tsv:5817) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7150](../raw_map.tsv:7150) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;concern-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7151](../raw_map.tsv:7151) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). International Data Corporation → Framingham: Explicit concern/company/bank location, local division or working-in premises establishes organizational physical location.

Cited evidence lines: [5816](../raw_map.tsv:5816), [5817](../raw_map.tsv:5817), [7150](../raw_map.tsv:7150), [7151](../raw_map.tsv:7151).




### rel_1__ent_547__ent_789

**All observed names:** I.B.M. → Armonk (2)

Ordered IDs: Ent[ent_547] → Ent[ent_789]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [806](../raw_map.tsv:806) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;working-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4402](../raw_map.tsv:4402) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;working-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). I.B.M. → Armonk: The sole have-working-in path omits who or what is working in Armonk. It does not clearly identify company premises, an office, or a base.

Cited evidence lines: [806](../raw_map.tsv:806), [4402](../raw_map.tsv:4402).

**Review question:** Does the complete sentence place an I.B.M. office or facility in Armonk, or only unspecified people/things working there?
Issue tags: attachment

### rel_1__ent_548__ent_1003

**All observed names:** Johnson &amp; Johnson → New Brunswick (2)

Ordered IDs: Ent[ent_548] → Ent[ent_1003]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [855](../raw_map.tsv:855) | Johnson &amp; Johnson | New Brunswick | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-division-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4388](../raw_map.tsv:4388) | Johnson &amp; Johnson | New Brunswick | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-division-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Johnson & Johnson → New Brunswick: Explicit concern/company/bank location, local division or working-in premises establishes organizational physical location.

Cited evidence lines: [855](../raw_map.tsv:855), [4388](../raw_map.tsv:4388).



