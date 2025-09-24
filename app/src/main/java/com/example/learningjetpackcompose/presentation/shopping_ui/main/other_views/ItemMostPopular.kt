package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Composable
fun ItemMostPopular(img : Int,text : String,height : Dp,imgHeight : Dp,margin5 : Dp,text15 : TextUnit,text19 : TextUnit,raleway : Font,ralewayRegular : Font,margin1 : Dp,text13 : TextUnit,text17 : TextUnit,margin10 : Dp){
    Column(
        modifier = Modifier
            .shadow(elevation = 2.dp, shape = RoundedCornerShape(9.dp))
            .background(Color.White,RoundedCornerShape(9.dp))
            .height(height)
            .aspectRatio(0.742f)
            .padding(top = margin5, start = margin5, end = margin5)
    ){
        Image(painter = painterResource(img), contentDescription = "", modifier = Modifier.clip(RoundedCornerShape(9.dp)).height(imgHeight).aspectRatio(0.902f), contentScale = ContentScale.Crop)
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart){
            Row(verticalAlignment = Alignment.CenterVertically){
                Text("1780", fontSize = text15, lineHeight = text19, fontFamily = FontFamily(raleway))
                Spacer(Modifier.width(margin1))
                Image(painter = painterResource(R.drawable.heart), contentDescription = "", colorFilter = ColorFilter.tint(Color(0xFF0042E0)), modifier = Modifier.size(margin10))
            }
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd){
                Text(text, fontSize = text13, lineHeight = text17, fontFamily = FontFamily(ralewayRegular))
            }
        }
    }
}