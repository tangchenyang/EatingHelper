package com.example.eatinghelper.util

import android.content.Context
import android.widget.ListView
import android.widget.SimpleAdapter
import com.example.eatinghelper.R
import com.example.eatinghelper.entity.Food

object FoodUtil {

    fun fillListViewWithFoods(context: Context, foods: List<Food>, listView: ListView) {
        val arrayList: ArrayList<Map<String, Any>> = ArrayList()

        for (food in foods) {
            val map: MutableMap<String, Any> = mutableMapOf()
            map["foodImage"] = R.drawable.kafei
            map["foodName"] = food.name
            arrayList.add(map)
        }

        val adapter: SimpleAdapter? = SimpleAdapter(
            context,
            arrayList,
            R.layout.single_food,
            arrayOf("foodImage", "foodName"),
            arrayOf(R.id.image_view_for_single_food, R.id.text_view_for_single_food).toIntArray()
        )
        listView.adapter = adapter
    }
}