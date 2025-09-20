package com.example.learningjetpackcompose.presentation.shopping_ui.common_views

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

@Composable
fun LargeBlueButton(text : String,modifier: Modifier){
    val text22 = dimensionResource(R.dimen.sp_22).value.sp
    val text31 = dimensionResource(R.dimen.sp_31).value.sp
    val padding = dimensionResource(R.dimen.dp_5)
    val nunitoFont = Font(R.font.nuninto_light)
    Button(
        shape = RoundedCornerShape(16.dp),
        colors = ButtonColors(
            containerColor = Color(0xFF004CFF),
            contentColor = Color(0xFFF3F3F3),
            disabledContainerColor =  Color(0xFF004CFF),
            disabledContentColor = Color(0xFFF3F3F3)
        ),
        modifier = modifier,
        onClick = {}
    ) {
        Text(text, fontSize = text22, fontFamily = FontFamily(nunitoFont), lineHeight = text31, modifier = Modifier.padding(top = padding, bottom = padding))
    }
}