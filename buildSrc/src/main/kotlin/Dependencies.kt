object Dependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val lifeCycleRuneTime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleRunTime}"
    const val material = "com.google.android.material:material:${Versions.material}"

    object Compose {
        const val composeUi = "androidx.compose.ui:ui:${Versions.Compose.compose}"
        const val composeMaterial = "androidx.compose.material:material:${Versions.Compose.compose}"
        const val composeToolingPreview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.compose}"
        const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.Compose.compose}"
        const val composeActivity =
            "androidx.activity:activity-compose:${Versions.Compose.composeActivity}"
        const val navigation =
            "androidx.navigation:navigation-compose:${Versions.Compose.navigation}"
    }

    object Animations {
        const val lottie = "com.airbnb.android:lottie-compose:${Versions.lottie}"
    }

    object Koin {
        const val koinAndroid = "io.insert-koin:koin-android:${Versions.koin_version}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }

    object DI{
        const val hilt = "com.google.dagger:hilt-android:${Versions.DI.hilt}"
    }
    object Test {
        const val mockk = "io.mockk:mockk:${Versions.Test.mockk}"
        const val mockkAndroid = "io.mockk:mockk-android:${Versions.Test.mockk}"
        const val jUnit = "junit:junit:${Versions.Test.jUnit}"
        const val jupiter = "org.junit.jupiter:junit-jupiter-api:${Versions.Test.junitJupiter}"
        const val jupiterEngine =
            "org.junit.jupiter:junit-jupiter-engine:${Versions.Test.junitJupiter}"

        const val truth = "com.google.truth.extensions:truth-java8-extension:${Versions.Test.truth}"
        const val jUnitAndroid = "androidx.test.ext:junit:${Versions.Test.androidJUnit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.Test.espresso}"
        const val composeJUnit = "androidx.compose.ui:ui-test-junit4:${Versions.Compose.compose}"
        const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:3.2.0"
    }
}

