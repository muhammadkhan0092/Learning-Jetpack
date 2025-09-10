package com.example.learningjetpackcompose.shopping_ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R


@SuppressLint("UnusedBoxWithConstraintsScope")
@Preview(showSystemUi = true)
@Composable
fun CreateAccount(){
    val ralewayFont = Font(R.font.raleway_bold)
    val nunitoLight = Font(R.font.nunito_light)
    val sp_54 = dimensionResource(id = R.dimen.sp_54)
    val sp_50 = dimensionResource(id = R.dimen.sp_50)
    val sp_22 = dimensionResource(id = R.dimen.sp_22).value.sp
    val sp_15 = dimensionResource(id = R.dimen.sp_15).value.sp
    val dp_10 = dimensionResource(R.dimen.dp_10)
    val dp_90 = dimensionResource(R.dimen.dp_90)
    val dp_17 = dimensionResource(R.dimen.dp_17)
    val dp_15 = dimensionResource(R.dimen.dp_15)
    val dp_8 = dimensionResource(R.dimen.dp_8)
    val dp_16 = dimensionResource(R.dimen.dp_16)
    val dp_52 = dimensionResource(R.dimen.dp_52)
    val dp_24 = dimensionResource(R.dimen.dp_24)
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
        BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
            val width = maxWidth
            val height = maxHeight
            Image(painter = painterResource(
                R.drawable.bg_bubble_blue),
                contentDescription = "",
                modifier = Modifier.offset(maxWidth*0.7546f,0.dp).fillMaxWidth(0.25f)
            )
            Image(painter = painterResource(
                R.drawable.bg_bubble_light_purple),
                contentDescription = "",
                modifier = Modifier.offset(0.dp,0.dp).fillMaxHeight(0.2343f).fillMaxWidth(0.55f)
            )
        }
        BoxWithConstraints(modifier = Modifier.fillMaxWidth(0.8933f).fillMaxHeight(0.843f)) {
            val width = maxWidth
            val height = maxHeight
            Text(
                "Create \n" + "Account",
                fontSize = sp_50.value.sp, lineHeight = sp_54.value.sp,
                modifier = Modifier.padding(start = dp_10),
                fontFamily = FontFamily(ralewayFont)
            )
            Image(
                painter = painterResource(R.drawable.img_camera),
                contentDescription = "",
                modifier = Modifier.offset(dp_10,maxHeight*0.248f).size(dp_90)
            )
            Column(modifier = Modifier.offset(0.dp,maxHeight*0.436f)){
                EditTextComposable("Email", Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(dp_8))
                EditTextComposable("Password", Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(dp_8))
                EditTextComposable("Country", Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(dp_52))
                Text(
                    "Done",
                    fontSize = sp_22,
                    fontFamily = FontFamily(nunitoLight),
                    color = Color(0xFFF3F3F3),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF004CFF), shape = RoundedCornerShape(16.dp))
                        .padding(top = dp_15, bottom = dp_15)
                )
                Spacer(modifier = Modifier.height(dp_24))
                Text(
                    "Cancel",
                    fontSize = sp_15,
                    color = Color(0xFF202020),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily(nunitoLight),
                    modifier = Modifier.fillMaxWidth(),
                )
            }

        }
    }
}
@Composable
fun EditTextComposable(hint : String,modifier: Modifier){
    val sp_14 = dimensionResource(id = R.dimen.sp_14).value.sp
    val dp_20 = dimensionResource(id = R.dimen.sp_20)
    val dp_54 = dimensionResource(R.dimen.dp_54)
    BasicTextField(
        value = "",
        onValueChange = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(dp_54) // fixed height
            .background(Color(0xFFF8F8F8), RoundedCornerShape(100.dp))
            .padding(start = dp_20, top = 0.dp, bottom = 0.dp, end = 0.dp)
        ,
        decorationBox = { innerTextField ->
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.CenterStart // centers text vertically
            ) {
                if ("".isEmpty()) { // show hint only if value is empty
                    Text(
                        text = hint,
                        color = Color(0xFFD2D2D2),
                        fontSize = sp_14
                    )
                }
                innerTextField()
            }
        }
    )


}
@Composable
fun dimensionResourceByName(name: String): Dp {
    val context = LocalContext.current
    val resId = context.resources.getIdentifier(name, "dimen", context.packageName)
    return if (resId != 0) {
        (context.resources.getDimensionPixelSize(resId) / context.resources.displayMetrics.density).dp
    } else {
        0.dp
    }
}
