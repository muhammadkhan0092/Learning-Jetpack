package com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.ProfileEt
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.other_views.CardView


@Preview(showSystemUi = true)
@Composable
fun SettingsPayment(width : Dp = 375.dp,height : Dp = 812.dp){
    val size7V = height*0.008f
    val size12V = height*0.0147f
    val size14V = height*0.017f
    val size30V = height*0.0369f
    val size20V = height*0.023f
    val size10V = height*0.012f
    val size27V = height*0.033f
    val size35V = height*0.043f
    val size44V = height*0.054f
    val size50V = height*0.061f
    val size105V = height*0.128f
    val size155V = height*0.190f
    val size1V = height*0.00123f
    val size18V = height*0.0221f
    val size20H = width*0.0533f
    val size33V = height*0.040f



    val size45H = width*0.12f
    val size16H = width*0.042f
    val size17H = width*0.045f
    val size10H = width*0.026f



    val text13 = (height*0.0160f).value.sp
    val text12 = (height*0.0147f).value.sp
    val text15 = (height*0.018f).value.sp
    val text16 = (height*0.019f).value.sp
    val text20 = (height*0.024f).value.sp
    val text25 = (height*0.030f).value.sp
    val text21 = (height*0.025f).value.sp
    val text28 = (height*0.0344f).value.sp
    val text36 = (height*0.044f).value.sp

    val text12H = (width*0.032f).value.sp
    val text7H = (width*0.018f).value.sp
    val text2H = (width*0.0048f).value.sp
    val text1_5_H = (width*0.004f).value.sp
    val text10H = (width*0.026f).value.sp
    val nunitoBold = Font(R.font.nunito_bold)
    val ralewayBold = Font(R.font.raleway_bold)
    val ralewaySemiBold = Font(R.font.raleway_semi_bold)
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = size30V, start = size20H, end = size20H, bottom = size20V)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                "Settings",
                fontSize = text28,
                lineHeight = text36,
                fontFamily = FontFamily(ralewayBold)
            )
            Spacer(Modifier.height(size7V))
            Text(
                "Payment Methods",
                fontSize = text16,
                lineHeight = text21,
                fontFamily = FontFamily(ralewaySemiBold)
            )
            Spacer(Modifier.height(size27V))
            CardView(
                size14V,
                size10V,
                size35V,
                size155V,
                size33V,
                size45H,
                size17H,
                size10H,
                text13,
                text12,
                text7H,
                text2H,
                text1_5_H,
                text10H,
                nunitoBold
            )
        }
    }
}