# Review of opaque audit_af30702564

All 20 complete path dictionaries and all evidence rows for the 100 sampled facts were manually read. The 20 meanings and scope rules were saved in [predicate_declarations.json](../manual_review/audit_af30702564/predicate_declarations.json) before reviewing the selected case evidence or entering judgments. An explicit manual record preserves all decisions; the reporter validates full case coverage, citations, ambiguity questions and the protocol/source hashes. No run configuration, mapping or other run's results were read for this review.

The primary result is **85 supported, 9 incorrect and 6 ambiguous**. Weighting the 20 relation samples by their full populations gives **85.05–91.15%** for the 436 expressed latent facts in those relations. This is the range from treating every ambiguous case as incorrect or supported, **not a confidence interval**. It is a screening estimate under the fixed fact-level rubric, not a census or a claim that 95% precision was reproduced. See [assessment.md](../manual_review/audit_af30702564/assessment.md) for separate, deliberately conservative sampling bounds.

## The competing meaning in rel_6

Before seeing the five facts, I recorded that the largest path in this dictionary was play (26 rows), compared with beat (16), loss-to (10), lose-to (9) and face (6). The primary assessment retained the earlier defeated-opponent scope. A coherent broader interpretation is **X played or competed against opponent Y**, irrespective of outcome.

| Selected case | Primary: defeated | Alternative: competed against | Local evidence for alternative |
| --- | --- | --- | --- |
| Knicks → Bulls | S | S | 873, 6043 |
| Mets → Phillies | E | S | 6909 |
| Mariners → Yankees | S | S | 6063 |
| Nets → Knicks | S | S | 946 |
| Mets → Cubs | S | S | 6959 |

Only the second judgment changes: its sole row says Mets play Phillies without establishing a win. The relation has 26 of the 436 top-20 latent facts, so this separate interpretation changes the weighted estimate by `(26/436)*(1/5) = 1.19` percentage points. Its conditional result would be **86.24–92.34%**; the unweighted macro endpoints would each rise by one point. [The separate sensitivity record](../manual_review/audit_af30702564/predicate_sensitivity.json) includes all case IDs and citations. Primary annotations remain unchanged. This is uncertainty about naming a relation, not an arbitrary union of unrelated meanings and not a statement about the other 21 unsampled facts.

## Other scope limitations

- **rel_175, director versus spokesperson:** director was declared from the leading director-for/of family. All five selected facts have director evidence. Fink and Amlung also have explicit spokesperson evidence, while the other three do not. High fact support under one predicate can coexist with mixed path meanings when the same people hold correlated roles. It does not establish that all assigned rows express director, and it does not justify combining director and spokesperson into one definition.
- **rel_32, rel_164 and rel_239, managerial office family:** their head/director/chair/president constructions were assessed under the previously used broader office scope. In particular, Hill → District Council is supported as leader/head under that declaration. A chair-only meaning would be different. The declarations expose this choice before grades.
- **rel_72, Kristol → Weekly Standard:** the supplied editor-of row was not treated as evidence of the declared organizational head/leader office. Whether the intended relation should include this particular editorial role is a scope question for a user review; it was not silently added after seeing the case.
- **Six ambiguous cases:** three involve incompatible literal identities within the same inferred fact (Wolzien/Abramowitz/Black; Trimble/Science fiction with their different second arguments; Expos/Padres). Three concern truncated arguments or missing institutional attachment (Yugoslav; Stephanopoulos as Mr. Clinton's director; Chicago as a DDB Worldwide unit). Every annotation has a specific review question.
- **Malformed input paths remain visible:** source metadata leaks into some dictionary entries. The Phillips/Mets and Ullrich/Tour cases also have uncorrupted supporting paths, so their labels do not depend on treating the leaked text as a valid dependency path.

## Global entity identity is a separate unresolved problem

After completing primary judgments, I inspected literal names across the copied MAP for the selected entity IDs. There are **1,160 expressed entity IDs**, of which **511 carry more than one literal name**. **68 of the 100 selected facts**, including **55 of the 85 supported cases**, touch such an ID. Multiple names are a flag, not an error count: aliases and truncated names can be legitimate. No labels were automatically changed because of this flag.

Some collisions are nevertheless plainly incompatible:

| Entity ID | Literal names and occurrence counts in the copied MAP |
| --- | --- |
| ent_1132 | Shimon Peres (20); Conde Nast Publications (1) |
| ent_146 | District Council (10); Metro-North (3); United States Central Command (2); Mr. Simpson (12) |
| ent_1370 | Norman Siegel (1); Englewood (1); Montreal Expos (5); San Diego Padres (3) |
| ent_1186 | Tom Wolzien (3); Kenneth S. Abramowitz (2); Harris Upham & Company (1); Gary D. Black (1) |

For example, Peres → Labor Party and Conde Nast → Advance Publications each have correct local predicate evidence, even though their common subject ID is not a coherent real-world entity. Likewise, Hill → District Council and Franks → United States Central Command locally support leadership, but the second ID merges incompatible organizations and a person. The existing fact-local protocol does not turn these independently supported rows into a verified coherent knowledge graph.

Consequently, **85.05–91.15% must not be described as globally correct entity-resolved fact precision**. It measures local support for a declared relation, with within-fact identity ambiguity accounted for and cross-fact identity coherence left as a separate audit. [global_identity_flags.json](../manual_review/audit_af30702564/global_identity_flags.json) retains the full name lists and affected selected cases. A rigorous identity-aware comparison should apply the same additional adjudication rule to every historical and new arm rather than changing only this run's primary labels.

Fragmentation also matters. Two selected Dick Steinberg → Jets facts in rel_338 have different latent pairs and each supports manager. United/UAL Corporation and United/UAL also remain separate output facts. Such distinctions alter the evaluated population without necessarily adding different real-world discoveries.

This review was performed by an assistant who knew the follow-up hypothesis and previous study, though the new run identity stayed masked. It has not been independently calibrated against a human reviewer. Predicate choice, reviewer judgment and entity coherence remain additional uncertainties beyond the sampling intervals.
