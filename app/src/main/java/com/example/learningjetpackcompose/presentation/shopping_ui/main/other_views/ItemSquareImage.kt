package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ItemSquareImage(image : Int,height : Dp){
    Image(
        painter = painterResource(image),
        contentDescription = "",
        modifier = Modifier.size(height).clip(RoundedCornerShape(5.dp)),
        contentScale = ContentScale.FillBounds
    )
}