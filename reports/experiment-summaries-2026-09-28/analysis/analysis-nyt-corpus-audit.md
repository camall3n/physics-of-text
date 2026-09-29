# Unchanged NYT input: corpus and dependency-path diagnostics

Organization: [experiment index](../README.md) · [bug-state definitions](../BUG_CATALOG.md).

The saved read-only corpus audit describes the common input to the modern controlled experiments. It did not clean data, remove rows, rerun inference or assess semantic precision.

| Corpus quantity | Saved result |
| --- | --- |
| Input rows | 8,516 |
| Literal name vocabulary | 1,199 |
| Distinct dependency paths | 4,276 |
| Ordered literal name pairs | 920 |
| Distinct source/destination/path triples | 7,732 |
| Repetitions beyond first occurrence | 784 |
| Paths contaminated by appended lex#/pos#/lc#/rc# metadata | 30 rows / 30 categories (0.352%) |
| Simple three-part path-shape failures | 30 |

## Method, findings and limits

The diagnostic counts literal strings and exact triples in the archived JSON, without alias normalization or semantic labels. CorpusParser.load passes the entire depPath field to a Trigger, so appended metadata becomes part of an observed category. This contamination is inherited input behavior, not a runner change. Thirty malformed rows are too few to directly explain a roughly 40-point precision gap, although stochastic trajectories can change after even small input edits. The syntactic shape test is not a semantic parser or proof every other path is valid.

Exact repeated triples can represent different original sentences. They contribute likelihood and row-based relation ranking; they must not be equated automatically with duplicated source documents. The JSON lacks complete sentences and article dates, limiting negation, attachment, historical identity and modifier judgments. This audit has no random seed, MCMC proposal budget, held-out split, fact-precision denominator or convergence result.

## Role in comparisons

All 12 modern runs use this identical full corpus with SHA-256 f34202952d36e2a0fc36dd7466d51be4c24fe36661a8100625dc373b9213161c. The later complete evaluation confirms input triples in the same row order across its 14 full-NYT MAP exports. Corpus cleaning would be a separately named data-processing experiment; no such change is part of these results.

## Evidence and cleanup dependencies

[Audit narrative](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/corpus_audit.md) · [Exact rows and counts](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/corpus_audit.json) · [Audit script](../../../experiments/nyt-precision-investigation-2026-09-12/scripts/audit_corpus.mjs) · [Input JSON](../../../resources/sampler-140626/data/Umass-sub-corpus/pluieTriples_2013_01_06_5.json) · [Cross-run equivalence](../../../experiments/nyt-complete-evaluation-2026-09-14/analysis/corpus_equivalence.json). Preserve the original corpus and parser/source hashes, exact anomalous-row list and audit script; cleaned data would not reproduce the saved trajectories.

This report summarizes existing evidence only. No calculations, simulations or tests from the experiment were rerun, no scientific outputs were rewritten, and no cleanup/deletion decision was made. Preserve the linked inputs, source, output and interpretation together; a summary cannot replace exact reproducibility artifacts.
