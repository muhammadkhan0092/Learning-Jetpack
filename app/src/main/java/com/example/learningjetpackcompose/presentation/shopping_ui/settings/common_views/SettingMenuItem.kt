package com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.example.learningjetpackcompose.R

@Composable
fun SettingMenuItem(
    settingName: String = "Country",
    selectedItem: String = "",
    size21V: Dp,
    text16: TextUnit,
    nunitoBold: Font,
    text15: TextUnit,
    nunitoRegular: Font,
    size16H: Dp,
    size18V: Dp,
    onClick: () -> Unit
){
    Box(Modifier.fillMaxWidth().padding(top = size21V, bottom = size21V)){
        Text(settingName, fontSize = text16, fontFamily = FontFamily(nunitoBold))
        Row(
            modifier = Modifier.fillMaxWidth().clickable{onClick()},
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ){
            Text(selectedItem, fontSize = text15, fontFamily = FontFamily(nunitoRegular))
            Spacer(Modifier.width(size16H))
            Image(painter = painterResource(R.drawable.ic_right_arrow), contentDescription = "",
                Modifier.height(size18V).aspectRatio(0.535f))
        }
    }
}