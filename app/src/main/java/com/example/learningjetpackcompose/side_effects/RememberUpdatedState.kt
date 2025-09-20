package com.example.learningjetpackcompose.side_effects

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun RememberUpdatedState(modifier: Modifier) {
    val counter = remember {mutableIntStateOf(0)}
   LaunchedEffect(Unit) {
        delay(2000)
        counter.intValue = 10
    }
    RenderText(counter.intValue,modifier)

}
//if we do not use remember updated state , it will show log as 0 because this launched effect runs only one time
//because on recomposition launched effect will not run
@Composable
fun RenderText(count: Int, modifier: Modifier){
    val counter = rememberUpdatedState(count)
    LaunchedEffect(Unit) {
        delay(5000)
        Log.d("Remember Updated State","Updated State in Launched is ${counter.value}")
    }
    Text("Remember Updated Data is $count", modifier = modifier)
}