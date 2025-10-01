package com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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

@Preview
@Composable
fun PaymentItem(
    img : Int = R.drawable.ic_cart_red,
    size19V : Dp =19.dp,
    size12V: Dp = 12.dp,
    size9V : Dp=9.dp,
    size18H : Dp=18.dp,
    size20H : Dp = 20.dp,
    size13H : Dp = 13.dp,
    text10 : TextUnit = 10.sp,
    text14 : TextUnit = 14.sp,
    text18 : TextUnit = 18.sp,
    text17 : TextUnit = 17.sp,
    text21 : TextUnit = 21.sp,
    ralewayBold : Font = Font(R.font.raleway_bold),
    nunitoRegular : Font = Font(R.font.nunito_semi_bold)
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF1F4FE), RoundedCornerShape(14.dp))
            .padding(top = size9V, bottom = size9V, start = size18H, end = size20H),
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(img), contentDescription = "", modifier = Modifier.height(size19V).aspectRatio(0.94f))
        Spacer(Modifier.width(size13H))
        Column(modifier = Modifier.weight(1f)){
            Text("April,19 2020 12:31", fontSize = text10, fontFamily = FontFamily(nunitoRegular))
            Text("Order #92287157", fontSize = text14, lineHeight = text18,fontFamily = FontFamily(ralewayBold))
        }
        Text("-$37,00", fontSize = text17, lineHeight = text21, fontFamily = FontFamily(ralewayBold))
    }
}