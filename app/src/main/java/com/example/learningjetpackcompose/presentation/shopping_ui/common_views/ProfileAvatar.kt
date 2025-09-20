package com.example.learningjetpackcompose.presentation.shopping_ui.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Composable
fun ProfileAvatar(){
    val height106 = dimensionResource(R.dimen.dp_106)
    val height90 = dimensionResource(R.dimen.dp_90)
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(height106).background(Color.White,
            RoundedCornerShape(100.dp),
        )) {
        Image(
            painter = painterResource(id = R.drawable.img_profile_avatar),
            contentDescription = "Profile picture",
            modifier = Modifier.size(height90)
                .clip(CircleShape)
        )
    }
}