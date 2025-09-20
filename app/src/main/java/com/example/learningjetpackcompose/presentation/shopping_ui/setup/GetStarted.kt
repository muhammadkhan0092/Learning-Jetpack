package com.example.learningjetpackcompose.presentation.shopping_ui.setup

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ButtonFrontArrow
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.LargeBlueButton


@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun GetStarted(onClick : ()-> Unit){
    val ralewayFont = Font(R.font.raleway_bold)
    val nunitoFont = Font(R.font.nuninto_light)
    val text19 = dimensionResource(R.dimen.sp_19).value.sp
    val text52 = dimensionResource(R.dimen.sp_52).value.sp
    val text26 = dimensionResource(R.dimen.sp_26).value.sp
    val text15 = dimensionResource(R.dimen.sp_15).value.sp
    val text33 = dimensionResource(R.dimen.sp_33).value.sp
    val margin18 = dimensionResource(R.dimen.dp_18)
    BoxWithConstraints(modifier = Modifier.fillMaxSize().clickable {onClick()}) {
        val maxWidth = maxWidth
        val maxHeight = maxHeight
        Box(modifier = Modifier.offset(0.dp,maxHeight*0.244f).fillMaxWidth(), contentAlignment = Alignment.Center){
            Card(
                shape = RoundedCornerShape(120.dp),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.cardElevation(8.dp),
                modifier = Modifier
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
        }
        Column(Modifier.offset(0.dp,maxHeight*0.457f).fillMaxWidth()) {
            Text(
                "Shoppe",
                fontSize = text52,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontFamily = FontFamily(ralewayFont),
                modifier = Modifier
                    .fillMaxWidth(1f)
            )
            Spacer(modifier = Modifier.height(margin18))
            Text(
                "Beautiful eCommerce UI Kit\nfor your online store",
                fontSize = text19,
                lineHeight = text33,
                fontFamily = FontFamily(nunitoFont),
                color = Color(0xFF202020),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
        LargeBlueButton(
            "Let's get started",
            Modifier
            .offset(maxWidth*0.053f,maxHeight*0.754f)
            .fillMaxWidth(0.893f)
            .fillMaxHeight(0.078f))
        Text(
            "I already have an account",
            fontSize = text15,
            lineHeight =text26,
            fontFamily = FontFamily(nunitoFont),
            modifier = Modifier.offset(maxWidth*0.216f,maxHeight*0.863f)
        )
        ButtonFrontArrow(Modifier.offset(maxWidth*0.705f,maxHeight*0.855f))
    }
}