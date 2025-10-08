package com.example.learningjetpackcompose.presentation.shopping_ui.cart

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.cart.common.BottomAmountItem
import com.example.learningjetpackcompose.presentation.shopping_ui.cart.common.CartPaymentItem
import com.example.learningjetpackcompose.presentation.shopping_ui.cart.common.CartShippingOptionItem
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.NunitoRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewayRegular
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.RalewaySemiBold
import com.example.learningjetpackcompose.presentation.shopping_ui.settings.rememberDimensions

@Preview(showSystemUi = true)
@Composable
fun CartPaymentScreen(width : Dp = 375.dp,height : Dp = 812.dp){
    val dims = rememberDimensions(width,height)
    val scrollState = rememberScrollState()
    val shippingSelected = remember { mutableStateOf("Standard") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(start = dims.size20H, end = dims.size20H, top = dims.size20V)
            .background(Color.White))
    {
        Text("Payment", fontSize = dims.text28, lineHeight = dims.text36, fontFamily = RalewayBold)
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
            dims.text18,
        )
        Spacer(Modifier.height(dims.size7V))
        CommonBoxWIthEditIcon(
            dims.size10H,
            dims.size16H,
            dims.size45H,
            dims.size4V,
            dims.size9V,
            dims.text10,
            dims.text14,
            dims.text16,
            dims.text18,
            "Contact Information",
            "+84932000000\n" +
                    "amandamorgan@example.com"
        )
        Spacer(Modifier.height(dims.size20V))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd){
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
                Text("Items", fontSize = dims.text21, lineHeight = dims.text28, fontFamily = RalewayBold)
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
            Text(
                "Add Voucher",
                color =  Color(0xFF004BFE),
                modifier = Modifier
                    .border(1.dp,Color(0xFF004BFE),RoundedCornerShape(5.dp))
                    .padding(start = dims.size6H, end = dims.size6H, top = dims.size4V, bottom = dims.size4V)
            )
        }
        Spacer(Modifier.height(dims.size10V))
        repeat(2){
            CartPaymentItem(
                R.drawable.img_hello, dims.size60H,
                dims.size25H,
                dims.size9H,
                dims.text12,
                dims.text13,
                dims.text16,
                dims.text18,
                dims.text22,
                NunitoRegular,RalewayBold
            )
            Spacer(Modifier.height(dims.size7V))
        }
        Spacer(Modifier.height(dims.size22V))
        Text("Shipping Options", fontFamily = RalewayBold, fontSize = dims.text21, lineHeight = dims.text28)
        Spacer(Modifier.height(dims.size10V))
        CartShippingOptionItem(dims.size25V,dims.size4V,dims.size7V,dims.size6H,dims.size9H,dims.size10H,dims.size20H,dims.text16,dims.text20,dims.text13,dims.text17,
            RalewaySemiBold,
            RalewayRegular,
            RalewayBold,
            "Standard",
            "5-7 days",
            "FREE",
            shippingSelected.value,
            {
                if(shippingSelected.value!="Standard") shippingSelected.value="Standard"
            }
        )
        Spacer(Modifier.height(dims.size7V))
        CartShippingOptionItem(dims.size25V,dims.size4V,dims.size7V,dims.size6H,dims.size9H,dims.size10H,dims.size20H,dims.text16,dims.text20,dims.text13,dims.text17,
            RalewaySemiBold,
            RalewayRegular,
            RalewayBold,
            "Express   ",
            "1-7 days",
            "$1200",
            shippingSelected.value,
            {
                if(shippingSelected.value!="Standard") shippingSelected.value="Standard"
            }
        )
        Spacer(Modifier.height(dims.size7V))
        Text("Delivered on or before Thursday, 23 April 2020", fontSize = dims.text12, lineHeight = dims.text16, fontFamily = NunitoRegular)
        Spacer(Modifier.height(dims.size22V))
        Row(verticalAlignment = Alignment.CenterVertically){
            Text("Payment Method", modifier = Modifier.weight(1f), fontSize = dims.text21, lineHeight = dims.text28, fontFamily = RalewayBold)
            Image(painter = painterResource(R.drawable.ic_edit), contentDescription = "")
        }
        Spacer(Modifier.height(dims.size10V))
        Text(
            text = "Card",
            fontSize = dims.text16,
            color = Color(0xFF004CFF),
            lineHeight = dims.text20,
            modifier = Modifier
                .background(Color(0xFFE5EBFC),RoundedCornerShape(10.dp))
                .padding(top = dims.size4V, bottom = dims.size4V, start = dims.size6H, end = dims.size6H)
        )
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
            dims.text25,
            action = "Pay",
            btnColor = Color(0xFF202020)
        )
    }
}