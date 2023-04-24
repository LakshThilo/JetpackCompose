package com.example.jetpackcompose.composables

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.composables.appBar.AppBar
import com.example.jetpackcompose.composables.bottomNavigation.sample1.BottomBar
import com.example.jetpackcompose.composables.bottomNavigation.sample1.BottomBarScreen
import com.example.jetpackcompose.composables.bottomNavigation.sample1.BottomNavGraph
import com.example.jetpackcompose.composables.navigationDrawer.sampleNavDrawer.DrawerBody
import com.example.jetpackcompose.composables.navigationDrawer.sampleNavDrawer.DrawerHeader
import com.example.jetpackcompose.composables.navigationDrawer.sampleNavDrawer.MenuItem
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import kotlinx.coroutines.launch

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val listMenuItems = MenuItem.get()
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
                items = listMenuItems,
                onItemClick = {
                    when(it.id){
                        "settings" -> navController.navigate(BottomBarScreen.Settings.route)
                        "home" -> navController.navigate(BottomBarScreen.Home.route)
                        "profile" -> navController.navigate(BottomBarScreen.Profile.route)
                        "share" -> navController.navigate(BottomBarScreen.Share.route)
                    }
                    println("Click on ${it.title}")
                })
        },
        bottomBar = { BottomBar(navController = navController) }
    ) {
        BottomNavGraph(navHostController = navController)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        MainScreen()
    }
}
