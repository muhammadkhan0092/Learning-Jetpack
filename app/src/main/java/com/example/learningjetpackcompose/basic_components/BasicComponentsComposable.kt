package com.example.learningjetpackcompose.basic_components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
    fun BasicComponentsComposable(){
        val etState = remember {mutableStateOf("")}
        val nameState = remember { mutableStateOf("Your Name is ${etState.value}") }
        Column(verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize(1f)) {
            ButtonComposable("Button Composable",{})
            EditTextComposable(etState.value,{
                etState.value = it
                nameState.value = "Your Name is $it"
            })
            TextComposable(nameState.value)
            ImageComposable()
        }
    }