package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Composable
fun ItemSquareImageWhiteBg(image : Int =R.drawable.img_hello,width : Dp = 75.dp,isOnSale : Boolean = false){
    Box(
        modifier = Modifier
            .shadow(elevation = 2.dp, shape = RoundedCornerShape(5.dp),clip = false)
            .background(Color.White,RoundedCornerShape(5.dp))
            .size(width*0.285f),
        contentAlignment = Alignment.Center
    ){
        ItemSquareImage(image,width*0.265f,true)
    }
}