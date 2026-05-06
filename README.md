# TP-Plugin-Gradle

This repository contains the solution for the Gradle Plugin Lab.

## Environment Setup

To run the project, you need to have Java and Gradle installed.

### Install Java

Install Java (JDK 17 or higher) from the [Oracle website](https://www.oracle.com/java/technologies/downloads/) or [Adoptium](https://adoptium.net/).

### Install Gradle

Install Gradle from the [Gradle website](https://gradle.org/install/) or use SDKMAN (for Linux/macOS).

### Verify Installation

Open a terminal and run the following commands to verify the installation:

```bash
java --version
gradle --version
```

## Project Structure

```
vscode-lab-1/
├── build.gradle
├── gradlew
├── gradlew.bat
└── src/
    └── main/
        ├── java/
        │   └── org/
        │       └── example/
        │           └── App.java
        └── resources/
            └── META-INF/
                └── services/
                    └── org.gradle.api.Plugin
```

## How to Build and Run

### Build the Project

```bash
gradle build
```

### Run the Project

```bash
gradle run
```

### Run Tests

```bash
gradle test
```

### environment 

```powershell
PS C:\Users\ELITE COMPUTER\vscode-lab-1> cd gradle
PS C:\Users\ELITE COMPUTER\vscode-lab-1\gradle> gradle init

Select type of build to generate:
  1: Application
  2: Library
  3: Gradle plugin
  4: Basic (build structure only)
Enter selection (default: Application) [1..4] 3

Select implementation language:
  1: Java
  2: Kotlin
  3: Groovy
Enter selection (default: Java) [1..3] 1

Project name (default: gradle): 

Select build script DSL:
  1: Kotlin
  2: Groovy
Enter selection (default: Kotlin) [1..2] 2

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] no


> Task :init
For more information, please refer to https://docs.gradle.org/8.7/userguide/custom_plugins.html in the Gradle documentation.

BUILD SUCCESSFUL in 24s
1 actionable task: 1 executed
PS C:\Users\ELITE COMPUTER\vscode-lab-1\gradle> 
```
