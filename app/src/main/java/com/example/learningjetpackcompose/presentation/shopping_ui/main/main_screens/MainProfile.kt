package com.example.learningjetpackcompose.presentation.shopping_ui.main.main_screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemMyOrders
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemStories

@Preview(showSystemUi = true)
@Composable
fun MainProfile(){
    Box(modifier = Modifier.fillMaxSize()){
        LazyRow(modifier = Modifier.fillMaxSize()){
            items(listOf(1,2,3)) {
                ItemMyOrders()
            }
        }
    }
}