package com.example.learningjetpackcompose.presentation.shopping_ui.common_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

@Preview
@Composable
fun CustomCheckbox(
    modifier: Modifier = Modifier.fillMaxWidth(),
    selected: String = "Email",
    name: String = "Email"
) {
    dimensionResource(R.dimen.dp_9)
    val margin_10 = dimensionResource(R.dimen.dp_10)
    val size_22 = dimensionResource(R.dimen.dp_22)
    val size_20 = dimensionResource(R.dimen.dp_20)
    val text15 = dimensionResource(R.dimen.sp_15).value.sp
    val size15 = dimensionResource(R.dimen.dp_15)
    val height = dimensionResource(R.dimen.dp_40)
    val selectedBoxColor = Color(0xFFE5EBFC)
    val unselectedBoxColor = Color(0xFFFFEBEB)
    val selectedTextColor = Color(0xFF004CFF)
    val unSelectedTextColor = Color(0xFF000000)
    val selectedCircleColor = Color(0xFF004CFF)
    val unSelectedCircleColor = Color(0xFFF8CECE)

    val boxColor = if (selected == name) selectedBoxColor else unselectedBoxColor
    val textColor = if (selected == name) selectedTextColor else unSelectedTextColor
    val circleColor = if (selected == name) selectedCircleColor else unSelectedCircleColor

    Box(
        modifier = modifier
            .background(boxColor, RoundedCornerShape(100.dp))
            .height(height)
            .padding(end = margin_10),
        contentAlignment = Alignment.Center
    ) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd){
            Box(
                modifier = Modifier
                    .size(size_22)
                    .background(Color.White, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(size_20)
                        .background(circleColor, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    if (selected == name) {
                        Image(
                            painter = painterResource(R.drawable.ic_tick),
                            contentDescription = null,
                            modifier = Modifier.size(size15)
                        )
                    }
                }
            }
        }
        Text(
            text = name,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily(Font(R.font.raleway_semi_bold)),
            modifier = Modifier.fillMaxWidth(),
            color = textColor,
            fontSize = text15
        )
    }
}
