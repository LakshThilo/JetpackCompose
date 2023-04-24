package com.example.jetpackcompose.composables.custom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CustomBox() {
    Box(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .background(Color.Yellow),
        contentAlignment = Alignment.TopCenter,
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(50.dp)
                    .background(Color.Green),
                contentAlignment = Alignment.BottomCenter
            )
            {
                Text(text = "Box", fontSize = 20.sp)
            }

            Text(text = "Testing Box layout", fontSize = 40.sp)
        }
    }
}


@Composable
@Preview
fun CustomBoxPreview() {
        // A surface container using the 'background' color from the theme
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.background)
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            CustomBox()

        }
}