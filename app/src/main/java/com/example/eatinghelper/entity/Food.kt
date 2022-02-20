package com.example.eatinghelper.entity

import android.content.ContentValues
import android.database.Cursor

class Food(
    var id: Int = 0,
    var name: String,
    var isHot: Boolean,
    var isMeat: Boolean,
    var foodType: String,
    var isSingle: Boolean,
    // 餐别
    var mealType: String
) {
    override fun toString(): String {
        return "Food [name=$name, isHot=$isHot, isMeat=$isMeat, foodType=$foodType, isSingle=$isSingle, mealType=$mealType ]"
    }

    fun toContentValues(): ContentValues {
        return ContentValues().apply {
            put("name", name)
            put("isHot", isHot)
            put("isMeat", isMeat)
            put("foodType", foodType)
            put("isSingle", isSingle)
            put("mealType", mealType)
        }
    }


    companion object {

        const val TABLE_NAME = "FOOD"

        val CREATE_TABLE_STATEMENT = """
            CREATE TABLE IF NOT EXISTS $TABLE_NAME (
                id          INTEGER PRIMARY KEY AUTOINCREMENT,
                name        text,
                isHot       text,
                isMeat      text,
                foodType    text,
                isSingle    text,
                mealType    text
            )
        """.trimIndent()

        val DROP_TABLE_STATEMENT = """
            DROP TABLE IF EXISTS $TABLE_NAME
        """.trimIndent()

        fun fromCursor(cursor: Cursor): Food {
            val id = cursor.getInt(cursor.getColumnIndex("id"))
            val name = cursor.getString(cursor.getColumnIndex("name"))
            val isHot = cursor.getInt(cursor.getColumnIndex("isHot"))
            val isMeat = cursor.getInt(cursor.getColumnIndex("isMeat"))
            val foodType = cursor.getString(cursor.getColumnIndex("foodType"))
            val isSingle = cursor.getInt(cursor.getColumnIndex("isSingle"))
            val mealType = cursor.getString(cursor.getColumnIndex("mealType"))

            return Food(id, name, pasteBoolean(isHot), pasteBoolean(isMeat), foodType, pasteBoolean(isSingle), mealType)
        }

        fun pasteBoolean(int: Int): Boolean {
            return int != 0
        }
    }
}

