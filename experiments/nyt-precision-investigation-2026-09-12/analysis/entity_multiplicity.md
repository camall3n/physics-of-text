# Entity-count factorial defect: derivation and isolated correction

The entity sampler's split/merge proposals target an extra **`1/N!` penalty** on the number of entities, relative to the entity model represented by `WorldProb.logProbEntityWorld()`. This is an inherited implementation error in the count/multiplicity bookkeeping. It is independent of the already documented relation-pool prior problem.

The correction is implemented only in [variants/entity-multiplicity-fix](../variants/entity-multiplicity-fix/README.md). The original sampler, frozen baseline and `variants/controlled` remain unchanged. The two additional NYT configurations are follow-up experiments motivated by this exact counterexample and proof; they were not part of the initial eight-run comparison matrix.

## Verified provenance in the original archive import

The omission is present in the **June 2014 source archive as imported**, not merely in the recent baseline. Read-only `git show` checks used import commit `9489d21ee6797a7b4ccc71f1f46f1c27af7da31b`, whose subject is “Add archived Java code from Stuart's tar file (sampler-140626)”. Its `resources/sampler-140626/src` tree is `b309a9dbdad849d760ef8a8d3ce1075240c4490e`.

In that commit, under `resources/sampler-140626/src/main/java/org/ucb/generative_ie/`:

- `mh/EntitySmartSplitStep.java`, lines 324–326, says “this part is ignored because it will be cancelled by the proposal ratio” and comments out the `Util.logPermutation(...)` difference. The complete state ratio at lines 315–359 contains only the count prior, uniform mention-origin factor and dictionary difference; there is no compensating `log(N+1)`/`-log(N)` term. SHA-256: `df1af1629b7b50985dc107ce4b5bbbb02f25b2cd17238989d4a0f5d76e573276`.
- `mh/EntitySmartMergeStep.java`, lines 326–328, has the same omission and cancellation comment; the complete state ratio is at lines 317–361. SHA-256: `2360a8ffde344943dcb1513505d537191c5cc589d4ec0bf32c9a51c3e0c74e90`.
- `world/WorldProb.java`, lines 78–89, already includes `Util.logPermutation(numEntities, numNonEmptyEntities)` in `logProbEntityWorld()`. SHA-256: `6b5cdecd97ca92d57a4ecbf9cd1d25cf9a40e988839978530e621173f9962123`.

[Machine-readable provenance](entity_archive_provenance.json) contains all three Git blob hashes, source SHA-256 values and numbered excerpts. These hashes identify the imported source; the original tar file is not available here, so its hash is not asserted. The archive is not verified to be the exact implementation used for the 2016 paper. Other archived proposal defects were subsequently corrected: the exact invariant-density proof below applies to the current pre-investigation baseline, while this comparison establishes that the omitted count/multiplicity term itself was inherited.

## What the target should mean

Entity names such as `ent_314` are implementation identifiers, not observed proper names. An entity state can therefore be represented by:

- `N`: total available entity objects;
- a partition `B_1,...,B_K` of the `J` distinct mention positions into `K` nonempty entities;
- `E=N-K` empty entities, which are indistinguishable in this partition representation.

Define the density without label multiplicity as

\[
L(z)=g(N)N^{-J}\prod_{k=1}^{K}D(B_k),
\]

where `g(N)` is the existing entity-count log-normal factor and `D(B_k)` is the collapsed noun-dictionary likelihood. A partition with `K` nonempty blocks can be assigned to `N` labeled objects in `(N)_K=N!/(N-K)!` ways. The entity model's partition probability is therefore

\[
\pi(z)\propto L(z)\frac{N!}{E!}.
\]

This is exactly the multiplicity included by [WorldProb.java](../baseline/src/main/java/org/ucb/generative_ie/world/WorldProb.java), in `logProbEntityWorld()` and `logUnlabeledEntities()`. It also follows from the generative interpretation in which each mention selects one of `N` entities uniformly. This derivation concerns the existing entity-only phase; it does not claim that the subsequent two-phase NYT procedure is joint MCMC for the full fact model.

