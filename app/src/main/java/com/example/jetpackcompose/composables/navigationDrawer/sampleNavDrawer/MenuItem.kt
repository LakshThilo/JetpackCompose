package com.example.jetpackcompose.composables.navigationDrawer.sampleNavDrawer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val id: String,
    val title: String,
    val contentDesc: String,
    val icon: ImageVector
) {
    companion object {

        fun get(): List<MenuItem> {
            return listOf(
                MenuItem(
                    id = "home",
                    title = "Home",
                    contentDesc = "Go to home screen",
                    icon = Icons.Default.Home
                ),
                MenuItem(
                    id = "profile",
                    title = "Profile",
                    contentDesc = "Go to profile screen",
                    icon = Icons.Default.Person
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
            )
        }
    }
}
