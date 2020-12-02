package com.udemy.my_first_app.di

import com.udemy.core.di.ActivityScope
import com.udemy.login.LoginActivity
import com.udemy.login.di.LoginModule
import com.udemy.my_first_app.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    @ActivityScope
    abstract fun mainActivity() : MainActivity

    @ContributesAndroidInjector(modules = [LoginModule::class])
    @ActivityScope
    abstract fun loginActivity() : LoginActivity
}