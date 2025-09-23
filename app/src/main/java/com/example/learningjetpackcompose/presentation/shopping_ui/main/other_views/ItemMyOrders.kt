package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

@Preview
@Composable
fun ItemMyOrders(content : String="",isSelected : Boolean = true){
    val textSize = dimensionResource(R.dimen.sp_16).value.sp
    val lineHeight = dimensionResource(R.dimen.sp_21).value.sp
    val padding = dimensionResource(R.dimen.dp_6)
    val paddingHorizontal = dimensionResource(R.dimen.dp_19)
    Box(contentAlignment = Alignment.TopEnd){
        Text(
            "To Pay",
            fontSize = textSize,
            lineHeight = lineHeight,
            color = Color(0xFF0042E0),
            modifier = Modifier.background(Color(0xFFE5EBFC), RoundedCornerShape(20.dp)).padding(top = padding, bottom = padding, start = paddingHorizontal, end = paddingHorizontal)
        )
        if(isSelected){
            Box(modifier = Modifier.background(Color.White, CircleShape).size(14.dp).padding(1.dp), contentAlignment = Alignment.Center){
                Box(modifier = Modifier.fillMaxSize().background(Color.Green,CircleShape))
            }
        }
    }
}