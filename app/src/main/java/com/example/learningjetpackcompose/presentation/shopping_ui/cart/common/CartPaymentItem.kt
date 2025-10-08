package com.example.learningjetpackcompose.presentation.shopping_ui.cart.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold

@Preview
@Composable
fun CartPaymentItem(
    img : Int = R.drawable.img_hello,
    size60H : Dp = 60.dp,
    size25H : Dp = 25.dp,
    size9H : Dp = 9.dp,
    text12 : TextUnit = 12.sp,
    text13 : TextUnit =13.sp,
    text16 : TextUnit = 16.sp,
    text18 : TextUnit = 18.sp,
    text22 : TextUnit = 22.sp,
    nunitoRegular : FontFamily = NunitoRegular,
    ralewayBold : FontFamily = RalewayBold
){
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
        Box(
            modifier = Modifier.size(size60H)
                .background(Color.White, RoundedCornerShape(100.dp)),
            contentAlignment = Alignment.TopEnd
        ){
            ItemRoundedImage(img,size60H)
            Box(
                modifier = Modifier
                    .size(size25H)
                    .background(Color.White, RoundedCornerShape(100.dp))
                    .padding(2.dp)
            ){
                Text(
                    text = "1",
                    fontSize = text13,
                    lineHeight = text18,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFE5EBFC), RoundedCornerShape(100.dp))
                )
            }
        }
        Spacer(Modifier.width(size9H))
        Text("Lorem ipsum dolor sit amet \nconsectetur.", fontSize = text12, lineHeight = text16, fontFamily = nunitoRegular)
        Text("$17,00", modifier = Modifier.weight(1f), textAlign = TextAlign.End, fontSize = text18, lineHeight = text22, fontFamily = ralewayBold)
    }
}