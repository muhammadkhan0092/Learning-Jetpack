package com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
@Composable
fun LanguageCurrencySizeSelector(
    text: String = "English",
    selectedText: String = "English",
    size22V: Dp = 22.dp,
    size20H: Dp = 20.dp,
    size10H: Dp = 10.dp,
    size7V: Dp = 7.dp,
    size9V: Dp = 9.dp,
    text16V: TextUnit = 16.sp,
    nunitoSemiBold: FontFamily = FontFamily(
        Font(R.font.nunito_semi_bold)
    ),
    function: () -> Unit
){
    val bgColor = if(text==selectedText) Color(0xFFE5EBFC) else Color(0xFFF9F9F9)
    val circleColor = if(text==selectedText) Color(0xFF004CFF) else Color(0xFFF8CECE)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(bgColor,RoundedCornerShape(9.dp))
            .clickable{function()}
            .padding(top = size9V, bottom = size9V, start = size20H, end = size10H)
    ){
        Text(text, modifier = Modifier.weight(1f), fontSize = text16V, fontFamily = nunitoSemiBold)
        Box(
            modifier = Modifier
                .size(size22V)
                .background(Color.White, RoundedCornerShape(100.dp))
                .padding(2.dp)
        ){
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = circleColor, RoundedCornerShape(100.dp))
                    .padding(size7V)
            ){
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(R.drawable.ic_tick),
                    contentDescription = null,
                )
            }
        }
    }
}