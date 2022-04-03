package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListView : AppCompatActivity() {
    private var strList= arrayOf("aa","bb","cc")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val listView=findViewById<ListView>(R.id.listview1)
        val arraya= ArrayAdapter(this,android.R.layout.simple_list_item_1,strList)
        listView.adapter=arraya
    }
}