package com.example.learningjetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.learningjetpackcompose.basic_components.ButtonComposable
import com.example.learningjetpackcompose.basic_components.EditTextComposable
import com.example.learningjetpackcompose.basic_components.ImageComposable
import com.example.learningjetpackcompose.basic_components.TextComposable
import com.example.learningjetpackcompose.side_effects.DisposableEffectSimulation
import com.example.learningjetpackcompose.side_effects.LaunchedEffectButton
import com.example.learningjetpackcompose.side_effects.RememberCoroutineScope
import com.example.learningjetpackcompose.side_effects.RememberUpdatedState
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeTheme {
                //appComposable()
                SideEffects()
            }
        }
    }

    @Composable
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

    @Preview(showSystemUi = true)
    @Composable
    fun SideEffects(){
        val count = remember { mutableIntStateOf(0) }
        val rememberScope = rememberCoroutineScope()
        val counter = remember { mutableIntStateOf(0) }
        ConstraintLayout(modifier = Modifier.fillMaxSize(1f)){
            val (btnOne,btnTwo,textRemember,textRememberUpdated,etDisposible) = createRefs()
            LaunchedEffectButton(
                count.intValue,
                {count.intValue++},
                Modifier.constrainAs(btnOne){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )
            RememberCoroutineScope(
                counter.intValue,
                {
                    rememberScope.launch {
                        Log.d("khan","Remember Launched")
                        try {
                            for (i in 1..10){
                                counter.intValue++
                                Log.d("khan","Counter -> ${counter.intValue}")
                                delay(1000)
                            }
                        }
                        catch (e : Exception){
                            Log.d("khan","Exception in Remember -> ${e.message}")
                        }
                    }
                },
                Modifier.constrainAs(btnTwo){
                    top.linkTo(btnOne.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
                Modifier.constrainAs(textRemember){
                    top.linkTo(btnTwo.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )
            RememberUpdatedState(
                Modifier.constrainAs(textRememberUpdated){
                    top.linkTo(textRemember.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )
            DisposableEffectSimulation(
                Modifier.constrainAs(etDisposible){
                    top.linkTo(textRememberUpdated.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )
        }
    }
}
