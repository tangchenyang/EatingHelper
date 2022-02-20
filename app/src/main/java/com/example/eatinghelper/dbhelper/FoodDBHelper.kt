package com.example.eatinghelper.dbhelper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import com.example.eatinghelper.entity.Food
import com.example.eatinghelper.service.FoodService

class FoodDBHelper(var context: Context) :
    SQLiteOpenHelper(context, "eating_helper_food.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) {
            val foodService = FoodService(this)
            foodService.createFoodTable(db)
            FoodService(this).initFoods(db)
        }

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (db != null) {
            val foodService = FoodService(this)
            foodService.dropFoodTable(db)
        }
    }
}