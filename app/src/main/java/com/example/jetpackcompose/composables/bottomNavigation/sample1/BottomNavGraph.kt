package com.example.jetpackcompose.composables.bottomNavigation.sample1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcompose.composables.screens.HomeScreen
import com.example.jetpackcompose.composables.screens.ProfileScreen
import com.example.jetpackcompose.composables.screens.SettingsScreen
import com.example.jetpackcompose.composables.screens.ShareScreen


@Composable
fun BottomNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController ,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }

        composable(route = BottomBarScreen.Share.route) {
            ShareScreen()
        }
    }
}