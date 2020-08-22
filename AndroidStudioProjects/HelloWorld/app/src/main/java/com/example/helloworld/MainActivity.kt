package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val btn2_intent_click = View.OnClickListener {
        // 取得word1的值
        var value = word1.text.toString()
        // 創建intent 並且指定跳轉頁面
        var intent_value = Intent(this,MainActivity2::class.java)
        // intent 夾帶單筆資料 "key" 是指定的index 用來認data
        intent_value.putExtra("key",value)
        // 啟動intent
        startActivity(intent_value)
    }

    private val change = View.OnClickListener {
        word1.setText("change again")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 觸發buttom事件 1 -> 直接進行修改
        //btn1.setOnClickListener {
            //word1.setText("change!")
        //}
        // 觸發buttom事件 2 -> 呼叫函數觸發
        btn1.setOnClickListener(change)
        btn2.setOnClickListener(btn2_intent_click)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
}


