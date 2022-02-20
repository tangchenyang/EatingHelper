package com.example.eatinghelper.activity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.eatinghelper.R

class AddFoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_food)
        initButton()

    }

    private fun initButton() {
        val foodNameTextView = findViewById<TextView>(R.id.text_view_add_food_name)
        val isHotButton = findViewById<Button>(R.id.button_add_food_is_hot)
        val isMeatButton = findViewById<Button>(R.id.button_add_food_is_meat)
        val foodTypeButton = findViewById<Button>(R.id.button_add_food_is_soup)

        isHotButton.setOnClickListener {
            Toast.makeText(this, "isHotButton", Toast.LENGTH_LONG).show()
        }

        isMeatButton.setOnClickListener {
            Toast.makeText(this, "isMeatButton", Toast.LENGTH_LONG).show()
        }

        foodTypeButton.setOnClickListener {
            Toast.makeText(this, "foodTypeButton", Toast.LENGTH_LONG).show()
        }

    }


}