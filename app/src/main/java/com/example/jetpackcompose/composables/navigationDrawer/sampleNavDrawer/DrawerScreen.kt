package com.example.jetpackcompose.composables.navigationDrawer.sampleNavDrawer

import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.composables.appBar.AppBar
import kotlinx.coroutines.launch

@Composable
fun DrawerScreen(){
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBar(
                onNavigationIconClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            )
        },
        drawerContent = {
            DrawerHeader()
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
    ) {

    }
}

@Composable
@Preview
fun PreviewDrawerScreen(){
    DrawerScreen()
}