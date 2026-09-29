# audit_9c88162c7b22 — rel_98: political body has a leader

Predicate ID: has_political_leader

Country, political body or legislature X has or had person Y as a political leader.

Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

Complete census: 0 supported, 0 incorrect, 6 ambiguous; N=6. Precision 0/6=0.00% to 6/6=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| 5 | amod\|&lt;-amod&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 5 | amod\|&lt;-amod&lt;-president-&gt;appos-&gt;\|appos |
| 4 | nn\|&lt;-nn&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | amod\|&lt;-amod&lt;-republic&lt;-pobj&lt;-of&lt;-prep&lt;-president-&gt;appos-&gt;\|appos |
| 2 | amod\|&lt;-amod&lt;-republic&lt;-poss&lt;-president-&gt;appos-&gt;\|appos |
| 1 | amod\|&lt;-amod&lt;-military&lt;-nsubj&lt;-heed-&gt;dobj-&gt;order-&gt;poss-&gt;\|poss |
| 1 | amod\|&lt;-amod&lt;-republic&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-government&lt;-pobj&lt;-of&lt;-prep&lt;-head-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-president&lt;-pobj&lt;-of&lt;-prep&lt;-indictment&lt;-dobj&lt;-publish-&gt;dobj-&gt;\|dobj |
| 1 | nn\|&lt;-nn&lt;-president&lt;-pobj&lt;-to&lt;-prep&lt;-letter&lt;-nsubj&lt;-address-&gt;prep-&gt;to-&gt;pobj-&gt;president-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-regime-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-representative&lt;-nsubj&lt;-come-&gt;prep-&gt;with-&gt;pobj-&gt;letter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-request-&gt;nn-&gt;\|nn |
| 1 | nn\|&lt;-nn&lt;-version-&gt;rcmod-&gt;play-&gt;prep-&gt;with-&gt;pobj-&gt;future-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_98__ent_497__ent_255

**All observed names:** Yugoslav → Slobodan Milosevic (7)

Ordered IDs: Ent[ent_497] → Ent[ent_255]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6728](../raw_map.tsv:6728) | Yugoslav | Slobodan Milosevic | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| [6730](../raw_map.tsv:6730) | Yugoslav | Slobodan Milosevic | nn\|&lt;-nn&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6731](../raw_map.tsv:6731) | Yugoslav | Slobodan Milosevic | amod\|&lt;-amod&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6732](../raw_map.tsv:6732) | Yugoslav | Slobodan Milosevic | nn\|&lt;-nn&lt;-president&lt;-pobj&lt;-of&lt;-prep&lt;-indictment&lt;-dobj&lt;-publish-&gt;dobj-&gt;\|dobj |
| [6735](../raw_map.tsv:6735) | Yugoslav | Slobodan Milosevic | nn\|&lt;-nn&lt;-version-&gt;rcmod-&gt;play-&gt;prep-&gt;with-&gt;pobj-&gt;future-&gt;poss-&gt;\|poss |
| [6736](../raw_map.tsv:6736) | Yugoslav | Slobodan Milosevic | nn\|&lt;-nn&lt;-request-&gt;nn-&gt;\|nn |
| [6737](../raw_map.tsv:6737) | Yugoslav | Slobodan Milosevic | nn\|&lt;-nn&lt;-regime-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Yugoslav → Slobodan Milosevic: The first argument is a national adjective while the paths refer to a government, republic or presidency; the actual political body is omitted.

Cited evidence lines: [6728](../raw_map.tsv:6728), [6730](../raw_map.tsv:6730), [6731](../raw_map.tsv:6731), [6732](../raw_map.tsv:6732), [6735](../raw_map.tsv:6735), [6736](../raw_map.tsv:6736), [6737](../raw_map.tsv:6737).

**Review question:** Which complete country or governmental body does the national adjective stand for in this leadership fact?
Issue tags: incomplete_argument, mixed_evidence

### rel_98__ent_25__ent_939

