pluginManagement {
    repositories {
        google()
        //mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        //mavenLocal()
        mavenCentral()
        maven {
            setUrl("https://maven.pkg.github.com/zawadz88/AnalyticsEventGenerator")
            name = "eventGenerator"
            credentials(PasswordCredentials::class)
        }
        maven {
            setUrl("https://maven.pkg.github.com/zawadz88/AnalyticsEventGeneratorSample-SharedLibrary")
            name = "sharedLibrary"
            credentials(PasswordCredentials::class)
        }
    }
}

rootProject.name = "SampleAndroidApp"
include(":app")
