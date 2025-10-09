package com.example.learningjetpackcompose.presentation.shopping_ui.history

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.draw.shadow
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
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.SpacerView

@Preview
@Composable
fun ItemHistory(
    img : Int = R.drawable.img_hello,
    size6H : Dp = 6.dp,
    size109V : Dp = 109.dp,
    size129H : Dp = 129.dp,
    size10H : Dp = 10.dp,
    size30V : Dp = 30.dp,
    text12 : TextUnit = 12.sp,
    text16 : TextUnit = 16.sp,
    text14 : TextUnit = 14.sp,
    text18 : TextUnit = 18.sp,
    text13 : TextUnit = 13.sp,
    text17 : TextUnit = 17.sp,
    text20 : TextUnit = 20.sp,
    nunitoRegular : FontFamily = NunitoRegular,
    ralewayBold : FontFamily = RalewayBold,
    ralewayRegular : FontFamily = RalewayRegular
){
    Row {
        Box(
            modifier = Modifier
                .height(size109V).width(size129H)
                .shadow(elevation = 2.dp,RoundedCornerShape(10.dp),clip = false)
                .background(Color.White, RoundedCornerShape(10.dp))
                .padding(5.dp)
        ){
            Image(
                painter = painterResource(img),
                contentDescription = "",
                modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillBounds
            )
        }
        Spacer(Modifier.width(size10H))
            Column(modifier = Modifier.height(size109V), verticalArrangement = Arrangement.SpaceBetween){
                Text("Lorem ipsum dolor sit amet consectetur.", fontSize = text12, lineHeight = text16, fontFamily = nunitoRegular)

                Text("Order #92287157", fontSize = text14, lineHeight = text18, fontFamily = ralewayBold)
                Row {
                        Box(
                            modifier = Modifier.height(size30V).weight(1f)
                                .background(Color(0xFFF9F9F9),RoundedCornerShape(10.dp)),
                            contentAlignment = Alignment.Center
                        ){
                            Text("April,06", fontSize = text13, lineHeight = text17, fontFamily = ralewayRegular)
                        }
                        Spacer(Modifier.width(size6H))
                        Box(
                            modifier =
                                Modifier.height(size30V)
                                    .border(2.dp, color = Color(0xFF004CFF),RoundedCornerShape(10.dp))
                                    .weight(1f),
                            contentAlignment = Alignment.Center
                        ){
                            Text("Review", fontSize = text16, lineHeight = text20, color = Color(0xFF004CFF), fontFamily = ralewayRegular)
                        }
                    }
            }
        }
}