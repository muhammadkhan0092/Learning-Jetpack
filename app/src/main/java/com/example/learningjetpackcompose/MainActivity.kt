package com.example.learningjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningjetpackcompose.basic_components.ButtonComposable
import com.example.learningjetpackcompose.basic_components.EditTextComposable
import com.example.learningjetpackcompose.basic_components.ImageComposable
import com.example.learningjetpackcompose.basic_components.TextComposable
import com.example.learningjetpackcompose.side_effects.launchedEffect
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeTheme {
                //appComposable()
                launchedEffect()
            }
        }
    }

    @Composable
    @Preview(showSystemUi = true)
    fun appComposable(){
        val etState = remember {mutableStateOf("")}
        val nameState = remember { mutableStateOf("Your Name is ${etState.value}") }
        Column(verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize(1f)) {
            ButtonComposable()
            EditTextComposable(etState.value,{
                etState.value = it
                nameState.value = "Your Name is $it"
            })
            TextComposable(nameState.value)
            ImageComposable()
        }
    }
}
