package com.example.eatinghelper.service

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import com.example.eatinghelper.Menu
import com.example.eatinghelper.dbhelper.FoodDBHelper
import com.example.eatinghelper.entity.Food
import com.example.eatinghelper.enum.FoodType
import com.example.eatinghelper.enum.MealType

class FoodService(private val dbHelper: FoodDBHelper) {


    constructor(context: Context) : this(FoodDBHelper(context)) {
    }


    fun addFood(food: Food) {
        val db = dbHelper.writableDatabase
        db.insert(Food.TABLE_NAME, null, food.toContentValues())
        db.close()
    }

    fun queryFoods(): List<Food> {
        var database: SQLiteDatabase = dbHelper.writableDatabase

        var foodList: MutableList<Food> = mutableListOf()
        val cursor = database.query(Food.TABLE_NAME, null, null, null, null, null, null)

        if (cursor.moveToFirst()) {
            do {
                val food: Food = Food.fromCursor(cursor)
                Log.d(this.javaClass.name, food.toString())
                foodList.add(food)
            } while (cursor.moveToNext())
        }
        cursor.close()
        database.close()
        return foodList.toList()
    }

    fun initFoods(db: SQLiteDatabase) {
        for (food in Menu.defaultFoodList) {
            db.insert(Food.TABLE_NAME, null, food.toContentValues())
            Log.d(this.javaClass.name, "add food $food")
        }
    }

    fun createFoodTable(db: SQLiteDatabase) {
        db.execSQL(Food.CREATE_TABLE_STATEMENT)
    }

    fun dropFoodTable(db: SQLiteDatabase) {
        db.execSQL(Food.DROP_TABLE_STATEMENT)
    }

    fun generateMenuForBreakfast(): List<Food> {
        val allFoods = queryFoods()
        return allFoods.filter { food -> food.mealType == MealType.BREAKFAST }.shuffled().take(2)
    }

    fun generateMenuForOnePerson(): List<Food> {
        val allFoods = queryFoods()
        return allFoods.filter { food -> food.isSingle }.shuffled().take(1)
    }

    fun generateMenuForTwoPerson(): List<Food> {
        val allFoods = queryFoods()
        val meatDish = allFoods.filter { food -> food.isMeat && food.foodType == FoodType.DISH }.shuffled().take(1)
        val vegetablesDish = allFoods.filter { food -> !food.isMeat && food.foodType == FoodType.DISH }.shuffled().take(1)
        val soup = allFoods.filter { food -> food.foodType == FoodType.SOUP }.shuffled().take(1)
        val fruit =  allFoods.filter { food -> food.mealType == FoodType.OTHER }.shuffled().take(1)
        return meatDish + vegetablesDish + soup + fruit
    }
    fun generateMenuForFourPerson(): List<Food> {
        val allFoods = queryFoods()
        val meatDish = allFoods.filter { food -> food.isMeat && food.foodType == FoodType.DISH }.shuffled().take(2)
        val vegetablesDish = allFoods.filter { food -> !food.isMeat && food.foodType == FoodType.DISH }.shuffled().take(2)
        val soup = allFoods.filter { food -> food.foodType == FoodType.SOUP }.shuffled().take(1)
        val fruit =  allFoods.filter { food -> food.foodType == FoodType.OTHER }.shuffled().take(2)
        return meatDish + vegetablesDish + soup + fruit
    }



}