package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        // Get the Intent that started this activity and extract the string
        // 获得Intene的参数
        val message = intent.getStringExtra(EXTRA_MESSAGE) // 从intent中获取由Extra传递过来的数据(EXTRA_MESSAGE

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}