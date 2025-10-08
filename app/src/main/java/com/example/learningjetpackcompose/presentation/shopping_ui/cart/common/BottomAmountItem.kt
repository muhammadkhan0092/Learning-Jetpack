package com.example.learningjetpackcompose.presentation.shopping_ui.cart.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoLight
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayExtraBold
@Composable
fun BottomAmountItem(
    size6H : Dp,
    size20H: Dp,
    size29H: Dp,
    size7V: Dp,
    size10V: Dp,
    text16: TextUnit,
    text18: TextUnit,
    text20: TextUnit,
    text22: TextUnit,
    text25: TextUnit,
    amount : String="$34,00",
    action: String = "Checkout",
    btnColor :Color= Color(0xFF004CFF),
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5))
            .padding(top =size10V, bottom = size10V, start = size20H, end =size20H)
        ,
        contentAlignment = Alignment.CenterStart
    ){
        Row {
            Text("Total", fontSize = text20, lineHeight = text25, fontFamily = RalewayExtraBold)
            Spacer(Modifier.width(size6H))
            Text(amount, fontSize = text18, lineHeight = text22, fontFamily = RalewayBold)
        }
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd){
            Text(
                action,
                fontSize = text16,
                lineHeight = text25,
                fontFamily = NunitoLight,
                color = Color.White,
                modifier = Modifier
                    .background(btnColor,RoundedCornerShape(10.dp))
                    .padding(top = size7V, bottom = size7V, start = size29H, end = size29H)
            )
        }
    }
}