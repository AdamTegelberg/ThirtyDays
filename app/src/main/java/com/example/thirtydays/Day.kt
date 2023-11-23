package com.example.thirtydays

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    @DrawableRes val image: Int,
    @StringRes val task: Int,
    @StringRes val title: Int,
    @StringRes val description: Int
)
