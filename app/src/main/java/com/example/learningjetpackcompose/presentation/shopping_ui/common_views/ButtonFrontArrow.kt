package com.example.learningjetpackcompose.presentation.shopping_ui.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Composable
fun ButtonFrontArrow(modifier: Modifier){
    val size = dimensionResource(R.dimen.dp_30)
    val padding7 = dimensionResource(R.dimen.dp_7)
    val padding8 = dimensionResource(R.dimen.dp_8)
    val padding9 = dimensionResource(R.dimen.dp_9)
    Image(
        modifier = modifier
            .size(size)
            .background(Color(0xFF004CFF),RoundedCornerShape(20.dp))
            .padding(padding9)
        ,
        painter = painterResource(R.drawable.ic_forward),
        contentDescription = ""
    )
}