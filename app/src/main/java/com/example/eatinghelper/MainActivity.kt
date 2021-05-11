package com.example.eatinghelper

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButton()
        initFood()

    }

    private fun initFood() {
        val out = openFileOutput("data", Context.MODE_PRIVATE)
        val writer = BufferedWriter(OutputStreamWriter(out))
         com.example.eatinghelper.Menu.defaultFoodList.forEach { food ->
            writer.write(food.toString() + "\n")
        }
        writer.close()

        com.example.eatinghelper.Menu.foodList = loadFoods()
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    @SuppressLint("WrongConstant", "ShowToast")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_food -> {
                Toast.makeText(this, "点击了第一个菜单", 0).show()
                com.example.eatinghelper.Menu.foodList = loadFoods()
            }
        }

        return super.onOptionsItemSelected(item)

    }

    fun loadFoods(): List<Food> {
        val input = openFileInput("data")
        val reader = BufferedReader(InputStreamReader(input))
        var line = reader.readLine()
        var foodList = ArrayList<Food>()
        while (line != null) {
            val lineAry = line.split(",")
            val food = Food(lineAry[0], lineAry[1] == "true", lineAry[2] == "true", lineAry[3] == "true")
            foodList.add(food)
            line = reader.readLine()
        }
        input.close()
        return foodList
    }
}



