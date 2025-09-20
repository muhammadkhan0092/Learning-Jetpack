package com.example.learningjetpackcompose.side_effects

import android.util.Log
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LaunchedEffectButton(count: Int, onClick: () -> Int, modifier: Modifier) {
    //Launched effect is used in compose to handle side effects , side effect is the manipulation
    // of components outside the scope of the function , Composable should only handle the ui rendering , but
    //sometimes we need to put such code in our composable , launched effect manages it, the log will only
    //run once the key passed changes. We can control the side effects according to our need
        LaunchedEffect(Unit) {
            Log.d("khan","Count is $count")
        }
        Button(
            onClick = {
                onClick()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = modifier
        ) {
            Text("Launched Effect Button Count - $count")
        }
}