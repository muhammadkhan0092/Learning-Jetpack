package com.example.learningjetpackcompose.presentation.shopping_ui.settings.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Composable
fun CardView(
    size14V: Dp,
    size10V: Dp,
    size35V: Dp,
    size155V: Dp,
    size33V: Dp,
    size45H: Dp,
    size17H: Dp,
    size10H: Dp,
    text13: TextUnit,
    text12: TextUnit,
    text7H: TextUnit,
    text2H: TextUnit,
    text1_5_H: TextUnit,
    text10H: TextUnit,
    nunitoBold: Font,
    onAddClicked: () -> Unit
){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(size10H)
    ){
        Column (
            modifier = Modifier
                .height(size155V)
                .weight(1f)
                .background(Color(0xFFF1F4FE),RoundedCornerShape(10.dp))
                .padding(start = size17H, end = size17H, top = size14V)
        ){
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ){
                Image(
                    painter = painterResource(R.drawable.ic_mastercard),
                    contentDescription = "",
                    modifier = Modifier.height(size35V).aspectRatio(1.616f)
                )
            }
            Spacer(Modifier.height(size33V))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ){
                Text("****  ****  **** ", fontSize = text12, letterSpacing = text7H, fontFamily = FontFamily(nunitoBold), textAlign = TextAlign.Center)
                Text("1579",fontSize = text12, letterSpacing = text2H, fontFamily = FontFamily(nunitoBold))
            }
            Spacer(Modifier.height(size10V))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ){
                Text("Amanda Morgan", fontSize = text10H, fontFamily = FontFamily(nunitoBold), letterSpacing = text1_5_H)
                Text("12/22", fontSize = text12, fontFamily = FontFamily(nunitoBold), letterSpacing = text1_5_H)
            }
        }
        Box(
            modifier = Modifier
                .height(size155V)
                .width(size45H)
                .background(Color(0xFF004CFF),RoundedCornerShape(9.dp)).clickable{onAddClicked()},
            contentAlignment = Alignment.Center
        ){
            Text(
                "+",
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
    }
}