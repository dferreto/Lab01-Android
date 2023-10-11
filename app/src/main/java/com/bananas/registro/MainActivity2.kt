package com.bananas.registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        parent.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)


            startActivity(intent)
        }
    }
}
