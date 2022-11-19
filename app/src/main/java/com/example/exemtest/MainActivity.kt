package com.example.exemtest

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.LaucnhThem)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun soslan(view: View) {

        val name:EditText = findViewById(R.id.editTextTextPersonName)
        val nameString = name.toString()

        val password:EditText = findViewById(R.id.editTextTextPersonName2)
        val passwordString = password.toString()

        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
    }
}