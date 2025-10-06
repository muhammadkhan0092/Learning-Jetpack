package com.example.learningjetpackcompose.presentation.shopping_ui.wishlist.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoLight
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular


@Composable
fun WishListItem(
    size6H: Dp = 6.dp,
    size35: Dp = 35.dp,
    size129H: Dp = 129.dp,
    size45H: Dp = 45.dp,
    size25V: Dp = 25.dp,
    size29H: Dp = 29.dp,
    size13V: Dp = 14.dp,
    size28V: Dp = 28.dp,
    text12: TextUnit = 12.sp,
    text16: TextUnit = 16.sp,
    text14: TextUnit = 14.sp,
    text18: TextUnit = 18.sp,
    text22: TextUnit = 22.sp,
    ralewayRegular: FontFamily = RalewayRegular,
    nunitoRegular: FontFamily = NunitoLight,
    RalewayBold: FontFamily
){
    Row(){
        Box(
            modifier = Modifier.size(size129H)
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
        Spacer(Modifier.width(size6H))
        Column {
            Text("Lorem ipsum dolor sit amet \nconsectetur.", fontSize = text12, lineHeight = text16, fontFamily = nunitoRegular)
            Spacer(Modifier.height(size25V))
            Text("\$17,00", fontSize = text18, lineHeight = text22, fontFamily = RalewayBold)
            Spacer(Modifier.height(size13V))
            Row(verticalAlignment = Alignment.CenterVertically){
                ItemWishlistOption("Pink",text14,text18,size45H,size28V,ralewayRegular)
                Spacer(modifier = Modifier.width(size6H))
                ItemWishlistOption("M",text14,text18,size45H,size28V,ralewayRegular)
                Spacer(Modifier.height(0.dp).weight(1f))
                Image(
                    painter = painterResource(R.drawable.img_wishlist_add),
                    contentDescription = "",
                    modifier = Modifier.height(size25V).width(size29H)
                )
            }
        }
    }
}