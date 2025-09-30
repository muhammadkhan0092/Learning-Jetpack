package com.example.learningjetpackcompose.presentation.shopping_ui.main.main_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.SCREEN_DESTINATIONS.MAIN_CART
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.SCREEN_DESTINATIONS.MAIN_CATEGORIES
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.SCREEN_DESTINATIONS.MAIN_HOME
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.SCREEN_DESTINATIONS.MAIN_PROFILE
import com.example.learningjetpackcompose.presentation.shopping_ui.constants.SCREEN_DESTINATIONS.MAIN_WISHLIST
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsMenu
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsPayment
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens.SettingsProfile

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
            NavHost(
                navController = navController,
                startDestination = MAIN_HOME,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(MAIN_HOME) { SettingsPayment(width,height) }
                composable(MAIN_WISHLIST) { MainProfile()}
                composable(MAIN_CATEGORIES) {MainProfile() }
                composable ( MAIN_CART){MainProfile()}
                composable (MAIN_PROFILE){MainProfile()}
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
