# Unit tests for the NeetCode solution archive

This repository is an auto-synced archive of NeetCode submissions. Each solution
lives at `Data Structures & Algorithms/<problem>/submission-*.java` and was
exported straight from the NeetCode in-browser editor, which means:

- there is **no build system, no package structure, and no tests**;
- the files have **no `import` statements** (they rely on the editor's implicit
  imports), so they do not compile on their own;
- 170+ files declare the same top-level **`class Solution`**, so they cannot be
  put on one classpath together.

Because nothing was previously tested, effective coverage across every solution
was **0%**. This directory establishes a lightweight harness and adds unit tests
for a first batch of self-contained, pure-function solutions.

## Running

```bash
tests/run_tests.sh
```

Requires a JDK (17+). No network access is needed — the JUnit 5 console launcher
is vendored in `tests/lib/`.

## How it works

`run_tests.sh` builds each solution-under-test into its own isolated Java
package **at test time**, without editing the committed source:

1. it reads `manifest.tsv` (`package<TAB>path-to-submission`);
2. for each entry it copies the original solution into `build/gen/<package>/`,
   prepending a `package` line and `import java.util.*;` so it compiles;
3. it copies the hand-written tests from `src/<package>/` next to it;
4. it compiles everything and runs it with the JUnit console launcher.

The committed submission files are never modified, so the tests always exercise
the real solution source.

## Adding tests for another solution

1. Pick a package name, e.g. `sol_<problem_with_underscores>`.
2. Add a line to `manifest.tsv`:
   `sol_my_problem<TAB>Data Structures & Algorithms/my-problem/submission-0.java`
3. Create `src/sol_my_problem/MyProblemTest.java` with
   `package sol_my_problem;` and JUnit `@Test` methods calling
   `new Solution().<method>(...)`.
4. Run `tests/run_tests.sh`.

Solutions that reference helper types not defined in the file (e.g. `ListNode`,
`TreeNode`, `Node`) need those types provided before they can be compiled and
are not yet covered.
