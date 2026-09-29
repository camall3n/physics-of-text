# Prospective manual assessment protocol for the latent low-smoothing follow-up

Recorded 2026-09-14T19:10:38.960Z, before these two follow-up runs have produced outcomes or been semantically assessed. This is a later, prospectively specified screening comparison of latent entities with beta = 0.001 and the confirmed sampling repairs. It was requested after the earlier investigation; it is not part of that investigation's original eight-run preregistration. Reviewers already know the hypothesis and previous results. The same sampling salt, five-facts-per-relation allocation, fact rubric and estimators are retained for comparability.

The two seeds and all run settings are fixed in this folder's experiment plan/configurations before launching. The original folders are read-only. This file must remain unchanged once a sample records its hash; any later amendment belongs in a separate dated file with an explicit reason and affected cases.

## Population and sampling

- Input per run: the complete `map_world_sentences.tsv` saved by the isolated harness. Relation IDs have meaning only within their own run.
- Rank relations by decreasing assigned sentence-row count, breaking ties by numeric relation ID. Select the top 20. A fact is the ordered tuple `(relation ID, entity1 ID, entity2 ID)` expressed by at least one row.
- Draw five facts without replacement from each selected relation, or all of its facts if fewer than five. This yields at most 100 facts per run and at most 200 across the two follow-up runs.
- Selection is deterministic pseudorandom ranking by SHA-256 of the fixed salt `nyt-precision-screen-2026-09-12-v1`, the complete input MAP SHA-256, relation ID, ordered entity IDs, and first source line. Take the five smallest hashes. No words, paths, annotation values, model scores or semantic judgments enter selection.
- Save every selected fact's complete evidence rows and every relation's complete path-frequency list before judgments are entered. Avoid selecting a favorite representative row.
- Use opaque audit IDs for reviewers. Case documents contain a copied raw TSV with no configuration/arm name. The separate `manual_review/unblinding.json` maps audit IDs to run paths for later analysis. This masks variant labels where feasible; it does not make the study fully blind if a reviewer also worked on those runs or recognizes their outputs.

## Predicate choice and fact judgment

For each relation, first inspect its path-frequency distribution and declare a directional predicate with inclusion/exclusion rules. Use the prior review's predicate scope when the same meaning is identifiable, but never transfer judgments using an old relation number. Preserve substantial competing meanings as errors or uncertainty under the chosen scope rather than inventing a disjunction that fits every member. New meanings need an explicit definition. Reviewers may inspect the full relation evidence to settle its meaning, but the five sampled facts remain the only cases in this screening estimate.

Each sampled fact receives exactly one judgment, a reason, cited source lines, optional issue tags, and a question for an ambiguous case:

- **supported**: at least one supplied row clearly supports the declared predicate for the ordered entities. Flag mixed evidence when other assigned rows express something else. This does not imply sentence-cluster purity or prove historical truth.
- **incorrect**: the supplied evidence contradicts the direction/role, or expresses another predicate without establishing the declared one.
- **ambiguous**: unresolved entity identity, attachment, scope, temporal/modal interpretation, or insufficient text prevents a sound binary judgment. State the exact uncertainty; do not silently drop the case from the denominator.

Do not use keyword rules or model scores to assign semantic labels. Do not reclassify cases to make the result resemble 95%. Preserve the pre-existing 1,066-fact census as a separate historical population; these new samples are not paired with it.

## Estimators and uncertainty

For run j and relation r, let \(N_{jr}\) be its complete expressed-fact count, \(n_{jr}=\min(5,N_{jr})\), and \(s_{jr},e_{jr},a_{jr}\) its sampled judgment counts. Let \(N_j=\sum_rN_{jr}\). The primary micro estimates are

\[
\widehat P_{j,L}=\sum_r\frac{N_{jr}}{N_j}\frac{s_{jr}}{n_{jr}},
\qquad
\widehat P_{j,U}=\sum_r\frac{N_{jr}}{N_j}\frac{s_{jr}+a_{jr}}{n_{jr}}.
\]

These are separate estimates treating A as incorrect or supported, not confidence limits. Report total sample counts too, but do not call raw `supported/100` a micro estimate: equal allocation oversamples smaller relations. Macro estimates are the unweighted mean of the 20 within-relation rates.

Five observations per stratum are too few for reliable plug-in Wald intervals, especially for all-correct/all-incorrect samples. If a variance is supplied for descriptive purposes, name the stratified finite-population formula and explicitly note its instability:

\[
\widehat{\operatorname{Var}}(\widehat P)=
\sum_r\left(\frac{N_r}{N}\right)^2
\left(1-\frac{n_r}{N_r}\right)\frac{s_r^2}{n_r},
\]

where \(s_r^2\) is the sample variance of the binary endpoint, computed separately for the two ambiguity treatments. A sampled stratum with five successes does not establish a 100% population rate even though this plug-in variance is zero. Prefer per-stratum exact finite-population intervals, combined conservatively with simultaneous coverage, or clearly describe the results as screening estimates with substantial sampling uncertainty. Ordinary Wilson intervals per stratum are useful illustrations, but averaging their endpoints does not automatically produce a valid 95% interval for the weighted sum.

Report each seed separately. Two chains per arm do not support a precise estimate of run-to-run variability. Do not pool facts from different seeds as though they were independent new corpus examples. A promising improvement should trigger a complete top-20 census and additional seeds rather than a claim of replication success from this small screen.

## Reproducibility and amendments

The preparer records input hashes, full stratum populations, selected case hashes, sample sizes, estimator weights, copied evidence, blank annotation templates and the protocol hash. It refuses to overwrite a changed source or an existing differing review artifact. Human annotation files are never overwritten. All new artifacts are under `experiments/nyt-latent-low-smoothing-2026-09-14/`. The earlier investigation and its annotations remain unchanged.

## Predicate comparability and reviewer limitations

Use the same previously declared meaning where identifiable: subsidiary/unit-to-parent, owner-to-property/company, organizational location, personal residence, directed communication, defeated opponent, winner of an event/award, analyst affiliation, economist affiliation, coach, athlete playing for a team, explicit president/manager, broader managerial leadership office, director, spokesperson, organizational membership and inverse political leadership are distinct meanings. Their prior scope notes provide the reference. Do not combine competing meanings merely to credit more sampled facts. Record why a mixed dictionary is interpreted as a specific role or a broader previously used office family before entering its case judgments. Relation numbers are local identifiers and carry no meaning across runs.

Keep entity identity separate from a supporting path: a latent pair with incompatible literal referents requires explicit identity consideration even if some of its evidence expresses the chosen predicate. Identical literal pairs assigned to distinct latent facts remain separate population units, as in the earlier protocol; report fragmentation and top-20 sentence coverage separately.

Opaque IDs suppress configuration/seed names in review documents, but the known purpose of this two-run follow-up and recognition of evidence prevent a fully blind study. The preparer/coordinator will assign opaque folders without sharing the run mapping with the two grading reviewers. These are assistant reviews, not independently calibrated human judgments. Predicate choice and reviewer effects add uncertainty beyond the reported ambiguity endpoints and sampling intervals. A user review and a complete census are required before claiming a result comparable to the paper's all-facts precision.

No amendments at creation.
