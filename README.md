# AnalyticsEventGenerator Sample - Android App

To build locally execute: `./gradlew assemble`.

This will use
the [AnalyticsEventGeneratorSample-SharedLibrary](https://github.com/zawadz88/AnalyticsEventGeneratorSample-SharedLibrary)
artifact published to Github Packages.

If you wish to work on SharedLibrary and test locally you need to:

- add `mavenLocal()` repository in `SampleAndroidApp/settings.gradle.kts`
- make the changes in AnalyticsEventGeneratorSample-SharedLibrary
- in AnalyticsEventGeneratorSample-SharedLibrary run `./gradlew assemble` and `./gradlew publishToMavenLocal`
- in AnalyticsEventGeneratorSample-AndroidApp in `build.gradle.kts` update dependency version for SharedLibrary
- in AnalyticsEventGeneratorSample-AndroidApp execute `./gradlew clean assemble --no-build-cache --refresh-dependencies`
