# NYT kernel audit, 12 September 2026

All new source, tests, binaries and logs for this audit are inside this investigation directory. `baseline/src` is the read-only snapshot of the sampler after the earlier five sampling fixes. The original sampler and saved outputs were not modified.

## Findings and their status

| Finding | Classification | Status |
|---|---|---|
| Fact birth/death, sentence-origin conditionals, fact/relation moves and relation split/merge agree with independent small-state oracles | Negative audit result with bounded coverage | No new arithmetic defect identified in these tested active relation kernels |
| The relation moves usually transport all sentences reporting one fact together; separating meanings for one entity pair requires another fact for that pair | Mixing limitation, not an incorrect MH ratio | Added an optional, reversible sentence/relation bridge in the isolated variant |
| Entity smart split/merge introduce an extra `1/N!` entity-count penalty while reporting proposal probabilities aggregated over child labels | Inherited entity-phase target mismatch | Corrected and exhaustively tested only in `variants/entity-multiplicity-fix`; [full derivation](entity_multiplicity.md) |

These results do not establish that the sampler reaches equilibrium at NYT scale, that its target represents the intended paper model, or that semantic precision is high. Correct MCMC arithmetic can sample a poorly specified posterior or mix too slowly to be useful.

## Independent active-kernel tests

Run from the repository root:

```sh
node experiments/nyt-precision-investigation-2026-09-12/tests/kernel-audit/run.mjs
```

The runner compiles the frozen baseline plus the new bridge into `tests/kernel-audit/classes`. It uses the archived fat JAR only as a dependency bundle, after the freshly compiled classes on the classpath. It does not rebuild or overwrite the original sampler.

The independent density oracle in [KernelAuditProbe.java](../tests/kernel-audit/KernelAuditProbe.java) deliberately avoids both `WorldProb` and `ModelFunctions`. It recomputes histograms directly from sentence origins. For a dictionary it uses products of scalar predictive factors:

\[
\log p(x_{1:n}\mid a,V)=\sum_v\sum_{i=0}^{n_v-1}\log(a+i)-\sum_{i=0}^{n-1}\log(aV+i).
\]

For a labeled fact set with `n` true facts among `P` possible facts and Beta sparsity, it uses

\[
\log p(F_r)=\log(a)_n+\log(b)_{P-n}-\log(a+b)_P,
\]

where `(a)_n` is a rising factorial. Uniform sentence origins contribute `-S log F`. The relation-count factor is calculated directly from the scalar log-normal expression. Entity count is fixed in these tests, so its factor cancels. No binomial coefficient is added to a particular labeled fact set.

Completed coverage:

- **1,020 fact worlds and 7,650 toggles:** every nonempty subset of the eight possible facts for two entities and two relation slots, both fixed and Beta sparsity, with and without observed sentences. Fact conditionals and birth/death detailed balance agree with the oracle. Includes shared entity pairs across relations, self-entity pairs, unreferenced facts, and moves into or out of empty relation slots.
- **512 complete-fact worlds and 9,216 sentence alternatives:** every assignment of three sentences to eight facts. Both entity arguments and relation conditionals agree with the independently recomputed density. Includes repeated nouns and source/destination referring to the same entity.
- **324 fact/relation moves and 144 relation splits plus their reverses:** all assignments of three distinct entity pairs to three slots, both sparsity models. Proposal symmetry and joint ratios agree; the original state is restored exactly.
- **2.4 million actual split/merge draws:** each of the two relation kernels ran for 1.2 million retained steps on the complete 27-state three-fact/three-slot partition space after a 10,000-step warmup. Total variation from the exact normalized posterior was **0.002297** for dumb split/smart merge and **0.004577** for smart split/dumb merge. This is a seeded stationary-distribution smoke test, not an IID confidence interval or a proof of rapid mixing on larger corpora.
- Cached fact, sentence, relation, noun, trigger and mention indexes were repeatedly checked against raw iteration. The deterministic checks totaled **70,266**, with largest floating-point discrepancy approximately **9.8e-15**.

Exact output: [KernelAuditProbe.txt](../tests/kernel-audit/KernelAuditProbe.txt).

## Added sentence/relation bridge: the same posterior, an additional proposal

Source: [SentenceRelationBirthDeathMove.java](../variants/controlled/src/main/java/org/ucb/generative_ie/mcmc/SentenceRelationBirthDeathMove.java). The controlled runner enables it with `sentenceRelationMoveWeight`; zero preserves the baseline move mixture. A positive weight changes the computational schedule, not a model parameter. At a fixed total move budget, adding weight also reduces the fraction of proposals allocated to the existing kernels, so comparisons must document both weight and total budget.

The baseline has a real accessibility limitation. `FactRelationMoveStep` and `RelationSplitMergeStep` carry a fact's entire sentence bundle. `SentenceOriginRV` can move one sentence only to a fact that already exists. If two different predicates concern the same entity pair, creating their second relation/fact by `FactBirthDeathStep` requires hitting one of `N² M` potential facts. This is mathematically possible but may be rare in a finite run. It is a mixing issue, not evidence that the existing acceptance formula is wrong.

The added move chooses a sentence `s` uniformly and a relation slot `r'` uniformly:

1. Return a null move if `r'` is the sentence's current relation.
2. Let `f'=(r',e_1(s),e_2(s))`. If `f'` exists but has no sentence references, return a null move.
3. Create `f'` if absent and move only `s` to it.
4. Delete the old fact only if `s` was its final reference.

The important restriction in step 2 preserves all pre-existing unreferenced facts. Without that restriction, consuming an unreferenced target and then reversing could delete that fact, failing to restore the original world. Reversibility would then require a richer proposal with additional choices and corrections.

