package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.example.myapplication.MESSAGE"
const val EXTRA_NUMBER1 = "com.example.myapplication.NUMBER1"
const val EXTRA_NUMBER2 = "com.example.myapplication.NUMBER2"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // onCreate() 初始化Activity基本组件
        setContentView(R.layout.activity_main) // 定义Activity布局，设置指定xml作为内容视图
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName) // 在活动中查找内容id
        /*
    <EditText // <内容>
        android:id="@+id/editTextTextPersonName" // (R.id.内容)
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="16dp"
        android:layout_marginTop="16dp"
        android:ems="10"
        android:hint="@string/edit_message"
        android:inputType="textPersonName"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
         */
        val message = editText.text.toString() // 获取xx的text并且转换为String类型
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            /*
Intent 构造函数会获取两个参数：Context 和 Class。
首先使用 Context 参数，因为 Activity 类是 Context 的子类。
在本例中，系统将 Intent, 传递到的应用组件的 Class 参数是要启动的 activity。
*/
            putExtra(EXTRA_MESSAGE, message) // 方法将 EditText 的值添加到 intent。Intent 能够以称为“extra”的键值对形式携带数据类型。
            // 当前键是一个公共常量 EXTRA_MESSAGE，因为下一个 activity 将使用该键检索文本值。为 intent extra 定义键时，最好使用应用的软件包名称作为前缀。这样可以确保这些键是独一无二的，这在您的应用需要与其他应用进行交互时会很重要。
        }
        startActivity(intent) // 方法将启动一个由 Intent 指定的 DisplayMessageActivity 实例
    }

    fun sendNumber(view: View){
        val fnum=findViewById<EditText>(R.id.fNum )
        val snum=findViewById<EditText>(R.id.sNum)
        val message1=fnum.text
        val message2=snum.text
        Log.d("msg1:", "$message2")
        Log.d("msg2","$message2")
        val intent=Intent(this,PlusNumber::class.java).apply {
            putExtra(EXTRA_NUMBER1,message1)
            putExtra(EXTRA_NUMBER2,message2)
        }
        startActivity(intent)
    }
}