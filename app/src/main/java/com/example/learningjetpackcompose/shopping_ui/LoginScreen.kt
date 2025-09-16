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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.shopping_ui.common_views.EditTextComposable
import com.example.learningjetpackcompose.shopping_ui.common_views.LargeBlueButton
import com.example.learningjetpackcompose.shopping_ui.common_views.TopLeftTwoBg

@Preview(showSystemUi = true)
@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun LoginScreen(){
    val raleway = Font(R.font.raleway_bold)
    val nunitoSans = Font(R.font.nuninto_light)
    TopLeftTwoBg()
    Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.fillMaxSize().padding( start = 20.dp)) {
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.683f), contentAlignment = Alignment.TopEnd){
            Image(painter = painterResource(R.drawable.bg_login_center), contentDescription = "", contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxHeight(0.3f).aspectRatio(0.5f))
        }
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd){
            Image(
                    painter = painterResource(R.drawable.bg_bottom_login),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxWidth(0.75f).aspectRatio(1f)
                )
            }
        val text52 = dimensionResource(R.dimen.sp_52).value.sp
        val text19 = dimensionResource(R.dimen.sp_19).value.sp
        val text35 = dimensionResource(R.dimen.sp_35).value.sp
        val text15 = dimensionResource(R.dimen.sp_15).value.sp
        val margin20 = dimensionResource(R.dimen.dp_20)
        val margin36 = dimensionResource(R.dimen.dp_36)
        val margin17 = dimensionResource(R.dimen.dp_17)
        val margin14 = dimensionResource(R.dimen.dp_14)
        val margin10 = dimensionResource(R.dimen.dp_10)
        val height4 = dimensionResource(R.dimen.dp_4)
        Box(contentAlignment = Alignment.TopCenter, modifier = Modifier.fillMaxWidth().fillMaxHeight(0.420f)){
            Column {
                Text("Login", fontSize =text52, fontFamily = FontFamily(raleway))
                Spacer(modifier = Modifier.height(height4))
                Row(verticalAlignment = Alignment.CenterVertically){
                    Text("Good to see you back!", fontSize =text19, lineHeight = text35, fontFamily = FontFamily(nunitoSans))
                    Spacer(modifier = Modifier.width(margin10))
                    Image(painter = painterResource(R.drawable.heart), contentDescription = "")
                }
                Spacer(modifier = Modifier.height(margin17))
                EditTextComposable(hint = "Email", Modifier.fillMaxWidth().padding(end = margin20))
                Spacer(modifier = Modifier.height(margin36))
                LargeBlueButton("Next", Modifier.fillMaxWidth().fillMaxHeight(0.40f).padding(end = margin20))
                Spacer(modifier = Modifier.height(margin14))
                Text("Cancel", modifier = Modifier.fillMaxWidth().padding(end = margin20), textAlign = TextAlign.Center, fontSize = text15, fontFamily = FontFamily(nunitoSans))
            }
            }

    }
}
