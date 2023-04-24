package com.example.jetpackcompose.composables.navigationDrawer.modalDrawer

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.jetpackcompose.R

sealed class MenuAction(@StringRes val label: Int, @DrawableRes val icon: Int) {
    object Share: MenuAction(R.string.share, R.drawable.ic_share)
    object Notification: MenuAction(R.string.notification, R.drawable.ic_notifications)
}
