package com.example.learningjetpackcompose.presentation.shopping_ui.common_views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

@Composable
fun SquareEditText(hint : String,modifier: Modifier){
    val sp21 = dimensionResource(id = R.dimen.sp_21).value.sp
    val sp17 = dimensionResource(id = R.dimen.sp_17).value.sp
    BasicTextField(
        value = "",
        onValueChange = { },
        modifier = modifier
            .background(Color(0xFFF8F8F8), RoundedCornerShape(4.dp))
        ,
        decorationBox = { innerTextField ->
            if ("".isEmpty()) {
                Text(
                    text = hint,
                    color = Color(0xFFD2D2D2),
                    fontSize = sp17,
                    lineHeight = sp21,
                    modifier = Modifier.fillMaxWidth().padding(top = 15.dp, bottom = 15.dp),
                    textAlign = TextAlign.Center
                )
            }
                innerTextField()
        }
    )


}
