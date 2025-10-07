package com.example.learningjetpackcompose.presentation.shopping_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage

@Composable
fun ReviewsItem(
    size40H : Dp = 40.dp,
    size20H : Dp=20.dp,
    size4V : Dp=4.dp,
    size10V : Dp=10.dp,
    size5H : Dp = 5.dp,
    size15V : Dp = 15.dp,
    text16 : TextUnit = 16.sp,
    text20 : TextUnit = 20.sp,
    text12 : TextUnit = 12.sp,
    text18 : TextUnit = 18.sp,
    stars : Int,
    ralewaySemiBold : FontFamily,
    nunitoRegular : FontFamily
)
{
    Row(modifier = Modifier.fillMaxWidth()){
        ItemRoundedImage(R.drawable.img_hello,size40H)
        Spacer(Modifier.width(size20H))
        Column {
            Text("Veronika", fontSize = text16, lineHeight = text20, fontFamily = ralewaySemiBold)
            Spacer(Modifier.height(size4V))
            Row(horizontalArrangement = Arrangement.spacedBy(size5H)){
            repeat(5){
                val img =
                    if(it+1<=stars) R.drawable.ic_star_checked
                    else R.drawable.ic_star_unchecked
                Image(
                    painter = painterResource(img),
                    contentDescription = "",
                    modifier = Modifier.size(size15V),
                    contentScale = ContentScale.FillBounds
                )
            }
            }
            Spacer(Modifier.height(size10V))
            Text(
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum",
                fontSize = text12,
                lineHeight = text18,
                fontFamily = nunitoRegular
            )
        }
    }
}