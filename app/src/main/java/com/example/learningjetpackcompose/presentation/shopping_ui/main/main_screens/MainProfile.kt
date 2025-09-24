package com.example.learningjetpackcompose.presentation.shopping_ui.main.main_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.ButtonFrontArrow
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.HeadingWithSeeAll
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemMyOrders
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemNewItem
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemStories
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemTopMenu

@Preview(showSystemUi = true)
@Composable
fun MainProfile(height: Dp = 812.dp) {
    val paddingTop = dimensionResource(R.dimen.dp_71)
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
    val margin17 = dimensionResource(R.dimen.dp_17)
    val margin5 = dimensionResource(R.dimen.dp_5)
    val margin8 = dimensionResource(R.dimen.dp_8)
    val margin10 = dimensionResource(R.dimen.dp_10)
    val margin29 = dimensionResource(R.dimen.dp_29)
    val margin18 = dimensionResource(R.dimen.dp_18)
    val margin25 = dimensionResource(R.dimen.dp_25)
    val margin28 = dimensionResource(R.dimen.dp_28)
    val margin3 = dimensionResource(R.dimen.dp_3)
    val size40 = dimensionResource(R.dimen.dp_40)
    val text28 = dimensionResource(R.dimen.sp_28).value.sp
    val text10 = dimensionResource(R.dimen.sp_10).value.sp
    val text15 = dimensionResource(R.dimen.sp_15).value.sp
    val text16 = dimensionResource(R.dimen.sp_16).value.sp
    val text14 = dimensionResource(R.dimen.sp_14).value.sp
    val text18 = dimensionResource(R.dimen.sp_18).value.sp
    val text36 = dimensionResource(R.dimen.sp_36).value.sp
    val text21 = dimensionResource(R.dimen.sp_21).value.sp
    val text30 = dimensionResource(R.dimen.sp_30).value.sp
    val raleway = Font(R.font.raleway_bold)
    val scrollState = rememberScrollState()
    val padding = dimensionResource(R.dimen.dp_10)
    val ralewayExtra = Font(R.font.raleway_extra_bold)
    val nun = Font(R.font.nunito_regular)
    val text12 = dimensionResource(R.dimen.sp_12).value.sp
    val text17 = dimensionResource(R.dimen.sp_12).value.sp
    val margin1 = dimensionResource(R.dimen.dp_1)
    Column(modifier = Modifier.fillMaxSize()
        .verticalScroll(scrollState) .padding(top = paddingTop, bottom = paddingBottom, start = paddingStart, end = paddingEnd).background(Color.White)) {
        Row(verticalAlignment = Alignment.CenterVertically){
            ItemRoundedImage(size40)
            Spacer(Modifier.width(margin16))
            Text(
                "My Activity",
                fontSize = text15,
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
        Text("Hello, Romina!", fontSize = text28, lineHeight = text36, fontFamily = FontFamily(raleway))
        Spacer(Modifier.height(margin12))
        Column(modifier = Modifier.background(Color(0xFFF8F8F8),RoundedCornerShape(10.dp))){
            Spacer(Modifier.height(margin10))
            Text("Announcement", modifier = Modifier.padding(start = margin14), fontSize = text14, lineHeight = text18, fontFamily = FontFamily(raleway))
            Spacer(Modifier.height(margin3))
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
        Spacer(Modifier.height(margin18))
        Text("Recently viewed", fontSize = text21, lineHeight = text30, fontFamily = FontFamily(raleway))
        Spacer(Modifier.height(margin17))
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
            repeat(5){
                ItemRoundedImage(height*0.061f)
                ItemRoundedImage(height*0.061f)
                ItemRoundedImage(height*0.061f)
                ItemRoundedImage(height*0.061f)
                ItemRoundedImage(height*0.061f)
            }
        }
        Spacer(Modifier.height(margin25))
        Text("My Orders", fontSize = text21, lineHeight = text30, fontFamily = FontFamily(raleway))
        Spacer(Modifier.height(margin12))
        Row {
            ItemMyOrders()
            Spacer(Modifier.width(margin8))
            ItemMyOrders(isSelected = false)
            Spacer(Modifier.width(margin8))
            ItemMyOrders(isSelected = false)

        }
        Spacer(Modifier.height(margin28))
        Text("Stories", fontSize = text21, lineHeight = text30, fontFamily = FontFamily(raleway))
        Spacer(Modifier.height(margin5))
        val horizontalScroll = rememberScrollState()
        Row(horizontalArrangement = Arrangement.spacedBy(margin6), modifier = Modifier.fillMaxWidth().horizontalScroll(horizontalScroll)){
           ItemStories(height*0.215f)
            ItemStories(height*0.215f)
            ItemStories(height*0.215f)
            ItemStories(height*0.215f)
            ItemStories(height*0.215f)
        }
        Spacer(Modifier.height(margin28))
        HeadingWithSeeAll("New Items",text21,text30,raleway,text15,margin12)
        Spacer(Modifier.height(margin10))
        Row {
            repeat(2){
                ItemNewItem(height*0.172f,text12,text16,text17,text21,margin6,margin1,ralewayExtra,nun,padding)
            }
        }
    }
}