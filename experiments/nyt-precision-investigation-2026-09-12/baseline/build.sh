#!/usr/bin/env bash
# Build, test and run the current sampler without Maven or downloads. Prefer the
# exact dependency versions in the local Maven cache; otherwise use the archived
# fat JAR as a dependency bundle, with current classes first on the classpath.
# The jahmm repository referenced by pom.xml is dead; its tests remain excluded.
#
#   ./build.sh                 compile main and test sources into target-javac/
#   ./build.sh test [Class...] run JUnit test classes (default: WorldProbTest)
#   ./build.sh run Class args  run a main class, e.g.
#   ./build.sh run org.ucb.generative_ie.experiments.EntityResolution \
#        test/Entity_resolution_Relation/config-toy.json data/06-19/toyTriples.json
set -euo pipefail
cd "$(dirname "$0")"

maven_repo=${M2_REPO:-$HOME/.m2/repository}
dependency_jars=(
  "$maven_repo/com/google/guava/guava/14.0.1/guava-14.0.1.jar"
  "$maven_repo/com/google/code/gson/gson/2.2.4/gson-2.2.4.jar"
  "$maven_repo/net/sourceforge/parallelcolt/parallelcolt/0.10.0/parallelcolt-0.10.0.jar"
  "$maven_repo/org/apache/commons/commons-math3/3.2/commons-math3-3.2.jar"
  "$maven_repo/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar"
  "$maven_repo/ch/qos/logback/logback-classic/1.0.13/logback-classic-1.0.13.jar"
  "$maven_repo/ch/qos/logback/logback-core/1.0.13/logback-core-1.0.13.jar"
  "$maven_repo/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.jar"
  "$maven_repo/junit/junit/4.11/junit-4.11.jar"
  "$maven_repo/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar"
  "$maven_repo/com/carrotsearch/junit-benchmarks/0.7.0/junit-benchmarks-0.7.0.jar"
)
missing_jars=()
for dependency in "${dependency_jars[@]}"; do
  if [[ ! -f "$dependency" ]]; then missing_jars+=("$dependency"); fi
done
if [[ ${#missing_jars[@]} -eq 0 ]]; then
  dependency_cp=$(IFS=:; echo "${dependency_jars[*]}")
else
  dependency_cp=target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar
  if [[ ! -f "$dependency_cp" ]]; then
    echo "Dependency bundle is absent and these local Maven jars are missing:" >&2
    printf '%s\n' "${missing_jars[@]}" >&2
    exit 1
  fi
  echo "Using bundled dependencies: $dependency_cp"
fi

# JDK 9+ can also enforce the Java 8 API surface. JDK 8 uses source/target flags.
javac_help=$(javac -help 2>&1)
case "$javac_help" in
  *--release*) java_flags=(--release 8) ;;
  *) java_flags=(-source 1.8 -target 1.8) ;;
esac

OUT=target-javac
# Remove only this script's compiled outputs so deleted classes cannot linger.
rm -rf "$OUT/classes" "$OUT/test-classes"
mkdir -p "$OUT/classes" "$OUT/test-classes"
main_sources=()
while IFS= read -r -d '' source; do
  main_sources+=("$source")
done < <(find src/main/java -name '*.java' -print0)
javac -nowarn "${java_flags[@]}" -cp "$OUT/classes:$dependency_cp" \
  -d "$OUT/classes" "${main_sources[@]}"
cp src/main/resources/logback.xml "$OUT/classes/"
# Preserve the legacy test exclusions, including tests requiring jahmm.
test_sources=()
while IFS= read -r -d '' source; do
  case "$source" in
    *HMMTest*|*MathTest*|*LoggerTest*|*BernoulliExperimentTest*|*DpmSuite*) ;;
    *) test_sources+=("$source") ;;
  esac
done < <(find src/test/java -name '*.java' -print0)
javac -nowarn "${java_flags[@]}" -cp "$OUT/classes:$OUT/test-classes:$dependency_cp" \
  -d "$OUT/test-classes" "${test_sources[@]}"

case "${1:-}" in
  test) shift
        if [[ $# -eq 0 ]]; then set -- org.ucb.generative_ie.world.WorldProbTest; fi
        java -cp "$OUT/classes:$OUT/test-classes:$dependency_cp" org.junit.runner.JUnitCore "$@" ;;
  run)  shift
        java -cp "$OUT/classes:$dependency_cp" "$@" ;;
  "")   echo "compiled into $OUT/" ;;
  *)    echo "unknown command: $1" >&2; exit 2 ;;
esac
