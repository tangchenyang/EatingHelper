package com.example.eatinghelper.util

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.widget.ListView
import android.widget.SimpleAdapter
import com.example.eatinghelper.R
import com.example.eatinghelper.entity.Food
import kotlin.random.Random

object FoodUtil {

    private val typeColors = mapOf(
        "soup" to "#2196F3",        // 汤类 - 蓝色
        "staple_food" to "#FF9800", // 主食 - 橙色
        "dish" to "#4CAF50",        // 菜品 - 绿色
        "other" to "#9C27B0"        // 其他 - 紫色
    )

    fun fillListViewWithFoods(context: Context, foods: List<Food>, listView: ListView) {
        val arrayList: ArrayList<Map<String, Any>> = ArrayList()

        for ((index, food) in foods.withIndex()) {
            val map: MutableMap<String, Any> = mutableMapOf()
            // 根据食物类型设置颜色
            val color = typeColors[food.foodType] ?: "#607D8B" // 默认灰色
            val squareBackground = GradientDrawable().apply {
                shape = GradientDrawable.RECTANGLE
                cornerRadius = context.resources.displayMetrics.density * 8 // 8dp的圆角
                setColor(android.graphics.Color.parseColor(color))
            }
            map["foodImage"] = squareBackground
            map["foodName"] = food.name
            arrayList.add(map)
        }

        val adapter: SimpleAdapter? = SimpleAdapter(
            context,
            arrayList,
            R.layout.single_food,
            arrayOf("foodImage", "foodName"),
            arrayOf(R.id.image_view_for_single_food, R.id.text_view_for_single_food).toIntArray()
        ).apply {
            setViewBinder { view, data, _ ->
                if (view.id == R.id.image_view_for_single_food && data is GradientDrawable) {
                    view.background = data
                    return@setViewBinder true
                }
                false
            }
        }
        listView.adapter = adapter
    }
}