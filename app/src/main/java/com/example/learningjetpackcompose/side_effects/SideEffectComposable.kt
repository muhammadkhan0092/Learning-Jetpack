package com.example.learningjetpackcompose.side_effects
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
@Composable
    fun SideEffectComposable(){
        val count = remember { mutableIntStateOf(0) }
        val rememberScope = rememberCoroutineScope()
        val counter = remember { mutableIntStateOf(0) }
        ConstraintLayout(modifier = Modifier.fillMaxSize(1f)){
            val (btnOne,btnTwo,textRemember,textRememberUpdated,etDisposable,producedAndDerivedState) = createRefs()
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
                            repeat(10){
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
                Modifier.constrainAs(etDisposable){
                    top.linkTo(textRememberUpdated.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )
            ProducedAndDerivedStateOfSimulation(
                Modifier.constrainAs(producedAndDerivedState){
                    top.linkTo(etDisposable.bottom,20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )
        }
    }