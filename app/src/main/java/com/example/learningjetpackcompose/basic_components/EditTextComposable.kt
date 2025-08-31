package com.example.learningjetpackcompose.basic_components

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun EditTextComposable(name: String = "", onChanged: (String) -> Unit = {}){
    TextField(
        value = name,
        onValueChange = {
            onChanged(it)
        },
        label = {Text("Write Your Name")},
        placeholder = {Text("Name")}
    )
}