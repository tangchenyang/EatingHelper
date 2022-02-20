package com.example.eatinghelper.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.eatinghelper.Menu.defaultFoodList
import com.example.eatinghelper.R
import com.example.eatinghelper.service.FoodService
import com.example.eatinghelper.util.FoodUtil

class TwoPersonMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.two_person_menu)
        initButton()

    }

    private fun initButton() {
        val twoPersonMenuListView = findViewById<ListView>(R.id.list_view_two_person_menu)
        FoodUtil.fillListViewWithFoods(this,  FoodService(this).generateMenuForTwoPerson(), twoPersonMenuListView)

        val twoPersonMenuRandomButton = findViewById<Button>(R.id.button_random_two_person_menu)

        twoPersonMenuRandomButton.setOnClickListener {
            FoodUtil.fillListViewWithFoods(this,  FoodService(this).generateMenuForTwoPerson(), twoPersonMenuListView)
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