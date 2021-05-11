package com.example.eatinghelper

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
        initButton()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun initButton() {
        val txt = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        button.background.alpha = 100
        button.setBackgroundColor(Color.GRAY)
        button.setOnClickListener {
            txt.text = Cook.menuToday()
        }
    }

    @SuppressLint("WrongConstant", "ShowToast")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_food -> Toast.makeText(this, "点击了第一个菜单", 0).show()
        }
        return super.onOptionsItemSelected(item)
    }
}



