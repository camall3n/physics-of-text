# Why the NYT audit scores poorly: code and evaluation audit

> **Historical pre-fix report.** The five sampling defect families below and related defects were subsequently corrected on 2026-09-11. See [sampling_fixes.md](sampling_fixes.md) for current source locations, fixes, regression results and remaining issues. Statements such as “still present” below describe revision `13c3605`, not the corrected working tree. Saved NYT outputs remain pre-fix. The runner now checks corrected behavior and writes `code_fixes/`; the `code_audit/` results linked here retain the original defect evidence.

[Retired evaluation status](README.md) · [Diagnostic numbers](code_audit/diagnostics.json)

Audited on 2026-09-11 against current sampler source at `13c3605` and archive import `9489d21`. The archive is a June 2014 snapshot; it is not verified to be the exact implementation used for the 2016 paper. **Both inherited defects and defects introduced by the update remain.** The saved NYT run therefore should not be presented as a validated sample from the intended posterior. The amount of the semantic precision gap caused by each defect has not been measured by a corrected rerun.

No production sampler code or saved inference result was changed during this audit. The additions are this report, diagnostic data and runnable probes. This report supplements the earlier CHANGES account; passing the earlier tests did not catch the defects below.

## Which code contains the problems?

| Confirmed defect | Original archive | Updated code | Evidence |
|---|---|---|---|
| Smart-split reverse proposal uses the wrong likelihood signs | Present | Still present | Proposal ratio 0.008219178 instead of 0.6 in a two-entity example: factor 73 |
| Empty-entity split returns without marking a null proposal | Present | Still present in both active entity kernels | Adds an entity, N=2→3, while claiming a state ratio of 1 instead of 0.501376 |
| Log-probability accumulator uses numeric zero as an initialization marker | Present | Still present | Two unit weights normalize to total 2; another valid Gibbs example chooses one of three equally likely relations 30,000/30,000 times |
| Reverse smart-merge normalization includes a nonexistent unit-weight candidate | Present | Still present | One-entity proper split gives proposal ratio 0.08 instead of 2: factor 25 |
| Fact-deletion search can fail, but acceptance assumes guaranteed selection | Absent; this move did not exist | **Introduced by `8a2939a`** | Detailed-balance counterexample; search success is only 33.85% at the saved NYT MAP counts |

The two active `EntitySmart*` source files differ from their imported versions only in lazy debug logging. `LogProbMap` is unchanged from the import. Thus the earlier reconstruction did not create those inherited mathematical defects, but it continued to use them. The new fact birth/death move was added in `8a2939aefa73b18c529a3e05e27e955745457de6`.

### 1. Updated fact birth/death move has an incorrect proposal correction

