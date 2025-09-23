package com.example.learningjetpackcompose.presentation.shopping_ui.main.main_screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun  MainScreen(){
    Column(modifier = Modifier.fillMaxSize()){
        MainProfile()
    }
}