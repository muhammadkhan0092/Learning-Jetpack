package com.example.learningjetpackcompose.side_effects

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

//Derived State is used to Combine Two States
//Produced State is a utility function used to combine State of and launched effect property , inside the producer ,
//we can observe the live data or flow
@Composable
fun ProducedAndDerivedStateOfSimulation(constrainAs: Modifier) {
    val tableOf = remember {mutableIntStateOf(5)}
    val index = produceState(1) {
        repeat(9){
            delay(1000)
            value+=1
        }
    }
    val derivedState = remember { derivedStateOf {
        "${tableOf.intValue} * ${index.value} = ${index.value*tableOf.value}"
    }
    }
    Text(text = derivedState.value, modifier = constrainAs, fontSize = 20.sp)

}