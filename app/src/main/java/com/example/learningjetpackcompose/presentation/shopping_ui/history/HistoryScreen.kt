package com.example.learningjetpackcompose.presentation.shopping_ui.history

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemTopMenu
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions

@Preview(showSystemUi = true)
@Composable
fun HistoryScreen(width : Dp = 375.dp,height : Dp = 812.dp){
    val dims = rememberDimensions(width,height)
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize()
        .verticalScroll(scrollState)
        .padding(top = dims.size20V, start = dims.size20H, end = dims.size20H)
        .background(Color.White)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            ItemRoundedImage(R.drawable.img_profile, dims.size44V)
            Spacer(Modifier.width(dims.size16V))
            Text(
                "History",
                fontSize = dims.text21,
                lineHeight = dims.text28,
                fontFamily = RalewayBold,
                modifier = Modifier
            )
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxWidth()
            ){
                ItemTopMenu(image = R.drawable.ic_vouchers, isSelected = true, {})
                Spacer(Modifier.width(dims.size10H))
                ItemTopMenu(image = R.drawable.ic_lines, isSelected = false, {})
                Spacer(Modifier.width(dims.size10H))
                ItemTopMenu(image = R.drawable.ic_settings_blue, isSelected = false, {
                })
            }
        }
        Spacer(Modifier.height(dims.size28V))
        repeat(10){
            ItemHistory(
                R.drawable.img_hello,
                dims.size6H, dims.size109V, dims.size129H, dims.size10H, dims.size30V,
                dims.text12, dims.text16, dims.text14, dims.text18, dims.text13, dims.text17, dims.text20,
                NunitoRegular,RalewayBold, RalewayRegular
            )
            Spacer(Modifier.height(dims.size14V))
        }
    }
}