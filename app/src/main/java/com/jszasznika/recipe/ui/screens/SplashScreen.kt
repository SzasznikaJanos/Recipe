package com.jszasznika.recipe.ui.screens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.jszasznika.recipe.R
import com.jszasznika.recipe.repository.ComplexSearchQuery
import com.jszasznika.recipe.repository.SpoonacularService
import com.jszasznika.recipe.ui.TAG
import kotlinx.coroutines.launch


@Composable
fun SplashScreen(
  navController: NavHostController
) {
    Scaffold {
        val scope =  rememberCoroutineScope()
        Greeting{
            Log.d(TAG, "SplashScreen: navigating...")
           // navController.navigate("profile")
            val api =  SpoonacularService.client
            val query = ComplexSearchQuery("vegan pie").query

            scope.launch {
                kotlin.runCatching {
                   api.complexSearch(query)
               }.onFailure {
                   Log.d(TAG, "Failure: ${it.message} ${it.cause} ${it.printStackTrace()}")
               }.onSuccess {
                   Log.d(TAG, "SplashScreen: $it")
               }

            }
        }
    }
}


@Composable
fun Greeting(onComplete:() -> Unit) {
    val spec = LottieCompositionSpec.RawRes(R.raw.splash2)
    val composition: LottieComposition? by rememberLottieComposition(spec)
    val progress by animateLottieCompositionAsState(
        composition,
        restartOnPlay = false
    )

    LottieAnimation(
        composition = composition,
        progress = progress,
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                onComplete()
            }
    )


}

