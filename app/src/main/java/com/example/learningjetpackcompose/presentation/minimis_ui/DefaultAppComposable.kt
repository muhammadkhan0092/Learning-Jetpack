package com.example.learningjetpackcompose.presentation.minimis_ui

import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

@Composable
fun defaultAppComposable(width : Dp,height : Dp,fontFamily : FontFamily,text : String = "",textSize : TextUnit){
    Text(
        modifier = Modifier.offset(width, height),
        text = text,
        fontFamily = fontFamily,
        color = Color.Black,
        fontSize = textSize,
        textAlign = TextAlign.Left,
    )
}