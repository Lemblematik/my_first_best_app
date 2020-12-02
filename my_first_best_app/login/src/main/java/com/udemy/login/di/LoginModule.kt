package com.udemy.login.di

import com.udemy.login.Foo
import com.udemy.login.LoginActivity
import dagger.Module
import dagger.Provides

@Module
class LoginModule {
    @Provides
    fun provideFoo() = Foo()
}