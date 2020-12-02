package com.udemy.login

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.udemy.core.IRessourceProvider
import com.udemy.core.IntentProvider
import dagger.android.AndroidInjection
import javax.inject.Inject


class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var ressourceProvider : IRessourceProvider

    @Inject
    lateinit var intentProvider : IntentProvider


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initialiseViews()
    }

    private fun initialiseViews() {
        //Text
        findViewById<TextView>(R.id.text_start).text =
            ressourceProvider.getString(R.string.textStart)

        //button
        findViewById<Button>(R.id.btn_go_to_main).text =
            ressourceProvider.getString(R.string.go_to_home)
        findViewById<Button>(R.id.btn_go_to_main).setOnClickListener{
            startActivity(intentProvider.goToMainActivity())
        }
    }

}