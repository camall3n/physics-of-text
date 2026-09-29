# Archived NYT output inventory

[Every archived fact pair](archived_fact_pairs.md) · [Structured archive inventory](archive_comparison.json)

The archive contains related experiments and selected cluster listings. **No saved complete partition has verified provenance to the paper's published relation 46 / 60-fact run.** Relation IDs are arbitrary between runs. Neither matching example pairs nor a similar cluster name establishes that an archive file is the published run. This inventory preserves historical archive evidence whose active bug status is not established; evaluation mappings to the retired nyt-2026 run have been removed.

## Saved archive inventories

| Artifact/run | Sentence rows | Noun strings | Paths | Ordered name pairs | What is saved |
|---|---:|---:|---:|---:|---|
| User-attached results/output.txt | Not stated | 4,484 | 333 | 3,002 | Trigger snapshots; header names Umass-sub-corpus-06-12/pluieTriples_2013_06_12_3.json |
| McCallum output-1 | 116 | 46 | 65 | 25 | Trigger snapshots for 2013_01_06_1 subset |
| McCallum output-2 | 223 | 89 | 123 | 50 | Trigger snapshots for 2013_01_06_2 subset |
| McCallum output-3 | 451 | 177 | 204 | 100 | Trigger snapshots for 2013_01_06_3 subset |
| McCallum output-5 | 8,516 | 1,199 | 4,276 | 920 | Trigger snapshots for 2013_01_06_5 subset |

Input links and sentence totals for McCallum outputs come from [McCallum-corpus-sub/log](../../McCallum-corpus-sub/log), especially lines 29–35 for output-5. The attached [output.txt](../../output.txt) has a different corpus inventory. Pair-presence and triple-overlap counts below use only name/path corpus text from the saved full-NYT TSV; its relation and entity assignments are ignored.

All five archived output logs print checkpoints 0, 1000, …, 9000 with denominator 10000. They contain trigger weights but **zero explicit fact entries and no complete sentence assignment**. The four McCallum logs each contain 800 trigger entries; the attached output.txt contains 1200. These are repeated displays, not numbers of unique relations or paths. The 9000 display in output-5 contains 8 trigger blocks without stable relation labels. The number displayed is not the total occupied relation count.

The archive log reports 26,187.49 seconds (about 7.27 hours) for output-5. Hardware, code revision, update schedule and timing scope are not established well enough for a speedup comparison.

## Additional archived partial-corpus MAP worlds

The imported test fixtures also preserve smaller NYT-derived runs. These are separate from the later inference-of-K experiments summarized in CHANGES.

| Archived directory | Source rows | Relation headers | Displayed sentence rows | Missing source occurrences | Triple multiset intersection with full-NYT corpus text |
|---|---:|---:|---:|---:|---:|
| [output-250](../../../test/Entity_resolution_Relation/all-poss-facts/output-250/map_world.txt) | 250 | 15 | 250 | 0 | 123/250 |
| [output-2500](../../../test/Entity_resolution_Relation/all-poss-facts/output-2500/map_world.txt) | 2500 | 50 | 2461 | 39 | 516/2461 |

The 250-row listing exactly matches the (argument1, argument2, path) multiset in data/06-19/pluieTriples-1.json. The 2500-row listing is a subset of pluieTriples_fgreptest4.json with zero extra triples; its histogram totals 2,500 while its 2,461 printed examples follow a cap of ten per relation/path. The omitted 39 occurrences prevent a full sentence-partition reconstruction from that display. Both files start with a MAP score equal to the maximum of their respective 10,000-value total-score traces (five score channels).

The corpus names and multiset checks establish which data these fixtures describe; they do not identify the exact run configuration or connect them to the paper's full NYT run. Their 15/50 displayed relations are not estimates for the full 8,516-row corpus. Triple overlap is a multiset intersection: repeated triples contribute the smaller occurrence count in the two files. It is a corpus-intersection count, not a semantic or clustering score.

## Selected fact listings and duplicates

