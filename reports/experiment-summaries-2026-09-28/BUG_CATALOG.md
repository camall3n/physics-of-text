# Bug sets and correction history

This catalog classifies known implementation defects and their applicability to saved experiments. It was assembled from existing audits, source provenance and run documentation during the September 2026 organization review. No sampler changes, tests, simulations or new semantic judgments were made for this catalog.

**Beta=0.1 is a modeling choice, not a code defect.** Beta selection and bug status are separate dimensions. A run may appear in the beta=0.1 view and in a bug-set directory without representing two runs. A low score alone does not establish a bug; a high score does not establish a correct sampler.

## How to read the groups

- **Active defect:** the saved configuration uses the affected kernel or computation. This establishes exposure, not how often a particular numerical edge occurred or the number of precision points lost.
- **Dormant defect:** the source retains an error, but the saved configuration does not execute the affected path.
- **Corrected:** the documented correction is included in the producing implementation, with the recorded checks. This is not a proof that every possible defect is absent.
- **Unknown:** provenance is insufficient to assign an exact producing revision or active bug set.

| Directory | Defining status |
| --- | --- |
| [01: pre-correction latent](bug-sets/01-before-sampling-fixes-latent/BUGS.md) | Modern reconstructed NYT baseline before the five sampling repairs; entity factorial omission also active. |
| [02: entity multiplicity active](bug-sets/02-entity-multiplicity-active/BUGS.md) | Five earlier families corrected; later factorial defect remains active. |
| [03: entity multiplicity dormant](bug-sets/03-entity-multiplicity-dormant/BUGS.md) | Five earlier families corrected; unpatched entity kernel is disabled by fixed names. |
| [04: known fixes, latent](bug-sets/04-known-fixes-latent/BUGS.md) | Five families and factorial correction included; entity inference enabled. |
| [05: pre-correction relation-only](bug-sets/05-before-sampling-fixes-relation-only/BUGS.md) | Earlier Figure 1; relation/shared numerical defects relevant, smart entity kernels unused. |
| [06: known fixes, relation-only](bug-sets/06-known-fixes-relation-only/BUGS.md) | Corrected Figure 1; relevant shared/fact/relation/query repairs included, smart entity kernels unused. |
| [07: known fixes, frozen validation](bug-sets/07-known-fixes-frozen-validation/BUGS.md) | Frozen toy replays from factorial-patched source; affected entity kernels disabled. |
| [08: documented pre-fix, unverified](bug-sets/08-documented-pre-fix-unverified/BUGS.md) | Five early development configurations with missing raw outputs and exact producing revisions. |
| [Archive, unclassified](unclassified/archive/BUGS.md) | Imported historical outputs with incomplete source-to-output provenance; different sampler families distinguished. |
| [Exploratory, unclassified](unclassified/exploratory/BUGS.md) | Code-only or insufficiently attributed material cannot receive a definite run-specific bug label. |

The numbered groups describe correction status and execution mode, not a quality ranking. Each has a sibling `EVALUATION.md` linking applicable results. Some analyses compare multiple groups; they are not themselves new inference runs.

## The five sampling defect families

The [historical code audit](../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) describes the pre-fix source at revision `13c3605`. The [sampling corrections](../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) document repairs on 2026-09-11. Four families were inherited from the June-2014 source import; bounded fact birth/death was added by the 2026 reconstruction in commit `8a2939a`.

Source locations below follow the corrected files and line numbers recorded in that report. Earlier revisions have different line numbers; the saved report and run source hashes identify the intended version.