**All observed names:** Russian → Boris N. Yeltsin (7)

Ordered IDs: Ent[ent_25] → Ent[ent_939]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6765](../raw_map.tsv:6765) | Russian | Boris N. Yeltsin | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| [6766](../raw_map.tsv:6766) | Russian | Boris N. Yeltsin | amod\|&lt;-amod&lt;-republic&lt;-poss&lt;-president-&gt;appos-&gt;\|appos |
| [6767](../raw_map.tsv:6767) | Russian | Boris N. Yeltsin | amod\|&lt;-amod&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6768](../raw_map.tsv:6768) | Russian | Boris N. Yeltsin | amod\|&lt;-amod&lt;-republic&lt;-pobj&lt;-of&lt;-prep&lt;-president-&gt;appos-&gt;\|appos |
| [6769](../raw_map.tsv:6769) | Russian | Boris N. Yeltsin | amod\|&lt;-amod&lt;-president-&gt;appos-&gt;\|appos |
| [6772](../raw_map.tsv:6772) | Russian | Boris N. Yeltsin | amod\|&lt;-amod&lt;-republic&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| [6774](../raw_map.tsv:6774) | Russian | Boris N. Yeltsin | amod\|&lt;-amod&lt;-military&lt;-nsubj&lt;-heed-&gt;dobj-&gt;order-&gt;poss-&gt;\|poss |

**Judgment: ambiguous** (primary). Russian → Boris N. Yeltsin: The first argument is a national adjective while the paths refer to a government, republic or presidency; the actual political body is omitted.

Cited evidence lines: [6765](../raw_map.tsv:6765), [6766](../raw_map.tsv:6766), [6767](../raw_map.tsv:6767), [6768](../raw_map.tsv:6768), [6769](../raw_map.tsv:6769), [6772](../raw_map.tsv:6772), [6774](../raw_map.tsv:6774).

**Review question:** Which complete country or governmental body does the national adjective stand for in this leadership fact?
Issue tags: incomplete_argument, mixed_evidence

### rel_98__ent_932__ent_213

**All observed names:** Croatian → Franjo Tudjman (6)

Ordered IDs: Ent[ent_932] → Ent[ent_213]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6798](../raw_map.tsv:6798) | Croatian | Franjo Tudjman | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| [6799](../raw_map.tsv:6799) | Croatian | Franjo Tudjman | nn\|&lt;-nn&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6802](../raw_map.tsv:6802) | Croatian | Franjo Tudjman | amod\|&lt;-amod&lt;-republic&lt;-poss&lt;-president-&gt;appos-&gt;\|appos |
| [6803](../raw_map.tsv:6803) | Croatian | Franjo Tudjman | amod\|&lt;-amod&lt;-president-&gt;appos-&gt;\|appos |
| [6804](../raw_map.tsv:6804) | Croatian | Franjo Tudjman | amod\|&lt;-amod&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6805](../raw_map.tsv:6805) | Croatian | Franjo Tudjman | nn\|&lt;-nn&lt;-president&lt;-pobj&lt;-to&lt;-prep&lt;-letter&lt;-nsubj&lt;-address-&gt;prep-&gt;to-&gt;pobj-&gt;president-&gt;appos-&gt;\|appos |

**Judgment: ambiguous** (primary). Croatian → Franjo Tudjman: The first argument is a national adjective while the paths refer to a government, republic or presidency; the actual political body is omitted.

Cited evidence lines: [6798](../raw_map.tsv:6798), [6799](../raw_map.tsv:6799), [6802](../raw_map.tsv:6802), [6803](../raw_map.tsv:6803), [6804](../raw_map.tsv:6804), [6805](../raw_map.tsv:6805).

**Review question:** Which complete country or governmental body does the national adjective stand for in this leadership fact?
Issue tags: incomplete_argument, mixed_evidence

### rel_98__ent_1074__ent_255

**All observed names:** Serbian → Slobodan Milosevic (5)

