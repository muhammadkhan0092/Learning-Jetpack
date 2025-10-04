package com.example.learningjetpackcompose.presentation.shopping_ui.common_views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun SmallButton(
    text : String = "",
    color : Color,
    size7V : Dp = 7.dp,
    size40H : Dp = 40.dp,
    text16 : TextUnit,
    text25 : TextUnit,
    nunitoLight : FontFamily
){
    Text(
        modifier = Modifier
            .background(color = color, RoundedCornerShape(10.dp))
            .padding(start = size40H, end = size40H, top = size7V, bottom = size7V),
        text = text,
        fontSize = text16,
        lineHeight = text25,
        fontFamily = nunitoLight,
        color = Color.White
    )
}