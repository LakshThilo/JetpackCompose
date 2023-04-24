package com.example.jetpackcompose.demo.composabale

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.demo.model.ItemEntry
import com.example.jetpackcompose.demo.model.ItemProvider
import com.example.jetpackcompose.ui.theme.Typography

@Composable
fun SingleListItem(item: ItemEntry){

    Card(modifier = Modifier
        .padding(horizontal = 8.dp, vertical = 4.dp)
        .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(8.dp))
    ) {
        Row {
            ItemImage(item = item)
            Column(modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
            ) {
                Row {
                    Text(text = item.name, style = Typography.h6)
                    Text(text = item.name, style = Typography.h6)
                }
                Text(text = item.name, style = Typography.h6)
            }

        }
    }
}

@Composable
private fun ItemImage(item: ItemEntry) {
    Image(
        painter = painterResource(id = item.imageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}


@Composable
@Preview
fun SingleListItemPreview(){
    SingleListItem(item = ItemProvider.item)
}


@Composable
@Preview
fun ItemImagePreview(){
        ItemImage(item = ItemProvider.item)
}
