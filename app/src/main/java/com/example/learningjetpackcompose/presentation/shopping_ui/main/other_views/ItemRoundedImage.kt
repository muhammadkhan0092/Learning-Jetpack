package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Composable
fun ItemRoundedImage(img : Int,size : Dp = 50.dp){
    val padding = dimensionResource(R.dimen.dp_5)
    Box(
        modifier = Modifier
            .size(size)
            .shadow(2.dp, CircleShape, clip = false) // shadow outside
            .clip(CircleShape)                       // force circle
            .background(Color.White)                 // circle background
            .padding(padding), contentAlignment = Alignment.Center
    ){
        Image(painter = painterResource(img), contentDescription = "", modifier = Modifier.fillMaxSize().clip(CircleShape), contentScale = ContentScale.FillBounds)
    }
}