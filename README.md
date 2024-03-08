# AnalyticsEventGenerator Sample - Android App

To build locally execute: `./gradlew assemble`.

This will use
the [AnalyticsEventGeneratorSample-SharedLibrary](https://github.com/zawadz88/AnalyticsEventGeneratorSample-SharedLibrary)
artifact published to Github Packages.

If you wish to work on AnalyticsEventGeneratorSample-SharedLibrary and test locally you need to:

- add `mavenLocal()` repository in this project's `settings.gradle.kts`
- make the changes in AnalyticsEventGeneratorSample-SharedLibrary
- in AnalyticsEventGeneratorSample-SharedLibrary run `./gradlew assemble` and `./gradlew publishToMavenLocal`
- in this project execute `./gradlew clean assemble --no-build-cache --refresh-dependencies`
