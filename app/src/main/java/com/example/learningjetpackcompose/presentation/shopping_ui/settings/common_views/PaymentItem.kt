package com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

@Composable
fun PaymentItem(
    img: Int,
    size19V: Dp,
    size9V: Dp,
    size18H: Dp,
    size20H: Dp,
    size13H: Dp,
    text10: TextUnit,
    text14: TextUnit,
    text18: TextUnit,
    text17: TextUnit,
    text21: TextUnit,
    ralewayBold: FontFamily,
    nunitoSemiBold: FontFamily
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF1F4FE), RoundedCornerShape(14.dp))
            .padding(top = size9V, bottom = size9V, start = size18H, end = size20H),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = null,
            modifier = Modifier
                .height(size19V)
                .aspectRatio(0.94f)
        )
        Spacer(Modifier.width(size13H))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                "April,19 2020 12:31",
                fontSize = text10,
                fontFamily = nunitoSemiBold
            )
            Text(
                "Order #92287157",
                fontSize = text14,
                lineHeight = text18,
                fontFamily = ralewayBold
            )
        }
        Text(
            "-$37,00",
            fontSize = text17,
            lineHeight = text21,
            fontFamily = ralewayBold
        )
    }
}
