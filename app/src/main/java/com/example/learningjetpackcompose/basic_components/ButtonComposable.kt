package com.example.learningjetpackcompose.basic_components

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ButtonComposable(){
    Button(onClick = {
        Log.d("khan","Button Clicked")
    },
        colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray, contentColor = Color.White),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.background(Color.White)
    ) {
        Text("Demo Button")
    }
}