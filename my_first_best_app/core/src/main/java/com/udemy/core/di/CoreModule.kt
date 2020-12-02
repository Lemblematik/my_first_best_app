package com.udemy.core.di

import com.udemy.core.IntentProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {

    @Provides
    @Singleton
    fun provideIntentProvider() : IntentProvider {
        return IntentProvider();
    }
}