object BuildPlugins {
  const val androidGradle = "com.android.tools.build:gradle:${Versions.Plugins.gradle}"
  const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Plugins.kotlin}"
}

object Plugins {
    const val android = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
}

object Dependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val lifeCycleRuneTime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleRunTime}"
    const val  material = "com.google.android.material:material:${Versions.material}"

    object Compose{
        const val composeUi = "androidx.compose.ui:ui:${Versions.Compose.compose}"
        const val composeMaterial = "androidx.compose.material:material:${Versions.Compose.compose}"
        const val composeToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.compose}"
        const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.Compose.compose}"
        const val composeActivity = "androidx.activity:activity-compose:${Versions.Compose.composeActivity}"
    }

    object Test{
        const val jUnit = "junit:junit:${Versions.Test.jUnit}"
        const val jUnitAndroid = "androidx.test.ext:junit:${Versions.Test.androidJUnit}"
        const val espresso ="androidx.test.espresso:espresso-core:${Versions.Test.espresso}"
        const val composeJUnit = "androidx.compose.ui:ui-test-junit4:${Versions.Compose.compose}"
    }
}

