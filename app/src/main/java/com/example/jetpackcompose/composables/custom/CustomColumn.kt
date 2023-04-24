package com.example.jetpackcompose.composables.custom

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CustomColumn() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray)
            .padding(4.dp)
            .border(BorderStroke(1.dp, Color.Black)),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        CustomColumnItem(weight = 1f, color = MaterialTheme.colors.primary)
        CustomColumnItem(weight = 1f, color = MaterialTheme.colors.secondary)
    }

}


@Composable
fun ColumnScope.CustomColumnItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .weight(weight),
        color = color
    ) { }
}

@Composable
@Preview
fun CustomColumnPreview() {
        // A surface container using the 'background' color from the theme
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.background)
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            CustomColumn()

        }

}