# Sample Android App

To build locally execute: `./gradlew assemble`.

This will use the SharedAnalyticsLibrary artifact published to Github Packages.

If you wish to work on SharedAnalyticsLibrary and test locally you need to:

- add `mavenLocal()` repository in `SampleAndroidApp/settings.gradle.kts`
- make the changes in SharedAnalyticsLibrary
- in SharedAnalyticsLibrary run `./gradlew assemble` and `./gradlew publishToMavenLocal`
- in SampleAndroidApp execute `./gradlew clean assemble --no-build-cache --refresh-dependencies`
