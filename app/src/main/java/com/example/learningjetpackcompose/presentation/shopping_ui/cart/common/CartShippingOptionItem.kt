package com.example.learningjetpackcompose.presentation.shopping_ui.cart.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewaySemiBold

@Preview
@Composable
fun CartShippingOptionItem(
    size24V : Dp =24.dp,
    size4V : Dp = 4.dp,
    size7V : Dp = 7.dp,
    size7H : Dp = 7.dp,
    size8H : Dp = 8.dp,
    size10H : Dp = 11.dp,
    size20H : Dp = 20.dp,
    text16 : TextUnit = 16.sp,
    text20: TextUnit = 20.sp,
    text13: TextUnit = 13.sp,
    text17: TextUnit = 17.sp,
    ralewaySemiBold : FontFamily = RalewaySemiBold,
    ralewayRegular : FontFamily = RalewayRegular,
    ralewayBold : FontFamily = RalewayBold,
    textOne : String="Standard",
    textTwo : String ="5-7 days",
    textThree : String="FREE",
    selectedText : String="Standard",
    onClick : ()-> Unit={}
){
    val bgMain =if(textOne==selectedText)Color(0XFFE5EBFC) else Color(0xFFF9F9F9)
    val bgSquare = if(textOne==selectedText)Color(0XFFF5F8FF) else Color(0xFFF5F8FF)
    val bgCircle =if(textOne==selectedText)Color(0XFF0042E0) else Color(0xFFEFEFEF)
    Row(modifier = Modifier.fillMaxWidth()
        .background(bgMain,RoundedCornerShape(5.dp))
        .clickable{onClick()}
        .padding(top = size7V, bottom = size7V, start = size10H, end = size20H),
        verticalAlignment = Alignment.CenterVertically
    ){
        Box(
            modifier = Modifier.size(size24V).background(Color.White, RoundedCornerShape(100.dp)),
            contentAlignment = Alignment.Center
        ){
            Box(
                modifier = Modifier.fillMaxSize().background(bgCircle,RoundedCornerShape(100.dp)),
                contentAlignment = Alignment.Center
            ){
                if(selectedText==textOne){
                    Image(
                        modifier = Modifier.width(size7H).aspectRatio(0.686f),
                        painter = painterResource(R.drawable.ic_tick),
                        contentDescription = ""
                    )
                }
            }
        }
        Spacer(Modifier.width(size8H))
        Text(textOne, fontSize = text16, lineHeight = text20, fontFamily = ralewaySemiBold)
        Spacer(Modifier.width(size8H))
        Text(
            modifier = Modifier
                .background(bgSquare,RoundedCornerShape(5.dp))
                .padding(top = size4V, bottom = size4V, start = size10H, end = size10H),
            text=textTwo,
            fontSize = text13,
            lineHeight = text17,
            fontFamily = ralewayRegular
        )
        Text(
            modifier = Modifier.weight(1f),
            text = textThree,
            fontSize = text16,
            lineHeight = text17,
            fontFamily = ralewayBold,
            textAlign = TextAlign.End
        )
    }
}