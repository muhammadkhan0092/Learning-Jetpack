package com.example.learningjetpackcompose.presentation.shopping_ui.main.main_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.MAIN_CART
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.MAIN_CATEGORIES
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.MAIN_HOME
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.MAIN_PROFILE
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.MAIN_WISHLIST
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.SETTINGS_COUNTRY
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.SETTINGS_LANGUAGE
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.SETTINGS_SIZE
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.SETTING_ABOUT
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.SETTING_CURRENCY
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.ScreenDestinations.SETTING_SHIPPING_ADDRESS
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoLight
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsAbout
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsCurrency
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsDelete
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsLanguage
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsMenu
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsShippingAddress
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsSizes
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions

@SuppressLint("UnusedBoxWithConstraintsScope")
@Preview
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        containerColor = Color.White,
        contentColor = Color.Black,
        bottomBar = {
            CustomBottomBar(navController)
        }
    ) { innerPadding ->
        BoxWithConstraints {
            val width = maxWidth
            val height = maxHeight
            val dims = rememberDimensions(width, height)
            val config = LocalConfiguration.current
            val metrics = LocalContext.current.resources.displayMetrics

            // Get actual physical density (px / dp) from metrics
            val physicalDensity = metrics.xdpi / 160f  // baseline Android formula

            // Lock density & font scale
            val fixedDensity = Density(
                density = physicalDensity, // ignores system Display size
                fontScale = 1f             // ignores font size
            )
            val isDeleteClicked = remember { mutableStateOf(false) }
           // CompositionLocalProvider(LocalDensity provides fixedDensity) {
                NavHost(
                    navController = navController,
                    startDestination = MAIN_HOME,
                    modifier = Modifier.padding(innerPadding)
                ) {
                    composable(MAIN_HOME) {
                        SettingsMenu(
                            width,
                            height,{
                                navController.navigate(SETTINGS_LANGUAGE)
                            },
                            {
                                navController.navigate(SETTINGS_SIZE)
                            },
                            {
                                navController.navigate(SETTING_CURRENCY)
                            },
                            {
                                navController.navigate(SETTING_SHIPPING_ADDRESS)
                            },
                            {
                                navController.navigate(SETTING_ABOUT)
                            },
                            {
                                if(!isDeleteClicked.value){
                                    isDeleteClicked.value = true
                                }
                            },
                            isDeleteClicked.value
                        )
                    }
                    composable(MAIN_WISHLIST) { MainProfile(width,height)}
                    composable(MAIN_CATEGORIES) {MainProfile(width,height) }
                    composable ( MAIN_CART){MainProfile(width,height)}
                    composable (MAIN_PROFILE){MainProfile(width,height)}
                    composable (SETTINGS_LANGUAGE){ SettingsLanguage(width,height) }
                    composable (SETTINGS_COUNTRY){MainProfile(width,height)}
                    composable (SETTINGS_SIZE){SettingsSizes(width,height)}
                    composable (SETTING_CURRENCY){ SettingsCurrency(width,height) }
                    composable (SETTING_SHIPPING_ADDRESS){ SettingsShippingAddress(width,height) }
                    composable (SETTING_ABOUT){
                        SettingsAbout(width,height)
                    }
                }
          //  }
            if(isDeleteClicked.value) Box(modifier = Modifier.fillMaxSize().background(Color(0xB8E9E9E9)))
            if(isDeleteClicked.value){
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    SettingsDelete(
                        Modifier,
                        dims.size7V,
                        dims.size20V,
                        dims.size27V,
                        dims.size50V,
                        dims.size35V,
                        dims.size44V,
                        height*0.098f,
                        height*0.073f,
                        height*0.049f,
                        height*0.036f,
                        dims.text16,
                        dims.text25,
                        dims.text28,
                        dims.text25,
                        dims.text13,
                        dims.text20,
                        RalewayBold,
                        NunitoLight
                    )
                }
            }
        }
    }
}
@Composable
fun CustomBottomBar(navController: NavController) {
    val item = listOf(MAIN_HOME,MAIN_WISHLIST,MAIN_CATEGORIES,MAIN_CART,MAIN_PROFILE)
    val selectedIcons = listOf(
        R.drawable.ic_selected_home,
        R.drawable.ic_selected_wishlist,
        R.drawable.ic_unselected_categories,
        R.drawable.ic_selected_cart,
        R.drawable.ic_selected_profile
    )
    val unSelectedIcons = listOf(
        R.drawable.ic_unselected_home,
        R.drawable.ic_unselected_wishlist,
        R.drawable.ic_unselected_categories,
        R.drawable.ic_unselected_cart,
        R.drawable.ic_unselected_profile
    )
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route
    Row(
        modifier = Modifier.fillMaxWidth().padding(bottom = 25.dp, top = 14.dp).background(Color.White),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        repeat(5) {
            Image(
                painter = painterResource(
                if(item[it]==currentDestination) selectedIcons[it]
                else unSelectedIcons[it]
            ),
                contentDescription = "",
                modifier = Modifier.clickable{
                navController.navigate(item[it]){
                    popUpTo(navController.graph.startDestinationId){ saveState = true }
                    launchSingleTop = true
                    restoreState = true
                }
            }
            )
        }
    }
}
