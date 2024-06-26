# Can Shuffling Inputs in Your Test Suite Enhance its Bug Detection Capability?

## Summary

This repository includes Booster proposed in this paper along with its experimental results.
Booster is a test generation tool that generates a new test suite by reusing existing inputs from the initial test suite. 
Unlike existing approaches that aim to enhance bug detection through coverage improvement or functional test oracle improvement, Booster achieve bug detection enhancement without using resources for coverage or oracle improvement. 
Additionally, Booster generate new test cases using only the existing inputs present in the initial test suite, without generating new inputs.
To evaluate the bug detection effectiveness of Booster, we generate new test suites from the initial test suites generated by prominent test generation tools, Randoop and EvoSuite. 
We then measure the bug detection enhancement by Booster and compare the bug detection capability of these newly generated test suites with those generated solely by Randoop and EvoSuite.
In this repository, we share the source code and executable of Booster, as well as the experimental results in CSV file format.

## Repo Structure

```
- Booster/
    - src/
    - Booster-shadow.jar
    - build.gradle
    - settings.gradle
    - README.md                               
- dataset/   
    - bug_detection/
        - Booster_bug_detection.csv
        - ES_bug_detection.csv
        - ESM_bug_detection.csv
        - RD_bug_detection.csv
    - coverage/
        - Booster_coverage.csv
        - ES_coverage.csv
        - RD_coverage.csv
    - README.md
- .gitignore
- README.md  
```

## Usage

Booster is easy to use.
You only need to get into the Booster directory and execute [executable](./Booster/Booster-shadow.jar) in the Java 1.8 environment.
[README.md](./Booster/README.md) is a detailed usage instruction.

## Experiment Results

To evaluate the effectiveness of Booster, we conduct experiments on the 833 bugs in Defects4J. We apply Booster to the initial test suites generated by Randoop and EvoSuite, generating new test suites. These generated test suites are then executed on both the buggy and fixed versions to observe different behaviors and evaluate bug detection. 
As a result, Booster demonstrated a statistically significant improvement in bug detection compared to the initial test suites and showed better efficiency than existing test generation tools within the same test generation time budget. Detailed experimental results can be found in [README.md](./dataset/).

