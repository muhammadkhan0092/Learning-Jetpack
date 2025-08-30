package com.example.learningjetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeTheme {
                HomeLauncher()
            }
        }
    }
}
@Preview(showSystemUi = true)
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
            modifier = Modifier.fillMaxWidth(0.277f).fillMaxHeight(0.14f).offset(screenWidth * 0.120f,screenHeight*0.097f),
            color = Color.Black,
            strokeWidth = 1.dp
        )
        defaultAppComposable(screenWidth * 0.222f,screenHeight * 0.153f,InterFontFamily,"85",20.sp)
        Column(modifier =Modifier.offset(screenWidth * 0.120f,screenHeight * 0.3029f)){
            defaultAppComposable(screenWidth * 0.0f,screenHeight * 0.0f,FontFamily(Font(R.font.inter_light, weight = FontWeight.Light)),"8:14",48.sp)
            defaultAppComposable(screenWidth * 0.0f,screenHeight * 0.0f,FontFamily(Font(R.font.inter_thin, weight = FontWeight.Thin)),"Mon Nov 21",32.sp)
        }
        defaultAppComposable(screenWidth * 0.120f,screenHeight * 0.5f,InterFontFamily,"Call",24.sp)
        defaultAppComposable(screenWidth * 0.120f,screenHeight * 0.57f,InterFontFamily,"Message",24.sp)
        defaultAppComposable(screenWidth * 0.120f,screenHeight * 0.64f,InterFontFamily,"Camera",24.sp)
        defaultAppComposable(screenWidth * 0.120f,screenHeight * 0.71f,InterFontFamily,"Music",24.sp)
        defaultAppComposable(screenWidth * 0.120f,screenHeight * 0.919f,FontFamily(Font(R.font.inter_light, weight = FontWeight.Light)),"| Apps",16.sp)
    }
}
@Composable
fun defaultAppComposable(width : Dp,height : Dp,fontFamily : FontFamily,text : String = "",textSize : TextUnit){
    Text(
        modifier = Modifier.offset(width, height),
        text = text,
        fontFamily = fontFamily,
        color = Color.Black,
        fontSize = textSize,
        textAlign = TextAlign.Left,
    )
}
