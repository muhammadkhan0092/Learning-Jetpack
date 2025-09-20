package com.example.learningjetpackcompose.presentation.shopping_ui.setup

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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.CustomCheckbox
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.LargeBlueButton
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ProfileAvatar
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.TopRightTwoBg


@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun PasswordRecovery(onClick : ()-> Unit){
    val margin20 = dimensionResource(R.dimen.dp_20)
    val margin19 = dimensionResource(R.dimen.dp_19)
    val margin5 = dimensionResource(R.dimen.dp_5)
    val margin28 = dimensionResource(R.dimen.dp_28)
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
    val checkedType = remember { mutableStateOf("SMS") }
    BoxWithConstraints(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(start = margin20, end = margin20).clickable {onClick()}
    ){
        val width = maxWidth
        Column(modifier = Modifier.offset(0.dp,maxHeight*0.148f)){
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                ProfileAvatar()
            }
            Spacer(Modifier.height(margin19))
            Text("Password Recovery", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontFamily = FontFamily(raleway), fontSize = text21, lineHeight = text30, letterSpacing = 0.21.sp)
            Spacer(Modifier.height(margin5))
            Text("How you would like to restore\nyour password?",modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,fontFamily = FontFamily(nunito), fontSize = text19, lineHeight = text27)
            Spacer(Modifier.height(margin28))
            Box(modifier = Modifier.offset(width * 0.197f,0.dp).fillMaxWidth(0.594f)){
                CustomCheckbox(name = "SMS", selected = checkedType.value){
                    if(checkedType.value!="SMS") checkedType.value = "SMS"
                }
            }
            Spacer(Modifier.height(margin10))
            Box(modifier = Modifier.offset(width * 0.197f,0.dp).fillMaxWidth(0.594f)){
                CustomCheckbox(name = "Email", selected =checkedType.value){
                    if(checkedType.value!="Email") checkedType.value = "Email"
                }
            }
        }

        Column(modifier = Modifier.offset(0.dp,maxHeight*0.780f)){
            LargeBlueButton("Next", Modifier.fillMaxWidth())
            Spacer(Modifier.height(margin24))
            Text("Cancel", fontFamily = FontFamily(nunito), modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = text15, lineHeight = text26)
        }
    }
    TopRightTwoBg()
}