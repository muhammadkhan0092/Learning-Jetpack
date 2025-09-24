package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
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
fun ItemNewItem(size : Dp=140.dp,textOne : TextUnit,lineHeightOne : TextUnit,textTwo : TextUnit,lineHeightTwo : TextUnit,marginOne : Dp,marginTwo : Dp,raleway : Font,nun : Font,padding : Dp){
    Column(modifier = Modifier.width(size)){
        Box(
            modifier = Modifier
                .shadow(elevation = 10.dp, RoundedCornerShape(10.dp), clip = false)
                .size(size)
                .background(Color.White,RoundedCornerShape(10.dp))
                .padding(padding)
        ){
            Image(painter = painterResource(R.drawable.img_hello), contentDescription = "", modifier = Modifier.clip(RoundedCornerShape(10.dp)).fillMaxSize())
        }
        Spacer(Modifier.height(marginOne))
        Text("Lorem ipsum dolor sit amet consectetur.", fontFamily = FontFamily(nun), fontSize = textOne, lineHeight = lineHeightOne)
        Spacer(Modifier.height(marginTwo))
        Text("\$17,00", fontFamily = FontFamily(raleway), fontSize = textTwo, lineHeight = lineHeightTwo)
    }
}