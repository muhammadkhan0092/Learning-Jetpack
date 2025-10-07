package com.example.learningjetpackcompose.presentation.shopping_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewaySemiBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions

@Preview(showSystemUi = true)
@Composable
fun ReviewsScreen(width : Dp = 375.dp,height : Dp = 812.dp){
    val dims = rememberDimensions(width,height)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = dims.size20H, end = dims.size20H, top = dims.size20V)
            .background(Color.White))
    {
        Text("Reviews", fontSize = dims.text28, lineHeight = dims.text36, fontFamily = RalewayBold)
        Spacer(Modifier.height(dims.size25V))
        repeat(4){
            ReviewsItem(
                dims.size45H,
                dims.size20H,
                dims.size4V,
                dims.size10V,
                dims.size6H,
                dims.size14V,
                dims.text16,
                dims.text20,
                dims.text12,
                dims.text18,
                4,
                RalewaySemiBold,
                NunitoRegular
            )
            Spacer(Modifier.height(dims.size20V))
        }
    }
}