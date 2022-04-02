package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PlusNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plus_number)
        val mess1:Int=intent.getIntExtra(EXTRA_NUMBER1)
        val mess2:Int=intent.getIntExtra(EXTRA_NUMBER2)
        findViewById<TextView>(R.id.textView2).apply {
            setText(mess1+mess2)
        }
    }
}

private fun Intent.getIntExtra(extraNumber1: Any): Int {
    return extraNumber1 as Int
}