Ordered IDs: Ent[ent_1074] → Ent[ent_255]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6753](../raw_map.tsv:6753) | Serbian | Slobodan Milosevic | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| [6755](../raw_map.tsv:6755) | Serbian | Slobodan Milosevic | nn\|&lt;-nn&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6756](../raw_map.tsv:6756) | Serbian | Slobodan Milosevic | amod\|&lt;-amod&lt;-president-&gt;appos-&gt;\|appos |
| [6757](../raw_map.tsv:6757) | Serbian | Slobodan Milosevic | amod\|&lt;-amod&lt;-republic&lt;-pobj&lt;-of&lt;-prep&lt;-president-&gt;appos-&gt;\|appos |
| [6758](../raw_map.tsv:6758) | Serbian | Slobodan Milosevic | amod\|&lt;-amod&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Serbian → Slobodan Milosevic: The first argument is a national adjective while the paths refer to a government, republic or presidency; the actual political body is omitted.

Cited evidence lines: [6753](../raw_map.tsv:6753), [6755](../raw_map.tsv:6755), [6756](../raw_map.tsv:6756), [6757](../raw_map.tsv:6757), [6758](../raw_map.tsv:6758).

**Review question:** Which complete country or governmental body does the national adjective stand for in this leadership fact?
Issue tags: incomplete_argument

### rel_98__ent_1075__ent_1076

**All observed names:** Bosnian → Alija Izetbegovic (5)

Ordered IDs: Ent[ent_1075] → Ent[ent_1076]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6788](../raw_map.tsv:6788) | Bosnian | Alija Izetbegovic | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| [6789](../raw_map.tsv:6789) | Bosnian | Alija Izetbegovic | nn\|&lt;-nn&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6790](../raw_map.tsv:6790) | Bosnian | Alija Izetbegovic | amod\|&lt;-amod&lt;-president-&gt;appos-&gt;\|appos |
| [6793](../raw_map.tsv:6793) | Bosnian | Alija Izetbegovic | nn\|&lt;-nn&lt;-representative&lt;-nsubj&lt;-come-&gt;prep-&gt;with-&gt;pobj-&gt;letter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [6796](../raw_map.tsv:6796) | Bosnian | Alija Izetbegovic | nn\|&lt;-nn&lt;-government&lt;-pobj&lt;-of&lt;-prep&lt;-head-&gt;appos-&gt;\|appos |

**Judgment: ambiguous** (primary). Bosnian → Alija Izetbegovic: The first argument is a national adjective while the paths refer to a government, republic or presidency; the actual political body is omitted.

Cited evidence lines: [6788](../raw_map.tsv:6788), [6789](../raw_map.tsv:6789), [6790](../raw_map.tsv:6790), [6793](../raw_map.tsv:6793), [6796](../raw_map.tsv:6796).

**Review question:** Which complete country or governmental body does the national adjective stand for in this leadership fact?
Issue tags: incomplete_argument, mixed_evidence

### rel_98__ent_37__ent_34

**All observed names:** Soviet → Mikhail S. Gorbachev (3)

Ordered IDs: Ent[ent_37] → Ent[ent_34]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6743](../raw_map.tsv:6743) | Soviet | Mikhail S. Gorbachev | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| [6745](../raw_map.tsv:6745) | Soviet | Mikhail S. Gorbachev | amod\|&lt;-amod&lt;-president-&gt;appos-&gt;\|appos |
| [6747](../raw_map.tsv:6747) | Soviet | Mikhail S. Gorbachev | amod\|&lt;-amod&lt;-government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Soviet → Mikhail S. Gorbachev: The first argument is a national adjective while the paths refer to a government, republic or presidency; the actual political body is omitted.

Cited evidence lines: [6743](../raw_map.tsv:6743), [6745](../raw_map.tsv:6745), [6747](../raw_map.tsv:6747).

**Review question:** Which complete country or governmental body does the national adjective stand for in this leadership fact?
Issue tags: incomplete_argument
