package com.example.eatinghelper.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.eatinghelper.Menu.defaultFoodList
import com.example.eatinghelper.R
import com.example.eatinghelper.entity.Food
import com.example.eatinghelper.service.FoodService
import com.example.eatinghelper.util.FoodUtil

class FourPersonMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.four_person_menu)
        initButton()

    }

    private fun initButton() {
        val fourPersonMenuListView = findViewById<ListView>(R.id.list_view_four_person_menu)
        FoodUtil.fillListViewWithFoods(this,  FoodService(this).generateMenuForFourPerson(), fourPersonMenuListView)

        val fourPersonMenuRandomButton = findViewById<Button>(R.id.button_random_four_person_menu)

        fourPersonMenuRandomButton.setOnClickListener {
            FoodUtil.fillListViewWithFoods(this,  FoodService(this).generateMenuForFourPerson(), fourPersonMenuListView)
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