For every allowed move, selecting the same sentence and its old relation exactly restores the original state. The forward and reverse selection probabilities are both `1/(SM)`, including both directions' null-choice possibilities. Therefore

\[
A(w\to w')=\min\{1,\pi(w')/\pi(w)\}.
\]

Let `c` indicate that the target fact is created, `d` indicate that the source fact is deleted, and `F'=F+c-d`. Only two trigger histograms, two fact-count terms, the occupied-relation count, and the uniform origin term change:

\[
\begin{aligned}
\Delta\log\pi={}&\Delta\log p(T_r)+\Delta\log p(T_{r'})\\
&+\ell(n_r-d)-\ell(n_r)+\ell(n_{r'}+c)-\ell(n_{r'})\\
&+\log g(K')-\log g(K)-S\log(F'/F),
\end{aligned}
\]

where `ell(n)` is the existing per-relation fact-set log probability and `g(K)` is the existing relation-count factor. Noun assignments and noun likelihoods stay constant. This move does **not** repair the previously documented pool-size prior or the entity model.

[SentenceRelationBridgeProbe.java](../tests/kernel-audit/SentenceRelationBridgeProbe.java) exhaustively tests **9,216** two-sentence states across both sparsity models, plus two three-sentence fixtures needed for the case where source and target facts both remain referenced. It checks direct-oracle and `WorldProb` ratios, exact reversal, pairwise detailed balance, unchanged unreferenced facts, and cached indexes. Full transition probabilities—including null choices and rejected proposals—sum to one in every enumerated state. It also checks **8,192** proposals targeting unreferenced facts are rejected without mutation. Exact output and counts: [SentenceRelationBridgeProbe.txt](../tests/kernel-audit/SentenceRelationBridgeProbe.txt).

## Confirmed entity multiplicity counterexample and isolated follow-up fix

Relevant frozen sources:

- [EntitySmartSplitStep.java](../baseline/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java), lines 320–331 omit the permutation factor; lines 373–401 combine complementary split allocations and merge orientations.
- [EntitySmartMergeStep.java](../baseline/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java), lines 322–333 omit the same factor; its proposal calculation also treats child labelings as the same partition.
- [WorldProb.java](../baseline/src/main/java/org/ucb/generative_ie/world/WorldProb.java), lines 118–119 and 176–180 include `N!/(N-K)!` in the stated unlabeled entity-world density.

Here `N` is the number of entity objects, `K` is the number occupied by mentions, and `J` is the number of mentions. For an unlabeled partition the stated model assigns mass proportional to

\[
p(N)\,N^{-J}\,\frac{N!}{(N-K)!}\prod_k p(\text{nouns in block }k).
\]

The existing smart kernels compute their state ratio without the factorial term. Their source comment claims it cancels with proposal bookkeeping. The simplest concrete case shows that it does not cancel in their reported partition proposal probabilities:

- One sentence has two mentions, with a vocabulary containing just one noun. Both initially name the same entity: `N=K=1`.
- Split the mentions into two nonempty singleton entities: `N=K=2`.
- Every dictionary likelihood equals one. The smart-split branch is selected with probability `1/2`; the two complementary proper allocations each have probability `1/4`. Thus the forward partition proposal has probability `1/4`.
- In the split state, the dumb-merge branch is selected with probability `1/2` and the only unordered entity pair is selected with probability one. The reverse partition proposal is `1/2`.
- The code correctly reports the aggregate proposal ratio `2`, but reports a target ratio `p(2)/(4 p(1))`. The stated unlabeled target ratio is `p(2)/(2 p(1))`. Its **factor of two is missing** from the acceptance ratio.

[EntityMultiplicityProbe.java](../tests/kernel-audit/EntityMultiplicityProbe.java) forces precisely that split using the actual baseline proposal object and confirms the missing `log(2)`. [EntityMultiplicityProbe.txt](../tests/kernel-audit/EntityMultiplicityProbe.txt) records its acceptance probabilities. This probe exits successfully when it reproduces the documented baseline discrepancy; it does not run the separate corrected variant.

Simply declaring the objects to be labeled does not establish correctness: splits create fresh, monotonically increasing identifiers, so a merge followed by a split does not restore the same labeled state, and the code deliberately sums child-label orientations as equivalent partitions. `MentionRV`, meanwhile, draws among actual entity objects, whose multiplicities affect the induced partition probabilities.

The follow-up [entity multiplicity derivation](entity_multiplicity.md) now completes that analysis, including empty objects. The old combined kernel preserves `pi_partition/N!`; restoring `pi_partition` requires adding `log(N+1)` for every split and subtracting `log(N)` for every merge. A naïve addition of only the falling-factorial target term would mishandle empty-object proposal multiplicities. The fix is isolated in [its own complete variant](../variants/entity-multiplicity-fix/README.md), with exact seven-state and 38-state partition-chain checks, unequal noun observations, 91 passing regressions, and independent-JVM replay. [Original archive provenance](entity_archive_provenance.json) verifies that the omission was inherited. The [two completed NYT follow-ups](experiment_results.md) retain their evaluations; the defective baseline evaluations were retired. Their results do not restore the paper's high precision within the retained budget. This does not prove intrinsic harm from the correction: the sampled relation populations and predicate scopes differ, and convergence was not established.

## Limits of this audit

The sampled relation kernels retain the baseline fact-world target, including its pool-size dependence and its uniform choice of origin from true facts. The target itself may encourage correlations that differ from human relation semantics. This audit did not infer causal precision improvements from likelihood increases, did not assert that one MAP sample has converged, and did not tune semantic labels to make an experimental condition look better.
