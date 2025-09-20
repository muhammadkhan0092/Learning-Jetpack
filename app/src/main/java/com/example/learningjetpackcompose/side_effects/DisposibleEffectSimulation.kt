package com.example.learningjetpackcompose.side_effects

import android.util.Log
import android.view.ViewTreeObserver
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//Used When We have to dispose any component after the composable goes off screen
//Used to prevent memory leaks by removing listeners etc
@Composable
fun DisposableEffectSimulation(modifier: Modifier) {
    TextField("", onValueChange = {}, modifier = modifier)
    val view = LocalView.current
    DisposableEffect(Unit) {
        val listener = ViewTreeObserver.OnGlobalLayoutListener{
            val insets = ViewCompat.getRootWindowInsets(view)
            val isKeyBoardVisible = insets?.isVisible(WindowInsetsCompat.Type.ime())
            Log.d("Disposable Effect","is keyboard visible -> $isKeyBoardVisible")
        }
        view.viewTreeObserver.addOnGlobalLayoutListener(listener)
        onDispose {
            Log.d("Disposable Effect","Removing Listeners")
           view.viewTreeObserver.removeOnGlobalLayoutListener(listener)
        }
    }
}