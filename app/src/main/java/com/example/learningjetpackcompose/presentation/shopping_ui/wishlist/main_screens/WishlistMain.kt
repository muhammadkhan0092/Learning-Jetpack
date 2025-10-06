package com.example.learningjetpackcompose.presentation.shopping_ui.wishlist.main_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ButtonFrontArrow
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions
import com.example.learningjetpackcompose.presentation.shopping_ui.wishlist.common.WishListItem

@Composable
fun WishlistMain(width : Dp,height : Dp){
    val dims =rememberDimensions(width,height)
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(scrollState)
            .padding(
                top = dims.size20V,
                start = dims.size20H,
                end = dims.size20H
            )
            .background(Color.White)
    ) {
        Text("Wishlist", fontSize = dims.text28, lineHeight = dims.text36, fontFamily = RalewayBold)
        Spacer(Modifier.height(dims.size14V))
        Row {
            Text("Recently Viewed", fontSize = dims.text21, lineHeight = dims.text28, fontFamily = RalewayBold)
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd){
                ButtonFrontArrow(Modifier)
            }
        }
        Spacer(Modifier.height(dims.size14V))
        Row(horizontalArrangement = Arrangement.spacedBy(dims.size13H)){
            repeat(5){
                ItemRoundedImage(R.drawable.img_hello,dims.size50H)
            }
        }
        Spacer(Modifier.height(dims.size14V))
        repeat(10){
            WishListItem(dims.size6H,dims.size35H,dims.size129H,dims.size45H,dims.size25V,dims.size29H,dims.size13V,dims.size28V,dims.text12,dims.text16,dims.text14,dims.text18,dims.text22,
                RalewayRegular,NunitoRegular,RalewayBold
            )
            Spacer(Modifier.height(dims.size14V))
        }
    }
}