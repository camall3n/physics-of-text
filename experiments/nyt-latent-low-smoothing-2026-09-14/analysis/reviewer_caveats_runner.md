# Reviewer notes for audit_4f7553d383

This reviewer assessed all 100 sampled facts after reading every complete relation dictionary and every supplied evidence row. The prospective protocol and earlier reviewer caveats were read first. New run configurations, run mappings and quantitative results were not opened before or during grading; the general hypothesis and earlier investigation were already known. This is an assistant screen, not a fully blind or independently calibrated human assessment.

The [assessment](../manual_review/audit_4f7553d383/assessment.md) records **76 supported, 15 incorrect and 9 ambiguous** cases. The relation-population-weighted micro estimate is **76.20%–84.51%**, treating ambiguity negatively/positively. These endpoints do not measure sampling uncertainty. The reporter separately gives deliberately wide finite-population bounds and checks exact case coverage, source citations, unchanged input/protocol hashes and stratum weights.

## Identity and evidence limitations

Six ambiguous cases have different literal referents combined within a single latent entity, despite relation support for some or all of those names:

- [rel_342](../manual_review/audit_4f7553d383/relations/rel_342.md): Paine Webber/Merrill Lynch in one organization entity, and Wolzien/Abramowitz/Black in one person entity.
- [rel_274](../manual_review/audit_4f7553d383/relations/rel_274.md): Dole/Daschle in one person entity.
- [rel_98](../manual_review/audit_4f7553d383/relations/rel_98.md): Yankees/Marlins in one team entity.
- [rel_216](../manual_review/audit_4f7553d383/relations/rel_216.md): Dodgers/Florida Marlins in one opponent entity.
- [rel_223](../manual_review/audit_4f7553d383/relations/rel_223.md): Bedford-Stuyvesant/Brownsville in one neighborhood entity.

The other three questions concern an unidentified Democrat who chairs a committee, the possibly truncated institution “Study of American Catholicism,” and East/West names combining contest and geographic/political evidence. These uncertainties remain in the denominator. Clear wrong predicates remain incorrect even when an argument also has identity problems.

Repeated literal pairs can occur as different latent facts or across different learned relations. They remain separate population units. For example, distinct Clinton-to-Congress tuples are supported independently. Multiple subsidiary or winner dictionaries are assigned the same coherent meaning when appropriate; a new relation ID is not evidence for a new semantic predicate. This screen therefore does not establish unique real-world discovery counts or sentence-cluster purity.

## Predicate choices that matter

The director dictionaries (`rel_263`, `rel_383`) use the earlier specific-director scope. `rel_269` uses economist affiliation and `rel_342` analyst affiliation, rather than a union of employment roles. `rel_83` uses the earlier broader managerial-office family because head, chair and executive together dominate. `rel_186` preserves the earlier president-or-manager family, including functional offices without asserting sole overall presidency. Explicit historical offices and wins qualify without external historical verification.

`rel_205` has a strongly dominant chairperson dictionary, so its declared predicate specifically requires chairmanship. The executive-only Lamoriello–Devils case is incorrect under that scope. A broader managerial-office interpretation would support that one case and raise both micro endpoints by `(21/421)*(1/5)`, about **1.00 percentage point**. This is a disclosed alternative-predicate sensitivity, not a revised primary label or a confidence interval. It is a useful user adjudication case because earlier broad leadership dictionaries included executive roles.

`rel_242` requires chair/head leadership rather than ordinary committee membership. Bradford's NRC membership does not establish NRC chairmanship merely because a different chair title appears earlier in the path. `rel_274` retains the earlier political-group convention for adjectival names such as Bosnian Serb and Soviet when direct leader paths establish that connection; it does not infer an exact formal state title or current state control. Dalai Lama–Tibet is assessed as broad community/political leadership, not a claim of current governmental control.

The winner/champion scope in `rel_112` and `rel_98` preserves the earlier exclusion of political officeholding. The three sampled White House wins are incorrect under that scope. Expanding the predicate to include political office would change both endpoints by `(21/421)*(2/5)+(23/421)*(1/5)`, about **3.09 percentage points**. Primary judgments are unchanged. The defeated-opponent dictionaries remain directional: an explicit win can coexist with losses from other contests, but merely playing, losing, or having a margin without an established victory is insufficient.

All primary predicate definitions, competing families, individual reasons and questions are in the [annotation files](../manual_review/audit_4f7553d383/annotations). User adjudication, a common reviewer across comparisons, and a full census are needed before interpreting the screen as a precise comparison with the paper's reported precision. No annotation was changed after calculating the aggregate score.
