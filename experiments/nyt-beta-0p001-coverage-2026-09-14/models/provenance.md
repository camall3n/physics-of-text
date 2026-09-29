# Saved source verification and reproduction

[audit_saved_models.mjs](audit_saved_models.mjs) independently reads the four historical run configurations, `run.json` records, source archives, per-file source manifests, dependencies and all saved output checksums. It writes only [provenance.json](provenance.json) in this new folder. It does not compile code, execute inference, or modify earlier files.

To repeat this bounded inspection from the repository root:

```sh
node experiments/nyt-beta-0p001-coverage-2026-09-14/models/audit_saved_models.mjs
```

All checks passed. Each fixed-name archive contains the 153 source-tree files in its saved manifest, including 104 main Java files; each corrected latent archive contains 156 source-tree files, also 104 main Java files. macOS AppleDouble `._` archive metadata entries are separately counted and excluded from source comparisons. Every historical manifest source file also matches the currently linked variant file. All 176 recorded output hashes per fixed-name run and 179 per latent run match, including saved runtime class files. The archive container hashes match their recorded run manifests. The run configs agree exactly with their actual `run.json.config` values.

Only the following main Java source files differ between the two families:

| Source under `src/main/java/org/ucb/generative_ie/` | Fixed-name SHA-256 | Corrected latent SHA-256 |
|---|---|---|
| `mh/EntitySmartSplitStep.java` | `2f74c822bb45bc76f0c2fbb8a008b9367536a1aa4fe67f295aa70428ca094cd6` | `8b4b068d54166001c65b9b0054ab77d14f51e6ad1f90d6023975f45caab42c3f` |
| `mh/EntitySmartMergeStep.java` | `5dea19f869da470d9430c9f56f131b30bf77a1e1111ac3a74025f89f3b2c0c39` | `04ae30ada816f826fbae3fd99f37a972fd92de89a41b48dc05f26635408e96f7` |

The difference is the entity factorial acceptance correction and its explanatory comments. The source snapshots also contain different test sets for that correction. In particular, identical relation-phase production source was used for all four saved runs.

## Artifact hashes

| Model / seed suffix | Configuration SHA-256 | Per-file source-manifest SHA-256 |
|---|---|---|
| Fixed / 12 | `3d7e3533221fa7f09e05773b8eeab3bd672deb5cb949dcd16d6c5fa236626471` | `ebabae46375f5fd0e4a2161f19b56b157a4136683c8c37c30fdf5ccd33ce1fb5` |
| Fixed / 13 | `b9f4a78f21ac64e6f41c29fa09a1222de5d72652ba379b8680987416798f2a40` | `ebabae46375f5fd0e4a2161f19b56b157a4136683c8c37c30fdf5ccd33ce1fb5` |
| Latent / 12 | `5a4d0d395541e87d3e0be216fb960330de017ac030ba6a0572214da70097c9a1` | `98d6ff0b884cd6d596980ce9b95276c714a8e5f23a13430dca4a6a37da60c541` |
| Latent / 13 | `fce2a3ad944f092ca6fae4a65b9165aa5221d187ddf6c07e6674e27affc49f10` | `98d6ff0b884cd6d596980ce9b95276c714a8e5f23a13430dca4a6a37da60c541` |

| Model / seed suffix | `source_snapshot.tar.gz` SHA-256 | Evaluated `map_world_sentences.tsv` SHA-256 |
|---|---|---|
| Fixed / 12 | `f6763247bf3067f2042e20134133fc978c5aeb2d61242a4ad537a256901fdded` | `5fab808b6778c75611496d57bf58fc2c881dd7c33413b97052507b29ffacf89a` |
| Fixed / 13 | `bf1809fd02dda7de73b34df5f149eb934df82cf4ac59d5dd0de24ef60ed20af7` | `b6db21de59c94f2892766f29f6a34119694b6235c4001f33daf657b3aae10fea` |
| Latent / 12 | `f8bc05d96efe88a37e48e17795abf2284937938246c75f1f770cb937e24523d4` | `23bc536bced899125a6a30a82c93e7f273adf0fc22b9f6f3bca2bbcec9d019af` |
| Latent / 13 | `f8bc05d96efe88a37e48e17795abf2284937938246c75f1f770cb937e24523d4` | `5c8d613f28271af9b2b11495340a5ba8fac04f8e0c744cb84faadd7a857170f4` |

