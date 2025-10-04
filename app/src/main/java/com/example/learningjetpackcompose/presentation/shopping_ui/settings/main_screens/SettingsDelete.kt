package com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.SmallButton

@Composable
fun SettingsDelete(
    modifier: Modifier = Modifier,
    size7V : Dp,
    size20V : Dp,
    size25V : Dp,
    size57V : Dp,
    size37H : Dp,
    size40H : Dp ,
    size80V : Dp,
    size60V : Dp,
    size40V : Dp,
    size30V : Dp,
    text16 : TextUnit,
    text25 : TextUnit,
    text18 : TextUnit,
    text26: TextUnit,
    text13 : TextUnit,
    text20 : TextUnit,
    ralewayRegular : FontFamily,
    nunitoLight : FontFamily
) {
    Box(
        modifier = Modifier.padding(start = size20V, end = size20V)
    ){
        Box(
            modifier =
                Modifier.fillMaxWidth()
        ){
            Column(
                modifier = Modifier
                    .offset(0.dp,size40V)
                    .shadow(elevation = 5.dp, clip = false, shape = RoundedCornerShape(15.dp))
                    .background(Color.White, RoundedCornerShape(15.dp))

            ){
                Spacer(Modifier.height(size57V))
                Text("You are going to delete\n" + "your account", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = text18, lineHeight = text26, fontFamily = ralewayRegular)
                Spacer(Modifier.height(5.dp))
                Text("You won't be able to restore your data", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = text13, lineHeight = text20)
                Spacer(Modifier.height(size25V))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center){
                    SmallButton("Cancel",Color(0xFF202020),size7V,size40H,text16,text25,
                        nunitoLight
                    )
                    Spacer(Modifier.width(size20V))
                    SmallButton("Delete",Color(0xFFD97474),size7V,size40H,text16,text25,
                        nunitoLight
                    )
                }
                Spacer(Modifier.height(size20V))
            }
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                Box(
                    modifier = Modifier
                        .size(size80V)
                        .shadow(
                            elevation = 20.dp,
                            shape = CircleShape,
                            clip = false
                        )
                        .background(Color.White, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier.size(size60V)
                            .background(Color(0xFFFFEBEB), CircleShape)
                    )
                    Box(
                        modifier = Modifier.size(size40V)
                            .background(Color.White, CircleShape)
                    )
                    Box(
                        modifier = Modifier.size(size30V)
                            .background(Color.Black, CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_tick),
                            contentDescription = ""
                        )
                    }
                }
            }
        }


    }
}