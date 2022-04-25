package com.example.android.myapplication.Activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.android.myapplication.MainActivity
import com.example.android.myapplication.R
import com.example.android.myapplication.model.Constent

class SplashActivity : AppCompatActivity() {

    lateinit var  sharedPreferences: SharedPreferences
    lateinit var userEmail :String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val tvmsg = findViewById<TextView>(R.id.tvMsg)
        tvmsg.text = ("Swati").toString()

        sharedPreferences = this.getSharedPreferences(Constent.sharedPrefName, Context.MODE_PRIVATE)
        userEmail = sharedPreferences.getString("UserMail","").toString()
//        val intent = Intent(this, LogInActivity::class.java)
//        startActivity(intent)




        if(userEmail != ""){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }else{
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)

        }
    }
}