package com.example.learningjetpackcompose

import android.os.Bundle
import android.provider.MediaStore.Video.VideoColumns.CATEGORY
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.learningjetpackcompose.basic_components.BasicComponentsComposable
import com.example.learningjetpackcompose.basic_components.ButtonComposable
import com.example.learningjetpackcompose.mvvm.presentation.activity.CategoryScreen
import com.example.learningjetpackcompose.mvvm.presentation.activity.DetailScreen
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_BASIC
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_DETAIL
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_LAUNCHER
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_SIDE
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_MVVM
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.ROUTE_SHOPPING
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.MENU
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.SHOPPING_ROUTE_CREATE_ACCOUNT
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.SHOPPING_ROUTE_LOGIN
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.SHOPPING_ROUTE_PASSWORD
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.SHOPPING_ROUTE_PASSWORD_NEW
import com.example.learningjetpackcompose.mvvm.presentation.constants.Constants.SHOPPING_ROUTE_PASSWORD_RECOVERY
import com.example.learningjetpackcompose.presentation.minimis_ui.HomeLauncher
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.CreateAccount
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.GetStarted
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.LoginScreen
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.PasswordRecovery
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.PasswordScreen
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.SetupNewPassword
import com.example.learningjetpackcompose.side_effects.SideEffectComposable
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
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
        NavHost(navController = navController, startDestination = MENU) {
            composable(MENU) {
                MenuComposable(
                    {
                        navController.navigate(ROUTE_BASIC)
                    },
                    {
                        navController.navigate(ROUTE_SIDE)
                    },
                    {
                        navController.navigate(ROUTE_LAUNCHER)
                    },
                    {
                        navController.navigate(ROUTE_MVVM)
                    },
                    {
                        navController.navigate(ROUTE_SHOPPING)
                    }
                )
            }
            composable(ROUTE_SIDE) {
                SideEffectComposable()
            }
            composable(ROUTE_LAUNCHER) {
                HomeLauncher()
            }
            shoppingRoutes(this,navController)
            composable(ROUTE_BASIC) {
                BasicComponentsComposable()
            }
            composable(ROUTE_MVVM) {
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

    @Composable
    private fun MenuComposable(
        onBasicComponentClicked : ()-> Unit,
        onSideEffectClicked : ()-> Unit,
        onLauncherAppClicked : ()-> Unit,
        onMvvmAppClicked : ()-> Unit,
        onShoppingAppClicked : ()-> Unit
    ){
        Column(modifier = Modifier.fillMaxSize().padding(20.dp)){
            ButtonComposable(ROUTE_BASIC,onBasicComponentClicked)
            ButtonComposable(ROUTE_SIDE,onSideEffectClicked)
            ButtonComposable(ROUTE_LAUNCHER,onLauncherAppClicked)
            ButtonComposable(ROUTE_MVVM,onMvvmAppClicked)
            ButtonComposable(ROUTE_SHOPPING,onShoppingAppClicked)
        }
    }



    private fun shoppingRoutes(builder: NavGraphBuilder, navController: NavHostController) {
        builder.apply {
            composable(ROUTE_SHOPPING) {
                GetStarted(){
                    navController.navigate(SHOPPING_ROUTE_CREATE_ACCOUNT)
                }
            }
            composable(SHOPPING_ROUTE_CREATE_ACCOUNT) {
                CreateAccount(){
                    navController.navigate(SHOPPING_ROUTE_LOGIN)
                }
            }
            composable(SHOPPING_ROUTE_LOGIN) {
                LoginScreen(){
                    navController.navigate(SHOPPING_ROUTE_PASSWORD)
                }
            }
            composable(SHOPPING_ROUTE_PASSWORD) {
                PasswordScreen(){
                    navController.navigate(SHOPPING_ROUTE_PASSWORD_NEW)
                }

            }
            composable(SHOPPING_ROUTE_PASSWORD_NEW) {
                SetupNewPassword(){
                    navController.navigate(SHOPPING_ROUTE_PASSWORD_RECOVERY)
                }
            }
            composable(SHOPPING_ROUTE_PASSWORD_RECOVERY) {
                PasswordRecovery(){}
            }
        }
    }


}
