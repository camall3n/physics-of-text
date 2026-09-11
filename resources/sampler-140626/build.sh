#!/usr/bin/env bash
# Build, test and run the sampler without Maven, using the dependency jars that are
# already in the local Maven cache (versions as in pom.xml). Maven itself is not needed
# and the jahmm repository referenced by pom.xml is dead; jahmm is only used by HMMTest.
#
#   ./build.sh                 compile main and test sources into target-javac/
#   ./build.sh test [Class...] run JUnit test classes (default: WorldProbTest)
#   ./build.sh run Class args  run a main class, e.g.
#   ./build.sh run org.ucb.generative_ie.experiments.EntityResolution \
#        test/Entity_resolution_Relation/config-toy.json data/06-19/toyTriples.json
set -euo pipefail
cd "$(dirname "$0")"

M=${M2_REPO:-$HOME/.m2/repository}
CP=$(ls \
  "$M"/com/google/guava/guava/14.0.1/guava-14.0.1.jar \
  "$M"/com/google/code/gson/gson/2.2.4/gson-2.2.4.jar \
  "$M"/net/sourceforge/parallelcolt/parallelcolt/0.10.0/parallelcolt-0.10.0.jar \
  "$M"/org/apache/commons/commons-math3/3.2/commons-math3-3.2.jar \
  "$M"/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar \
  "$M"/ch/qos/logback/logback-classic/1.0.13/logback-classic-1.0.13.jar \
  "$M"/ch/qos/logback/logback-core/1.0.13/logback-core-1.0.13.jar \
  "$M"/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.jar \
  "$M"/junit/junit/4.11/junit-4.11.jar \
  "$M"/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar \
  "$M"/com/carrotsearch/junit-benchmarks/0.7.0/junit-benchmarks-0.7.0.jar \
  | tr '\n' ':')

OUT=target-javac
mkdir -p "$OUT/classes" "$OUT/test-classes"
javac -nowarn -source 1.7 -target 1.7 -cp "$CP" -d "$OUT/classes" $(find src/main/java -name '*.java')
cp src/main/resources/logback.xml "$OUT/classes/"
# Tests that need jahmm (dead repository) are skipped.
javac -nowarn -source 1.7 -target 1.7 -cp "$CP:$OUT/classes" -d "$OUT/test-classes" \
  $(find src/test/java -name '*.java' | grep -v -e HMMTest -e MathTest -e LoggerTest -e BernoulliExperimentTest -e DpmSuite)

case "${1:-}" in
  test) shift
        java -cp "$CP:$OUT/classes:$OUT/test-classes" org.junit.runner.JUnitCore \
          "${@:-org.ucb.generative_ie.world.WorldProbTest}" ;;
  run)  shift
        java -cp "$CP:$OUT/classes" "$@" ;;
  "")   echo "compiled into $OUT/" ;;
  *)    echo "unknown command: $1" >&2; exit 2 ;;
esac
