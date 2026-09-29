# Input data diagnostics

The unchanged input contains 8516 rows, 1199 literal names, 4276 distinct path strings and 920 ordered name pairs. All experiment arms use its identical SHA-256.

30 rows (0.352%) contain appended lex#/pos#/lc#/rc# metadata inside depPath, creating 30 contaminated path categories. The baseline CorpusParser.load simply passes this whole field to new Trigger(t.depPath); this is inherited input contamination, not a change introduced by the research runner. The exact rows are saved in [corpus_audit.json](corpus_audit.json). Rare-category changes can affect a stochastic trajectory; this input inventory alone does not quantify their semantic-precision effect. Removing them would be a separately named data-processing experiment; none were removed here. The JSON also records 30 failures of a simple three-part path-shape check. That syntactic diagnostic is not a semantic parser or a proof every remaining path is correct.

There are 7732 distinct (source,destination,path) triples and 784 repetitions beyond the first occurrence. The most repeated examples are recorded for inspection. Repeated observed triples may represent different original sentences and should not be deduplicated automatically. The provided JSON does not retain complete original sentences or article dates, which limits negation, historical identity and modifier-scope adjudication.

Run node scripts/audit_corpus.mjs to reproduce. No data or parser was modified.
