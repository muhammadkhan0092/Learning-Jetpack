package com.example.learningjetpackcompose.presentation.shopping_ui.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.learningjetpackcompose.R

@Composable
fun TopRightTwoBg(){
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd){
        Image(
            painter = painterResource(R.drawable.bg_right_down),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .fillMaxHeight(0.2f),
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(R.drawable.bg_right_up),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .fillMaxHeight(0.15f),
            contentScale = ContentScale.FillBounds
        )
    }
}