package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Composable
fun ItemStories(height: Dp) {
    val size29 = dimensionResource(R.dimen.dp_29)
    val width17 = dimensionResource(R.dimen.dp_17)
    val height12 = dimensionResource(R.dimen.dp_12)
    Box(modifier= Modifier.height(height).aspectRatio(0.594f).background(Color.White,RoundedCornerShape(10.dp)), contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(R.drawable.img_ready),
                contentDescription = null,
                modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(10.dp)).background(Color.Green),
                contentScale = ContentScale.FillBounds
            )
            Box(modifier = Modifier.size(size29).background(Color(0xFFD9D9D9),CircleShape), contentAlignment = Alignment.Center){
                Image(
                    painter = painterResource(R.drawable.ic_play),
                    contentDescription = "",
                    modifier = Modifier.width(width17).height(width17),
                    contentScale = ContentScale.Crop,
                    colorFilter = ColorFilter.tint(color = Color.White)
                )
            }
        }
}