package com.example.learningjetpackcompose.presentation.shopping_ui.settings.common_views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

@Composable
fun ProfileEt(hint : String, text : String="", size50 : Dp, text17 : TextUnit, text21 : TextUnit, size20H : Dp,modifier: Modifier = Modifier){
    val sp14 = dimensionResource(id = R.dimen.sp_14).value.sp
    val dp54 = dimensionResource(R.dimen.dp_54)
    BasicTextField(
        value = text,
        onValueChange = { },
        textStyle = TextStyle(
            fontSize = text17,
            lineHeight = text21
        ),
        readOnly = true,
        modifier = modifier
            .height(size50)
            .background(Color(0xFFF1F4FE), RoundedCornerShape(9.dp))
        ,
        decorationBox = { innerTextField ->
            Box(
                modifier = Modifier.fillMaxSize().padding(start = size20H),
                contentAlignment = Alignment.CenterStart
            ) {
                if (text.isEmpty()) {
                    Text(
                        text = hint,
                        color = Color(0xFF9EB4E8),
                        fontSize = sp14,
                    )
                }
                innerTextField()
            }
        }
    )


}
