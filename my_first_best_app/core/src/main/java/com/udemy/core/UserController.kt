package com.udemy.core

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserController @Inject constructor(){

    fun getName() : String {
        return "Paoolooo"
    }

}