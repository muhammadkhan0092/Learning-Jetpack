package com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.PaymentItem
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.ProfileEt
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.other_views.CardView


@Preview(showSystemUi = true)
@Composable
fun SettingsPayment(width : Dp = 375.dp,height : Dp = 812.dp){
    val size4V = height*0.004f
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
    val size33V = height*0.040f
    val size16V = height*0.019f


    val img : Int = R.drawable.ic_cart_red
    val size19V : Dp =height*0.023f
    val size9V : Dp=height*0.011f
    val text10 : TextUnit = (height*0.012f).value.sp
    val text14 : TextUnit = (height*0.017f).value.sp
    val text18 : TextUnit = (height*0.022f).value.sp
    val text17 : TextUnit = (height*0.020f).value.sp
    val nunitoSemiBold : Font = Font(R.font.nunito_semi_bold)






    val size18H : Dp = width*0.048f
    val size20H : Dp = width*0.053f
    val size13H : Dp = width*0.034f
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
    val isAddCardClicked = remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable{
                if(isAddCardClicked.value!=false){
                    isAddCardClicked.value = false
                }
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = size30V, start = size20H, end = size20H, bottom = size20V)
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
                nunitoBold,
                {
                    isAddCardClicked.value = true
                }
            )
            Spacer(Modifier.height(size16V))
            repeat(10){
                PaymentItem(img,size19V,size12V,size9V,size18H,size20H,size13H,text10,text14,text18,text17,text21,ralewayBold,nunitoSemiBold)
                Spacer(Modifier.height(size4V))
            }
        }
        if(isAddCardClicked.value){
            Box(modifier = Modifier.fillMaxSize().background(Color(0xB8E9E9E9)))
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
                Column(
                    modifier = Modifier
                        .background(Color(0xFFF8FAFF),RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
                        .padding(start = size20H, end = size20H)
                ){
                    Text(
                        "Add Card",
                        fontSize = text21,
                        fontFamily = FontFamily(ralewayBold),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = size27V, bottom = size27V)
                    )
                    Column(modifier = Modifier.background(Color.White)){
                        Spacer(Modifier.height(size20V))
                        Text("Card Holder", fontSize = text13, lineHeight = text20, fontFamily = FontFamily(nunitoSemiBold))
                        ProfileEt("Required","",size50V,text16,text20,size20H)
                        Spacer(Modifier.height(size18V))
                        Text("Card Number", fontSize = text13, lineHeight = text20, fontFamily = FontFamily(nunitoSemiBold))
                        ProfileEt("Required","",size50V,text16,text20,size20H)
                        Spacer(Modifier.height(size18V))
                        Row(horizontalArrangement = Arrangement.spacedBy(size10H)){
                            Column(Modifier.weight(1f)){
                                Text("Valid", fontSize = text13, lineHeight = text20, fontFamily = FontFamily(nunitoSemiBold))
                                ProfileEt("Required","",size50V,text16,text20,size20H)
                            }
                            Column(Modifier.weight(1f)){
                                Text("Cvv", fontSize = text13, lineHeight = text20, fontFamily = FontFamily(nunitoSemiBold))
                                ProfileEt("Required","",size50V,text16,text20,size20H)
                            }
                        }
                        Spacer(Modifier.height(size18V))
                            Text(
                                "Save Changes",
                                Modifier
                                    .fillMaxWidth()
                                    .background(Color(0xFF004CFF), RoundedCornerShape(9.dp))
                                    .padding(top = size7V, bottom = size7V)
                                ,
                                textAlign = TextAlign.Center,
                                fontSize = text16,
                                lineHeight = text25,
                                color = Color.White
                            )
                        Spacer(Modifier.height(size20V))
                    }
                }
            }
        }
    }
}