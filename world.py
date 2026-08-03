import numpy as np

N = 1000  # objects
K = 100  # relations
rng = np.random.default_rng(seed=42)


def sample_world(N, K, rng: np.random.Generator) -> tuple[np.ndarray, np.ndarray]:
    facts = np.zeros(shape=[K, N, N])
    sigmas = np.zeros(shape=[K])
    for k in range(K):
        p = rng.beta(1, 100)
        sigmas[k] = p
        facts[k, ...] = rng.choice([0, 1], [N, N], p=[1 - p, p])
    return sigmas, facts


def main():
    sigmas, facts = sample_world(N, K, rng)
    stats = np.mean(facts, axis=(1, 2)) / sigmas
    print("sigmas (truncated):", sigmas[:10])
    print("stats (truncated):", stats[:10])
    print("min:", np.min(stats))
    print("max:", np.max(stats))
    print("mean:", np.mean(stats))
    print("median:", np.median(stats))

    binomial_std_dev = np.sqrt(N**2 * sigmas * (1 - sigmas))
    ratio_std_dev = binomial_std_dev / N**2 / sigmas
    lower_ci = 1 - 2 * ratio_std_dev
    upper_ci = 1 + 2 * ratio_std_dev
    violations = (stats < lower_ci) | (stats > upper_ci)
    print(f"95% CI violations: {np.sum(violations)} of {len(violations)}")


main()
import seaborn as sns

sns.barplot(rng.dirichlet(np.ones((50,)) / 50))
