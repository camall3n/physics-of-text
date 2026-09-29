# audit_dcb746fa83d6 — rel_95: lives or has lived in

Predicate ID: resides_in

Person X, or members of population X, live or have lived in geographic place Y.

Includes: live/resident/residence/home-in; explicit resettlement or being raised there; death at own home in a place when home attachment is clear. Excludes: death/killing in a place without residence; birth alone; work/travel/visits/presence/office alone; a relative living there without attribution to X. Ambiguous unless resolved by case-local evidence: obituary person-of-city apposition; relative/home attachment. Population statements concern members of the population, not necessarily every member.

Complete census: 8 supported, 2 incorrect, 1 ambiguous; N=11. Precision 8/11=72.73% to 9/11=81.82%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 9 | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | amod\|&lt;-amod&lt;-living-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | amod\|&lt;-amod&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | amod\|&lt;-amod&lt;-firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | amod\|&lt;-amod&lt;-plane-&gt;prep-&gt;for-&gt;pobj-&gt;life-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;official-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-govern-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-author-&gt;prep-&gt;of-&gt;pobj-&gt;trattorias-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;route-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-control-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-defense-&gt;prep-&gt;with-&gt;pobj-&gt;lawyer-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_95__ent_822__ent_821

**All observed names:** American → London (4)

Ordered IDs: Ent[ent_822] → Ent[ent_821]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2102](../raw_map.tsv:2102) | American | London | amod\|&lt;-amod&lt;-living-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2104](../raw_map.tsv:2104) | American | London | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2108](../raw_map.tsv:2108) | American | London | amod\|&lt;-amod&lt;-firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2110](../raw_map.tsv:2110) | American | London | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;route-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). American → London: Explicit live-in or population living-in establishes residence in the geographic place.

Cited evidence lines: [2102](../raw_map.tsv:2102), [2104](../raw_map.tsv:2104), [2108](../raw_map.tsv:2108), [2110](../raw_map.tsv:2110).


Issue tags: mixed_evidence

### rel_95__ent_1304__ent_824

**All observed names:** American → Paris (2); PATRICIA WELLS → Paris (1)

Ordered IDs: Ent[ent_1304] → Ent[ent_824]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2112](../raw_map.tsv:2112) | American | Paris | amod\|&lt;-amod&lt;-living-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2113](../raw_map.tsv:2113) | American | Paris | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2155](../raw_map.tsv:2155) | PATRICIA WELLS | Paris | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). American → Paris; PATRICIA WELLS → Paris: Residence evidence exists, but generic American and the named Patricia Wells are merged into one latent person/group identity.

Cited evidence lines: [2112](../raw_map.tsv:2112), [2113](../raw_map.tsv:2113), [2155](../raw_map.tsv:2155).

**Review question:** Does American denote Patricia Wells in these rows, or a different person or population?
Issue tags: local_entity_collision, identity_ambiguity

### rel_95__ent_826__ent_825

**All observed names:** Palestinians → West Bank (3)

Ordered IDs: Ent[ent_826] → Ent[ent_825]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2133](../raw_map.tsv:2133) | Palestinians | West Bank | dobj\|&lt;-dobj&lt;-govern-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2135](../raw_map.tsv:2135) | Palestinians | West Bank | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2138](../raw_map.tsv:2138) | Palestinians | West Bank | nsubj\|&lt;-nsubj&lt;-control-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Palestinians → West Bank: Explicit live-in or population living-in establishes residence in the geographic place.

Cited evidence lines: [2133](../raw_map.tsv:2133), [2135](../raw_map.tsv:2135), [2138](../raw_map.tsv:2138).


Issue tags: mixed_evidence

### rel_95__ent_1304__ent_835

**All observed names:** American → England (3)

