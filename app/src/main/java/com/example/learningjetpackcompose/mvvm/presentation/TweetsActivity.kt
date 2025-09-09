package com.example.learningjetpackcompose.mvvm.presentation

import android.os.Bundle
import android.provider.MediaStore.Video.VideoColumns.CATEGORY
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.learningjetpackcompose.basic_components.BoxComposable
import com.example.learningjetpackcompose.mvvm.data.TweetsApi
import com.example.learningjetpackcompose.mvvm.presentation.activity.CategoryScreen
import com.example.learningjetpackcompose.mvvm.presentation.activity.DetailScreen
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ARG_CATEGORY
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_CATEGORIES
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_DETAIL
import com.example.learningjetpackcompose.shopping_ui.CreateAccount
import com.example.learningjetpackcompose.shopping_ui.GetStarted
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class TweetsActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeTheme {
                App()
               // BoxComposable()
//                Scaffold(
//                    topBar = {
//                        TopAppBar(
//                            title = {
//                                Text("Tweetsy")
//                            },
//                            colors = TopAppBarColors(
//                                containerColor = Color.Black,
//                                titleContentColor = Color.White,
//                                scrolledContainerColor = Color.White,
//                                navigationIconContentColor = Color.White,
//                                actionIconContentColor = Color.White,
//                            )
//                        )
//                    }
//                ){
//                    Box(modifier = Modifier.padding(it))
//                    {
//                        App()
//                    }
//                }
            }
        }
    }

    @Composable
    private fun App() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "getstarted") {
            composable("getstarted") {
                CreateAccount()
            }
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
