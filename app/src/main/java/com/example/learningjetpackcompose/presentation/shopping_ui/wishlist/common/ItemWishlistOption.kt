package com.example.learningjetpackcompose.presentation.shopping_ui.wishlist.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular

@Preview
@Composable
fun ItemWishlistOption(
    text : String="hello",
    text14 : TextUnit = 14.sp,
    text18 : TextUnit = 18.sp,
    size45H : Dp = 45.dp,
    size28V : Dp = 28.dp,
    ralewayRegular : FontFamily =  RalewayRegular
){
    Box(modifier = Modifier
        .width(size45H)
        .height(size28V)
        .background(Color(0xFFE5EBFC), RoundedCornerShape(4.dp))
        .padding(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = text,
            fontSize = text14,
            lineHeight = text18,
            fontFamily = ralewayRegular,
            textAlign = TextAlign.Center,
        )
    }
}