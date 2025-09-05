package com.example.learningjetpackcompose.mvvm.presentation

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
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.lifecycleScope
import com.example.learningjetpackcompose.basic_components.ButtonComposable
import com.example.learningjetpackcompose.basic_components.EditTextComposable
import com.example.learningjetpackcompose.basic_components.ImageComposable
import com.example.learningjetpackcompose.basic_components.TextComposable
import com.example.learningjetpackcompose.mvvm.data.TweetsApi
import com.example.learningjetpackcompose.mvvm.presentation.activity.CategoryScreen
import com.example.learningjetpackcompose.mvvm.presentation.activity.DetailScreen
import com.example.learningjetpackcompose.side_effects.DisposableEffectSimulation
import com.example.learningjetpackcompose.side_effects.LaunchedEffectButton
import com.example.learningjetpackcompose.side_effects.ProducedAndDerivedStateOfSimulation
import com.example.learningjetpackcompose.side_effects.RememberCoroutineScope
import com.example.learningjetpackcompose.side_effects.RememberUpdatedState
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class TweetsActivity : ComponentActivity() {
    @Inject
    lateinit var tweetsApi: TweetsApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch {
            val data =   tweetsApi.getTweetsCategories()
            Log.d("khan","data is ${data.body()}")
        }
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeTheme {
                DetailScreen()
            }
        }
    }
}
