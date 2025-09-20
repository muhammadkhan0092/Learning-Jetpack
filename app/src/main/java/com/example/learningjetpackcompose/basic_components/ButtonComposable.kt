package com.example.learningjetpackcompose.basic_components

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonComposable(text : String,onClick : ()-> Unit){
    Button(onClick = {
        onClick()
    },
        colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray, contentColor = Color.White),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.background(Color.White)
    ) {
        Text(text)
    }
}