| ID | Defect, origin and location | Implication | Recorded correction |
| --- | --- | --- | --- |
| S1 | **Bounded fact-deletion search correction**, introduced by the update. [FactBirthDeathStep.java](../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/mcmc/FactBirthDeathStep.java), helper at line 108 and acceptance methods at 129/143. | A death search may fail, so the proposal density is not uniform guaranteed selection among unreferenced facts. Omitting that probability biases birth/death transitions. | Include the search-success factor in both reverse/forward acceptance calculations, using stable numerical evaluation. |
| S2 | **Wrong signs in reverse smart-split selection**, inherited. [EntitySmartSplitStep.java](../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java), `logProposalRatio` at line 373. | Forward parent selection uses inverse noun likelihood, while the reverse calculation used inconsistent positive likelihood terms. A fixture returned 0.008219178 instead of 0.6. | Recompute the hypothetical merged-population normalizer using negative log noun likelihood consistently. |
| S3 | **Aborted empty splits remained non-null**, inherited. Both [EntitySmartSplitStep.java](../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java) and [EntitySmartMergeStep.java](../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java), around line 178. | Returning early could still allow application to add an entity, despite a ratio describing no change. | Mark the proposal null and guard application; reject unsupported both-empty merges. A populated parent may still produce one empty daughter with a tested reverse. |
| S4 | **Log-weight accumulation used zero as an empty-sum marker**, inherited. [LogProbMap.java](../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/util/LogProbMap.java), lines 49/68; related [NormalProbMap.java](../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/util/NormalProbMap.java) and [Util.java](../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/util/Util.java). | Since log(1)=0, a valid partial sum could be overwritten. Two unit weights normalized to total 2; a valid equal-weight Gibbs fixture selected one candidate 30,000/30,000 times. | Maximum-scaled normalization, consistent raw/normalized sampling, correct log-zero arithmetic, zero-mass/CDF boundaries and explicit invalid-input checks. |
| S5 | **Phantom unit-weight reverse smart-merge candidate**, inherited. [EntitySmartMergeStep.java](../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java), `logProposalRatio` line 375 and conditional normalizers 391–392. | Empty conditional sums started at log weight zero, adding a nonexistent candidate; a fixture returned 0.08 instead of 2. | Start with the actual opposite daughter, add only eligible candidates, recompute the proposed-population normalizer and sum both possible merge orders. |

For S1, with F existing facts, U removable unreferenced facts and 20 attempts,

`s(F,U) = 1 − (1 − U/F)^20`.

The actual proposal for a particular death is `0.5 × s(F,U)/U`. Birth therefore adds `log s(F+1,U+1)` to log acceptance and death subtracts `log s(F,U)`. At the first NYT MAP, F=2,103 and U=43 gave success 0.3384557. This demonstrates a material proposal error, not a measured semantic-precision penalty.

## The later entity-count factorial defect

**E1: entity multiplicity omitted from the accepted split/merge transition.** The [derivation and archive provenance](../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) establish the omission in the imported source and in the post-five-fix baseline.

For J mention positions partitioned into K nonempty entities out of N available objects, let

`L(z) = g(N) N^(−J) × product of collapsed noun-dictionary likelihoods`.

The stated entity-phase partition target is

`π(z) ∝ L(z) N!/(N−K)!`.

After accounting for empty-object proposal multiplicities, the post-five-fix kernels instead preserve `π(z)/N!`. They therefore add an unintended penalty favoring smaller N. The exact invariant-density result applies to that post-five-fix baseline; it does not assert that archived kernels with other uncorrected proposal errors jointly preserve the same distribution.

The [isolated correction](../../experiments/nyt-precision-investigation-2026-09-12/variants/entity-multiplicity-fix/README.md) adds `log(N+1)` to split log acceptance and subtracts `log N` for a merge. It appears in `logStateRatio()` of the isolated [EntitySmartSplitStep.java](../../experiments/nyt-precision-investigation-2026-09-12/variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java), line 368, and [EntitySmartMergeStep.java](../../experiments/nyt-precision-investigation-2026-09-12/variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java), line 370.

The correction is to the complete accepted transition; simply adding the full falling-factorial density difference would mishandle empty-object proposal multiplicities. Near N=1,000 the missing split log factor is about 6.9, but clipped acceptance probabilities need not change by the same factor. Favoring excessive entity merging could contaminate relation evidence; it does not establish how much of the paper-versus-replication gap this defect caused.

Frozen-name runs disable these kernels. The controlled frozen source retains E1, whereas frozen entityfix validation uses patched source. These are distinct code-provenance groups even though E1 cannot affect either frozen execution.

