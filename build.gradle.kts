// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath("com.google.android.gms:oss-licenses-plugin:0.10.5")
    }
}

plugins {
    alias(libs.plugins.releasehub)
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.gms.oss.licenses) apply false
    alias(libs.plugins.gms.google.services) apply false
    alias(libs.plugins.firebase.crashlytics) apply false
    alias(libs.plugins.dagger.hilt) apply false
}

releasesHub {
    pullRequestEnabled = true
    gitHubRepositoryOwner = "Yamanekazuma"
    gitHubRepositoryName = "ReleasesHubTest"
    autoDetectDependenciesPaths = true
    pullRequestLabels = listOf("environment", "releaseshub")
    pullRequestReviewers = listOf("Yamanekazuma")
    baseBranch = "main"
}
