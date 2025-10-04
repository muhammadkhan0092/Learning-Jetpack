package com.example.learningjetpackcompose

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.provider.MediaStore.Video.VideoColumns.CATEGORY
import android.util.DisplayMetrics
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
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
import com.example.learningjetpackcompose.presentation.shopping_ui.main.main_screens.MainScreen
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsAbout
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens.CreateAccount
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens.GetStarted
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens.HelloScreen
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens.LoginScreen
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens.PasswordRecovery
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens.PasswordScreen
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens.SetupNewPassword
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
        val baseDensity = LocalDensity.current
        val baseConfig = LocalConfiguration.current

        // create fixed (remembered) values with fontScale = 1f
        val fixedConfig = remember(baseConfig) {
            Configuration(baseConfig).apply { fontScale = 1f }
        }
        val fixedDensity = remember(baseDensity) {
            Density(baseDensity.density, 1f) // density, fontScale
        }
        val navController = rememberNavController()
        CompositionLocalProvider(
            LocalConfiguration provides fixedConfig,
            LocalDensity provides fixedDensity
        ) {
            val effectiveScale = LocalDensity.current.fontScale
            Log.d("KHAN","SCALE IS ${effectiveScale}")
            NavHost(navController = navController, startDestination = MENU) {
                composable(MENU) {
                    MainScreen()
                    //HelloScreen()
//                MenuComposable(
//                    {
//                        navController.navigate(ROUTE_BASIC)
//                    },
//                    {
//                        navController.navigate(ROUTE_SIDE)
//                    },
//                    {
//                        navController.navigate(ROUTE_LAUNCHER)
//                    },
//                    {
//                        navController.navigate(ROUTE_MVVM)
//                    },
//                    {
//                        navController.navigate(ROUTE_SHOPPING)
//                    }
//                )
                }
                composable(ROUTE_SIDE) {
                    SideEffectComposable()
                }
                composable(ROUTE_LAUNCHER) {
                    HomeLauncher()
                }
                composable(ROUTE_BASIC) {
                    BasicComponentsComposable()
                }
                shoppingRoutes(this,navController)
                mvvmRoutes(this,navController)
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
        Column(modifier = Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
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
                GetStarted {
                    navController.navigate(SHOPPING_ROUTE_CREATE_ACCOUNT)
                }
            }
            composable(SHOPPING_ROUTE_CREATE_ACCOUNT) {
                CreateAccount {
                    navController.navigate(SHOPPING_ROUTE_LOGIN)
                }
            }
            composable(SHOPPING_ROUTE_LOGIN) {
                LoginScreen {
                    navController.navigate(SHOPPING_ROUTE_PASSWORD)
                }
            }
            composable(SHOPPING_ROUTE_PASSWORD) {
                PasswordScreen {
                    navController.navigate(SHOPPING_ROUTE_PASSWORD_NEW)
                }

            }
            composable(SHOPPING_ROUTE_PASSWORD_NEW) {
                SetupNewPassword {
                    navController.navigate(SHOPPING_ROUTE_PASSWORD_RECOVERY)
                }
            }
            composable(SHOPPING_ROUTE_PASSWORD_RECOVERY) {
                PasswordRecovery {}
            }
        }
    }
    private fun mvvmRoutes(builder: NavGraphBuilder, navController: NavHostController){
        builder.apply {
            composable(ROUTE_MVVM) {
                CategoryScreen {
                    val navigateTo = "$ROUTE_DETAIL/$it"
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
    override fun attachBaseContext(newBase: Context) {
        val configuration = Configuration(newBase.resources.configuration)
        configuration.densityDpi = DisplayMetrics.DENSITY_LOW // Force default DPI (ignores "Display size")
        val context = newBase.createConfigurationContext(configuration)
        super.attachBaseContext(context)
    }

}
