package com.example.learningjetpackcompose.shopping_ui

import android.annotation.SuppressLint
import android.graphics.fonts.Font
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

//768
//375
@Preview(showSystemUi = true)
@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun GetStarted(){
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val maxWidth = maxWidth
        val maxHeight = maxHeight
        Card(
            shape = RoundedCornerShape(120.dp),
            colors = CardDefaults.cardColors(Color.White),
            elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier
                .offset(maxWidth*0.318f,maxHeight*0.244f)
                .fillMaxWidth(0.357f)
                .fillMaxHeight(0.174f)
                .aspectRatio(1f)
        )
        {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.img_shopping_back),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxHeight(0.686f)
                        .fillMaxWidth(0.607f)
                        .aspectRatio(1.095f)
                )
            }
        }
        Text(
            "Shoppe",
            fontSize = 52.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier
                .offset(0.dp,maxHeight*0.457f)
                .fillMaxWidth(1f)
        )
        val font = androidx.compose.ui.text.font.Font(R.font.nunito_regular)
        Text(
            "Beautiful eCommerce UI Kit for your online store",
            fontSize = 19.sp,
            lineHeight = 33.sp,
            fontFamily = FontFamily(font),
            color = Color(0xFF202020),
            textAlign = TextAlign.Center,
            modifier = Modifier.offset(maxWidth*0.168f,maxHeight*0.543f).fillMaxWidth(0.664f)
        )
        Button(
            shape = RoundedCornerShape(16.dp),
            colors = ButtonColors(
                containerColor = Color(0xFF004CFF),
                contentColor = Color(0xFFF3F3F3),
                disabledContainerColor = Color.White,
                disabledContentColor = Color(0xFF004CFF)
            ),
            modifier = Modifier
                .offset(maxWidth*0.053f,maxHeight*0.754f)
                .fillMaxWidth(0.893f)
                .fillMaxHeight(0.078f),
            onClick = {}
        ) {
            Text("Let's get started", fontSize = 22.sp)
        }
        Text(
            "I already have an account",
            fontSize = 15.sp,
            lineHeight = 26.sp,
            modifier = Modifier.offset(maxWidth*0.216f,maxHeight*0.863f)
        )
        Image(
            modifier = Modifier
                .fillMaxWidth(0.08f)
                .fillMaxHeight(0.038f)
                .offset(maxWidth*0.705f,maxHeight*0.855f)
                .aspectRatio(1f)
                .background(Color(0xFF004CFF),RoundedCornerShape(20.dp))
                .padding(top = 9.dp, bottom = 9.dp, start = 8.dp, end = 7.dp)
            ,
            painter = painterResource(R.drawable.ic_forward),
            contentDescription = ""
        )
    }
}