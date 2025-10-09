package com.example.learningjetpackcompose.presentation.shopping_ui.history

import android.util.Log
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemRoundedImage
import com.example.learningjetpackcompose.presentation.shopping_ui.main.other_views.ItemTopMenu
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoLight
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions

@Preview(showSystemUi = true)
@Composable
fun HistoryScreen(width : Dp = 375.dp,height : Dp = 812.dp){
    val dims = rememberDimensions(width,height)
    val scrollState = rememberScrollState()
    val isReviewClicked = mutableStateOf(true)
    Column(modifier = Modifier.fillMaxSize()
        .verticalScroll(scrollState)
        .padding(top = dims.size20V, start = dims.size20H, end = dims.size20H)
        .background(Color.White)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            ItemRoundedImage(R.drawable.img_profile, dims.size44V)
            Spacer(Modifier.width(dims.size16V))
            Text(
                "History",
                fontSize = dims.text21,
                lineHeight = dims.text28,
                fontFamily = RalewayBold,
                modifier = Modifier
            )
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxWidth()
            ){
                ItemTopMenu(image = R.drawable.ic_vouchers, isSelected = true, {})
                Spacer(Modifier.width(dims.size10H))
                ItemTopMenu(image = R.drawable.ic_lines, isSelected = false, {})
                Spacer(Modifier.width(dims.size10H))
                ItemTopMenu(image = R.drawable.ic_settings_blue, isSelected = false, {
                })
            }
        }
        Spacer(Modifier.height(dims.size28V))
        repeat(10){
            ItemHistory(
                R.drawable.img_hello,
                dims.size6H, dims.size109V, dims.size129H, dims.size10H, dims.size30V,
                dims.text12, dims.text16, dims.text14, dims.text18, dims.text13, dims.text17, dims.text20,
                NunitoRegular,RalewayBold, RalewayRegular
            )
            Spacer(Modifier.height(dims.size14V))
        }
    }
    if(isReviewClicked.value){
        Box(
            modifier = Modifier.fillMaxSize().background(Color(0xB8E9E9E9))
        )
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter){
            Column(modifier =Modifier
                .background(Color.White,RoundedCornerShape(10.dp))
                .padding(start = dims.size20H, end = dims.size20H)
            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF8FAFF),RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
                        .padding(top = dims.size27V, bottom = dims.size27V)
                    ,
                    contentAlignment = Alignment.CenterStart
                )
                {
                    Text("Review", fontSize = dims.text22, fontFamily = RalewayBold)
                }
                Spacer(Modifier.height(dims.size16V))
                Row(verticalAlignment = Alignment.CenterVertically){
                    Box(
                        modifier = Modifier
                            .size(dims.size44V)
                            .background(Color(0x1A000000), RoundedCornerShape(10.dp))
                            .padding(5.dp)
                    ){
                        Image(
                            painter = painterResource(R.drawable.img_hello),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize().clip(CircleShape)
                        )
                    }
                    Spacer(Modifier.width(dims.size10H))
                    Column(verticalArrangement = Arrangement.SpaceBetween){
                        Text("Lorem ipsum dolor sit amet consectetur.", fontSize = dims.text12, lineHeight = dims.text16, fontFamily = NunitoRegular)
                        Text("Order #92287157", fontSize = dims.text13, lineHeight = dims.text18, fontFamily = RalewayBold)
                    }
                }
                Spacer(Modifier.height(dims.size14V))
                Row {
                    repeat(5) {
                        Image(
                            painter = painterResource(R.drawable.ic_star_unchecked),
                            contentDescription = "",
                            modifier = Modifier.size(dims.size33V)
                        )
                    }
                }
                Spacer(Modifier.height(dims.size18V))
                Box(
                    modifier = Modifier
                        .fillMaxWidth().height(dims.size103V)
                        .background(Color(0xFFF1F4FE),RoundedCornerShape(10.dp))
                        .padding(top = dims.size10V, start = dims.size16H)
                ){
                    Text("Your comment", fontSize = dims.text16, lineHeight = dims.text20, fontFamily = RalewayRegular)
                }
                Spacer(Modifier.height(dims.size20V))
                Text(
                    "Say it!",
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF004CFF),RoundedCornerShape(10.dp))
                        .padding(top = dims.size7V, bottom = dims.size7V),
                    textAlign = TextAlign.Center,
                    fontSize = dims.text16,
                    lineHeight = dims.text25,
                    fontFamily = NunitoLight,
                    color = Color.White
                )
                Spacer(Modifier.height(dims.size20V))
            }
        }
    }
}