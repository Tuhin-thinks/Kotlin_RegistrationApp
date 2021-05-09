package com.example.registrationform

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name  = " "

        name = nameTextBox.text.toString()

        // handle button click
        btnClickHere.setOnClickListener {
            name = nameTextBox.text.toString()
            Toast.makeText (applicationContext, "Welcome to kotlin programming $name!",
                Toast.LENGTH_SHORT).show()

            var intent = Intent(this, SecondActivity::class.java).apply { putExtra("Refername", name) }
            startActivity(intent)
        }
    }
}