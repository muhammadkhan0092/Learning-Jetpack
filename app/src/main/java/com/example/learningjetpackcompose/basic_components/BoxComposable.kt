package com.example.learningjetpackcompose.basic_components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R


@SuppressLint("UnusedBoxWithConstraintsScope")
@Preview(showSystemUi = true)
@Composable
fun BoxComposable(){
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF282E36))
    ){
        Text(
            "You’re leaving?",
            color = Color(0xFFE2E0D7),
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxSize().offset(0.dp,maxHeight*0.07f),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        val width = maxWidth
        val height = maxHeight
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .offset(0.dp,height*0.576f)
                .fillMaxWidth()
                .fillMaxHeight(0.273f)
                .background(Color(0xFFCCBEAC))
        ){
            Text(
                "Do you really want to lose access to:",
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFF282E36),
                fontWeight = FontWeight.Bold,
            )
            val features = """• A beautifully minimalist OS
• Automatically blocked addictive apps
• Blocked notifications
• Mindful friction and accountability
• 15-minute limits
• Your dopamine journal
• Your carefully cultivated forest
""".trimIndent()
            Text(
               features,
                fontSize = 14.sp,
                color = Color(0xFF282E36),
                textAlign = TextAlign.Start,
                lineHeight = 21.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(start = 10.dp, end = 0.dp, bottom = 0.dp, top = 7.dp)
            )
        }
        Box(
            modifier = Modifier
                .offset(0.dp,height*0.15f)
                .fillMaxWidth()
                .fillMaxHeight(0.432f)
                .background(Color(0xFFE2E0D7)
                )
            ){
            Text(
                "Comparing your usage before & after Minimis Launcher, you'll lose x hours a month that you can use to enjoy real life with friends, family and hobbies!",
                fontWeight = FontWeight.Light,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.offset(width*0.09f,height*0.032f).fillMaxWidth(0.819f)
            )
            Image(
                contentDescription = "",
                painter = painterResource(R.drawable.img_thumbnail),
                contentScale = ContentScale.Crop,
                modifier = Modifier.offset(width*0.264f,height*0.178f).fillMaxWidth(0.49f).fillMaxHeight(0.5871f),
            )
        }
        Text(
            "| Uninstall",
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier
                .offset(width*0.08f,height*0.898f)
                .padding(top = 10.dp, bottom = 5.dp)
        )
        Text(
            "| Take me back",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .offset(width*0.5f,height*0.898f)
                .padding(top = 8.dp, bottom = 8.dp)
        )
    }
}