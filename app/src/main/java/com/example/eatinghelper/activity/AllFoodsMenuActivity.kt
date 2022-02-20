package com.example.eatinghelper.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.eatinghelper.R
import com.example.eatinghelper.service.FoodService
import com.example.eatinghelper.util.FoodUtil

class AllFoodsMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_foods)
        initButton()

    }

    private fun initButton() {
        val twoPersonMenuListView = findViewById<ListView>(R.id.list_view_all_food_menu)

        val foods = FoodService(this).queryFoods()
        FoodUtil.fillListViewWithFoods(this, foods, twoPersonMenuListView)
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