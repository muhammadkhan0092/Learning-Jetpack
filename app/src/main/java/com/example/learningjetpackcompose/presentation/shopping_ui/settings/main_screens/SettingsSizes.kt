package com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoSemiBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewaySemiBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.LanguageCurrencySizeSelector
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions

@Preview(showSystemUi = true)
@Composable
fun SettingsSizes(width: Dp = 375.dp, height: Dp = 812.dp) {
    val dims = rememberDimensions(width, height)
    val selectedLanguage = remember { mutableStateOf("US") }
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
            Spacer(Modifier.height(dims.size7V))
            Text(
                "Sizes",
                fontSize = dims.text16,
                lineHeight = dims.text21,
                fontFamily = RalewaySemiBold
            )
            Spacer(Modifier.height(dims.size27V))
            LanguageCurrencySizeSelector(
                "US",
                selectedLanguage.value,
                dims.size22V,
                dims.size20H,
                dims.size10H,
                dims.size7V,
                dims.size9V,
                dims.text16,
                NunitoSemiBold
            ){
                if(selectedLanguage.value!="US") selectedLanguage.value="US"
            }
            Spacer(Modifier.height(dims.size7V))
            LanguageCurrencySizeSelector(
                "EU",
                selectedLanguage.value,
                dims.size22V,
                dims.size20H,
                dims.size10H,
                dims.size7V,
                dims.size9V,
                dims.text16,
                NunitoSemiBold
            ) {
                if (selectedLanguage.value != "EU") selectedLanguage.value = "EU"
            }
            Spacer(Modifier.height(dims.size7V))
            LanguageCurrencySizeSelector(
                "UK",
                selectedLanguage.value,
                dims.size22V,
                dims.size20H,
                dims.size10H,
                dims.size7V,
                dims.size9V,
                dims.text16,
                NunitoSemiBold
            ) {
                if (selectedLanguage.value != "UK") selectedLanguage.value = "UK"
            }
        }
    }
}

