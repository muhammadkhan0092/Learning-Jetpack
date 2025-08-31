package com.example.learningjetpackcompose

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun HomeLauncher() {
    BoxWithConstraints(modifier = Modifier.fillMaxSize().background(Color(0xFFDFDDD3))) {
        val screenHeight = maxHeight      // This is a Dp
        val screenWidth = maxWidth        // This is a Dp
        val InterFontFamily = FontFamily(
            Font(R.font.inter_extra_light, weight = FontWeight.ExtraLight)
        )
        CircularProgressIndicator(
            progress = 0.7f,
            modifier = Modifier.fillMaxWidth(0.277f).fillMaxHeight(0.14f)
                .offset(screenWidth * 0.120f, screenHeight * 0.097f),
            color = Color.Black,
            strokeWidth = 1.dp
        )
        defaultAppComposable(
            screenWidth * 0.222f,
            screenHeight * 0.153f,
            InterFontFamily,
            "85",
            20.sp
        )
        Column(modifier = Modifier.offset(screenWidth * 0.120f, screenHeight * 0.3029f)) {
            defaultAppComposable(
                screenWidth * 0.0f,
                screenHeight * 0.0f,
                FontFamily(Font(R.font.inter_light, weight = FontWeight.Light)),
                "8:14",
                48.sp
            )
            defaultAppComposable(
                screenWidth * 0.0f,
                screenHeight * 0.0f,
                FontFamily(Font(R.font.inter_thin, weight = FontWeight.Thin)),
                "Mon Nov 21",
                32.sp
            )
        }
        defaultAppComposable(
            screenWidth * 0.120f,
            screenHeight * 0.5f,
            InterFontFamily,
            "Call",
            24.sp
        )
        defaultAppComposable(
            screenWidth * 0.120f,
            screenHeight * 0.57f,
            InterFontFamily,
            "Message",
            24.sp
        )
        defaultAppComposable(
            screenWidth * 0.120f,
            screenHeight * 0.64f,
            InterFontFamily,
            "Camera",
            24.sp
        )
        defaultAppComposable(
            screenWidth * 0.120f,
            screenHeight * 0.71f,
            InterFontFamily,
            "Music",
            24.sp
        )
        defaultAppComposable(
            screenWidth * 0.120f,
            screenHeight * 0.919f,
            FontFamily(Font(R.font.inter_light, weight = FontWeight.Light)),
            "| Apps",
            16.sp
        )
    }
}