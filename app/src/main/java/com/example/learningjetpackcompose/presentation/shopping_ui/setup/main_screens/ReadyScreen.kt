package com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.other_views.HelloAndReadyCard
import com.example.learningjetpackcompose.presentation.shopping_ui.setup.other_views.SelectedReadyHello

@Preview(showSystemUi = true)
@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun ReadyScreen(){
    BoxWithConstraints {
        val width = maxWidth
        val height = maxHeight
        val margin30 = dimensionResource(R.dimen.dp_30)
        Box(
            modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.1f)
                .offset(0.dp,height*0.2f)
                .background(Color(0xFFF2F5FE), RoundedCornerShape(bottomStart = 30.dp))
        )
        Image(painter = painterResource(R.drawable.bg_bottom), contentDescription = "", contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxWidth(0.7f).aspectRatio(0.95f))
        Box(modifier = Modifier.fillMaxSize()) {
            Box(Modifier.fillMaxWidth().fillMaxHeight().padding(start = width * 0.065f, end = width * 0.065f, top = height * 0.045f, bottom = height * 0.144f)){
                HelloAndReadyCard(
                    R.drawable.img_ready,
                    "Ready?",
                    "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit.",
                    "READY"
                )
            }
        }
        Box(modifier = Modifier.fillMaxWidth().offset(0.dp,height*0.9f), contentAlignment = Alignment.Center){
            SelectedReadyHello()
        }
    }
}