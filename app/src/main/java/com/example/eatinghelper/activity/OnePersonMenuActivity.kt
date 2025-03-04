package com.example.eatinghelper.activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eatinghelper.Cook
import com.example.eatinghelper.Menu.defaultFoodList
import com.example.eatinghelper.R
import com.example.eatinghelper.service.FoodService
import com.example.eatinghelper.util.FoodUtil
import android.widget.ArrayAdapter

class OnePersonMenuActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.one_person_menu)
        initButton()

    }

    private fun initButton() {
        val onePersonMenuListView = findViewById<ListView>(R.id.list_view_one_person_menu)
        FoodUtil.fillListViewWithFoods(this, FoodService(this).generateMenuForOnePerson(), onePersonMenuListView)

        val onePersonMenuRandomButton = findViewById<Button>(R.id.button_random_one_person_menu)

        onePersonMenuRandomButton.setOnClickListener {
            FoodUtil.fillListViewWithFoods(this, FoodService(this).generateMenuForOnePerson(), onePersonMenuListView)

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
        }
        return super.onOptionsItemSelected(item)
    }

}