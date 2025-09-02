package com.example.learningjetpackcompose.side_effects

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Remember Coroutine is used when we need control of the coroutine, eg we would have to cancel it
//Further Launched Effect can be launcher only from other composable , so on onClick we cannot launch it
@Composable
fun RememberCoroutineScope(count: Int, onClick: () -> Unit, modifierButton: Modifier, modifierText : Modifier) {
    Button(
        onClick = {onClick()},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = modifierButton
    ) {
        Text("Start Remember Coroutine")
    }
    Text("Counter -> $count", modifier = modifierText, fontSize = 25.sp)
}