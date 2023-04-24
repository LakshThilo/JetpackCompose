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
fun CustomRow() {
    Row(
        modifier = Modifier
            .height(100.dp)
            .background(Color.LightGray)
            .padding(4.dp)
            .border(BorderStroke(1.dp, Color.Black)),
        horizontalArrangement = Arrangement.Center
    ) {
        CustomRowItem(weight = 1f, color = MaterialTheme.colors.primary)
        CustomRowItem(weight = 1f, color = MaterialTheme.colors.secondary)
        CustomRowItem(weight = 1f, color = MaterialTheme.colors.primary)
        CustomRowItem(weight = 1f, color = MaterialTheme.colors.secondary)
    }

}

@Composable
fun RowScope.CustomRowItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .weight(weight)
            .height(200.dp),
        color = color
    ) { }
}


@Composable
@Preview
fun CustomRowPreview() {

        // A surface container using the 'background' color from the theme
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.background)
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            CustomRow()

        }
}