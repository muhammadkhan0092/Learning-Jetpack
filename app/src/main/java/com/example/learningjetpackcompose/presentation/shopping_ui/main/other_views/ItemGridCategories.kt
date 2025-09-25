package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Composable
fun ItemGridCategories(textOne : String,textTwo : String,imgOne : Int,imgTwo : Int,imgThree : Int,imgFour : Int,margin4 : Dp,margin6 : Dp,margin5 : Dp,height : Dp,width : Dp,margin1 : Dp,raleway : Font,text17 : TextUnit,text21: TextUnit,text12 : TextUnit,margin8 : Dp){
    Column(
        verticalArrangement = Arrangement.spacedBy(margin4)
        ,modifier = Modifier
            .shadow(elevation = 2.dp, shape = RoundedCornerShape(10.dp), clip = false)
            .background(Color.White, RoundedCornerShape(10.dp))
            .padding(start = margin6, end = margin6, top = margin6, bottom = margin5)){
            Row(horizontalArrangement = Arrangement.spacedBy(margin4), modifier = Modifier.background(Color.White,
                RoundedCornerShape(10.dp))){
                ItemSquareImage(imgOne,height)
                ItemSquareImage(imgTwo,height)
            }
        Row(horizontalArrangement = Arrangement.spacedBy(margin4), modifier = Modifier.background(Color.White,
            RoundedCornerShape(10.dp))){
            ItemSquareImage(imgThree,height)
            ItemSquareImage(imgFour,height)
        }
        Spacer(Modifier.height(margin1))
        Row(modifier = Modifier.width(width), verticalAlignment = Alignment.CenterVertically){
            Text(textOne, fontFamily = FontFamily(raleway), fontSize = text17, lineHeight = text21, modifier = Modifier.weight(1f))
            Text(
                textTwo, modifier = Modifier.background(Color(0xFFF3F3F3),RoundedCornerShape(6.dp)).padding(top = margin4, bottom = margin4, start = margin8, end = margin8),
                textAlign = TextAlign.End, fontSize = text12,
                fontFamily = FontFamily(raleway)
            )
        }
    }
}