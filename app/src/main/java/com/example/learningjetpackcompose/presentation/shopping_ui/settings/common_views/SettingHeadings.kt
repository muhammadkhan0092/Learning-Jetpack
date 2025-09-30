package com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SettingHeadings(text : String = "Personal",text20 : TextUnit,ralewayExtraBold : Font){
    Text(
        text,
        fontSize = text20,
        fontFamily = FontFamily(ralewayExtraBold)
    )
}