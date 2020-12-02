package com.udemy.utility.di

import android.app.Application
import android.content.Context
import com.udemy.core.IRessourceProvider
import com.udemy.utility.RessourceProviderImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UtilsModule {

    @Binds
    abstract fun bindContext (application: Application): Context

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun bindRessourceProvider(context : Context) : IRessourceProvider {
            return RessourceProviderImpl(context)
        }
    }



}