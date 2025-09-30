package com.example.learningjetpackcompose.presentation.shopping_ui.main.main_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.BigSaleCard
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.HeadingWithSeeAll
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemGridCategories
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemMostPopular
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemNewItem
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemSquareImageWhiteBg

@Preview(showSystemUi = true)
@Composable
fun MainHome(width : Dp = 375.dp,height : Dp = 812.dp) {
    val paddingTop = height*0.0258f
    val paddingBottom = dimensionResource(R.dimen.dp_19)
    val margin1 = height*0.001f
    val margin4 = height*0.004f
    val margin5 = height*0.006f
    val margin6 = height*0.007f
    val margin8 = height*0.009f
    val margin10 = height*0.012f
    val margin12 = height*0.014f
    val margin15 = height*0.018f
    val margin16 = height*0.019f
    val margin17 = height*0.020f
    val margin18 = height*0.022f
    val margin19 = width*0.101f
    val margin22 = height*0.027f
    val margin24 = height*0.029f
    val margin27 = height*0.033f
    val margin29 = height*0.035f
    val margin40 = height*0.049f
    val sizeH75 =width*0.2f

    val marginH6 = width*0.016f
    val sizeH165 = width*0.40f
    val marginH5 = width*0.013f
    val marginH4 = width*0.010f


    val marginV5 = height*0.006f
    val marginV6 = height*0.007f

    val sizeV130 = height*0.160f


    val text11 =(height * 0.013f).value.sp
    val text12 = (height * 0.014f).value.sp
    val text13 = (height * 0.016f).value.sp
    val text15 = (height * 0.018f).value.sp
    val text16 = (height * 0.019f).value.sp
    val text17 = (height * 0.020f).value.sp
    val text18 =(height * 0.022f).value.sp
    val text19 = (height * 0.023f).value.sp
    val text21 = (height * 0.025f).value.sp
    val text30 = (height * 0.036f).value.sp
    val text26 =(height * 0.032f).value.sp
    val text28 = (height * 0.034f).value.sp
    val text29 = (height * 0.034f).value.sp
    val text38 = (height * 0.046f).value.sp



    val ralewayBold = Font(R.font.raleway_bold)
    val ralewayExtra = Font(R.font.raleway_extra_bold)
    val nunito = Font(R.font.nunito_bold)
    val ralewayRegular = Font(R.font.raleway_regular)


    val imgHello = R.drawable.img_hello
    val recentImages = listOf(R.drawable.img_recent_one,R.drawable.img_recent_two,R.drawable.img_recent_three,R.drawable.img_recent_four,R.drawable.img_recent_five)


    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(scrollState)
            .padding(
                top = paddingTop,
                bottom = paddingBottom,
                start = width * 0.053f,
                end = width * 0.053f
            )
            .background(Color.White)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically){
            Text("Shop", fontSize = text28, lineHeight = text38, fontFamily = FontFamily(ralewayBold))
            Spacer(Modifier.width(margin19))
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().background(Color(0xFFF8F8F8), RoundedCornerShape(30.dp)).weight(1f).padding(start = margin16, end = margin16, top = margin5, bottom = margin5)){
                Row(verticalAlignment = Alignment.CenterVertically){
                    Text("Search", modifier = Modifier.weight(1f), fontSize = text16, lineHeight = text21, color = Color(0xFFC7C7C7))
                    Image(painter = painterResource(R.drawable.ic_unselected_home), contentDescription = "", modifier = Modifier.size(margin16))
                }
            }
        }
        Spacer(Modifier.height(margin17))
        BigSaleCard(text29,text26,text12,text18,text11,text15,margin1,margin29,margin4,margin18,margin12,ralewayBold,nunito,sizeV130)
        Spacer(Modifier.height(margin22))
        HeadingWithSeeAll("Categories",text21,text30,ralewayBold,text15,margin12)
        Spacer(Modifier.height(margin10))
        Column(verticalArrangement = Arrangement.spacedBy(margin6)){
            Row(horizontalArrangement = Arrangement.spacedBy(marginH5)){
                ItemGridCategories("Clothing","253",R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,margin4,ralewayExtra,text17,text21,text12,margin8,sizeH75,sizeH165,marginH5,marginH6,marginH4,marginV5,marginV6)
                ItemGridCategories("Clothing","253",R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,margin4,ralewayExtra,text17,text21,text12,margin8,sizeH75,sizeH165,marginH5,marginH6,marginH4,marginV5,marginV6)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(marginH5)){
                ItemGridCategories("Clothing","253",R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,margin4,ralewayExtra,text17,text21,text12,margin8,sizeH75,sizeH165,marginH5,marginH6,marginH4,marginV5,marginV6)
                ItemGridCategories("Clothing","253",R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,margin4,ralewayExtra,text17,text21,text12,margin8,sizeH75,sizeH165,marginH5,marginH6,marginH4,marginV5,marginV6)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(marginH5)){
                ItemGridCategories("Clothing","253",R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,margin4,ralewayExtra,text17,text21,text12,margin8,sizeH75,sizeH165,marginH5,marginH6,marginH4,marginV5,marginV6)
                ItemGridCategories("Clothing","253",R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,R.drawable.img_hello,margin4,ralewayExtra,text17,text21,text12,margin8,sizeH75,sizeH165,marginH5,marginH6,marginH4,marginV5,marginV6)
            }
        }
        Spacer(Modifier.height(margin27))
        Text("Top Products", fontSize = text21, lineHeight = text30, fontFamily = FontFamily(ralewayBold))
        Spacer(Modifier.height(margin10))
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
            repeat(5){
                ItemRoundedImage(recentImages[it],height*0.061f)
            }
        }


        Spacer(Modifier.height(margin40))
        HeadingWithSeeAll("New Items",text21,text30,ralewayBold,text15,margin12)
        Spacer(Modifier.height(margin10))
        Row(horizontalArrangement = Arrangement.spacedBy(margin6)){
            ItemNewItem(R.drawable.img_new_item_one,height*0.172f,text12,text16,text17,text21,margin6,margin1,ralewayExtra,nunito,margin5)
            ItemNewItem(R.drawable.img_new_item_two,height*0.172f,text12,text16,text17,text21,margin6,margin1,ralewayExtra,nunito,margin5)
        }


        Spacer(Modifier.height(margin24))
        Text("Flash Sale", fontSize = text21, lineHeight = text30, fontFamily = FontFamily(ralewayBold))
        Spacer(Modifier.height(margin10))
        Column(verticalArrangement = Arrangement.spacedBy(margin6)){
            Row(horizontalArrangement = Arrangement.spacedBy(margin8)){
                ItemSquareImageWhiteBg(imgHello,width,true)
                ItemSquareImageWhiteBg(imgHello,width,true)
                ItemSquareImageWhiteBg(imgHello,width,true)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(margin8)){
                ItemSquareImageWhiteBg(imgHello,width,true)
                ItemSquareImageWhiteBg(imgHello,width,true)
                ItemSquareImageWhiteBg(imgHello,width,true)
            }
        }



        Spacer(Modifier.height(margin24))
        HeadingWithSeeAll("Most Popular",text21,text30,ralewayBold,text15,margin12)
        Spacer(Modifier.height(margin15))
        Row(horizontalArrangement = Arrangement.spacedBy(margin6)){
            ItemMostPopular(R.drawable.img_popular_one,"New",height*0.172f,height*0.126f,margin5,text15,text19,ralewayBold,ralewayRegular,margin1,text13,text17,margin10)
            ItemMostPopular(R.drawable.img_popular_two,"Sale",height*0.172f,height*0.126f,margin5,text15,text19,ralewayBold,ralewayRegular,margin1,text13,text17,margin10)
            ItemMostPopular(R.drawable.img_popular_three,"Hot",height*0.172f,height*0.126f,margin5,text15,text19,ralewayBold,ralewayRegular,margin1,text13,text17,margin10)
        }




        Spacer(Modifier.height(margin27))
        Text("Just For You", fontSize = text21, lineHeight = text30, fontFamily = FontFamily(ralewayBold))
        Spacer(Modifier.height(margin15))
        val scrollIndicator = rememberScrollState()
        Row(horizontalArrangement = Arrangement.spacedBy(margin6), modifier = Modifier.horizontalScroll(scrollIndicator)){
            ItemNewItem(R.drawable.img_new_item_one,width*0.44f,text12,text16,text17,text21,margin6,margin1,ralewayExtra,nunito,margin5)
            ItemNewItem(R.drawable.img_new_item_two,width*0.44f,text12,text16,text17,text21,margin6,margin1,ralewayExtra,nunito,margin5)
        }

    }
}