[FactBirthDeathStep:65](../../../src/main/java/org/ucb/generative_ie/mcmc/FactBirthDeathStep.java#L65) draws an existing fact at most 20 times, looking for one no sentence references. It can return without proposing anything. [The acceptance formulas:103](../../../src/main/java/org/ucb/generative_ie/mcmc/FactBirthDeathStep.java#L103) instead assume that an unreferenced fact is always selected uniformly.

Let F be all facts, U the unreferenced facts, and T the number of potential facts. The probability that the bounded search finds an unreferenced fact is

`s(U,F) = 1 − (1 − U/F)^20`.

For a particular unreferenced fact, the actual death proposal probability is `0.5 × s(U,F)/U`, not `0.5/U`. Keeping the bounded search requires adding `log s(U+1,F+1)` to the birth log-acceptance and subtracting `log s(U,F)` from death log-acceptance. An alternative is to maintain and sample an explicit set of unreferenced facts, which would make the existing proposal assumption valid.

At the saved MAP: F=2,103, referenced facts=2,060, U=43. Therefore s=0.3384557. The missing factor is not negligible at this state. The error favors retaining/adding unused facts relative to the intended transition probabilities. These facts influence origin probabilities and offer possible destinations for later sentence moves. **This establishes biased inference, not a measured loss of a particular number of precision points.**

The [fact proposal probe](code_audit/fact_proposal_probe.txt) uses F=10, U=1 and compares actual probability flow in both directions. Forward flow is 0.03125, while target-weighted reverse flow is 0.02745073; they should be equal. In 200,000 forced-death trials the observed deletion rate is 0.141685, matching the actual bounded-search calculation 0.141710, rather than the assumed 0.161323.

### 2. Original smart-split reverse probability has inconsistent signs

[EntitySmartSplitStep:153](../../../src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java#L153) selects an entity for splitting using inverse noun-likelihood weights: negative log likelihood. [The reverse calculation:446](../../../src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java#L446) removes/adds positive log likelihoods and uses the positive likelihood of the merged entity. The reverse proposal must use the same inverse-likelihood convention as the actual forward smart split.

With one A mention in one entity and one B mention in another, α=0.1 and a two-name vocabulary, the reported reverse/forward proposal ratio is 0.008219178; direct calculation gives 0.6. This 73-fold discrepancy changes the acceptance of entity merges. It can bias the entity partition passed into the relation phase, but its prevalence and net effect in the saved NYT trajectory are not recorded.

### 3. Empty-entity split is not actually aborted

Both [EntitySmartSplitStep:185](../../../src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java#L185) and [EntitySmartMergeStep:185](../../../src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java#L185) return early after choosing an empty entity. They do not mark the proposal null or update the proposed entity count. The caller still evaluates it, and `applyProposal()` adds an entity.

In the probe, N changes from 2 to 3 even though the reported state ratio is 1; the actual entity-target ratio is 0.501376. The routine must either return a genuine null move or construct a valid entity-birth proposal with the correct target and proposal factors. The saved MAP itself has 1,119 entities, all expressed; this example does not prove how often empty entities were encountered earlier in its entity phase.

### 4. Numeric zero is a valid log weight, not an empty sum

[LogProbMap:44](../../../src/main/java/org/ucb/generative_ie/util/LogProbMap.java#L44) and [nonNormalizedSample:92](../../../src/main/java/org/ucb/generative_ie/util/LogProbMap.java#L92) use `0` to mean an uninitialized log sum. But `log(1)=0`. When a partial sum legitimately equals zero, the next term replaces it instead of being added.

Two log weights of zero normalize to probabilities 1 and 1. Three weights of 0.5 cause the accumulation to forget the first two weights when their sum reaches 1. In the [actual SentenceOriginRV probe](code_audit/sentence_conditional_probe.txt), all three candidate worlds have identical joint probability, yet the sampler selects the first hash-iteration candidate 30,000 times and the others zero times.

Use an explicit initialization flag or a log-zero value of negative infinity with log-add code that handles it correctly. Audit the related cumulative-sampling code too. Empty noun histograms give exactly zero log likelihood, so this is relevant to entity kernels as well as the constructed sentence-origin example. Its incidence in the full NYT run is unknown; the two-path probe is evidence of a defect, not evidence that all NYT Gibbs choices collapse this way.

### 5. Reverse smart-merge normalizers have a related edge error

[EntitySmartMergeStep:397](../../../src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java#L397) and its second normalizer at line 419 initialize a log sum to zero. If there are no other entities to iterate over, the code later adds the actual candidate to this initial value, effectively introducing a nonexistent candidate of weight 1.

Splitting a single entity with one A and one B mention gives a proposal ratio of 0.08 rather than 2. This is another inherited proposal-density error. Correcting only `LogProbMap` does not fix these separate accumulator sites.

All four entity/numerical demonstrations are in [entity_probe.txt](code_audit/entity_probe.txt).

## A separate model mismatch introduced by the update

The relation pool is not merely a harmless upper bound. [WorldProb:190](../../../src/main/java/org/ucb/generative_ie/world/WorldProb.java#L190) applies a Beta–Bernoulli fact prior to every labelled slot in the pool, then [logRelationNumber:151](../../../src/main/java/org/ucb/generative_ie/world/WorldProb.java#L151) multiplies by a lognormal factor for the number of occupied slots.

For fixed entity count N and no sentences, write M for the pool size and

`q = 1 − B(a,b+N²)/B(a,b)`.

Marginalizing all fact configurations gives

`P(K) ∝ Binomial(K; M,q) × Lognormal(K; configured parameters)`.

It does **not** give the advertised broad lognormal prior on K alone. With a=1 and b=N², q=1/2:

| Pool M | Configured lognormal mean | Actual empty-corpus mean K | Actual SD |
|---:|---:|---:|---:|
| 40 | 10 | 18.86 | 3.21 |
| 400 | 200 | 199.25 | 10.01 |
| 800 | 200 | 398.90 | 14.15 |

These examples hold N fixed and set b=N². In the NYT run b is fixed at 1,199² while the entity phase changes N; the general formula above still applies, with a different q. An [exhaustive 16-world probe](code_audit/target_density_probe.txt) verifies the extra binomial multiplicity against the actual current `WorldProb` for N=1 and M=4.

This is a confirmed difference between the documented generative story and the implemented target, not an additional detailed-balance failure. Choosing the intended distribution over K and a consistent labelled/unlabelled representation requires an explicit model decision, with corresponding changes to the joint and every affected acceptance ratio. Its semantic precision effect has not been measured.

## Why the reported score looks especially low

The score is a first-pass **corpus-evidence audit under stated predicates**, not a reproduction of the paper's historical fact-checking protocol. There is no evidence of a counting error, but the name “precision” should not hide this distinction. For example, the audit requires chairman in rel_294, uses leadership in rel_399, requires analyst in rel_365, and distinguishes organizational location from a nationality adjective. Different reasonable predicate granularity can change judgments. The paper does not supply a complete rubric or judgment set with which to calibrate this.

More concretely, errors concentrate in rare inferred facts:

| Assigned rows per fact | Facts | Supported | Incorrect | Ambiguous | Audit support range |
|---|---:|---:|---:|---:|---:|
| One | 237 | 22 | 204 | 11 | 9.3–13.9% |
| One or two | 386 | 60 | 303 | 23 | 15.5–21.5% |
| At least three | 697 | 427 | 199 | 71 | 61.3–71.4% |
| At least five | 457 | 322 | 91 | 44 | 70.5–80.1% |
| At least ten | 99 | 84 | 9 | 6 | 84.8–90.9% |

Rows in this table overlap; they are frequency diagnostics, not mutually exclusive bins. **303 of 502 judged mismatches (60.4%) have at most two assigned rows.** Frequent corporate/leadership/sports examples can look convincing while many weakly supported facts lower the fact-weighted total. Filtering to frequent facts would change the evaluated population, not repair the model or reproduce the paper's top-20 evaluation.

Supported facts account for 3,009 of 4,820 assigned rows (62.4%). This is a row-weighted fact-label statistic, **not sentence-assignment purity**: 344 of the 487 supported facts already carry a `mixed_evidence` flag. The audit accepts a fact when it has clear support despite additional unrelated sentences. A per-relation macro average also remains low, 45.47–53.88%, versus the fact-weighted 44.97–53.65%; that weighting choice does not explain the gap.

The intended current model itself allows incompatible names to share entities: the entity phase uses smoothed noun likelihoods without entity types, name similarity or relation evidence. [MentionRV:43](../../../src/main/java/org/ucb/generative_ie/mcmc/MentionRV.java#L43) gives every entity a positive candidate weight. The paper's NYT setup uses verbatim argument strings. Removing code defects alone therefore need not recover its entity representation or semantic precision.

Fragmentation also has a mechanical limitation: relation split/merge rejects merges when the two relations share an entity pair. This keeps that kernel reversible, so it is not itself a balance bug, but semantically duplicate clusters can require other intermediate moves to unite. The two subsidiary clusters share three latent entity pairs.

## What checked out, and what does not explain this score

- The MAP TSV contains all 8,516 source triples in their original order, with no width or multiset mismatch. Reconstructed collapsed path/noun likelihoods agree with the maximum trace entry, index 964, within 4.6×10⁻⁹. Its 256 sentence-bearing relations agree too. Every one of the 980 total scores equals the sum of its stored joint components. No wrong-MAP or truncated-TSV explanation was found.
- `ObserveProb` updates its best score and writes the TSV synchronously on a new full-joint maximum. A different observer, `RelationTriggersObserver`, still fails to update `bestProb`, so its separate `relation_triggers.txt` describes the last observed state. That bug does not affect the TSV used in this audit.
- Earlier archive bugs involving phantom mentions, stale mention indexes, destructive noun-histogram updates and a doubled noun likelihood appear fixed in the current paths. The original archive's incomplete `WorldProb.logProb()` was also repaired. Those old bugs should not be listed as though they still run unchanged.
- The current `FactRV`, explicit-beta `FactRelationMoveStep`, and relation split/merge probability calculations passed the existing focused tests; no additional substantive ratio defect was established there. The wrong-alpha trigger helper overloads remain in `ModelFunctions`, but the current production fact move explicitly supplies beta. Their identified callers are legacy test/MH code, so they do not explain this NYT run.
- Raw iteration counts are misleading. The archived config's 50,000 iterations × 50 moves imply about 2M relation and 500k entity proposals. The current run uses 1.96M relation and 40k entity proposals. Relation proposal counts are similar; entity proposals are 12.5 times fewer. These are configuration comparisons, not proof of matching kernels, convergence or the paper's exact schedule.
- Only 43 of 2,103 MAP facts are unexpressed globally. Their absence from the TSV is a real audit limitation but is too small by itself to account for the large reported discrepancy. No common gold partition exists for a meaningful recall or partition-distance score.

## Verification and next experiment

All current main and eligible test sources compile with the installed JDK using `javac --release 8`, placing newly compiled classes before the archived dependency bundle on the classpath. **26 existing focused tests pass**; see [baseline_tests.txt](code_audit/baseline_tests.txt). The new small probes then reproduce the defects. Their successful exit means the expected defect was reproduced, not that it is fixed.

Run from the sampler directory:

```sh
node scripts/audit_sampler_code.mjs
```

The [runner](../../../scripts/audit_sampler_code.mjs) compiles in a temporary directory, uses the checked-in fat JAR for dependencies, runs the tests and probes, records results under `evaluation/code_audit/`, and removes its temporary build. It does not need the missing Maven cache or change `build.sh`. The [probe sources](../../../scripts/audit-probes/) are retained for inspection. The default build script still requests the unavailable separate JARs and Java-7 source flags; the successful audit build is a separate route.

A causal follow-up should first correct and regression-test the five sampling defect families, then compare fixed-budget runs with controlled randomness and identical evaluation definitions. The relation-pool prior and verbatim-versus-latent entity model should be separate experimental choices, so their effects can be distinguished. A single patched run or a broader retrospective relation label would not establish which change improved precision. No corrected NYT rerun has been performed in this audit.
