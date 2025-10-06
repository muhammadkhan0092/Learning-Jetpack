package com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoLight
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions

@Composable
fun SettingsAbout(width : Dp=375.dp,height : Dp = 812.dp){
    val dims = rememberDimensions(width, height)
    Column(modifier = Modifier.padding(start = dims.size20H, end = dims.size20H)){
        Spacer(Modifier.height(dims.size89V))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(R.drawable.img_shopping_back),
                contentDescription = "",
                modifier = Modifier.height(dims.size92V).aspectRatio(1f),
                contentScale = ContentScale.FillBounds
            )
        }
        Spacer(Modifier.height(dims.size103V))
        Text("About Shoppe", fontSize = dims.text28, lineHeight = dims.text36, fontFamily = RalewayBold)
        Spacer(Modifier.height(dims.size16V))
        Text(
            "Shoppe - Shopping UI kit\" is likely a user interface (UI) kit designed to facilitate the development of e-commerce or shopping-related applications. UI kits are collections of pre-designed elements, components, and templates that developers and designers can use to create consistent and visually appealing user interfaces.",
            fontSize = dims.text16,
            lineHeight = dims.text28,
            fontFamily = NunitoLight
        )
        Spacer(Modifier.height(dims.size35V))
        Text(
            "If you need help or you have any questions, feel free to contact me by email.",
            fontSize = dims.text16,
            lineHeight = dims.text28,
            fontFamily = NunitoLight
        )
        Spacer(Modifier.height(dims.size10V))
        Text("hello@mydomain.com", fontSize = dims.text17, lineHeight = dims.text28, fontFamily = RalewayBold)
    }
}