package com.example.learningjetpackcompose.shopping_ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.basic_components.EditTextComposable
import com.example.learningjetpackcompose.shopping_ui.common_views.LargeBlueButton

@Preview(showSystemUi = true)
@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun LoginScreen(){
    val raleway = Font(R.font.raleway_bold)
    val nunitoSans = Font(R.font.nuninto_light)
    Image(
        painter = painterResource(R.drawable.bg_top),
        contentDescription = "",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxWidth(0.75f).aspectRatio(1.09f)
    )
    Image(
        painter = painterResource(R.drawable.bg_bottom),
        contentDescription = "",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxWidth(0.6f).aspectRatio(1.09f)
    )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterEnd){
        Image(
            painter = painterResource(R.drawable.bg_login_center),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxHeight(0.2f).aspectRatio(0.5f)
        )
    }
    Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.fillMaxSize().padding( start = 20.dp)) {
        BoxWithConstraints(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.420f)
        ) {
            val width = maxWidth
            val height = maxHeight
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd){
                Image(
                    painter = painterResource(R.drawable.bg_bottom_login),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxWidth(0.75f).aspectRatio(1f)
                )
            }
            Column {
                Text("Login", fontSize = 52.sp, fontFamily = FontFamily(raleway))
                Spacer(modifier = Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically){
                    Text("Good to see you back!", fontSize = 19.sp, lineHeight = 35.sp, fontFamily = FontFamily(nunitoSans))
                    Spacer(modifier = Modifier.width(10.2.dp))
                    Image(painter = painterResource(R.drawable.heart), contentDescription = "")
                }
                Spacer(modifier = Modifier.height(17.dp))
                EditTextComposable(hint = "Email", Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(36.dp))
                LargeBlueButton("Next", Modifier.fillMaxWidth().fillMaxHeight(0.40f).padding(end = 20.dp))
                Spacer(modifier = Modifier.height(14.dp))
                Text("Cancel", modifier = Modifier.fillMaxWidth().padding(end = 20.dp), textAlign = TextAlign.Center, fontSize = 15.sp, fontFamily = FontFamily(nunitoSans))
            }
        }
    }
}