## Related repairs included with the five-family correction

The [sampling-fix report](../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) and [additional findings](../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) also document:

| Issue | Location recorded in the audit | Repair and experiment relevance |
| --- | --- | --- |
| Repeated ratio evaluation mutated entity proposals | Both smart entity proposal classes | Cache log ratios and retain proposal snapshots. Relevant when those kernels execute. |
| MH overflow/underflow | `mh/GeneralMHStep.java:29` | Compare log acceptance instead of multiplying exponentiated factors that can yield 0×infinity=NaN. Active smart kernels expose log ratios. Legacy subclasses without overrides retain ratio-range limits. |
| Tiny reverse relation probabilities truncated | `mcmc/RelationSplitMergeStep.java:467` | Stable `log(-expm1(x))` replaces truncation near zero. Relevant to NYT and Figure 1 relation proposals. |
| Empty-corpus scheduling | `mcmc/WorldInferSteps.java:61` | Do not schedule sentence selection in an empty corpus. This is not an explanation for completed nonempty-corpus runs. |
| Trigger helpers used alpha instead of beta | `inference/ModelFunctions.java:29,121,148` | Correct the world-taking overloads. The active NYT fact move already supplied beta explicitly, so this is not an established cause of its low score. |
| Trigger best-state output overwritten | `inference/RelationTriggersObserver.java:105` | Update bestProb after saving. The evaluated full-joint MAP TSV used a separate observer whose best-state logic was already correct. |
| Optional filename used before null check | Three observer classes | Return before filesystem operations when output is disabled. No effect established on completed NYT MAP evaluation. |
| Short-run progress divided by zero | `inference/MCMCInferer.java:71` | Reporting interval is at least one. Completed NYT phases had 20/980 iterations, outside the failing 1–9 case. |
| Burn-in discarded one extra draw | `inference/Inferer.java:42` | Retain indices i≥burnin. Figure 1 changes from 1,499 to 1,500 query draws; NYT MAP observation did not use this filter. |

Historical validation recorded 85 tests and four probes after these repairs. Later entityfix validation recorded 91 tests. Those are saved evidence counts, not tests run during this organization task or proof of large-corpus convergence.

## Earlier reconstruction defects are a different historical set

The [reconstruction history](../../resources/sampler-140626/CHANGES.md) records older imported-code problems repaired before the modern full-NYT baseline:

- `WorldProb.logProb()` omitted relation terms, so its MAP score ignored relation structure.
- Entity changes left sentence origins and the true-fact set inconsistent.
- `Sentences.clear()` retained discarded mentions in its index.
- `SentenceOriginRV.probEntityName` modified live noun histograms during probability calculation.
- The argument conditional counted its noun predictive twice.
- Sentence-origin updates left mention objects/indexes stale.
- `FactRV` produced NaN or exceptions at empty/only-fact boundaries.

The reconstruction added the full relation-phase joint, synchronized facts, cleared and maintained indexes, used nonmutating histogram calculations, counted the noun predictive once and handled boundary cases. Performance repairs removed unused dictionary draws, eager debug formatting, large unused fact-variable allocations and repeated observer scans.

**Do not project these already-repaired reconstruction defects onto modern group 01.** Conversely, original archive outputs are not automatically validated by fixes later applied to the working source. Their producing code is often unknown.

## Separate modeling and evidence limitations

The occupied relation-count prior remains pool-dependent: for fixed entity count, `P(K) ∝ Binomial(K;M,q) × Lognormal(K)`, with `q = 1 − B(a,b+N²)/B(a,b)`. This differs from a lognormal count factor alone; changing it requires a modeling decision and consistent target/ratio changes. It is not another missing proposal correction.

Beta smoothing, fixed versus latent entities, the optional reversible sentence/relation bridge, proposal budgets, two-phase inference, incomplete seed control, finite-chain convergence and the evaluation rubric are separate issues. The organization does not equate beta=0.1, old age, low precision or unknown provenance with a proved invalid experiment. The archive is not verified as the exact executable used for the published paper.
