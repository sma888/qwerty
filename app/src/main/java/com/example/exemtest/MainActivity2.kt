package com.example.exemtest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val firstFragment = UserFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain2, firstFragment)
            commit()
        }
    }
}