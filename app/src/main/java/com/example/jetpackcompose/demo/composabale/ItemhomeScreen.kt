package com.example.jetpackcompose.demo.composabale

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.demo.model.ItemProvider

@Composable
fun ItemHomeScreen() {

    val fruits = remember { ItemProvider.itemList }

    LazyColumn(contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp )
    ){
       items(
           items = fruits,
           itemContent = {
               SingleListItem(item = it)
           }
       )
    }
}



@Preview(showBackground = true)
@Composable
fun ItemHomeScreenPreview() {
    ItemHomeScreen()
}