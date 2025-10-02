package com.example.learningjetpackcompose.presentation.shopping_ui.settings.main_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoSemiBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewaySemiBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.CardAddAndEditBottomView
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views.PaymentItem
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.other_views.CardView
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions

@Preview(showSystemUi = true)
@Composable
fun SettingsPayment(width: Dp = 375.dp, height: Dp = 812.dp) {
    val dims = rememberDimensions(width, height)
    val isAddCardClicked = remember { mutableStateOf(false) }
    val isEditCardClicked = remember { mutableStateOf(false) }

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
                "Payment Methods",
                fontSize = dims.text16,
                lineHeight = dims.text21,
                fontFamily = RalewaySemiBold
            )
            Spacer(Modifier.height(dims.size27V))

            CardView(
                dims.size14V, dims.size10V, dims.size35V, dims.size155V, dims.size33V,
                dims.size45H, dims.size17H, dims.size10H, dims.text13, dims.text12,
                dims.text7H, dims.text2H, dims.text1_5_H, dims.text10H,
                NunitoBold,
                { isAddCardClicked.value = true },
                { isEditCardClicked.value = true }
            )

            Spacer(Modifier.height(dims.size16V))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(dims.size4V)
            ) {
                items(50, key = { it }) { index ->
                    PaymentItem(
                        R.drawable.ic_cart_red,
                        dims.size19V,
                        dims.size9V,
                        dims.size18H,
                        dims.size20H,
                        dims.size13H,
                        dims.text10,
                        dims.text14,
                        dims.text18,
                        dims.text17,
                        dims.text21,
                        RalewayBold,
                        NunitoSemiBold
                    )
                }
            }
        }

        // ✅ overlays handled separately
        if (isAddCardClicked.value) {
            OverlayBackground()
            CardAddAndEditBottomView(
                dims.size20H, dims.size10H, dims.size27V, dims.size7V, dims.size20V,
                dims.size18V, dims.size50V, dims.text21, dims.text13, dims.text16,
                dims.text20, dims.text25, RalewayBold, NunitoSemiBold,
                "", "", "", "", "Add Card"
            ) { isAddCardClicked.value = false }
        }

        if (isEditCardClicked.value) {
            OverlayBackground()
            CardAddAndEditBottomView(
                dims.size20H, dims.size10H, dims.size27V, dims.size7V, dims.size20V,
                dims.size18V, dims.size50V, dims.text21, dims.text13, dims.text16,
                dims.text20, dims.text25, RalewayBold, NunitoSemiBold,
                "Romina", "**** **** **** 1579", "12 / 22", "209", "Edit Card"
            ) { isEditCardClicked.value = false }
        }
    }
}

@Composable
private fun OverlayBackground() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xB8E9E9E9))
    )
}
