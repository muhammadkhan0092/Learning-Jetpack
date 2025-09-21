package com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ButtonFrontArrow
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ProfileAvatar
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.TopLeftTwoBg

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun PasswordScreen(onClick : ()-> Unit){
    val raleway = Font(R.font.raleway_bold)
    val nunito = Font(R.font.nunito_light)
    val text28 = dimensionResource(R.dimen.sp_28).value.sp
    val text19 = dimensionResource(R.dimen.sp_19).value.sp
    val text36 = dimensionResource(R.dimen.sp_36).value.sp
    val text26 = dimensionResource(R.dimen.sp_26).value.sp
    val text15 = dimensionResource(R.dimen.sp_15).value.sp
    val margin30 = dimensionResource(R.dimen.dp_30)
    val margin23 = dimensionResource(R.dimen.dp_23)
    TopLeftTwoBg()
    BoxWithConstraints(modifier = Modifier.fillMaxWidth().fillMaxHeight().clickable {onClick()}) {
        val height = maxHeight

        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().offset(0.dp,height*0.12f), horizontalAlignment = Alignment.CenterHorizontally) {
            ProfileAvatar()
            Spacer(modifier = Modifier.height(28.dp))
            Text("Hello, Romina!!", fontFamily = FontFamily(raleway), fontSize = text28, letterSpacing = 0.28.sp, color = Color(0xFF202020), lineHeight = text36)
            Spacer(modifier = Modifier.height(margin30))
            Text("Type your password", fontFamily = FontFamily(nunito), fontSize = text19)
            Spacer(modifier = Modifier.height(margin23))
            OtpTextFields {  }
        }
        Row(modifier = Modifier.fillMaxWidth().offset(0.dp,height*0.892f), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Text("Not you?", fontSize = text15, lineHeight = text26)
            ButtonFrontArrow(Modifier.offset(10.dp))
        }
    }
}