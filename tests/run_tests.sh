#!/usr/bin/env bash
#
# Unit-test harness for the NeetCode solution archive.
#
# The solutions under "Data Structures & Algorithms/<problem>/submission-*.java"
# were exported from the NeetCode in-browser editor: they have no `package`
# declaration and no `import` statements, and 170+ of them declare the same
# top-level `class Solution`, so they cannot be compiled together as-is.
#
# This script builds each solution-under-test into its own isolated package at
# test time (without modifying the committed source): it prepends a `package`
# line and `import java.util.*;` to a copy of the original file, drops it next
# to the hand-written JUnit test for that package (see tests/src/<pkg>/), then
# compiles and runs everything with the bundled JUnit console launcher.
#
# Usage:  tests/run_tests.sh
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
JUNIT_JAR="$SCRIPT_DIR/lib/junit-platform-console-standalone.jar"
MANIFEST="$SCRIPT_DIR/manifest.tsv"
BUILD_DIR="$SCRIPT_DIR/build"
GEN_DIR="$BUILD_DIR/gen"
CLASSES_DIR="$BUILD_DIR/classes"

if [[ ! -f "$JUNIT_JAR" ]]; then
  echo "ERROR: JUnit jar not found at $JUNIT_JAR" >&2
  exit 1
fi

rm -rf "$BUILD_DIR"
mkdir -p "$GEN_DIR" "$CLASSES_DIR"

# Generate a compilable, packaged copy of each solution-under-test.
while IFS=$'\t' read -r pkg rel || [[ -n "$pkg" ]]; do
  [[ -z "$pkg" ]] && continue
  src="$REPO_ROOT/$rel"
  if [[ ! -f "$src" ]]; then
    echo "ERROR: solution file missing: $rel" >&2
    exit 1
  fi
  dest_dir="$GEN_DIR/$pkg"
  mkdir -p "$dest_dir"
  {
    echo "package $pkg;"
    echo "import java.util.*;"
    cat "$src"
  } > "$dest_dir/Solution.java"
done < "$MANIFEST"

# Copy the committed hand-written tests alongside their generated solution.
cp -R "$SCRIPT_DIR/src/." "$GEN_DIR/"

# Compile everything.
find "$GEN_DIR" -name '*.java' > "$BUILD_DIR/sources.txt"
javac -d "$CLASSES_DIR" -cp "$JUNIT_JAR" @"$BUILD_DIR/sources.txt"

# Run the tests.
java -jar "$JUNIT_JAR" execute \
  --class-path "$CLASSES_DIR" \
  --scan-class-path \
  --details=tree \
  --disable-banner
