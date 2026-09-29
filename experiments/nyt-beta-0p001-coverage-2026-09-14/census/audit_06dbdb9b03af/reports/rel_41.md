# audit_06dbdb9b03af — rel_41: political candidate or nominee for party

Predicate ID: candidate_for

Person X is or was an explicitly identified candidate, contender for nomination, or nominee of political party Y.

Includes: explicit party candidate or nominee; front-runner or contender for the party nomination; historical candidacy or nomination. Excludes: holding an executive or other office without party candidacy; merely supporting or belonging to the party; candidacy for a corporate or sporting appointment. Ambiguous unless resolved by case-local evidence: a constituency or office appears where the political party is omitted; candidate or nomination attachment does not identify whose party nomination is sought; the purported party is materially truncated or unidentified. This is a candidacy relation and does not claim election or actual office. The second role is the political party, not the office being contested. Republican as an identified party label follows the inherited party-label convention.

Complete census: 1 supported, 1 incorrect, 0 ambiguous; N=2. Precision 1/2=50.00% to 1/2=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;candidate-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;nominee-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;assistant-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;baseball-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;escort-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;introduce-&gt;prep-&gt;as-&gt;pobj-&gt;chief-&gt;prep-&gt;of-&gt;pobj-&gt;operation-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;manager-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_41__ent_277__ent_321

**All observed names:** Omar Minaya → Mets (6)

Ordered IDs: Ent[ent_277] → Ent[ent_321]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3217](../raw_map.tsv:3217) | Omar Minaya | Mets | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3219](../raw_map.tsv:3219) | Omar Minaya | Mets | rcmod\|-&gt;rcmod-&gt;manager-&gt;poss-&gt;\|poss |
| [3220](../raw_map.tsv:3220) | Omar Minaya | Mets | rcmod\|-&gt;rcmod-&gt;introduce-&gt;prep-&gt;as-&gt;pobj-&gt;chief-&gt;prep-&gt;of-&gt;pobj-&gt;operation-&gt;poss-&gt;\|poss |
| [3221](../raw_map.tsv:3221) | Omar Minaya | Mets | rcmod\|-&gt;rcmod-&gt;escort-&gt;dobj-&gt;\|dobj |
| [3222](../raw_map.tsv:3222) | Omar Minaya | Mets | rcmod\|-&gt;rcmod-&gt;baseball-&gt;poss-&gt;\|poss |
| [3223](../raw_map.tsv:3223) | Omar Minaya | Mets | rcmod\|-&gt;rcmod-&gt;assistant-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Omar Minaya → Mets: A baseball manager or operations chief is not a political party candidate.

Cited evidence lines: [3217](../raw_map.tsv:3217), [3219](../raw_map.tsv:3219), [3220](../raw_map.tsv:3220), [3221](../raw_map.tsv:3221), [3222](../raw_map.tsv:3222), [3223](../raw_map.tsv:3223).




### rel_41__ent_261__ent_263

**All observed names:** Bob Dole → Republican (4)

Ordered IDs: Ent[ent_261] → Ent[ent_263]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2986](../raw_map.tsv:2986) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;nn-&gt;\|nn |
| [2988](../raw_map.tsv:2988) | Bob Dole | Republican | appos\|-&gt;appos-&gt;candidate-&gt;nn-&gt;\|nn |
| [3710](../raw_map.tsv:3710) | Bob Dole | Republican | appos\|-&gt;appos-&gt;nominee-&gt;nn-&gt;\|nn |
| [3712](../raw_map.tsv:3712) | Bob Dole | Republican | appos\|-&gt;appos-&gt;candidate-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bob Dole → Republican: Explicit Republican candidate and nominee appositions establish party candidacy.

Cited evidence lines: [2986](../raw_map.tsv:2986), [2988](../raw_map.tsv:2988), [3710](../raw_map.tsv:3710), [3712](../raw_map.tsv:3712).



