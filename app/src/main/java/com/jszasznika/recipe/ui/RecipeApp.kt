package com.jszasznika.recipe.ui

import android.app.Application
import android.content.res.Resources
import android.util.Log
import androidx.annotation.StringRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jszasznika.recipe.ui.screens.ProfileSetupScreen
import com.jszasznika.recipe.ui.screens.SplashScreen

const val TAG = "Test -> "

@ExperimentalFoundationApi
@Composable
@Preview(showBackground = true)
fun RecipeApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "splash") {
        composable(route = "splash") {
            SplashScreen(navController)
        }
        composable(route = "profile") {
            ProfileSetupScreen()
        }
    }
}

class RecipeApplication : Application() {


    companion object {
        var instance :RecipeApplication? = null

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    fun getStringResource(resId: Int) = try {
        resources.getString(resId)
    } catch (exception: Exception) {
        exception.printStackTrace()
        Log.e(TAG, "getString failed: ", exception)
        ""
    }

}
