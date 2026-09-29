# audit_dcb746fa83d6 — rel_75: lives or has lived in

Predicate ID: resides_in

Person X, or members of population X, live or have lived in geographic place Y.

Includes: live/resident/residence/home-in; explicit resettlement or being raised there; death at own home in a place when home attachment is clear. Excludes: death/killing in a place without residence; birth alone; work/travel/visits/presence/office alone; a relative living there without attribution to X. Ambiguous unless resolved by case-local evidence: obituary person-of-city apposition; relative/home attachment. Population statements concern members of the population, not necessarily every member.

Complete census: 2 supported, 4 incorrect, 1 ambiguous; N=7. Precision 2/7=28.57% to 3/7=42.86%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |
| 3 | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | amod\|&lt;-amod&lt;-woman&lt;-nsubj&lt;-come-&gt;prep-&gt;into-&gt;pobj-&gt;conflict-&gt;prep-&gt;with-&gt;pobj-&gt;church-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | amod\|&lt;-amod&lt;-woman&lt;-nsubj&lt;-go-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-3d-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-bring-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;in-&gt;pobj-&gt;exile-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;join-&gt;dobj-&gt;\|dobjé_to_get_his_first_big_league_experience_._'' lex#,_who_will_not_join_the pos#,_WP_MD_RB_VB_DT lc#General_Manager rc#on_the |
| 1 | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;with-&gt;pobj-&gt;wife-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_75__ent_643__ent_333

**All observed names:** Robert → Manhattan (4)

Ordered IDs: Ent[ent_643] → Ent[ent_333]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3928](../raw_map.tsv:3928) | Robert | Manhattan | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [3930](../raw_map.tsv:3930) | Robert | Manhattan | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [3931](../raw_map.tsv:3931) | Robert | Manhattan | nsubj\|&lt;-nsubj&lt;-bring-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| [3933](../raw_map.tsv:3933) | Robert | Manhattan | nn\|&lt;-nn&lt;-3d-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Robert → Manhattan: Direct live-in or living-with-wife-in paths establish residence; a first name alone does not defeat an otherwise clear local residence statement.

Cited evidence lines: [3928](../raw_map.tsv:3928), [3930](../raw_map.tsv:3930), [3931](../raw_map.tsv:3931), [3933](../raw_map.tsv:3933).


Issue tags: mixed_evidence

### rel_75__ent_822__ent_835

**All observed names:** American → England (3)

Ordered IDs: Ent[ent_822] → Ent[ent_835]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2157](../raw_map.tsv:2157) | American | England | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2164](../raw_map.tsv:2164) | American | England | amod\|&lt;-amod&lt;-woman&lt;-nsubj&lt;-go-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [2165](../raw_map.tsv:2165) | American | England | amod\|&lt;-amod&lt;-woman&lt;-nsubj&lt;-come-&gt;prep-&gt;into-&gt;pobj-&gt;conflict-&gt;prep-&gt;with-&gt;pobj-&gt;church-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). American → England: American is an adjectival person fragment in woman-and-church paths, leaving the particular resident or identified population unresolved.

Cited evidence lines: [2157](../raw_map.tsv:2157), [2164](../raw_map.tsv:2164), [2165](../raw_map.tsv:2165).

**Review question:** Which American person or population is said to live in England?
Issue tags: argument_identity

### rel_75__ent_309__ent_1302

**All observed names:** Red Sox → World Series (3)

Ordered IDs: Ent[ent_309] → Ent[ent_1302]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2201](../raw_map.tsv:2201) | Red Sox | World Series | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |
| [2203](../raw_map.tsv:2203) | Red Sox | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |
| [2205](../raw_map.tsv:2205) | Red Sox | World Series | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Red Sox → World Series: Sports-event results, an explicitly negated prospective team joining, or losing a player are not geographic residence.

Cited evidence lines: [2201](../raw_map.tsv:2201), [2203](../raw_map.tsv:2203), [2205](../raw_map.tsv:2205).




### rel_75__ent_1228__ent_507

**All observed names:** Mr. Marcos → Hawaii (3)

Ordered IDs: Ent[ent_1228] → Ent[ent_507]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8183](../raw_map.tsv:8183) | Mr. Marcos | Hawaii | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;with-&gt;pobj-&gt;wife-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8184](../raw_map.tsv:8184) | Mr. Marcos | Hawaii | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8186](../raw_map.tsv:8186) | Mr. Marcos | Hawaii | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;in-&gt;pobj-&gt;exile-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. Marcos → Hawaii: Direct live-in or living-with-wife-in paths establish residence; a first name alone does not defeat an otherwise clear local residence statement.

Cited evidence lines: [8183](../raw_map.tsv:8183), [8184](../raw_map.tsv:8184), [8186](../raw_map.tsv:8186).


Issue tags: mixed_evidence

### rel_75__ent_1004__ent_1302

**All observed names:** Yankees → World Series (2)

Ordered IDs: Ent[ent_1004] → Ent[ent_1302]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2179](../raw_map.tsv:2179) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |
| [2695](../raw_map.tsv:2695) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Yankees → World Series: Sports-event results, an explicitly negated prospective team joining, or losing a player are not geographic residence.

Cited evidence lines: [2179](../raw_map.tsv:2179), [2695](../raw_map.tsv:2695).




### rel_75__ent_272__ent_284

**All observed names:** Steve Phillips → Mets (1)

Ordered IDs: Ent[ent_272] → Ent[ent_284]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3193](../raw_map.tsv:3193) | Steve Phillips | Mets | rcmod\|-&gt;rcmod-&gt;join-&gt;dobj-&gt;\|dobjé_to_get_his_first_big_league_experience_._'' lex#,_who_will_not_join_the pos#,_WP_MD_RB_VB_DT lc#General_Manager rc#on_the |

**Judgment: incorrect** (primary). Steve Phillips → Mets: Sports-event results, an explicitly negated prospective team joining, or losing a player are not geographic residence.

Cited evidence lines: [3193](../raw_map.tsv:3193).




### rel_75__ent_308__ent_64

**All observed names:** Knicks → Patrick Ewing (1)

Ordered IDs: Ent[ent_308] → Ent[ent_64]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4938](../raw_map.tsv:4938) | Knicks | Patrick Ewing | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Knicks → Patrick Ewing: Sports-event results, an explicitly negated prospective team joining, or losing a player are not geographic residence.

Cited evidence lines: [4938](../raw_map.tsv:4938).



