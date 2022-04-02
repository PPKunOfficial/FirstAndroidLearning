package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class PlusNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plus_number)
        val msg1=intent.getStringExtra(EXTRA_NUMBER1)
        val msg2=intent.getStringExtra(EXTRA_NUMBER2)

        findViewById<TextView>(R.id.textView2).apply {
            Log.d("msg1:", "Value:$msg1")
            val vadd=msg1!!.toInt().plus(msg2!!.toInt())
            text=vadd.toString()

        }
    }
}

