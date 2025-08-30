package com.example.learningjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme

class UninstallSpecialOffer : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeTheme {

            }
        }
    }
    @Preview(showSystemUi = true)
    @Composable
    fun FourSidePercentageBox(

    ) {
        val config = LocalConfiguration.current
        val screenHeight = config.screenHeightDp.dp
        val screenWidth = config.screenWidthDp.dp
        ConstraintLayout(
            modifier = Modifier.offset().fillMaxWidth(1f).fillMaxHeight(1f).background(Color(0xFF282E36))
        ) {
            val (box,oneTime) = createRefs()

            Box(
                modifier = Modifier
                    .background(Color(0xFFECEBE5), RoundedCornerShape(4.dp))
                    .constrainAs(box) {
                        top.linkTo(parent.top,screenHeight*0.457f)
                        bottom.linkTo(parent.bottom,screenHeight*0.412f)
                        start.linkTo(parent.start,screenWidth*0.089f)
                        end.linkTo(parent.end,screenWidth*0.089f)
                        width = Dimension.fillToConstraints
                        height = Dimension.fillToConstraints
                    }

            ){
                ConstraintLayout(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val guidelineLifeTop = createGuidelineFromTop(0.161f)   // 20% from top of Box
                    val guidelineStart = createGuidelineFromStart(0.050f) // 30% from start
                    val guidelineYearTop = createGuidelineFromTop(0.656f)
                    val guidelineSpacerTop = createGuidelineFromTop(0.535f)
                    val guidelineSpacerEnd = createGuidelineFromEnd(0.05f)
                    val (lifeText,yearText,icon,spacer) = createRefs()

                    Text(
                        "\$ 49 USD", fontFamily = FontFamily(Font(R.font.inter_bold)),
                        fontSize = 19.sp,
                        lineHeight = 25.sp,
                        modifier = Modifier.constrainAs(lifeText) {
                            top.linkTo(guidelineLifeTop)
                            start.linkTo(guidelineStart)
                        }
                    )

                    Text(
                        "\$49 USD / year", fontFamily = FontFamily(Font(R.font.inter_regular)),
                        fontSize = 12.sp,
                        lineHeight = 18.sp,
                        modifier = Modifier.constrainAs(yearText) {
                            top.linkTo(guidelineYearTop)
                            start.linkTo(guidelineStart)
                        },
                        textDecoration = TextDecoration.LineThrough
                    )
                    Spacer(
                        modifier = Modifier
                            .background(Color(0xFFDDDBCF))
                            .constrainAs(spacer) {
                                top.linkTo(guidelineSpacerTop)
                                start.linkTo(guidelineStart)
                                end.linkTo(guidelineSpacerEnd)
                                width = Dimension.fillToConstraints
                                height = Dimension.value(1.dp)   // fixed height
                            }
                    )

                }

            }
            val guidelineTop = createGuidelineFromTop(0.533f)
            val guidelineStart = createGuidelineFromEnd(0.068f)
            Text(
                text = "One-time payment for life!",
                color = Color.White,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                lineHeight = 18.sp,
                modifier = Modifier
                    .constrainAs(oneTime){
                    top.linkTo(guidelineTop)
                    end.linkTo(guidelineStart)
                    }
                    .background(color = Color(0xFFFF7414), RoundedCornerShape(topStart = 4.dp, bottomStart = 4.dp))
                    .padding(8.dp)

            )
        }
    }


}
