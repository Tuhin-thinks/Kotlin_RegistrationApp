package com.example.registrationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var obtainedName = " "
        obtainedName = intent.getStringExtra("Refername").toString()
        "Welcome $obtainedName".also { welcomeTextView.text = it }
    }
}