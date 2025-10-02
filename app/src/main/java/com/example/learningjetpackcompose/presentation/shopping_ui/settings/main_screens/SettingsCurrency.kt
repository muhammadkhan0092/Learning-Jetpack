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
fun SettingsCurrency(width: Dp = 375.dp, height: Dp = 812.dp) {
    val dims = rememberDimensions(width, height)
    val selectedLanguage = remember { mutableStateOf("$ USD") }
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
                "Currency",
                fontSize = dims.text16,
                lineHeight = dims.text21,
                fontFamily = RalewaySemiBold
            )
            Spacer(Modifier.height(dims.size27V))
            LanguageCurrencySizeSelector(
                "$ USD",
                selectedLanguage.value,
                dims.size22V,
                dims.size20H,
                dims.size10H,
                dims.size7V,
                dims.size9V,
                dims.text16,
                NunitoSemiBold
            ){
                if(selectedLanguage.value!="$ USD") selectedLanguage.value="$ USD"
            }
            Spacer(Modifier.height(dims.size7V))
            LanguageCurrencySizeSelector(
                "€ EURO",
                selectedLanguage.value,
                dims.size22V,
                dims.size20H,
                dims.size10H,
                dims.size7V,
                dims.size9V,
                dims.text16,
                NunitoSemiBold
            ) {
                if (selectedLanguage.value != "€ EURO") selectedLanguage.value = "€ EURO"
            }
            Spacer(Modifier.height(dims.size7V))
            LanguageCurrencySizeSelector(
                "₫ VND",
                selectedLanguage.value,
                dims.size22V,
                dims.size20H,
                dims.size10H,
                dims.size7V,
                dims.size9V,
                dims.text16,
                NunitoSemiBold
            ) {
                if (selectedLanguage.value != "₫ VND") selectedLanguage.value = "₫ VND"
            }
            Spacer(Modifier.height(dims.size7V))
            LanguageCurrencySizeSelector(
                "₽ RUB",
                selectedLanguage.value,
                dims.size22V,
                dims.size20H,
                dims.size10H,
                dims.size7V,
                dims.size9V,
                dims.text16,
                NunitoSemiBold
            ) {
                if (selectedLanguage.value!= "₽ RUB") selectedLanguage.value = "₽ RUB"
            }
        }
    }
}

