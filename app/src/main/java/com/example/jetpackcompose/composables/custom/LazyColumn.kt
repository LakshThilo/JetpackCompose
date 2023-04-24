package com.example.jetpackcompose.composables.custom

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.model.PersonRepo

@ExperimentalFoundationApi
@Composable
fun CustomLazyColumn() {

    val personRepo = PersonRepo()
    val people = personRepo.getAllPeople()

    val section = listOf("A", "B", "C", "D", "E", "F", "G", "H")

    LazyColumn(
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // items
        /*items(
            items = people) { person ->
            CustomItem(person = person)
        }*/

        // itemsIndexed
        /*      itemsIndexed(
                  items = people,
                  key = { index, person ->
                      person.id
                  }
              ) { index, person ->
                  Log.d("MainActivity", index.toString())
                  CustomItem(person = person)
              }*/

        section.forEach { section ->
            stickyHeader {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                        .background(Color.LightGray),
                    text = "Section $section"
                )
            }
            items(10) {
                Text(
                    modifier = Modifier
                        .padding(12.dp),
                    text = "Item $it from the section $section "
                )
            }
        }
    }
}


@ExperimentalFoundationApi
@Composable
@Preview
fun CustomLazyColumnPreview() {
        // A surface container using the 'background' color from the theme
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.background)
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomLazyColumn()
        }
}