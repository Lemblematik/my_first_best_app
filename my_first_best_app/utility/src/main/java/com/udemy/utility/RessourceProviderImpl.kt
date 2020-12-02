package com.udemy.utility

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.udemy.core.IRessourceProvider

class RessourceProviderImpl(private val context : Context) : IRessourceProvider {

    override fun getString(resourceId: Int): String {
        return context.getString(resourceId)
    }

    override fun getDrawable(drawableRes: Int): Drawable {
        return requireNotNull(ContextCompat.getDrawable(context,drawableRes))
    }
}