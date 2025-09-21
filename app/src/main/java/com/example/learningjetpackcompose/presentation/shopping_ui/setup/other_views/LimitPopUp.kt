package com.example.learningjetpackcompose.presentation.shopping_ui.setup.other_views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.presentation.shopping_ui.common_views.LargeBlueButton

@Composable
fun LimitPopUp(modifier: Modifier) {
    val margin57 = dimensionResource(R.dimen.dp_57)
    val margin25 = dimensionResource(R.dimen.dp_25)
    val margin20 = dimensionResource(R.dimen.dp_20)
    val margin38 = dimensionResource(R.dimen.dp_38)
    val text18 = dimensionResource(R.dimen.sp_18).value.sp
    val text26 = dimensionResource(R.dimen.sp_26).value.sp
    val raleRegular = Font(R.font.raleway_medium)
    Box(modifier = modifier){
        Box(modifier = Modifier.fillMaxWidth().offset(0.dp,margin38).background(Color.White, RoundedCornerShape(30.dp))){
            Column {
                Spacer(Modifier.height(margin57))
                Text("You reached out maximum\namount of attempts.\nPlease, try later.", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = text18, lineHeight = text26, fontFamily = FontFamily(raleRegular))
                Spacer(Modifier.height(margin25))
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                    LargeBlueButton("Okay", Modifier.fillMaxWidth(0.5f))
                }
                Spacer(Modifier.height(margin20))
            }

        }
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .shadow(
                        elevation = 20.dp,
                        shape = CircleShape,
                        clip = false
                    )
                    .background(Color.White, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier.size(60.dp)
                        .background(Color(0xFFFFEBEB), CircleShape)
                )
                Box(
                    modifier = Modifier.size(40.dp)
                        .background(Color.White, CircleShape)
                )
                Box(
                    modifier = Modifier.size(30.dp)
                        .background(Color.Black, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_tick),
                        contentDescription = ""
                    )
                }
            }
        }


    }
}