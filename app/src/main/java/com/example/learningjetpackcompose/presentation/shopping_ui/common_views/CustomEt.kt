package com.example.learningjetpackcompose.presentation.shopping_ui.common_views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

@Composable
fun EditTextComposable(hint : String,modifier: Modifier){
    val sp14 = dimensionResource(id = R.dimen.sp_14).value.sp
    val dp54 = dimensionResource(R.dimen.dp_54)
    BasicTextField(
        value = "",
        onValueChange = { },
        modifier = modifier
            .height(dp54)
            .background(Color(0xFFF8F8F8), RoundedCornerShape(100.dp))
        ,
        decorationBox = { innerTextField ->
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.CenterStart
            ) {
                if ("".isEmpty()) {
                    Text(
                        text = hint,
                        color = Color(0xFFD2D2D2),
                        fontSize = sp14
                    )
                }
                innerTextField()
            }
        }
    )


}
