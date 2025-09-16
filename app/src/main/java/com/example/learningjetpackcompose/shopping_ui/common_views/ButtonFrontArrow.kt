package com.example.learningjetpackcompose.shopping_ui.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Composable
fun ButtonFrontArrow(modifier: Modifier){
    Image(
        modifier = modifier
            .fillMaxWidth(0.08f)
            .fillMaxHeight(0.038f)
            .aspectRatio(1f)
            .background(Color(0xFF004CFF),RoundedCornerShape(20.dp))
            .padding(top = 9.dp, bottom = 9.dp, start = 8.dp, end = 7.dp)
        ,
        painter = painterResource(R.drawable.ic_forward),
        contentDescription = ""
    )
}