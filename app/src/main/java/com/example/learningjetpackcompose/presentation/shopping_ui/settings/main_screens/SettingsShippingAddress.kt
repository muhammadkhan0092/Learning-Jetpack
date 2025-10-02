package com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ButtonFrontArrow
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoSemiBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewaySemiBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.LanguageCurrencySizeSelector
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.ProfileEt
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions

@Composable
fun SettingsShippingAddress(width: Dp = 375.dp, height: Dp = 812.dp) {
    val dims = rememberDimensions(width, height)
    val headings = listOf("Address","Town / City","Postcode","Phone Number")
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = dims.size30V,
                    start = dims.size20H,
                    end = dims.size20H,
                    bottom = dims.size20V
                )
        ) {
            Text(
                "Settings",
                fontSize = dims.text28,
                lineHeight = dims.text36,
                fontFamily = RalewayBold
            )
            Spacer(Modifier.height(dims.size27V))
            Text("Country", fontSize = dims.text13, lineHeight = dims.text20, fontFamily = NunitoSemiBold)
            Spacer(Modifier.height(dims.size4V))
            Row(verticalAlignment = Alignment.CenterVertically){
                Text("Choose Your Country", modifier = Modifier.weight(1f), fontSize = dims.text20, lineHeight = 0.2.sp, fontFamily = RalewayBold)
                ButtonFrontArrow(Modifier)
            }
            Spacer(Modifier.height(dims.size22V))
            repeat(4){
                Text(headings[it])
                ProfileEt("Required","",dims.size50V,dims.text17,dims.text21,dims.size20H, modifier = Modifier)
                Spacer(Modifier.height(dims.size22V))
            }
        }
    }
}