Archive containers may differ despite identical per-file sources because archive metadata differs. The per-file check is therefore essential. Full hashes for the logs, summaries, MAP descriptions, initial/post-entity/final TSVs, source files and config comparisons are in the JSON.

All four runs use:

- Corpus: [pluieTriples_2013_01_06_5.json](../../../resources/sampler-140626/data/Umass-sub-corpus/pluieTriples_2013_01_06_5.json), SHA-256 `f34202952d36e2a0fc36dd7466d51be4c24fe36661a8100625dc373b9213161c`.
- Dependency jar: [generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar](../../../resources/sampler-140626/target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar), SHA-256 `66d396ff7a5bce7df7c3d0637377693be218e077b483df0f0335454b1f586242`.
- Java: OpenJDK Temurin 25.0.4.1+1 LTS; compiler `javac 25.0.4.1` in the build records.
- Main class: `org.ucb.generative_ie.experiments.ControlledNYT`, with assertions enabled, `-Xmx4g`, saved per-run `runtime_classes` **before** the dependency jar on the classpath.

The MAP score header was checked against the maximum of the complete 980-observation `logprobs.txt` trajectory. Every MAP TSV observed argument/path field agrees, in row order, with its corpus row. This preserves repeated rows and verifies that coverage uses the same 8,516-row denominator in all four models.

## How to reproduce inference without changing an old run

The precise original invocation, absolute paths, Java version, dependency hash and full parameters are recorded in each linked run manifest in [fixed_name.md](fixed_name.md) or [latent_entity.md](latent_entity.md). The source archive, saved runtime classes and `build.json` are in that same directory. Historical wrappers are [run_experiment.mjs](../../nyt-precision-investigation-2026-09-12/scripts/run_experiment.mjs) for the controlled variant and [run_entity_experiment.mjs](../../nyt-latent-low-smoothing-2026-09-14/scripts/run_entity_experiment.mjs) for the corrected latent variant.

A new reproduction must choose a fresh output directory. The recorded command can be replayed using its saved config/corpus/runtime-class paths, replacing **only the final output-directory argument and working directory** with that new directory. `ControlledNYT` requires an explicit seed and refuses to replace an output containing `initial_world_sentences.tsv`. The wrappers also refuse an existing output folder and snapshot compiled classes before starting Java, preventing later builds from changing a running experiment.

For rebuilding rather than using saved classes, extract the chosen source snapshot into a new isolated location, verify every source hash against `source_sha256.json`, and reproduce the recorded compiler/dependency classpath. The historical [controlled build script](../../nyt-precision-investigation-2026-09-12/scripts/build_controlled.mjs) and [entity-variant build script](../../nyt-latent-low-smoothing-2026-09-14/scripts/build_entity_variant.mjs) show the exact build procedure. They target their own research directories; copy/adapt wrappers into a new reproduction directory rather than overwriting a historical build. The current coverage task deliberately performs no such new inference.

## Scope of the source review

The mathematical documentation was checked against executable methods rather than relying only on comments: `ControlledNYT.main`, `SentenceEvidence.evidenceToWorldByNoun`, `EntityInferSteps.RandomIterator`, `WorldInferSteps.RandomIterator`, `MCMCInferer.next`, `ObserveProb.observe`, `WorldProb`'s full/entity-only/count/fact/dictionary terms, `MentionRV.sample`, `SentenceOriginRV`'s conditionals, `FactBirthDeathStep`, `FactRelationMoveStep`, and `RelationSplitMergeStep`.

This is bounded verification of the saved models and confirmed repairs. Source identity and passing historical regression tests do not certify the absence of every other implementation issue. Nor does this inspection establish that the archive was the exact code/data run used for the paper, which does not fully specify all numeric and procedural choices used in this reproduction.