## What the existing kernels actually preserve

[EntitySmartSplitStep.java](../baseline/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java) and [EntitySmartMergeStep.java](../baseline/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java) omit the factorial from `logStateRatio()` at lines 329–333, claiming that it cancels with proposal terms. Their proposal methods combine the two child labelings of a split and the two orientations of a merge. After accounting for empty-object choices, their invariant partition density is instead

\[
\mu(z)\propto \frac{L(z)}{E!}=\frac{\pi(z)}{N!}.
\]

This conclusion is stronger and more precise than saying that two density functions disagree. It explains both nonempty and empty-child cases.

### Proper split: both children are nonempty

Here `N'=N+1`, `K'=K+1`, and `E'=E`. A particular pair of child blocks has one parent; the code's summed complementary allocations and merge orientations are the actual partition proposal probabilities. Its state ratio `L(z')/L(z)` is precisely `mu(z')/mu(z)` because the empty factorial is unchanged. It is missing a factor `N+1` for the stated target `pi`.

### Split that creates one empty child

Here `N'=N+1`, `K'=K`, and `E'=E+1`. For a selected nonempty parent, the reverse can merge it with **any of the `E+1` empty entities**. These are equivalent transitions on partition states, and their aggregate reverse probability is `E+1` times the probability for the individual pair used in the code's ratio.

For `mu`, the target ratio contains `1/(E+1)`. That factor cancels the `E+1` multiplicity of reverse empty-merge choices. Thus the existing acceptance formula again preserves `mu`. The same partition can be reached by creating an empty child from different parents; detailed balance holds per selected-parent channel and therefore also after summing over parents. Both-empty merges and splits of empty parents are null in both directions.

For `pi`, the target ratio is `(N+1)/(E+1)` times the `L` ratio. After the same reverse-proposal cancellation, the missing factor is again **`N+1`**, independent of `K` and of which parent was chosen.

### Why the mention Gibbs step does not repair it

`MentionRV` selects among the `N` actual entity objects using their collapsed noun predictive probabilities. At fixed `N`, its induced partition chain preserves `pi`. But `pi` and `mu=pi/N!` differ by a constant when `N` is fixed, so the Gibbs step also preserves `mu`. Combining it with the existing split/merge kernels therefore does not remove the unintended count penalty.

This also explains why simply adding `Delta log((N)_K)` to the old state ratio would be unsafe: empty objects contribute proposal multiplicities too. The correct adjustment to the **whole acceptance ratio** is the factorial ratio `N'!/N!`.

## The isolated code correction

Each smart kernel adds one term to its stored log acceptance components:

```java
rState += splitCase ? Math.log(newNumEntities) : -Math.log(numEntities);
```

For a split this adds `log(N+1)`; for a merge it subtracts `log(N)`. Null proposals remain null. The proposal distributions, dictionary parameters, entity-count prior function, observation data and relation-phase kernels are unchanged.

Locations in the isolated files:

- [EntitySmartSplitStep.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java): line 368, after the collapsed dictionary difference in `logStateRatio()`.
- [EntitySmartMergeStep.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java): line 370, the corresponding term in `logStateRatio()`.

The adjustment is stored in `logStateRatio()` for minimal code disruption. With empty entities, that component alone is not literally the full partition-density ratio; the remaining empty-object multiplicity cancels with the proposal terms as shown above. The invariant object being verified is the complete accepted transition, not an arbitrarily separated component.

## Executable evidence

1. **Small counterexample:** one noun, one sentence/two mentions; split `N=K=1` into `N=K=2`. Forward partition proposal `1/4`; reverse `1/2`. Baseline acceptance is **0.13902598**, while the stated target requires **0.27805196**. [Code](../tests/kernel-audit/EntityMultiplicityProbe.java), [output](../tests/kernel-audit/EntityMultiplicityProbe.txt).
2. **Exact seven-state projection:** two mentions, one noun, all valid `(N,K)` with `N=1..4`. Both actual split/merge proposal classes, plus the actual mention Gibbs implementation, preserve `pi/N!`. Maximum detailed-balance flow discrepancy is **0.03122** against the stated target and **1.4e-17** against the unintended target. The correction reduces the discrepancy against the stated target to **1.4e-17**. [Code](../tests/kernel-audit/EntityProjectedChainProbe.java), [output](../tests/kernel-audit/EntityProjectedChainProbe.txt).
3. **Exact 38-state partition chains:** four distinct mentions, two nouns, all 15 set partitions embedded at every permissible `N<=4`, for observed noun sequences `0011`, `0101`, and `0001`. Every parent choice, split allocation, ordered merge, mention/target Gibbs choice, empty-object case, rejection and null move is enumerated. Probability rows sum to one. The baseline preserves `pi/N!` with residual below **6.3e-17** and violates `pi` with residual as large as **0.0351**. The compiled isolated correction preserves `pi` with residual below **4.9e-17**. The independent target uses scalar rising products and directly counted mentions; it does not reuse `WorldProb` or `ModelFunctions`. [Code](../tests/kernel-audit/EntityPartitionChainProbe.java), [baseline output](../tests/kernel-audit/EntityPartitionChainProbe.txt), [actual corrected-class output](../tests/kernel-audit/EntityPartitionChainProbe-fixed.txt).
4. **Regression and replay:** the assembled controlled variant passes **91 JUnit tests**: the previous 85 tests, five control/reproducibility tests, and the new exact partition-target test. One previous assertion comparing the isolated `logStateRatio()` component to the labeled density difference is updated to include the intentional factorial term; proposal-probability and reversal assertions are retained. Two latent-mode and two frozen-mode toy runs in independent JVMs replay byte-for-byte for the recorded outputs. [Latest validation pointer](../tests/latest_entity_variant_test.txt).

The finite tests reject moves beyond `N=4` to make the oracle state space complete. That is a symmetric truncation used only in the test harness; no cap of four exists in the experiment. Tests with two nouns are necessary because one-noun dictionary likelihoods all equal one and cannot exercise the nonuniform smart selection weights.

## Why this could matter for NYT precision

Under the unintended target, increasing the entity count from `N` to `N+1` incurs an additional prior penalty `1/(N+1)`. Around a thousand entities this is a log penalty near **6.9 per added entity**, even before the intended count prior, uniform mention-origin likelihood and dictionary likelihood are considered. The correction therefore increases the pre-clipping split acceptance ratio by roughly a thousand and decreases the corresponding merge ratio by that factor at that count. Actual acceptance probabilities are clipped at one, so their observed changes need not equal this multiplier.

Favoring too few entities can merge distinct people or organizations with similar observed names. That can contaminate relation evidence through the shared latent entity pairs. This is a plausible route to precision loss, but it does not establish that this bug explains the difference from the paper’s reported precision. Relation semantics, incomplete textual evidence, prior/model differences and finite-run mixing remain separate issues.

The two completed follow-up NYT runs preserve the latent entity phase, `beta=0.1`, `maxRels=400`, both recorded seeds, and the original 40,000 entity plus 1,960,000 relation proposal budget. Only this acceptance correction distinguishes them from their paired controlled latent runs. [Completed experiment results and manual assessments](experiment_results.md) show that the correction **does not restore high precision within this budget**:

| Seed | Available entities, baseline → corrected | Weighted precision estimate, corrected | Top-20 fact population, corrected |
|---|---:|---:|---:|
| 20260912 | 1045 → 1180 | 46.1%–52.1% | 1184 |
| 20260913 | 1026 → 1161 | 37.3%–43.7% | 1197 |

Each estimate uses 100 manually reviewed facts, five from each of the run's top 20 relations, weighted by the complete relation fact counts. Endpoints count ambiguous cases as incorrect or correct; they are not confidence intervals. The baseline grades were retired because this confirmed defect was active. Corrected estimates remain conditional on sampled cases, relation populations and selected predicate scopes; convergence was not established. These results do not prove that a correct stationary target intrinsically harms precision. They do show that this genuine arithmetic correction alone is not an explanation that recovers the paper's 95% claim under the tested configuration and search budget.
