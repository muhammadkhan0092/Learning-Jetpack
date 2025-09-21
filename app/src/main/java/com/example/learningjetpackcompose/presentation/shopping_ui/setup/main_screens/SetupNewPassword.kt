package com.example.learningjetpackcompose.presentation.shopping_ui.setup.main_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.LargeBlueButton
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ProfileAvatar
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.SquareEditText
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.TopRightTwoBg


@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun SetupNewPassword(onClick : ()-> Unit){
    val margin20 = dimensionResource(R.dimen.dp_20)
    val margin19 = dimensionResource(R.dimen.dp_19)
    val margin5 = dimensionResource(R.dimen.dp_5)
    val margin23 = dimensionResource(R.dimen.dp_23)
    val margin24 = dimensionResource(R.dimen.dp_24)
    val margin10 = dimensionResource(R.dimen.dp_10)
    val text21 = dimensionResource(R.dimen.sp_21).value.sp
    val text30 = dimensionResource(R.dimen.sp_30).value.sp
    val text19 = dimensionResource(R.dimen.sp_19).value.sp
    val text27 = dimensionResource(R.dimen.sp_27).value.sp
    val text15 = dimensionResource(R.dimen.sp_15).value.sp
    val text26 = dimensionResource(R.dimen.sp_26).value.sp
    val raleway = Font(R.font.raleway_bold)
    val nunito = Font(R.font.nunito_light)
    BoxWithConstraints(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(start = margin20, end = margin20).clickable {onClick()}
    ){
        val height = maxHeight
        Column(modifier = Modifier.offset(0.dp,height*0.148f)){
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                ProfileAvatar()
            }
            Spacer(Modifier.height(margin19))
            Text("Setup New Password", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontFamily = FontFamily(raleway), fontSize = text21, lineHeight = text30, letterSpacing = 0.21.sp)
            Spacer(Modifier.height(margin5))
            Text("Please, setup a new password for\nyour account",modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,fontFamily = FontFamily(nunito), fontSize = text19, lineHeight = text27)
            Spacer(Modifier.height(margin23))
            SquareEditText("New Password", Modifier)
            Spacer(Modifier.height(margin10))
            SquareEditText("Repeat Password", Modifier)
        }

        Column(modifier = Modifier.offset(0.dp,height*0.780f)){
            LargeBlueButton("Save", Modifier.fillMaxWidth())
            Spacer(Modifier.height(margin24))
            Text("Cancel", fontFamily = FontFamily(nunito), modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = text15, lineHeight = text26)
        }
    }
    TopRightTwoBg()
}