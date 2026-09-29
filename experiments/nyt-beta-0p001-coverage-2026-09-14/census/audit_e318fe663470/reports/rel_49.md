# audit_e318fe663470 — rel_49: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 0 supported, 4 incorrect, 2 ambiguous; N=6. Precision 0/6=0.00% to 2/6=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-nomination&lt;-dobj&lt;-approve-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;activist-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;speaker-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;speechwriter-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-return-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-successor&lt;-pobj&lt;-of&lt;-prep&lt;-government&lt;-nsubj&lt;-endorse-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;hospitalize-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;kill-&gt;prep-&gt;in-&gt;pobj-&gt;accident-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_49__ent_30__ent_36

**All observed names:** Nancy Pelosi → Democratic (4)

Ordered IDs: Ent[ent_30] → Ent[ent_36]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3730](../raw_map.tsv:3730) | Nancy Pelosi | Democratic | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| [3731](../raw_map.tsv:3731) | Nancy Pelosi | Democratic | appos\|-&gt;appos-&gt;chairman-&gt;amod-&gt;\|amod |
| [3733](../raw_map.tsv:3733) | Nancy Pelosi | Democratic | appos\|-&gt;appos-&gt;speaker-&gt;amod-&gt;\|amod |
| [3737](../raw_map.tsv:3737) | Nancy Pelosi | Democratic | appos\|-&gt;appos-&gt;activist-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Nancy Pelosi → Democratic: Speaker/leader/chair wording attaches to the incomplete political adjective Democratic.

Cited evidence lines: [3730](../raw_map.tsv:3730), [3731](../raw_map.tsv:3731), [3733](../raw_map.tsv:3733), [3737](../raw_map.tsv:3737).

**Review question:** Which complete institution or party is intended?
Issue tags: truncated_argument

### rel_49__ent_988__ent_507

**All observed names:** Mr. Marcos → Hawaii (3)

Ordered IDs: Ent[ent_988] → Ent[ent_507]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8185](../raw_map.tsv:8185) | Mr. Marcos | Hawaii | rcmod\|-&gt;rcmod-&gt;hospitalize-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8188](../raw_map.tsv:8188) | Mr. Marcos | Hawaii | poss\|&lt;-poss&lt;-successor&lt;-pobj&lt;-of&lt;-prep&lt;-government&lt;-nsubj&lt;-endorse-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [8189](../raw_map.tsv:8189) | Mr. Marcos | Hawaii | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Marcos → Hawaii: Death/hospitalization, a return or speechwriting alone does not establish managerial office.

Cited evidence lines: [8185](../raw_map.tsv:8185), [8188](../raw_map.tsv:8188), [8189](../raw_map.tsv:8189).




### rel_49__ent_380__ent_1280

**All observed names:** Alan Greenspan → Federal Reserve Board (2)

Ordered IDs: Ent[ent_380] → Ent[ent_1280]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [201](../raw_map.tsv:201) | Alan Greenspan | Federal Reserve Board | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-nomination&lt;-dobj&lt;-approve-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5679](../raw_map.tsv:5679) | Alan Greenspan | Federal Reserve Board | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-nomination&lt;-dobj&lt;-approve-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Alan Greenspan → Federal Reserve Board: Approved nomination as chairman does not by itself resolve whether tenure actually began.

Cited evidence lines: [201](../raw_map.tsv:201), [5679](../raw_map.tsv:5679).

**Review question:** Does this nomination approval establish actual chair tenure in the supplied text?
Issue tags: tenure_ambiguity

### rel_49__ent_615__ent_824

**All observed names:** Diana → Paris (2)

Ordered IDs: Ent[ent_615] → Ent[ent_824]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8160](../raw_map.tsv:8160) | Diana | Paris | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8168](../raw_map.tsv:8168) | Diana | Paris | rcmod\|-&gt;rcmod-&gt;kill-&gt;prep-&gt;in-&gt;pobj-&gt;accident-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Diana → Paris: Death/hospitalization, a return or speechwriting alone does not establish managerial office.

Cited evidence lines: [8160](../raw_map.tsv:8160), [8168](../raw_map.tsv:8168).




### rel_49__ent_673__ent_108

**All observed names:** Mr. Mandela → Winnie (1)

Ordered IDs: Ent[ent_673] → Ent[ent_108]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4528](../raw_map.tsv:4528) | Mr. Mandela | Winnie | poss\|&lt;-poss&lt;-return-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Mr. Mandela → Winnie: Death/hospitalization, a return or speechwriting alone does not establish managerial office.

Cited evidence lines: [4528](../raw_map.tsv:4528).




### rel_49__ent_910__ent_1383

**All observed names:** Patrick J. Buchanan → White House (1)

Ordered IDs: Ent[ent_910] → Ent[ent_1383]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8485](../raw_map.tsv:8485) | Patrick J. Buchanan | White House | appos\|-&gt;appos-&gt;speechwriter-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Patrick J. Buchanan → White House: Death/hospitalization, a return or speechwriting alone does not establish managerial office.

Cited evidence lines: [8485](../raw_map.tsv:8485).



