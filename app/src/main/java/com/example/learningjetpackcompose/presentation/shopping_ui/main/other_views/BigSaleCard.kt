package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

@Composable
fun BigSaleCard(
    text29 : TextUnit = 29.sp,
    text26: TextUnit = 29.sp,
    text12 : TextUnit = 12.sp,
    text18 : TextUnit = 18.sp,
    text11 : TextUnit = 11.sp,
    text15 : TextUnit = 15.sp,
    margin1 : Dp = 1.dp,
    margin29 : Dp = 29.dp,
    margin4 : Dp = 4.dp,
    padding18 : Dp = 18.dp,
    padding12 : Dp = 12.dp,
    raleway : Font = Font(R.font.raleway_bold),
    nunito  : Font = Font(R.font.nunito_bold),
    imgSize : Dp
){
    Row(modifier = Modifier.fillMaxWidth().background(Color(0xFFF0B01B), RoundedCornerShape(10.dp))){

        Column(modifier = Modifier.weight(0.5f).padding(start = padding18, top = padding12)){
            Text("Big Sale", color = Color.White, fontSize = text29, lineHeight = text26, fontFamily = FontFamily(raleway))
            Spacer(Modifier.height(margin1))
            Text("Up to 50%",color = Color.White,fontSize = text12, lineHeight = text18, fontFamily = FontFamily(nunito))
            Spacer(Modifier.height(margin29))
            Text("Happening \n" +"Now",color = Color.White,fontSize = text11, lineHeight = text15, fontFamily = FontFamily(raleway))
            Spacer(Modifier.height(margin4))
        }
        Image(
            painter = painterResource(R.drawable.img_hello),
            contentDescription = "",
            modifier = Modifier.weight(0.5f).height(imgSize)
        )
    }
}