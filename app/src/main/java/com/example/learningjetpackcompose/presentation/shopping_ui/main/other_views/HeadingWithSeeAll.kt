package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ButtonFrontArrow

@Composable
fun HeadingWithSeeAll(text : String,text21: TextUnit,text30 : TextUnit,raleway : Font,text15 : TextUnit,margin12 : Dp){
    Box(modifier = Modifier.fillMaxWidth()){
        Text(text, fontSize = text21, lineHeight = text30, fontFamily = FontFamily(raleway))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd){
            Row(verticalAlignment = Alignment.CenterVertically){
                Text("See All", fontSize = text15, fontFamily = FontFamily(raleway))
                Spacer(Modifier.width(margin12))
                ButtonFrontArrow(Modifier)
            }
        }
    }
}