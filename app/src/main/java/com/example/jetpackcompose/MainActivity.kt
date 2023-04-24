package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.composables.MainScreen
import com.example.jetpackcompose.composables.bottomNavigation.sample2.ContentView
import com.example.jetpackcompose.composables.navigationDrawer.sampleNavDrawer.DrawerScreen
import com.example.jetpackcompose.composables.onBoadingPage.OnBoardingScreen
import com.example.jetpackcompose.composables.tabLayout.CustomTabLayout
import com.example.jetpackcompose.demo.composabale.ItemHomeScreen
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                window.statusBarColor = MaterialTheme.colors.background.toArgb()
                window.navigationBarColor = MaterialTheme.colors.background.toArgb()
                Surface(color = MaterialTheme.colors.background,modifier = Modifier.fillMaxSize()) {
                    // ItemHomeScreen()
                    // OnBoardingScreen()
                    // DrawerScreen()

                    MainScreen()
                }
            }
        }
    }
}


@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxSize()
        ) {
            // ItemHomeScreen()
            // OnBoardingScreen()
            // DrawerScreen()
            MainScreen()

        }
    }
}



// custom TabLayout
// CustomTabLayout()

// custom bottom navigation
/* var selectedItem by remember { mutableStateOf(0) }
 ContentView(
     selectedItem = selectedItem,
     onSelectedItem = { selectedItem = it }
 )*/