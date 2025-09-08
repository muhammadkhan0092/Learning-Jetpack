package com.example.learningjetpackcompose.shopping_ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R


@SuppressLint("UnusedBoxWithConstraintsScope")
@Preview(showSystemUi = true)
@Composable
fun CreateAccount(){
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
        BoxWithConstraints(modifier = Modifier.fillMaxWidth(0.8933f).fillMaxHeight(0.843f)) {
            val width = maxWidth
            val height = maxHeight
            Text(
                "Create \n" + "Account",
                fontSize = 50.sp, lineHeight = 54.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
            Image(
                painter = painterResource(R.drawable.img_camera),
                contentDescription = "",
                modifier = Modifier.offset(10.dp,maxHeight*0.248f).size(90.dp)
            )
            Column(modifier = Modifier.offset(0.dp,maxHeight*0.436f)){
                EditTextComposable("Email", Modifier.fillMaxWidth())
                EditTextComposable("Password", Modifier.fillMaxWidth().offset(0.dp,8.dp))
                EditTextComposable("Country", Modifier.fillMaxWidth().offset(0.dp,16.dp))
            }
        }
    }
}
@Composable
fun EditTextComposable(hint : String,modifier: Modifier){
    TextField(
        textStyle = TextStyle(
            fontSize = 18.sp
        ),
        value = "",
        placeholder = {
            Text(
                text = hint,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 19.dp)
            )
        },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        ),
        onValueChange = {},
        shape = RoundedCornerShape(100.dp),
        modifier = modifier.background(Color(0xFFF8F8F8)),
    )
}
