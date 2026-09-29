# What the manual screen can and cannot establish

The new judgments are a small stratified screen of each saved run, not the paper's all-facts evaluation and not an independent human benchmark. Each retained screen has five selected facts per top-20 relation, each with complete local evidence. The primary micro estimate weights each five-fact stratum by its full latent-fact population. The earlier active-defect baseline censuses and screens were retired; their raw runs remain.

The unchanged [protocol](manual_protocol.md) was recorded before the initial eight runs. The [entity-fix extension](manual_followup_protocol.md) applies the same sampling and assessment rules to two later runs motivated by an exact kernel audit; those two were not in the original preregistration. Samples are deterministic and have no semantic selection rule. A reviewable decision, case-specific reason, source-line citation and question for every ambiguous case are retained in each audit's annotation JSON.

## Reviewer assignment and masking

Four assistant reviewers divided the work. The retained primary assignments are:

| Reviewer role | Audit folders |
| --- | --- |
| Kernel auditor | `audit_08e2dd6fc7` |
| Runner reviewer | `audit_dba5006d06`, `audit_4c50ddb65b`, `audit_384a3e2233` |
| Evaluation/preparation reviewer | `audit_5e74dee865`, `audit_6260319b65`, `audit_fb501b5da8`, `audit_c0010fff1d` |

Opaque IDs remove arm names from the evidence documents. This was **not a fully blinded study**: the preparation reviewer had access to run mappings, technical work was shared between reviewers, and outputs can be recognized. The coordinator stopped grading after unblinding. There was no independent second judgment on the same cases, no measured inter-rater agreement and no human calibration. The same reviewer assessed both small-beta samples, so a between-reviewer effect cannot be separated statistically from that arm's effect. The user should review uncertain cases and a common blinded subset from every arm before treating small differences as established.

## Choosing a predicate matters beyond S/E/A ambiguity

The protocol fixes a coherent directional meaning per relation before entering judgments. Some dictionaries have no uniquely compelling dominant meaning. The annotations preserve the chosen meaning and competing families instead of allowing a disjunction that accepts every member. The primary results are conditional on those choices. An S/E/A interval does not include uncertainty about choosing a different relation meaning.

Particularly relevant examples:

- `audit_dba5006d06/rel_215`: athlete plays for team was chosen after examining the mixed dictionary. Coach/manager and standings are distinct meanings.
- `audit_dba5006d06/rel_353`: personal residence was chosen after examination of all 32 fact summaries. Death in a city, a lawyer working there and an office there do not establish residence.
- `audit_6260319b65/rel_80`: athlete plays for team was chosen after all 15 fact summaries. Nine fact pairs clearly concern athletes; coaches, rival teams and corporate leadership use other senses of lead. Four of the five sampled facts consequently fail the declared predicate. This is not a reason to choose a broader disjunction afterwards.
- `audit_fb501b5da8/rel_118`: organization membership was declared after inspecting all 36 fact summaries. Physical presence/movement, event participation and political control are substantial competitors; there is no unique unambiguous dominant predicate. Two selected facts support membership; the other three concern Yankees/New York, Jets/Giants Stadium and Red Sox/World Series. A separate location interpretation would change which facts pass even where the raw count happens to match.
- `audit_fb501b5da8/rel_69`: travel/relocation was chosen after inspecting all 27 fact summaries. Contest outcomes and possession are substantial competing families.
- `audit_c0010fff1d/rel_156`: beat and defeat are the two most frequent paths; a directed communication family is nearly as salient. The declared defeated-opponent predicate gives 0/5 supported in its selected sample, which by chance contains mostly communication pairs. Four of these same five facts would support a separately declared communication predicate. With its stratum weight 111/1197, replacing this one predicate would change the whole-run strict estimate by `(111/1197)*(4/5) = 0.07419`, or **7.42 percentage points**. This is an explicitly described alternative-predicate sensitivity, not a revised primary score, not a confidence interval and not an estimate for the unsampled 106 facts. No primary labels were changed to obtain it.
- `audit_c0010fff1d/rel_298`: economist is the leading specific occupation; director/president/professor/analyst also occur heavily. This audit uses economist affiliation rather than the union of all professional roles.
- `audit_c0010fff1d/rel_258`: leadership office was chosen amid spokesperson, lawyer, residence and accusation families. In `rel_197`, the dominant director family was treated specifically; president/head alone did not substitute for that title. These differing widths are visible choices, not an externally established gold ontology.

The above examples explain why a paper that provided only a few labeled relation examples and a headline precision cannot be matched exactly by selecting an apparently similar number. They also identify where user adjudication or a shared predicate catalogue would most improve comparability.

## Fact evidence, identity and fragmentation

A supported fact needs at least one supplied row supporting its declared ordered predicate. Rows expressing other relations are flagged as mixed evidence. This criterion does not say the entire sentence cluster is pure and does not independently verify historical truth.

The population counts distinct **latent** `(relation, entity1, entity2)` tuples. For example, `audit_c0010fff1d/rel_372` includes two sampled Fox → News Corporation facts with different latent IDs and separate evidence; both are textually supported. Fragmenting one literal pair can change the evaluated population and its weights without adding a new real-world discovery. Conversely, a latent pair containing Bush and Mr. Greenspan as the same first entity cannot be assumed to have a single resolved identity merely because both address Congress. Such collisions are recorded explicitly in that audit.

Scores are therefore affected by relation specificity, entity splitting/merging and which facts enter the top 20, in addition to semantic correctness. The small-beta runs' top-20 populations are 384 and 364 facts, whereas the corrected latent beta=0.1 screens have 1,184 and 1,197. They are substantially different evaluation populations; gold-standard recall is unknown, and a high precision estimate on the smaller output is not by itself a recovery of the paper's discovery performance.

## Uncertainty and the next useful comparison

The two reported endpoints treat all A cases as incorrect or supported. They are **not sampling confidence bounds**. The reporter separately supplies exploratory finite-population standard errors and deliberately wide exact, simultaneously conservative intervals. Five observations in a stratum cannot establish its population purity, including when all five pass. Those intervals are conditional on fixed valid judgments; they do not cover reviewer mistakes, predicate choice, failed entity identity or chain-to-chain variability.

The most informative next step is a full census of all top-20 facts for the promising small-beta outputs, plus a common blinded review of a predefined subset from all arms by the same human reviewer using a fixed catalogue of meanings. Record any predicate changes as a separate sensitivity analysis and keep the present primary labels. Assess sentence coverage and relation fragmentation alongside precision. Additional seeds and convergence diagnostics are needed before attributing a stable accuracy improvement to a parameter or repair.
