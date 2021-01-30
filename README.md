# DPS Spring Boot SQS library

## Overview

This library

## Release Notes

##### [1.0.0](release-notes/1.0.0.md)

## How to use this library

## Testing the library locally on other projects

* Firstly bump the version of the library.
* Then publish the library to local maven
```
./gradlew publishToMavenLocal
```
* Then change the settings of the dependent project to read plugins from local storage.  In settings.gradle.kts
```
pluginManagement {
  repositories {
    mavenLocal()
    gradlePluginPortal()
  }
}
```

## Releasing the library

## Code style & formatting
```bash
./gradlew ktlintApplyToIdea addKtlintFormatGitPreCommitHook
```
will apply ktlint styles to intellij and also add a pre-commit hook to format all changed kotlin files.

Note that the .editorconfig in the root of this project is for this project only, the one in src/main/resources will be copied to other projects to enforce style.

To setup dependent projects with ktlint:
1. (Optional) run the above gradle command to apply to intellij and add the pre commit hook.
2. If you don't plan on making changes to .editorconfig (created on first run) then add to .gitignore.
3. Ensure that the continuous integration tool runs the `check` task instead of `test`.
