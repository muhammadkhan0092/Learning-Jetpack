package com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R


@Composable
fun ItemTopMenu(image : Int = R.drawable.ic_play,isSelected : Boolean = true,onClick : ()-> Unit){
    val size = dimensionResource(R.dimen.dp_35)
    val imageSize = dimensionResource(R.dimen.dp_30)
    val selectionSize = dimensionResource(R.dimen.dp_8)
    val padding = dimensionResource(R.dimen.dp_6)
    Box(contentAlignment = Alignment.TopEnd, modifier = Modifier.background(Color(0xFFF8F8F8),CircleShape).size(size).clickable{onClick()}){
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(image),
                contentDescription = "",
                modifier = Modifier.size(imageSize).padding(padding)
            )
        }
        if(isSelected){
            Box(modifier = Modifier.background(Color.White, CircleShape).size(selectionSize).padding(1.dp), contentAlignment = Alignment.Center){
                Box(modifier = Modifier.fillMaxSize().background(Color(0xFF004CFF),CircleShape))
            }
        }
    }
}