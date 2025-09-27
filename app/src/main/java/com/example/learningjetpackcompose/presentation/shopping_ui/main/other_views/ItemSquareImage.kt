package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R


@Composable
fun ItemSquareImage(image : Int =R.drawable.img_hello,imgSize : Dp ,isOnSale : Boolean = false){
    val text13 = dimensionResource(R.dimen.sp_13).value.sp
    val padding4 = dimensionResource(R.dimen.dp_4)
    Box(modifier = Modifier.size(imgSize).clip(RoundedCornerShape(5.dp)), contentAlignment = Alignment.TopEnd){
        Image(
            painter = painterResource(image),
            contentDescription = "",
            modifier = Modifier.size(imgSize).clip(RoundedCornerShape(5.dp)),
            contentScale = ContentScale.FillBounds
        )
        if(isOnSale){
            Text(
                text = "-20%",
                fontSize = text13,
                modifier = Modifier
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xFFFF5790), Color(0xFFE91E63))
                        ),
                        shape = RoundedCornerShape(topStart = 5.dp, bottomStart = 5.dp, topEnd = 5.dp)
                    ).padding(start = padding4, end = padding4),
                color = Color.White
            )
        }
    }
}