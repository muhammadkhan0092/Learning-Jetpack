package com.example.learningjetpackcompose.presentation.shopping_ui.setup.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.LargeBlueButton

@Preview(showSystemUi = true)
@Composable
fun HelloAndReadyCard(
    img: Int = R.drawable.img_hello,
    heading: String ="fsad",
    content: String ="das",
    type: String=""
){
    val raleBold = Font(R.font.raleway_bold)
    val nunLight = Font(R.font.nunito_light)
    val margin46 = dimensionResource(R.dimen.dp_46)
    val margin30 = dimensionResource(R.dimen.dp_30)
    val margin12 = dimensionResource(R.dimen.dp_12)
    val text28 = dimensionResource(R.dimen.sp_28).value.sp
    val text36 = dimensionResource(R.dimen.sp_36).value.sp
    val text19 = dimensionResource(R.dimen.sp_19).value.sp
    val text27 = dimensionResource(R.dimen.sp_27).value.sp
    Column(
        modifier = Modifier.fillMaxSize()
            .shadow(
                elevation = 20.dp,
                shape = CircleShape,
                clip = false
            )
            .background(color = Color.White, RoundedCornerShape(30.dp))
    ) {
        Image(
            painter = painterResource(img),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(0.964f)
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
            contentScale = ContentScale.FillBounds
        )
        Spacer(Modifier.height(margin46))
        Text(heading, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = text28, lineHeight = text36, fontFamily = FontFamily(raleBold))
        Spacer(Modifier.height(margin12))
        Text(content, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,fontSize = text19, lineHeight = text27, fontFamily = FontFamily(nunLight))
        Spacer(Modifier.height(margin30))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            if(type!="HELLO") LargeBlueButton("Let's Start", modifier = Modifier.fillMaxWidth(0.5f))
        }
    }
}