package com.example.learningjetpackcompose.presentation.shopping_ui.cart

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoLight
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewaySemiBold

@Preview
@Composable
fun CartItem(
    count : Int = 1,
    size6H: Dp = 6.dp,
    size10H : Dp = 10.dp,
    size30H : Dp = 30.dp,
    size35: Dp = 35.dp,
    size129H: Dp = 129.dp,
    size109V : Dp = 109.dp,
    size37H : Dp = 37.dp,
    size30V : Dp = 30.dp,
    size5V : Dp=5.dp,
    size23V : Dp = 23.dp,
    text12 : TextUnit =12.sp,
    text16 : TextUnit = 16.sp,
    text14 : TextUnit = 14.sp,
    text18 : TextUnit = 18.sp,
    text22 : TextUnit = 22.sp,
    ralewayBold : FontFamily = RalewayBold,
    ralewaySemiBold : FontFamily = RalewaySemiBold,
    nunitoRegular : FontFamily = NunitoRegular
){
    Row(modifier = Modifier.fillMaxWidth()){
        Box(
            modifier = Modifier.width(size129H).height(size109V)
                .background(Color.White,RoundedCornerShape(10.dp))
                .padding(5.dp)
        ){
            Image(
                painter = painterResource(R.drawable.img_hello),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(10.dp))
            )
            Box(
                modifier = Modifier.fillMaxSize().padding(start = size6H, bottom = size6H),
                contentAlignment = Alignment.BottomStart
            ){
                Box(
                    modifier = Modifier
                        .size(size35)
                        .background(Color.White, RoundedCornerShape(100.dp))
                        .padding(size6H),
                    contentAlignment = Alignment.Center
                ){
                    Image(painter = painterResource(R.drawable.img_wishlist_delete), contentDescription = "")
                }
            }
        }
        Spacer(Modifier.width(size10H))
        Column(modifier = Modifier.fillMaxWidth()){
            Text("Lorem ipsum dolor sit amet\nconsectetur.",fontSize = text12, lineHeight = text16, fontFamily = nunitoRegular)
            Spacer(Modifier.height(size5V))
            Text("Pink, Size M", fontSize = text14, lineHeight = text18, fontFamily = ralewaySemiBold)
            Spacer(Modifier.height(size23V))
            Box(
                contentAlignment = Alignment.CenterStart
            ){
                Text("\$17,00", fontSize = text18, lineHeight = text22, fontFamily =ralewayBold)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
                    Image(
                        painter = painterResource(R.drawable.ic_less),
                        contentDescription = "",
                        modifier = Modifier.size(size30H)
                    )
                    Spacer(Modifier.width(size6H))
                    Box(
                        modifier = Modifier
                            .width(size37H).height(size30V)
                            .background(Color(0xFFE5EBFC),RoundedCornerShape(7.dp))
                        ,
                        contentAlignment = Alignment.Center
                    ){
                        Text("$count")
                    }
                    Spacer(Modifier.width(size6H))
                    Image(
                        painter = painterResource(R.drawable.ic_more),
                        contentDescription = "",
                        modifier = Modifier.size(size30H)
                    )
                }
            }
        }
    }
}