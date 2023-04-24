package com.example.jetpackcompose.composables.navigationDrawer.sampleNavDrawer

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun DrawerBody(
    items: List<MenuItem>,
    modifier: Modifier = Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClick: (MenuItem) -> Unit
) {
    LazyColumn(modifier) {
        items(items) { item ->
            Row(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    onItemClick(item)
                }
                .padding(16.dp)
            ) {
                Icon(
                    imageVector = item.icon,
                    contentDescription = item.contentDesc
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = item.title,
                    style = itemTextStyle,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DrawerBodyPreview() {
    JetpackComposeTheme {
        DrawerBody(
            items = listOf(
                MenuItem(
                    id = "home",
                    title = "Home",
                    contentDesc = "Go to home screen",
                    icon = Icons.Default.Home
                ),
                MenuItem(
                    id = "settings",
                    title = "Settings",
                    contentDesc = "Go to settings screen",
                    icon = Icons.Default.Settings
                ),
                MenuItem(
                    id = "email",
                    title = "Email",
                    contentDesc = "Go to email screen",
                    icon = Icons.Default.Email
                ),
                MenuItem(
                    id = "help",
                    title = "Help",
                    contentDesc = "Go to help screen",
                    icon = Icons.Default.Info
                ),
            ), onItemClick = {
                /*when(it.id){
                    "settings" -> navigateToSettingsScreen
                }*/
                println("Click on ${it.title}")
            })
    }
}