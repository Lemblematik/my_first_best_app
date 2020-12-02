package com.udemy.utility.di

import android.app.Application
import com.udemy.core.IRessourceProvider
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UtilsModule::class])
interface UtilsComponent {

    fun getRessourceProvider (): IRessourceProvider

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): UtilsComponent.Builder

        fun build(): UtilsComponent
    }
}