package com.udemy.core.di

import com.udemy.core.UserController
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [CoreModule::class]
)
@Singleton
interface CoreComponent {
    fun getUserInfos() : UserController
}