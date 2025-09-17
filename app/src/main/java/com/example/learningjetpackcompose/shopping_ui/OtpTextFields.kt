package com.example.learningjetpackcompose.shopping_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun OtpTextFields(
    otpLength: Int = 4,
    onOtpComplete: (String) -> Unit
) {
    // OTP state: list of single-char strings
    var otpValue by remember { mutableStateOf(List(otpLength) { "" }) }

    // Keep focus requesters stable across recompositions
    val focusRequesters = remember { List(otpLength) { FocusRequester() } }

    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        otpValue.forEachIndexed { index, value ->
            TextField(
            value = value,
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.White,
                    unfocusedPlaceholderColor = Color.White,
                    disabledIndicatorColor = Color.White,
                    unfocusedIndicatorColor = Color.White
                ),
            onValueChange = { newValue ->
                // only accept max 1 digit
                if (newValue.length <= 1 && (newValue.isEmpty() || newValue.all { it.isDigit() })) {
                    val previous = otpValue[index]
                    otpValue = otpValue.toMutableList().also { it[index] = newValue }

                    if (newValue.isNotEmpty()) {
                        // move forward when user types a digit
                        if (index < otpLength - 1) {
                            focusRequesters[index + 1].requestFocus()
                        } else {
                            // last box filled
                            if (otpValue.all { it.isNotEmpty() }) onOtpComplete(otpValue.joinToString(""))
                        }
                    } else {
                        // deletion by IME/backspace:
                        // if user deleted but this field was already empty, move focus back
                        if (previous.isEmpty() && index > 0) {
                            focusRequesters[index - 1].requestFocus()
                        }
                    }
                }
            },
            modifier = Modifier
                .width(56.dp)
                .background(Color(0xFFF8F8F8), RoundedCornerShape(4.dp))
                .focusRequester(focusRequesters[index])
                .onKeyEvent { keyEvent ->
                    // Use nativeKeyEvent.keyCode (Int) and compare with android.view.KeyEvent.KEYCODE_DEL
                    if (keyEvent.type == KeyEventType.KeyDown &&
                        keyEvent.nativeKeyEvent.keyCode == android.view.KeyEvent.KEYCODE_DEL &&
                        value.isEmpty() &&
                        index > 0
                    ) {
                        focusRequesters[index - 1].requestFocus()
                        true // consume the event
                    } else {
                        false
                    }
                },
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = if (index == otpLength - 1) ImeAction.Done else ImeAction.Next
            )
        )
        }
    }

    // focus first field when shown
    LaunchedEffect(Unit) {
        // small delay can help in some situations where focus requester needs view to be composed
        delay(80)
        focusRequesters.first().requestFocus()
    }
}
