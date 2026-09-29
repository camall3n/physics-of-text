# audit_9c88162c7b22 — rel_52: researches or analyzes topic

Predicate ID: researches_topic

Person or organization X explicitly researches, studies, tracks, or analyzes subject or field Y.

Includes: explicit research or study of Y; tracking trends or analyzing developments in Y; producing identified analytical research or reports on Y. Excludes: ordinary business operation in a field without research activity; a passing reference or generic Internet use; selling another producer's reports without analysis; institutional employment alone. Ambiguous unless resolved by case-local evidence: report authorship or analytical role unresolved; unclear topic versus employer; mere report distribution without identified research. Y is the subject of inquiry, not necessarily the employer. This does not evaluate the quality or truth of the research.

Complete census: 1 supported, 2 incorrect, 0 ambiguous; N=3. Precision 1/3=33.33% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | appos\|-&gt;appos-&gt;consultancy-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;firm-&gt;rcmod-&gt;track-&gt;dobj-&gt;trend-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-earlier-&gt;appos-&gt;firm-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-report-&gt;dep-&gt;account-&gt;prep-&gt;for-&gt;pobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;traffic-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-analyst-&gt;rcmod-&gt;watch-&gt;dobj-&gt;development-&gt;prep-&gt;of-&gt;pobj-&gt;radio-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-reach-&gt;nsubj-&gt;number-&gt;prep-&gt;of-&gt;pobj-&gt;people-&gt;rcmod-&gt;use-&gt;dobj-&gt;program-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-design-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-hoard-&gt;prep-&gt;of-&gt;pobj-&gt;cash-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-income&lt;-nsubj&lt;-go&lt;-dep&lt;-triple-&gt;nsubj-&gt;price-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-operation&lt;-dobj&lt;-turn-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;sell-&gt;dobj-&gt;report-&gt;prep-&gt;on-&gt;pobj-&gt;trend-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_52__ent_943__ent_936

**All observed names:** Forrester Research → Internet (7)

Ordered IDs: Ent[ent_943] → Ent[ent_936]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7363](../raw_map.tsv:7363) | Forrester Research | Internet | rcmod\|-&gt;rcmod-&gt;sell-&gt;dobj-&gt;report-&gt;prep-&gt;on-&gt;pobj-&gt;trend-&gt;nn-&gt;\|nn |
| [7364](../raw_map.tsv:7364) | Forrester Research | Internet | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-reach-&gt;nsubj-&gt;number-&gt;prep-&gt;of-&gt;pobj-&gt;people-&gt;rcmod-&gt;use-&gt;dobj-&gt;program-&gt;amod-&gt;\|amod |
| [7365](../raw_map.tsv:7365) | Forrester Research | Internet | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-analyst-&gt;rcmod-&gt;watch-&gt;dobj-&gt;development-&gt;prep-&gt;of-&gt;pobj-&gt;radio-&gt;nn-&gt;\|nn |
| [7366](../raw_map.tsv:7366) | Forrester Research | Internet | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-report-&gt;dep-&gt;account-&gt;prep-&gt;for-&gt;pobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;traffic-&gt;nn-&gt;\|nn |
| [7367](../raw_map.tsv:7367) | Forrester Research | Internet | appos\|-&gt;appos-&gt;firm-&gt;rcmod-&gt;track-&gt;dobj-&gt;trend-&gt;nn-&gt;\|nn |
| [7368](../raw_map.tsv:7368) | Forrester Research | Internet | appos\|&lt;-appos&lt;-earlier-&gt;appos-&gt;firm-&gt;nn-&gt;\|nn |
| [7369](../raw_map.tsv:7369) | Forrester Research | Internet | appos\|-&gt;appos-&gt;consultancy-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Forrester Research → Internet: The firm explicitly tracks Internet trends and has locally identified reports and analysts watching developments, establishing research on that topic.

Cited evidence lines: [7363](../raw_map.tsv:7363), [7364](../raw_map.tsv:7364), [7365](../raw_map.tsv:7365), [7366](../raw_map.tsv:7366), [7367](../raw_map.tsv:7367), [7368](../raw_map.tsv:7368), [7369](../raw_map.tsv:7369).




### rel_52__ent_21__ent_10

**All observed names:** Siemens → German (4)

Ordered IDs: Ent[ent_21] → Ent[ent_10]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3664](../raw_map.tsv:3664) | Siemens | German | poss\|&lt;-poss&lt;-operation&lt;-dobj&lt;-turn-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [3665](../raw_map.tsv:3665) | Siemens | German | poss\|&lt;-poss&lt;-income&lt;-nsubj&lt;-go&lt;-dep&lt;-triple-&gt;nsubj-&gt;price-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [3666](../raw_map.tsv:3666) | Siemens | German | poss\|&lt;-poss&lt;-hoard-&gt;prep-&gt;of-&gt;pobj-&gt;cash-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [3667](../raw_map.tsv:3667) | Siemens | German | poss\|&lt;-poss&lt;-design-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Siemens → German: German modifies operations, design, and financial context; these rows do not identify a research subject or research activity.

Cited evidence lines: [3664](../raw_map.tsv:3664), [3665](../raw_map.tsv:3665), [3666](../raw_map.tsv:3666), [3667](../raw_map.tsv:3667).




### rel_52__ent_562__ent_1002

**All observed names:** Mr. Smith → Washington (1)

Ordered IDs: Ent[ent_562] → Ent[ent_1002]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3410](../raw_map.tsv:3410) | Mr. Smith | Washington | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Smith → Washington: Returning to Washington is travel, not research about Washington.

Cited evidence lines: [3410](../raw_map.tsv:3410).



