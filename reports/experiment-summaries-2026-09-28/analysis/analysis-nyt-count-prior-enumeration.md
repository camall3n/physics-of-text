# NYT relation-count prior: exact enumeration and finite-pool sensitivity

Organization: [experiment index](../README.md) · [bug-state definitions](../BUG_CATALOG.md).

The saved calculation confirms that the 400-slot relation pool is part of the prior, not a neutral storage cap. No experimental target was changed. This is a no-data, fixed-entity-count analytic experiment; it has no MCMC seed, precision score or inference runtime budget.

## Question and model

With M relation slots, p0 the Beta-Bernoulli mass of an empty fact set, q=1−p0, and g(K) the implemented occupied-count factor, summing the labeled fact configurations gives:

P(K | N,M) proportional to g(K) choose(M,K) q^K (1−q)^(M−K).

A proposed occupied-count-first model would sample K from truncated g, choose labels uniformly and condition each occupied fact set on nonemptiness. Its correction divides the current state weight by the complete Binomial(K;M,q) probability. Dividing only by choose(M,K) is insufficient. If entity count N changes, q changes too. Counting all real relations, including empty ones, is a different model requiring active-slot state.

## Saved experiment and exact results

The small check enumerates all **4,096** labeled fact configurations at N=2, M=3, a=1, b=4, q≈0.5. Its passed flag is true. Normalized mass for K=1,2,3 is (0.655871663, 0.294851214, 0.049277123) under the current model versus (0.597031658, 0.268399321, 0.134569021) under the proposed normalized count-first model; K=0 has zero mass in this setup.

| Fixed N | M | q | Current mean K | Count-first truncated mean K |
| --- | --- | --- | --- | --- |
| 1,199 | 400 | 0.500000 | 199.249078 | 130.582065 |
| 1,199 | 800 | 0.500000 | 398.901354 | 167.441624 |
| 1,008 | 400 | 0.414101 | 164.872007 | 130.582065 |
| 1,008 | 800 | 0.414101 | 330.104064 | 167.441624 |

The full-scale sums use a=1 and b=1,199²=1,437,601. The broad log-normal factor has log-scale standard deviation 1 and continuous untruncated mean parameter 200; its mode is about 45. Truncation therefore matters even after normalization.

## Conclusion and limits

Increasing the pool roughly doubles the present prior's no-data preferred count. A 400-slot setting does not recover the paper's theoretical count model by itself. These exact no-sentence sums do not predict MAP counts conditioned on NYT text and do not compare precision. All 12 modern inference runs retain the pool-dependent target and maxRels=400. Changing it remains a separate model experiment requiring revised target ratios and tests; none was performed here.

## Evidence and cleanup dependencies

[Derivation](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/count_prior_choice.md) · [Exact numerical output](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/count_prior_check.json) · [Enumeration source](../../../experiments/nyt-precision-investigation-2026-09-12/scripts/check_count_prior.mjs). Preserve the Node script and mathematical note with the JSON; no saved random trajectory is involved.

This report summarizes existing evidence only. No calculations, simulations or tests from the experiment were rerun, no scientific outputs were rewritten, and no cleanup/deletion decision was made. Preserve the linked inputs, source, output and interpretation together; a summary cannot replace exact reproducibility artifacts.
