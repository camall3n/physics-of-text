# audit_e318fe663470 — rel_11: reviewed artistic output of

Predicate ID: reviews_artistic_output_of

Person X explicitly reviews or reviewed artistic work or performance produced or performed by artist, ensemble, or producing institution Y.

Includes: review of Y's performance, program, production, or artistic work; direct review of artist or ensemble Y in an artistic criticism context; historical reviews. Excludes: a review merely taking place at venue Y; ordinary mention, attendance, or affiliation; an unrelated subject reviewed at a place owned by Y; authorship for a publication without reviewing Y's work. Ambiguous unless resolved by case-local evidence: Y could denote the venue rather than the producer or performer; unclear reviewer or artistic-work attachment. Inspect argument roles before assigning this predicate. A producing theater or ensemble can be Y; a venue alone is not automatically the artistic creator.

Complete census: 2 supported, 5 incorrect, 0 ambiguous; N=7. Precision 2/7=28.57% to 2/7=28.57%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;bank-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;production-&gt;poss-&gt;\|poss |
| 2 | nsubjpass\|&lt;-nsubjpass&lt;-know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;group-&gt;poss-&gt;\|poss |
| 1 | appos\|&lt;-appos&lt;-minutes-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;premiere-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;revival-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-review-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-article-&gt;prep-&gt;about-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;administration-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_11__ent_1189__ent_1190

**All observed names:** Anna Kisselgoff → American Ballet Theater (5)

Ordered IDs: Ent[ent_1189] → Ent[ent_1190]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1860](../raw_map.tsv:1860) | Anna Kisselgoff | American Ballet Theater | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;production-&gt;poss-&gt;\|poss |
| [1864](../raw_map.tsv:1864) | Anna Kisselgoff | American Ballet Theater | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;premiere-&gt;poss-&gt;\|poss |
| [1865](../raw_map.tsv:1865) | Anna Kisselgoff | American Ballet Theater | nsubj\|&lt;-nsubj&lt;-review-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [1867](../raw_map.tsv:1867) | Anna Kisselgoff | American Ballet Theater | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;revival-&gt;poss-&gt;\|poss |
| [1868](../raw_map.tsv:1868) | Anna Kisselgoff | American Ballet Theater | poss\|&lt;-poss&lt;-article-&gt;prep-&gt;about-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Anna Kisselgoff → American Ballet Theater: Explicit review-of-the-company's-production/performance wording establishes reviewing the ensemble's artistic output.

Cited evidence lines: [1860](../raw_map.tsv:1860), [1864](../raw_map.tsv:1864), [1865](../raw_map.tsv:1865), [1867](../raw_map.tsv:1867), [1868](../raw_map.tsv:1868).


Issue tags: mixed_evidence

### rel_11__ent_401__ent_688

**All observed names:** Lou Lamoriello → Devils (1); Mr. Abbas → Abu Mazen (1)

Ordered IDs: Ent[ent_401] → Ent[ent_688]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1643](../raw_map.tsv:1643) | Lou Lamoriello | Devils | appos\|&lt;-appos&lt;-minutes-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5606](../raw_map.tsv:5606) | Mr. Abbas | Abu Mazen | nsubjpass\|&lt;-nsubjpass&lt;-know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Lou Lamoriello → Devils; Mr. Abbas → Abu Mazen: Aliases, office, financial/geographic or political administration context does not assert artistic review of the second argument's work.

Cited evidence lines: [1643](../raw_map.tsv:1643), [5606](../raw_map.tsv:5606).




### rel_11__ent_1195__ent_1141

**All observed names:** Mcorp → Texas (2)

Ordered IDs: Ent[ent_1195] → Ent[ent_1141]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5796](../raw_map.tsv:5796) | Mcorp | Texas | appos\|-&gt;appos-&gt;bank-&gt;nn-&gt;\|nn |
| [5798](../raw_map.tsv:5798) | Mcorp | Texas | appos\|-&gt;appos-&gt;group-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Mcorp → Texas: Aliases, office, financial/geographic or political administration context does not assert artistic review of the second argument's work.

Cited evidence lines: [5796](../raw_map.tsv:5796), [5798](../raw_map.tsv:5798).




### rel_11__ent_1078__ent_1187

**All observed names:** Jennifer Dunning → New York City Ballet (1)

Ordered IDs: Ent[ent_1078] → Ent[ent_1187]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1875](../raw_map.tsv:1875) | Jennifer Dunning | New York City Ballet | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;production-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Jennifer Dunning → New York City Ballet: Explicit review-of-the-company's-production/performance wording establishes reviewing the ensemble's artistic output.

Cited evidence lines: [1875](../raw_map.tsv:1875).




### rel_11__ent_1149__ent_424

**All observed names:** Student Loan Marketing Association → Sallie Mae (1)

Ordered IDs: Ent[ent_1149] → Ent[ent_424]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5576](../raw_map.tsv:5576) | Student Loan Marketing Association | Sallie Mae | nsubjpass\|&lt;-nsubjpass&lt;-know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Student Loan Marketing Association → Sallie Mae: Aliases, office, financial/geographic or political administration context does not assert artistic review of the second argument's work.

Cited evidence lines: [5576](../raw_map.tsv:5576).




### rel_11__ent_300__ent_843

**All observed names:** Kohlberg → New York (1)

Ordered IDs: Ent[ent_300] → Ent[ent_843]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7355](../raw_map.tsv:7355) | Kohlberg | New York | appos\|-&gt;appos-&gt;bank-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Kohlberg → New York: Aliases, office, financial/geographic or political administration context does not assert artistic review of the second argument's work.

Cited evidence lines: [7355](../raw_map.tsv:7355).




### rel_11__ent_636__ent_828

**All observed names:** Democrats → Clinton (1)

Ordered IDs: Ent[ent_636] → Ent[ent_828]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7579](../raw_map.tsv:7579) | Democrats | Clinton | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;administration-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Democrats → Clinton: Aliases, office, financial/geographic or political administration context does not assert artistic review of the second argument's work.

Cited evidence lines: [7579](../raw_map.tsv:7579).



