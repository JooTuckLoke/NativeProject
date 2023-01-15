package com.example.nativeproject.navigation

import androidx.annotation.StringRes
import com.example.nativeproject.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Home : Screen("home", R.string.text_home)
    object Details : Screen("details", R.string.text_details)
}