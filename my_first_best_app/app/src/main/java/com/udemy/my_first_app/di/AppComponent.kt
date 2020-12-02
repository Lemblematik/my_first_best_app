package com.udemy.my_first_app.di

import android.app.Application
import com.udemy.core.di.CoreComponent
import com.udemy.my_first_app.MainApplication
import com.udemy.utility.di.UtilsComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityBindingModule::class
    ],
    dependencies = [CoreComponent::class, UtilsComponent::class]
)
@AppScope
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application) : AppComponent.Builder

        fun coreComponent(coreComponent: CoreComponent) : AppComponent.Builder

        fun utilsComponent (utilsComponent: UtilsComponent) : AppComponent.Builder

        fun build() : AppComponent
    }
}