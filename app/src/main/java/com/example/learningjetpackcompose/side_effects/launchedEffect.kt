package com.example.learningjetpackcompose.side_effects

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showSystemUi = true)
@Composable
fun launchedEffect(){
    val count = remember { mutableStateOf(0) }
    //Launched effect is used in compose to handle side effects , side effect is the manipulation
    // of components outside the scope of the function , Composables should only handle the ui rendering , but
    //sometimes we need to put such code in our composables , launched effect manages it, the log will only
    //run once the key passed changes
    LaunchedEffect(Unit) {
        Log.d("khan","Count is ${count.value}")
    }
    ConstraintLayout(modifier = Modifier.fillMaxSize(1f)){
        val (btn) = createRefs()
        Button(
            onClick = {
                count.value++
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.constrainAs(btn) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            Text("Launched Effect Button")
        }
    }
}