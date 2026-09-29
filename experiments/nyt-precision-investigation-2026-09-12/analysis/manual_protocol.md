# Frozen manual assessment protocol

Recorded 2026-09-12 18:12 UTC, before any MAP outputs existed in this investigation's `runs/` directory and before inspection of their semantic outcomes. This protocol governs screening of the four predefined arms at two seeds each. Changes, if needed, must be appended here with a reason; do not silently revise the sampling rule after observing judgments.

## Population and sampling

- Input per run: the complete `map_world_sentences.tsv` saved by the isolated harness. Relation IDs have meaning only within their own run.
- Rank relations by decreasing assigned sentence-row count, breaking ties by numeric relation ID. Select the top 20. A fact is the ordered tuple `(relation ID, entity1 ID, entity2 ID)` expressed by at least one row.
- Draw five facts without replacement from each selected relation, or all of its facts if fewer than five. This yields at most 100 facts per run and at most 800 across eight runs.
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

The preparer records input hashes, full stratum populations, selected case hashes, sample sizes, estimator weights, copied evidence, blank annotation templates and the protocol hash. It refuses to overwrite a changed source or an existing differing review artifact. Human annotation files are never overwritten. All artifacts are under `experiments/nyt-precision-investigation-2026-09-12/`.

No amendments at creation.
