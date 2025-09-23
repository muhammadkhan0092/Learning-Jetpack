package com.example.learningjetpackcompose.presentation.shopping_ui.main.main_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ButtonFrontArrow
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemMyOrders
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemStories
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemTopMenu

@Preview(showSystemUi = true)
@Composable
fun MainProfile(){
    val paddingTop = dimensionResource(R.dimen.dp_27)
    val paddingBottom = dimensionResource(R.dimen.dp_19)
    val paddingStart = dimensionResource(R.dimen.dp_24)
    val paddingEnd = dimensionResource(R.dimen.dp_20)
    val padding17 = dimensionResource(R.dimen.dp_17)
    val padding7 = dimensionResource(R.dimen.dp_7)
    val margin16 = dimensionResource(R.dimen.dp_16)
    val margin6 = dimensionResource(R.dimen.dp_6)
    val margin19 = dimensionResource(R.dimen.dp_19)
    val margin20 = dimensionResource(R.dimen.dp_20)
    val margin34 = dimensionResource(R.dimen.dp_34)
    val margin11 = dimensionResource(R.dimen.dp_11)
    val margin14 = dimensionResource(R.dimen.dp_14)
    val margin12 = dimensionResource(R.dimen.dp_12)
    val margin8 = dimensionResource(R.dimen.dp_8)
    val margin10 = dimensionResource(R.dimen.dp_10)
    val margin29 = dimensionResource(R.dimen.dp_29)
    val size40 = dimensionResource(R.dimen.dp_40)
    val text28 = dimensionResource(R.dimen.sp_28).value.sp
    val text10 = dimensionResource(R.dimen.sp_10).value.sp
    val text15 = dimensionResource(R.dimen.sp_15).value.sp
    val text14 = dimensionResource(R.dimen.sp_14).value.sp
    val text18 = dimensionResource(R.dimen.sp_18).value.sp
    val text36 = dimensionResource(R.dimen.sp_36).value.sp
    Column(modifier = Modifier.fillMaxSize().padding(top = paddingTop, bottom = paddingBottom, start = paddingStart, end = paddingEnd).background(Color.White)) {
        Row(verticalAlignment = Alignment.CenterVertically){
            ItemRoundedImage(size40)
            Spacer(Modifier.width(margin16))
            Text(
                "My Activity",
                modifier = Modifier
                    .background(Color(0xFF004CFF),
                    RoundedCornerShape(30.dp))
                    .padding(top = padding7, bottom = padding7, start = padding17, end = padding17),
                color = Color.White
            )
            Spacer(Modifier.width(margin34))
            ItemTopMenu(isSelected = true)
            Spacer(Modifier.width(margin11))
            ItemTopMenu(isSelected = false)
            Spacer(Modifier.width(margin11))
            ItemTopMenu(isSelected = false)
        }
        Spacer(Modifier.height(margin20))
        Text("Hello, Romina!", fontSize = text28, lineHeight = text36)
        Spacer(Modifier.height(margin12))
        Column(modifier = Modifier.background(Color(0xFFF8F8F8),RoundedCornerShape(10.dp))){
            Spacer(Modifier.height(margin10))
            Text("Announcement", modifier = Modifier.padding(start = margin14), fontSize = text14, lineHeight = text18)
            Row{
                Spacer(Modifier.width(margin14))
                Text(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas hendrerit luctus libero ac vulputate.",
                    fontSize = text10,
                    lineHeight = text15,
                    modifier = Modifier.weight(1f)
                )
                Spacer(Modifier.width(margin29))
                ButtonFrontArrow(Modifier)
                Spacer(Modifier.width(margin12))
            }
            Spacer(Modifier.height(margin10))
        }
        Text("Recently viewed")
        Row {
            ItemRoundedImage()
            Spacer(Modifier.width(margin19))
            ItemRoundedImage()
            Spacer(Modifier.width(margin19))
            ItemRoundedImage()
            Spacer(Modifier.width(margin19))
            ItemRoundedImage()
            Spacer(Modifier.width(margin19))
            ItemRoundedImage()
        }
        Text("My Orders")
        Row {
            ItemMyOrders()
            Spacer(Modifier.width(margin8))
            ItemMyOrders(isSelected = false)
            Spacer(Modifier.width(margin8))
            ItemMyOrders(isSelected = false)

        }
        Text("Stories")
        Row {
           ItemStories()
            Spacer(Modifier.width(margin6))
            ItemStories()
            Spacer(Modifier.width(margin6))
            ItemStories()
            Spacer(Modifier.width(margin6))
            ItemStories()
            Spacer(Modifier.width(margin6))
            ItemStories()
        }
    }
}