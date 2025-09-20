package com.example.learningjetpackcompose.presentation.shopping_ui.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.learningjetpackcompose.R

@Composable
fun TopLeftTwoBg(){
    Image(painter = painterResource(R.drawable.bg_top), contentDescription = "", contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxHeight(0.40f).aspectRatio(0.84f))
    Image(painter = painterResource(R.drawable.bg_bottom), contentDescription = "", contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxWidth(0.6f).aspectRatio(1.09f))
}