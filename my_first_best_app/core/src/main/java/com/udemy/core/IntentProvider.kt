package com.udemy.core

import android.content.Intent
import javax.inject.Inject

const val INITIAL_ROUTE = "com.udemy.my_first_app";
const val LOGIN  = "login";
const val MAIN = "main";


class IntentProvider @Inject constructor(){

    fun gotoLoginActivity() : Intent{
        return getIntent(LOGIN)
    }

    fun goToMainActivity() : Intent {
        return getIntent(MAIN)
    }

    private fun getIntent(filter: String) : Intent {
        return Intent().apply { action = "${INITIAL_ROUTE}.$filter"}
    }

}