package com.example.jetpackcompose.composables.custom

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomText() {
    Box(
        modifier = Modifier
            .height(220.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(2.dp)
            .border(BorderStroke(1.dp, Color.Black)),
        contentAlignment = Alignment.Center,
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .background(MaterialTheme.colors.error)
                    .width(300.dp)
                    .padding(8.dp),
                text = "Sample Text",
                fontSize = MaterialTheme.typography.h5.fontSize,
                color = Color.White,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            CustomTextAnnotatedString()

            Text(
                text = "Repeat Text!! ".repeat(20),
                maxLines = 2,
                overflow = TextOverflow.Visible
            )

            CustomSelectableText()
        }
    }
}

@Composable
fun CustomTextAnnotatedString() {
    Text(
        buildAnnotatedString {
            withStyle(
                style = ParagraphStyle(
                    textAlign = TextAlign.Center
                )
            ) {
                withStyle(
                    style = SpanStyle(
                        color = Color.Blue,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontStyle = FontStyle.Italic
                    )
                ) {
                    append("L")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("A")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Yellow,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("K")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Red,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("S")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("H")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("I")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Cyan,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("T")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Magenta,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("H")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.DarkGray,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("A")
                }
            }

        },
        modifier = Modifier.width(300.dp)
    )
}


@Composable
fun CustomSelectableText() {
    SelectionContainer {
        Column {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Selectable!",
                textAlign = TextAlign.Start,
                color = MaterialTheme.colors.primary,
                fontSize = 16.sp
            )

            DisableSelection {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Not Selectable!",
                    textAlign = TextAlign.Start,
                    color = MaterialTheme.colors.secondary,
                    fontSize = 16.sp
                )
            }
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Selectable!",
                textAlign = TextAlign.Start,
                color = MaterialTheme.colors.primary,
                fontSize = 16.sp
            )
        }

    }
}


@Composable
fun SuperAndSubScriptText(
    superText: String,
    superTextFontSize: TextUnit = MaterialTheme.typography.overline.fontSize,
    normalText: String,
    normalTextFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    subText: String,
    subTextFontSize: TextUnit = MaterialTheme.typography.overline.fontSize,
    fontWeight: FontWeight = FontWeight.Normal,

    ){

    Box(modifier = Modifier
        .background(Color.White)
        .padding(4.dp)
        .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text( buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = superTextFontSize,
                    fontWeight = fontWeight,
                    baselineShift = BaselineShift.Superscript,
                    color = Color.Red,
                )
            ) {
                append(superText)
            }

            withStyle(
                style = SpanStyle(
                    fontSize = normalTextFontSize,
                )
            ) {
                append(normalText)
            }

            withStyle(
                style = SpanStyle(
                    fontSize = subTextFontSize,
                    fontWeight = FontWeight.SemiBold,
                    baselineShift = BaselineShift.Subscript
                )
            ) {
                append(subText)
            }
        })

    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
        // A surface container using the 'background' color from the theme
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.background)
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            CustomText()

            SuperAndSubScriptText(
                superText = "Jetpack",
                normalText = "Compose",
                subText = "Awesome")

        }
}