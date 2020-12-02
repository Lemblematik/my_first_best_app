package com.udemy.core

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

interface IRessourceProvider {

    fun getString(@StringRes resourceId : Int) : String

    fun getDrawable(@DrawableRes drawableRes: Int): Drawable

}