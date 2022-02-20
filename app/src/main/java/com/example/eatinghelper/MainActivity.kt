package com.example.eatinghelper

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eatinghelper.activity.*
import com.example.eatinghelper.entity.Food
import com.example.eatinghelper.service.FoodService
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButton()

    }

    @SuppressLint("ResourceAsColor")
    private fun initButton() {
        val btnToBreakfastMenu = findViewById<TextView>(R.id.button_to_breakfast)
        val btnToOnePersonMenu = findViewById<TextView>(R.id.button_to_one_person_menu)
        val btnToTwoPersonMenu = findViewById<TextView>(R.id.button_to_two_person_menu)
        val btnToFourPersonMenu = findViewById<TextView>(R.id.button_to_four_person_menu)

        btnToBreakfastMenu.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, BreakfastMenuActivity::class.java)
            startActivity(intent)
        }

        btnToOnePersonMenu.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, OnePersonMenuActivity::class.java)
            startActivity(intent)
        }

        btnToTwoPersonMenu.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, TwoPersonMenuActivity::class.java)
            startActivity(intent)
        }

        btnToFourPersonMenu.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, FourPersonMenuActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //    @SuppressLint("WrongConstant", "ShowToast")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_food -> {
                val intent = Intent()
                intent.setClass(this, AddFoodActivity::class.java)
                startActivity(intent)
            }

            R.id.query_foods_menu -> {
                val intent = Intent()
                intent.setClass(this, AllFoodsMenuActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}



