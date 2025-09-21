package com.example.learningjetpackcompose.presentation.shopping_ui.setup.other_views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R

@Preview
@Composable
fun SelectedReadyHello(selectedItem : Int = 1){
    val margin = dimensionResource(R.dimen.dp_20)
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        repeat(4) {
            val isSelected = if(it==selectedItem) true else false
            CircleReadyHello(isSelected)
            Spacer(modifier = Modifier.width(margin))
        }
    }
}

@Composable
fun CircleReadyHello(isSelected : Boolean){
    val size = dimensionResource(R.dimen.dp_20)
    val unselected = Color(0xFFC7D6FB)
    val selected = Color(0xFF004CFF)
    val color = if(isSelected) selected else unselected
    Box(
        modifier = Modifier.size(size).background(color, RoundedCornerShape(100.dp))
    )
}