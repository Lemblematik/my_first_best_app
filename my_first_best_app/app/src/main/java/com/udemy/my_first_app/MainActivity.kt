package com.udemy.my_first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.udemy.core.IRessourceProvider
import com.udemy.core.IntentProvider
import com.udemy.core.UserController
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var ressourceProvider : IRessourceProvider

    @Inject
    lateinit var userController: UserController

    @Inject
    lateinit var intentProvider: IntentProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialiseView()
    }

    private fun initialiseView() {
        //text : bienvenue + mon nom

        findViewById<TextView>(R.id.welcome_text).text = ressourceProvider.getString(R.string.textStart)
        findViewById<TextView>(R.id.welcome_text).append(" " + userController.getName())
        //set foto :
       findViewById<ImageView>(R.id.my_image).setImageDrawable(ressourceProvider.getDrawable(R.drawable.ic_launcher_background))
        //set button logout
        findViewById<Button>(R.id.btn_logout).text = ressourceProvider.getString(R.string.logout)
        findViewById<Button>(R.id.btn_logout).setOnClickListener{
            startActivity(intentProvider.gotoLoginActivity())
        }
    }
}