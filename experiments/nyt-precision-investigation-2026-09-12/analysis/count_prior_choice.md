# Relation-count model: a decision, not a silent fix

No target probability is changed by this analysis. The four experimental arms retain the previous pool-dependent prior. [check_count_prior.mjs](../scripts/check_count_prior.mjs) independently sums all 4,096 labelled fact configurations for N=2, M=3 and verifies both the current count distribution and a possible normalized replacement. [Numerical output](count_prior_check.json) records the exact check and full-scale no-data calculations.

Write p(F_r) for the Beta-Bernoulli probability of a particular labelled fact set, p0=p(empty), q=1-p0, and g(K) for the implemented log-normal count factor. The current prior weight is

```
g(K) × product_r p(F_r).
```

There are choose(M,K) choices of occupied labels and total prior mass q for a nonempty fact set on each occupied label. Consequently the marginal weight for K is

```
g(K) × choose(M,K) × q^K × (1-q)^(M-K).
```

A possible **occupied-count-first** model samples K from g truncated to 1,...,M, chooses K distinct labels uniformly, and independently samples each occupied fact set conditional on being nonempty. Its state probability is proportional to

```
g(K) / choose(M,K) × product_{occupied r} [p(F_r) / q].
```

Relative to the current weight, this requires dividing by the complete Binomial(K; M,q) probability. Dividing by choose(M,K) alone is insufficient. Every affected acceptance/conditional ratio must then use the changed target. If entities change, q depends on N and must be accounted for as well.

This interpretation calls K the number of occupied relations. The paper's number of real relations could instead include real but empty relations, requiring a separate active-slot indicator. These are different models, not alternative algebra for the same model.

## The remaining effect of truncation

Even the count-first alternative does not make a finite cap completely neutral. The implemented g is broad: log-scale standard deviation 1, with its continuous untruncated mean parameter set to 200. Its mode is around 45. Truncating that broad distribution at 400 removes considerable upper-tail mass, so its mean is not 200.

| Fixed N | Pool M | q, with a=1 and b=1,199² | Current no-data mean K | Occupied-count-first mean K after truncation |
|---:|---:|---:|---:|---:|
| 1,199 | 400 | 0.5 | 199.25 | 130.58 |
| 1,199 | 800 | 0.5 | 398.90 | 167.44 |
| 1,008 | 400 | 0.41410 | 164.87 | 130.58 |
| 1,008 | 800 | 0.41410 | 330.10 | 167.44 |

These are exact finite sums for the configured density evaluated at positive integers, before conditioning on sentences. They do not predict the observed MAP counts. The table explains why replacing the factor and expecting the same preferred K is not justified. A model decision must specify what K means, its prior location and spread, and an adequate truncation policy. Merely picking whichever pool yields about 200 fitted relations would conceal these choices.
