package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toLogInIntent = Intent(this@MainActivity, LogInActivity::class.java)
        val toActivity2Intent = Intent(this@MainActivity, Activity2::class.java)
        val toActivity3Intent = Intent(this@MainActivity, Activity3::class.java)
        val toActivity4Intent = Intent(this@MainActivity, Activity4::class.java)

        toActivity1Button.setOnClickListener { startActivity(toLogInIntent) }
        toActivity2Button.setOnClickListener { startActivity(toActivity2Intent) }
        toActivity3Button.setOnClickListener { startActivity(toActivity3Intent) }
        toActivity4Button.setOnClickListener { startActivity(toActivity4Intent) }
    }
}