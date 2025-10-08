package com.example.learningjetpackcompose.presentation.shopping_ui.cart

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.cart.common.BottomAmountItem
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoLight
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayExtraBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewaySemiBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions
import com.example.learningjetpackcompose.presentation.shopping_ui.wishlist.common.WishListItem

@Composable
fun CartScreen(width : Dp = 375.dp,height : Dp = 812.dp){
    val dims = rememberDimensions(width,height)
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(start = dims.size20H, end = dims.size20H, top = dims.size20V)
            .background(Color.White))
    {
        Row(verticalAlignment = Alignment.CenterVertically){
            Text("Cart", fontSize = dims.text28, lineHeight = dims.text36, fontFamily = RalewayBold)
            Spacer(Modifier.width(dims.size7V))
            Box(
                modifier = Modifier
                    .size(dims.size30V)
                    .background(Color(0XFFE5EBFC), RoundedCornerShape(100.dp))
                ,
                contentAlignment = Alignment.Center){
                Text("2", fontSize = dims.text18, lineHeight = dims.text22)
            }
        }
        Spacer(Modifier.height(dims.size10V))
        CommonBoxWIthEditIcon(
            dims.size10H,
            dims.size16H,
            dims.size45H,
            dims.size4V,
            dims.size9V,
            dims.text10,
            dims.text14,
            dims.text16,
            dims.text18
        )
        Spacer(Modifier.height(dims.size16V))
        repeat(2){
            CartItem(
                1,
                dims.size6H,
                dims.size10H,
                dims.size30H,
                dims.size35H,
                dims.size129H,
                dims.size109V,
                dims.size35H,
                dims.size30V,
                dims.size4V,
                dims.size25V,
                dims.text12,
                dims.text16,
                dims.text14,
                dims.text18,
                dims.text22,
                RalewayBold,
                RalewaySemiBold,
                NunitoRegular
            )
            Spacer(Modifier.height(dims.size14V))
        }
        Spacer(Modifier.height(dims.size20V))
        Text("From Your Wishlist", fontSize = dims.text22, fontFamily = RalewayBold)
        Spacer(Modifier.height(dims.size16V))
        repeat(4){
            WishListItem(dims.size6H,dims.size35H,dims.size129H,dims.size45H,dims.size25V,dims.size29H,dims.size13V,dims.size28V,dims.text12,dims.text16,dims.text14,dims.text18,dims.text22,
                RalewayRegular,NunitoRegular,RalewayBold
            )
            Spacer(Modifier.height(dims.size14V))
        }
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomStart){
        BottomAmountItem(
            dims.size6H,
            dims.size20H,
            dims.size29H,
            dims.size7V,
            dims.size10V,
            dims.text16,
            dims.text18,
            dims.text20,
            dims.text22,
            dims.text25
        )
    }
}