package com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.models.DataSetting
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.SettingHeadings
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.SettingMenuItem
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.SpacerView

@Composable
fun SettingsMenu(
    width : Dp = 375.dp,
    height : Dp = 812.dp,
    onLanguageClicked : ()-> Unit,
    onSizeClicked : () -> Unit,
    onCurrencyClicked:()->Unit,
    onShippingClicked:()-> Unit
){
    val size12V = height*0.0147f
    val size30V = height*0.0369f
    val size21V = height*0.025f
    val size27V = height*0.033f
    val size44V = height*0.054f
    val size1V = height*0.00123f
    val size18V = height*0.0221f
    val size20H = width*0.0533f
    val size16H = width*0.042f

    val text13 = (height*0.0160f).value.sp
    val text12 = (height*0.0147f).value.sp
    val text15 = (height*0.018f).value.sp
    val text16 = (height*0.019f).value.sp
    val text20 = (height*0.024f).value.sp
    val text28 = (height*0.0344f).value.sp
    val text36 = (height*0.044f).value.sp
    val ralewayBold = Font(R.font.raleway_bold)
    val ralewayExtraBold = Font(R.font.raleway_extra_bold)
    val nunitoRegular = Font(R.font.nunito_regular)
    val nunitoBold = Font(R.font.nunito_bold)
    val personalSettings = listOf(
        DataSetting("Profile",""),
        DataSetting("Shipping Address",""),
        DataSetting("Payment Methods","")
    )

    val shopSettings = listOf(
        DataSetting("Country","Vietnam"),
        DataSetting("Currency","$ USD"),
        DataSetting("Sizes","UK"),
        DataSetting("Terms And Conditions","")
    )
    val accountSetting = listOf(
        DataSetting("Language","English"),
        DataSetting("About Slada","")
    )
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = size30V, start = size20H, end = size20H)
            .verticalScroll(scrollState)
    ){
        Text("Settings", fontSize = text28, lineHeight = text36, fontFamily = FontFamily(ralewayBold))
        Spacer(Modifier.height(size27V))
        SettingHeadings("Personal",text20,ralewayExtraBold)
        Spacer(Modifier.height(size12V))
        repeat(3){
            SettingMenuItem(
                personalSettings[it].settingName,
                personalSettings[it].selected,
                size21V,
                text16,
                nunitoBold,
                text15,
                nunitoRegular,
                size16H,
                size18V
            ) {
                if (it == 1) onShippingClicked()
            }
            SpacerView(size1V)
        }
        Spacer(Modifier.height(size27V))
        SettingHeadings("Shop",text20,ralewayExtraBold)
        Spacer(Modifier.height(size12V))
        repeat(4){
            SettingMenuItem(shopSettings[it].settingName,shopSettings[it].selected,size21V,text16,nunitoBold,text15,nunitoRegular,size16H,size18V){
                if (it==1) onCurrencyClicked()
                else if(it==2) onSizeClicked()
            }
            SpacerView(size1V)
        }
        Spacer(Modifier.height(size27V))
        SettingHeadings("Account",text20,ralewayExtraBold)
        Spacer(Modifier.height(size12V))
        repeat(2){
            SettingMenuItem(
                accountSetting[it].settingName,
                accountSetting[it].selected,
                size21V,
                text16,
                nunitoBold,
                text15,
                nunitoRegular,
                size16H,
                size18V
            ) {
                if (it == 0) onLanguageClicked()
            }
            SpacerView(size1V)
        }
        Spacer(Modifier.height(size44V))
        Text("Delete My Account", color = Color(0xFFD97474), fontSize = text13, fontFamily = FontFamily(ralewayBold))
        Spacer(Modifier.height(size30V))
        Text("Slada", fontSize = text20, fontFamily = FontFamily(ralewayExtraBold))
        Text("Version 1.0 April, 2020", fontSize = text12, fontFamily = FontFamily(nunitoRegular))
    }
}