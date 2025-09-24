package com.example.learningjetpackcompose.presentation.shopping_ui.main.main_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun  MainScreen(){
    BoxWithConstraints(modifier = Modifier.fillMaxSize().background(Color.White)){
        val height = maxHeight
        val width = maxWidth
        Column(modifier = Modifier.fillMaxSize().background(Color.White)){
            MainProfile(height)
        }
    }
}