# audit_e318fe663470 — rel_2: editor of publication

Predicate ID: editor_of

Person X serves or served as an editor of, for, or at publication Y.

Includes: explicit editor or editor-in-chief; section or departmental editor within a publication; explicitly editing publication Y; historical editorial office. Excludes: publisher, director, owner, or author alone; ordinary writing or contribution without editorial role; merely being quoted or discussed in the publication. Ambiguous unless resolved by case-local evidence: an incomplete publication argument; editor title attaching to someone other than X; editing a work versus holding the publication's editorial role when unclear. Publisher-only and writer-only evidence do not establish this editorial role. A section editor is included without implying overall control of the publication.

Complete census: 4 supported, 1 incorrect, 0 ambiguous; N=5. Precision 4/5=80.00% to 4/5=80.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;editor-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;editor-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;editor-in-chief-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-chief-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;--rrb--&gt;nsubj-&gt;boss-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-show&lt;-rcmod&lt;-man&lt;-nsubj&lt;-have-&gt;dobj-&gt;message-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-comment&lt;-pobj&lt;-from&lt;-prep&lt;-judge&lt;-dep&lt;-time-&gt;prep-&gt;before-&gt;pobj-&gt;return-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;discussion-&gt;prep-&gt;about-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;editor-&gt;prep-&gt;in-&gt;pobj-&gt;chief-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;top-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_2__ent_873__ent_187

**All observed names:** Graydon Carter → Vanity Fair (5)

Ordered IDs: Ent[ent_873] → Ent[ent_187]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2438](../raw_map.tsv:2438) | Graydon Carter | Vanity Fair | appos\|-&gt;appos-&gt;editor-&gt;poss-&gt;\|poss |
| [2439](../raw_map.tsv:2439) | Graydon Carter | Vanity Fair | appos\|-&gt;appos-&gt;editor-&gt;nn-&gt;\|nn |
| [2441](../raw_map.tsv:2441) | Graydon Carter | Vanity Fair | rcmod\|-&gt;rcmod-&gt;editor-&gt;prep-&gt;in-&gt;pobj-&gt;chief-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2443](../raw_map.tsv:2443) | Graydon Carter | Vanity Fair | rcmod\|-&gt;rcmod-&gt;top-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2444](../raw_map.tsv:2444) | Graydon Carter | Vanity Fair | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;--rrb--&gt;nsubj-&gt;boss-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Graydon Carter → Vanity Fair: An explicit editor/editor-in-chief title establishes the publication's editorial role.

Cited evidence lines: [2438](../raw_map.tsv:2438), [2439](../raw_map.tsv:2439), [2441](../raw_map.tsv:2441), [2443](../raw_map.tsv:2443), [2444](../raw_map.tsv:2444).


Issue tags: mixed_evidence

### rel_2__ent_1200__ent_1399

**All observed names:** Riley → Ewing (3)

Ordered IDs: Ent[ent_1200] → Ent[ent_1399]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1558](../raw_map.tsv:1558) | Riley | Ewing | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;discussion-&gt;prep-&gt;about-&gt;pobj-&gt;\|pobj |
| [1562](../raw_map.tsv:1562) | Riley | Ewing | poss\|&lt;-poss&lt;-comment&lt;-pobj&lt;-from&lt;-prep&lt;-judge&lt;-dep&lt;-time-&gt;prep-&gt;before-&gt;pobj-&gt;return-&gt;nn-&gt;\|nn |
| [1563](../raw_map.tsv:1563) | Riley | Ewing | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-show&lt;-rcmod&lt;-man&lt;-nsubj&lt;-have-&gt;dobj-&gt;message-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Riley → Ewing: Sports discussion, messages or return comments do not establish editing a publication.

Cited evidence lines: [1558](../raw_map.tsv:1558), [1562](../raw_map.tsv:1562), [1563](../raw_map.tsv:1563).




### rel_2__ent_178__ent_616

**All observed names:** Anna Wintour → Vogue (2)

Ordered IDs: Ent[ent_178] → Ent[ent_616]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2415](../raw_map.tsv:2415) | Anna Wintour | Vogue | appos\|-&gt;appos-&gt;editor-&gt;poss-&gt;\|poss |
| [2421](../raw_map.tsv:2421) | Anna Wintour | Vogue | appos\|-&gt;appos-&gt;editor-in-chief-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Anna Wintour → Vogue: An explicit editor/editor-in-chief title establishes the publication's editorial role.

Cited evidence lines: [2415](../raw_map.tsv:2415), [2421](../raw_map.tsv:2421).




### rel_2__ent_621__ent_1396

**All observed names:** Bill Keller → The Times (2)

Ordered IDs: Ent[ent_621] → Ent[ent_1396]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2465](../raw_map.tsv:2465) | Bill Keller | The Times | appos\|-&gt;appos-&gt;editor-&gt;poss-&gt;\|poss |
| [2471](../raw_map.tsv:2471) | Bill Keller | The Times | nsubj\|&lt;-nsubj&lt;-chief-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Bill Keller → The Times: An explicit editor/editor-in-chief title establishes the publication's editorial role.

Cited evidence lines: [2465](../raw_map.tsv:2465), [2471](../raw_map.tsv:2471).


Issue tags: mixed_evidence

### rel_2__ent_859__ent_956

**All observed names:** Anna Wintour → Vogue (1)

Ordered IDs: Ent[ent_859] → Ent[ent_956]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2416](../raw_map.tsv:2416) | Anna Wintour | Vogue | appos\|-&gt;appos-&gt;editor-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Anna Wintour → Vogue: An explicit editor/editor-in-chief title establishes the publication's editorial role.

Cited evidence lines: [2416](../raw_map.tsv:2416).



