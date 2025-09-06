package com.example.learningjetpackcompose.mvvm.presentation

import android.os.Bundle
import android.provider.MediaStore.Video.VideoColumns.CATEGORY
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.learningjetpackcompose.mvvm.data.TweetsApi
import com.example.learningjetpackcompose.mvvm.presentation.activity.CategoryScreen
import com.example.learningjetpackcompose.mvvm.presentation.activity.DetailScreen
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ARG_CATEGORY
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_CATEGORIES
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_DETAIL
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class TweetsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeTheme {
                App()
            }
        }
    }

    @Composable
    private fun App() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = ROUTE_CATEGORIES) {
            composable(ROUTE_CATEGORIES) {
                CategoryScreen() {
                    val navigateTo = ROUTE_DETAIL+"/$it"
                    navController.navigate(navigateTo)
                }
            }
            composable(
                ROUTE_DETAIL+"/{${CATEGORY}}",
                arguments = listOf(
                    navArgument(CATEGORY) {
                        type = NavType.StringType
                    }
                )
            ){
                DetailScreen()
            }
        }
    }
}