Ordered IDs: Ent[ent_1304] → Ent[ent_835]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2158](../raw_map.tsv:2158) | American | England | amod\|&lt;-amod&lt;-living-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2159](../raw_map.tsv:2159) | American | England | amod\|&lt;-amod&lt;-plane-&gt;prep-&gt;for-&gt;pobj-&gt;life-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2161](../raw_map.tsv:2161) | American | England | amod\|&lt;-amod&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). American → England: Explicit live-in or population living-in establishes residence in the geographic place.

Cited evidence lines: [2158](../raw_map.tsv:2158), [2159](../raw_map.tsv:2159), [2161](../raw_map.tsv:2161).


Issue tags: mixed_evidence

### rel_95__ent_840__ent_839

**All observed names:** MAUREEN B. FANT → Rome (2)

Ordered IDs: Ent[ent_840] → Ent[ent_839]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2142](../raw_map.tsv:2142) | MAUREEN B. FANT | Rome | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2144](../raw_map.tsv:2144) | MAUREEN B. FANT | Rome | nsubj\|&lt;-nsubj&lt;-author-&gt;prep-&gt;of-&gt;pobj-&gt;trattorias-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). MAUREEN B. FANT → Rome: Explicit live-in or population living-in establishes residence in the geographic place.

Cited evidence lines: [2142](../raw_map.tsv:2142), [2144](../raw_map.tsv:2144).


Issue tags: mixed_evidence

### rel_95__ent_562__ent_770

**All observed names:** Mr. Smith → Washington (2)

Ordered IDs: Ent[ent_562] → Ent[ent_770]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3409](../raw_map.tsv:3409) | Mr. Smith | Washington | poss\|&lt;-poss&lt;-defense-&gt;prep-&gt;with-&gt;pobj-&gt;lawyer-&gt;nn-&gt;\|nn |
| [3414](../raw_map.tsv:3414) | Mr. Smith | Washington | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. Smith → Washington: Explicit live-in or population living-in establishes residence in the geographic place.

Cited evidence lines: [3409](../raw_map.tsv:3409), [3414](../raw_map.tsv:3414).


Issue tags: mixed_evidence

### rel_95__ent_121__ent_989

**All observed names:** Charles Brecher → Citizens Budget Commission (1)

Ordered IDs: Ent[ent_121] → Ent[ent_989]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1758](../raw_map.tsv:1758) | Charles Brecher | Citizens Budget Commission | appos\|-&gt;appos-&gt;official-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Charles Brecher → Citizens Budget Commission: An official title or death in a place does not establish residence.

Cited evidence lines: [1758](../raw_map.tsv:1758).




### rel_95__ent_986__ent_537

**All observed names:** Mexicans → United States (1)

Ordered IDs: Ent[ent_986] → Ent[ent_537]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2124](../raw_map.tsv:2124) | Mexicans | United States | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mexicans → United States: Explicit live-in or population living-in establishes residence in the geographic place.

Cited evidence lines: [2124](../raw_map.tsv:2124).




### rel_95__ent_1306__ent_333

**All observed names:** David → Manhattan (1)

Ordered IDs: Ent[ent_1306] → Ent[ent_333]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3957](../raw_map.tsv:3957) | David | Manhattan | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). David → Manhattan: Explicit live-in or population living-in establishes residence in the geographic place.

Cited evidence lines: [3957](../raw_map.tsv:3957).




### rel_95__ent_1161__ent_368

**All observed names:** Turks → Germany (1)

Ordered IDs: Ent[ent_1161] → Ent[ent_368]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6121](../raw_map.tsv:6121) | Turks | Germany | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Turks → Germany: Explicit live-in or population living-in establishes residence in the geographic place.

Cited evidence lines: [6121](../raw_map.tsv:6121).




### rel_95__ent_747__ent_1313

**All observed names:** Diana → Paris (1)

Ordered IDs: Ent[ent_747] → Ent[ent_1313]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8162](../raw_map.tsv:8162) | Diana | Paris | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Diana → Paris: An official title or death in a place does not establish residence.

Cited evidence lines: [8162](../raw_map.tsv:8162).



