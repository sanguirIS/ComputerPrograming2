# Security Policy

This repository contains the Java coursework for **Computer Programming 2** (STI College) —
standalone console exercises for learning data structures, algorithms, exception handling,
file I/O, and object-oriented design. It is **not** a deployed application or a library that
other projects consume, so this policy is intentionally lightweight.

## Supported Versions

There are no numbered releases. Security-relevant fixes are applied to the default branch
(`main`) only.

| Version / Ref | Supported |
| ------------- | :-------- |
| `main` (HEAD) | :white_check_mark: |
| Older commits / forks | :x: |

## Scope

In scope — anything that would affect a learner who clones, compiles, or runs the code here:

- Code that executes unintended commands, opens sockets, or reaches out over the network.
- Unsafe file I/O (path traversal, writing outside the working directory, deleting user files).
- Hard-coded credentials, tokens, API keys, or personal data committed to the repository.
- Deserialization of untrusted input, or `Runtime.exec` / `ProcessBuilder` on user-controlled data.
- Problems in build or CI configuration, and in third-party assets referenced by the project.

Out of scope — please don't file these as vulnerabilities:

- Pedagogical shortcuts that are deliberate for a classroom exercise (e.g. `Scanner` input that
  isn't hardened, `System.out.println` debugging, no unit tests).
- Style, naming, or design critiques — open a normal issue or pull request instead.
- Vulnerabilities in the JDK, your IDE, or your own machine's configuration.

## Reporting a Vulnerability

**Please do not open a public GitHub issue for a security problem.**

1. Report it privately through GitHub's **Report a vulnerability** button on the
   [Security Advisories](https://github.com/sanguirIS/ComputerPrograming2/security/advisories/new)
   page of this repository.
2. If private reporting is unavailable, contact the maintainer
   ([@sanguirIS](https://github.com/sanguirIS)) through the contact details on their GitHub
   profile, with `[SECURITY]` in the subject.
3. Include: the affected file(s) and line(s), the Java/JDK version you used, step-by-step
   reproduction (`javac` / `java` commands and any input), the impact, and a suggested fix if
   you have one.

### What to expect

| Step | Target |
| ---- | ------ |
| Acknowledgement of your report | within 72 hours |
| Initial triage and severity assessment | within 7 days |
| Status update on an open report | at least every 14 days |
| Fix committed to `main` | as soon as practical, prioritized by severity |

Severity is assessed with [CVSS v3.1](https://www.first.org/cvss/calculator/3.1) as a guide,
tempered by the fact that this is educational code with no production deployment.

- **Accepted** — you'll be told the plan and an expected fix window, and you'll be credited in
  the advisory or commit message unless you ask to stay anonymous.
- **Declined** — you'll get a written explanation of the reasoning, not a silent close.

Coordinated disclosure is appreciated: please give a reasonable window (14 days from
acknowledgement) before publishing details, and don't access, modify, or delete data that
isn't yours while testing.

## Security Notes for Users

- Every `.java` file is self-contained; compile and run only the ones you need.
- Review the source before running it — reading the code is the point of the exercise.
- This project has no dependencies and no build system beyond `javac`. If you add external
  JARs, you are responsible for vetting them.
- Several exercises read from `System.in` (for example `StudentNumberValidation.java` prompts
  for a student number). Use made-up values — don't type real personal data into the console.

---

See also: [README.md](README.md) · [LICENSE](LICENSE)