| File | Fact entries | Distinct relation IDs printed on facts | Trigger entries | Exact ordered pairs present in full-NYT corpus text |
|---|---:|---:|---:|---:|
| [clusters_with_facts.txt](../../clusters_with_facts.txt) | 208 | 23 | 150 | 208/208 |
| [McCallum-corpus-sub/clusters_with_facts.txt](../../McCallum-corpus-sub/clusters_with_facts.txt) | 208 | 23 | 150 | 208/208 |
| [clusters_with_facts.log](../../clusters_with_facts.log) | 201 | 23 | 145 | 201/201 |
| [cluster_facts_sample.txt](../../cluster_facts_sample.txt) | 71 | 8 | 40 | 71/71 |
| [cluster_facts_sample_all.txt](../../cluster_facts_sample_all.txt) | 71 | 8 | 40 | 71/71 |

The root and McCallum clusters_with_facts.txt files are byte-identical; the two cluster_facts_sample files are byte-identical. Do not count these copies as independent runs or evaluations. Trigger counts include line-wrapped “Trigger [” entries; a same-line-only search undercounts them.

clusters_with_facts.log has 201 fact entries versus 208 in the .txt file. By exact (printed relation, name1, name2), there are 7 .txt-only entries and 0 .log-only entries. The log has hand-added section headers, including a repeated cluster14 label; printed fact IDs sometimes differ within one displayed section. These artifacts are edited selections, not an authoritative complete relation partition.

## Archived subsidiary examples

The old listing's rel_23 has ten example facts and five displayed paths: part-of, unit-of (two syntactic forms), and owned-by (two forms). Its selected name pairs are:

| Archive line | Archived ordered pair |
|---:|---|
| [714](../../clusters_with_facts.txt#L714) | Conde Nast Publications → Advance Publications |
| [717](../../clusters_with_facts.txt#L717) | Euro RSCG Worldwide → Havas |
| [720](../../clusters_with_facts.txt#L720) | Salomon Smith Barney → Citigroup |
| [723](../../clusters_with_facts.txt#L723) | BBDO Worldwide → Omnicom Group |
| [726](../../clusters_with_facts.txt#L726) | Fox → News Corporation |
| [729](../../clusters_with_facts.txt#L729) | McCann-Erickson World Group → Interpublic Group of Companies |
| [732](../../clusters_with_facts.txt#L732) | New York → BBDO Worldwide |
| [735](../../clusters_with_facts.txt#L735) | Grey Worldwide → Grey Global Group |
| [738](../../clusters_with_facts.txt#L738) | Foote → True North Communications |
| [741](../../clusters_with_facts.txt#L741) | Euro RSCG Worldwide → Havas Advertising |

These include the paper's two named examples, BBDO Worldwide/Omnicom Group and Fox/News Corporation. The old sample itself also includes **New York → BBDO Worldwide**. Appearance in an old list does not validate a fact. The ten selected examples are not the paper's complete 60-fact subsidiary output.

## Qualitative archive structure

The last displayed output-5 snapshot has these leading paths (display position is not a relation ID):

| Display position | First three printed paths |
|---:|---|
| 1 | appos&#124;->appos->lawyer->nn->&#124;nn<br>appos&#124;->appos->attorney->nn->&#124;nn<br>appos&#124;->appos->professor->prep->at->pobj->&#124;pobj |
| 2 | appos&#124;->appos->chairman->prep->of->pobj->&#124;pobj<br>appos&#124;->appos->chairman->nn->&#124;nn<br>appos&#124;->appos->head->prep->of->pobj->&#124;pobj |
| 3 | appos&#124;->appos->head->prep->of->pobj->&#124;pobj<br>appos&#124;->appos->director->prep->of->pobj->&#124;pobj<br>appos&#124;->appos->president->prep->of->pobj->&#124;pobj |
| 4 | appos&#124;->appos->coach->nn->&#124;nn<br>appos&#124;->appos->coach->poss->&#124;poss<br>appos&#124;->appos->coach->prep->of->pobj->&#124;pobj |
| 5 | appos&#124;->appos->analyst->prep->for->pobj->&#124;pobj<br>appos&#124;->appos->analyst->prep->at->pobj->&#124;pobj<br>nsubj&#124;<-nsubj<-tell->dobj->&#124;dobj |
| 6 | nsubj&#124;<-nsubj<-beat->dobj->&#124;dobj<br>nsubj&#124;<-nsubj<-play->dobj->&#124;dobj<br>nsubj&#124;<-nsubj<-lose->prep->to->pobj->&#124;pobj |
| 7 | appos&#124;->appos->unit->prep->of->pobj->&#124;pobj<br>appos&#124;->appos->part->prep->of->pobj->&#124;pobj<br>partmod&#124;->partmod->base->prep->in->pobj->&#124;pobj |
| 8 | poss&#124;<-poss<-president->appos->&#124;appos<br>rcmod&#124;->rcmod->live->prep->in->pobj->&#124;pobj<br>nsubj&#124;<-nsubj<-move->prep->to->pobj->&#124;pobj |

The old displays mix related but distinct predicates: the beat-labeled sample includes beat, defeat, play and lose-to; the analyst-labeled sample includes economist paths. The last output-5 display combines organizational unit/part paths with based-in/company-location paths. The archive's estimator, smoothing, vocabulary and saved-state selection are not established well enough for direct comparison with later empirical path frequencies.

## What the archived annotations establish

cluster_facts_sample.txt selects eight labeled sections: win, leader-in, lead, beat, expert-at, analyst-at, president/state and president/sports. Its 71 fact entries have prefixes “1”: 15, “0.5”: 1, “(unmarked)”: 50, “#”: 5. Some #Fact rows appear in a section different from their printed relation ID, which may mark exclusions or cross-references. Only a minority have numeric marks, including one 0.5. There is no complete annotation legend or documented denominator. **Do not infer 95% precision by treating unmarked entries or # entries as successes/failures.**

These partial, differently annotated old outputs do not establish numerical improvement or deterioration against later evaluations. Leadership, chairmanship, analyst work and generic affiliation have different boundaries; broadening predicates would change a measured rate.

## Listed facts by archived relation ID

Exact pair presence refers only to the input corpus, without using later relation assignments. The old selection contains neither sentence IDs nor all facts.

| Archive relation | Listed entries | Exact ordered pairs present in full-NYT corpus text |
|---|---:|---:|
| rel_0 | 12 | 12 |
| rel_1 | 10 | 10 |
| rel_2 | 7 | 7 |
| rel_3 | 9 | 9 |
| rel_4 | 1 | 1 |
| rel_6 | 12 | 12 |
| rel_7 | 6 | 6 |
| rel_9 | 21 | 21 |
| rel_10 | 9 | 9 |
| rel_12 | 8 | 8 |
| rel_13 | 10 | 10 |
| rel_14 | 3 | 3 |
| rel_15 | 5 | 5 |
| rel_16 | 12 | 12 |
| rel_18 | 4 | 4 |
| rel_20 | 11 | 11 |
| rel_21 | 7 | 7 |
| rel_23 | 10 | 10 |
| rel_24 | 14 | 14 |
| rel_25 | 1 | 1 |
| rel_27 | 13 | 13 |
| rel_28 | 11 | 11 |
| rel_29 | 12 | 12 |

Every main-listing pair and archive source line is in [archived_fact_pairs.md](archived_fact_pairs.md). Every parsed listing entry and original annotation prefix is preserved in [archive_comparison.json](archive_comparison.json). Exact string mismatches, including old line breaks around punctuation, remain unmatched; no entity-alias decisions are hidden. Without a full old row partition or a gold fact set, archive precision/recall and partition-distance measures would have an unjustified denominator.

Rebuild with `node scripts/compare_nyt_archives.mjs` from the sampler directory. All original archive files and the full-NYT corpus text are read-only inputs.
