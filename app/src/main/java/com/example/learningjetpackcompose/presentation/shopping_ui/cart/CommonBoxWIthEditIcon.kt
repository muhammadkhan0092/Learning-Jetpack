package com.example.learningjetpackcompose.presentation.shopping_ui.cart

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold

@Composable
fun CommonBoxWIthEditIcon(
    size10H : Dp,
    size16H : Dp,
    size45H : Dp,
    size4V : Dp,
    size9V : Dp,
    text10 : TextUnit,
    text14 : TextUnit,
    text16 : TextUnit,
    text18: TextUnit,
    textOne : String="Shipping Address",
    textTwo : String="26, Duong So 2, Thao Dien Ward, An Phu, District 2, Ho Chi Minh city"
){
    Column(
        modifier = Modifier
            .background(Color(0xFFF9F9F9),RoundedCornerShape(10.dp))
            .padding(start = size16H, end = size10H, top = size9V, bottom = size9V)){
        Text(textOne, fontSize = text14, lineHeight = text18, fontFamily = RalewayBold)
        Spacer(Modifier.height(size4V))
        Row {
            Text(
                modifier = Modifier.weight(1f),
                text = textTwo,
                fontFamily = NunitoRegular,
                fontSize = text10,
                lineHeight = text16
            )
            Spacer(Modifier.width(size45H))
            Image(
                painter = painterResource(R.drawable.ic_edit),
                contentDescription = ""
            )
        }
    }
}