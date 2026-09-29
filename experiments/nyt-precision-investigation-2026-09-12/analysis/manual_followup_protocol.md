# Entity multiplicity follow-up

After the initial eight-run design, exact transition-matrix audits identified an unintended 1/N! factor in the entity partition target. The separate entity-multiplicity-fix variant adds log(N+1) to split proposal corrections and subtracts log(N) from merge corrections. See entity_multiplicity.md for derivation.

Run both original latent beta=0.1 configurations with identical seeds 20260912 and 20260913 and all other parameters unchanged. This is a follow-up to a newly found implementation defect, not part of the original preregistered matrix. It leaves all original and controlled outputs intact.

Use the unchanged manual_protocol.md: five deterministically sampled facts from each of the 20 most frequent relations, blind audit IDs, one declared predicate per relation, supported/incorrect/ambiguous judgments with source lines and specific ambiguity questions. Weight each stratum by its full number of distinct latent facts. Do not equate a 100-fact screening estimate or its ambiguity range with the prior full census or with a confidence interval.
