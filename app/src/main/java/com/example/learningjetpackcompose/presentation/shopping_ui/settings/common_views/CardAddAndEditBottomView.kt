package com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun CardAddAndEditBottomView(
    size20H: Dp,
    size10H: Dp,
    size27V: Dp,
    size7V: Dp,
    size20V: Dp,
    size18V: Dp,
    size50V: Dp,
    text21: TextUnit,
    text13: TextUnit,
    text16: TextUnit,
    text20: TextUnit,
    text25: TextUnit,
    ralewayBold: Font,
    nunitoSemiBold: Font,
    holder: String = "",
    number : String ="",
    valid : String = "",
    cvv : String ="",
    type: String = "Add Card",
    onSaveClicked :()-> Unit
){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
        Column(
            modifier = Modifier
                .background(Color(0xFFF8FAFF),RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
                .padding(start = size20H, end = size20H)
        ){
            Text(
                type,
                fontSize = text21,
                fontFamily = FontFamily(ralewayBold),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = size27V, bottom = size27V)
            )
            Column(modifier = Modifier.background(Color.White)){
                Spacer(Modifier.height(size20V))
                Text("Card Holder", fontSize = text13, lineHeight = text20, fontFamily = FontFamily(nunitoSemiBold))
                ProfileEt("Required",holder,size50V,text16,text20,size20H)
                Spacer(Modifier.height(size18V))
                Text("Card Number", fontSize = text13, lineHeight = text20, fontFamily = FontFamily(nunitoSemiBold))
                ProfileEt("Required",number,size50V,text16,text20,size20H)
                Spacer(Modifier.height(size18V))
                Row(horizontalArrangement = Arrangement.spacedBy(size10H)){
                    Column(Modifier.weight(1f)){
                        Text("Valid", fontSize = text13, lineHeight = text20, fontFamily = FontFamily(nunitoSemiBold))
                        ProfileEt("Required",valid,size50V,text16,text20,size20H)
                    }
                    Column(Modifier.weight(1f)){
                        Text("Cvv", fontSize = text13, lineHeight = text20, fontFamily = FontFamily(nunitoSemiBold))
                        ProfileEt("Required",cvv,size50V,text16,text20,size20H)
                    }
                }
                Spacer(Modifier.height(size18V))
                Text(
                    "Save Changes",
                    Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF004CFF), RoundedCornerShape(9.dp))
                        .clickable{
                            onSaveClicked()
                        }
                        .padding(top = size7V, bottom = size7V)
                    ,
                    textAlign = TextAlign.Center,
                    fontSize = text16,
                    lineHeight = text25,
                    color = Color.White
                )
                Spacer(Modifier.height(size20V))
            }
        }
    }
}