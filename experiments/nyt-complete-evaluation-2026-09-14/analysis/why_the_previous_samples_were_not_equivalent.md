# Why the earlier five-case samples were insufficient

The early baseline evaluations were retired because confirmed sampler defects were active. The September 12 investigation and September 14 follow-up instead selected five facts per relation: 100 facts per run. This was an assistant-chosen screening shortcut, not a condition imposed by the paper, the sampler, or the user.

The later reports disclosed their sample sizes and used a stratified estimator that weighted each relation by its full population. That estimator can estimate the same operational precision quantity, but it does not provide the same evaluation coverage. Five cases can miss substantial contamination, and giving each relation five reviews can make the raw supported count differ from the fact-weighted estimate. The ambiguity endpoints alone also do not express the sample's statistical uncertainty.

Calling those screens a continuation of the earlier assessment without first agreeing to the reduction in coverage was a protocol change. It was especially inadequate for deciding whether a high-scoring setting approached the paper's reported precision, or for allowing inspection of each fact. No scientific requirement justified limiting review to five cases.

The new evaluation restores the full top-20 census for every retained comparable run. It also records common predicate scopes, puts individual judgments directly beside their evidence, preserves retained-run annotations, and provides explicit user corrections. Retained screen results remain historical artifacts rather than being silently replaced or relabeled as complete evaluations.
