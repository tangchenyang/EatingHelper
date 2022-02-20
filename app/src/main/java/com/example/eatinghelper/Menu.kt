package com.example.eatinghelper

import com.example.eatinghelper.entity.Food

object Menu {

    var defaultFoodList = listOf(
        // 热 素
        Food(0, "豆浆", true, false, "soup", true, "breakfast"),
        Food(0, "牛奶", true, false, "soup", true, "breakfast"),
        Food(0, "胡辣汤", true, false, "soup", true, "breakfast"),
        Food(0, "面包", true, false, "staple_food", true, "breakfast"),
        Food(0, "油条", true, false, "staple_food", true, "breakfast"),
        Food(0, "包子", true, false, "staple_food", true, "breakfast"),
        Food(0, "馒头", true, false, "staple_food", true, "breakfast"),
        Food(0, "疙瘩汤", true, false, "soup", true, "breakfast"),
        Food(0, "花卷", true, false, "staple_food", true, "breakfast"),
        Food(0, "葱花饼", true, false, "staple_food", true, "breakfast"),
        Food(0, "手抓饼", true, false, "staple_food", true, "breakfast"),
        Food(0, "小米南瓜粥", true, false, "soup", true, "breakfast"),
        Food(0, "红豆粥", true, false, "soup", true, "breakfast"),
        Food(0, "雪梨银耳粥", true, false, "soup", true, "breakfast"),
        Food(0, "绿豆小米粥", true, false, "soup", true, "breakfast"),
        Food(0, "皮蛋瘦肉粥", true, false, "soup", true, "breakfast"),
        Food(0, "玉米糁", true, false, "soup", true, "breakfast"),
        Food(0, "咸菜", true, false, "staple_food", true, "breakfast"),
        Food(0, "煎蛋", true, true, "dish", true, "breakfast"),
        Food(0, "水煮荷包蛋", true, true, "dish", true, "breakfast"),
        Food(0, "牛奶燕麦粥", true, false, "soup", true, "breakfast"),
        Food(0, "酸奶", false, false, "other", true, "other"),
        Food(0, "米饭", true, false, "staple_food", false, "lunch"),
        Food(0, "耳光炒饭", true, false, "staple_food", true, "lunch"),
        Food(0, "小锅米线", true, false, "staple_food", true, "lunch"),
        Food(0, "酸汤肥牛面", true, false, "staple_food", true, "lunch"),
        Food(0, "番茄鸡蛋面", true, false, "staple_food", true, "lunch"),
        Food(0, "炸酱面", true, false, "staple_food", true, "lunch"),
        Food(0, "炒馍花", true, false, "staple_food", true, "lunch"),
        Food(0, "凉拌西红柿", true, false, "dish", false, "lunch"),
        Food(0, "凉拌黄瓜", true, false, "dish", false, "lunch"),
        Food(0, "凉拌洋葱木耳", true, false, "dish", false, "lunch"),
        Food(0, "油泼胡萝卜丝", true, false, "dish", false, "lunch"),
        Food(0, "素拼", true, false, "dish", false, "lunch"),
        Food(0, "凉拌豆角", true, false, "dish", false, "lunch"),
        Food(0, "麻婆豆腐", true, false, "dish", false, "lunch"),
        Food(0, "炝炒菠菜", true, false, "dish", false, "lunch"),
        Food(0, "炝炒包菜", true, false, "dish", false, "lunch"),
        Food(0, "西红柿炒鸡蛋", true, false, "dish", false, "lunch"),
        Food(0, "炝炒莲菜", true, false, "dish", false, "lunch"),
        Food(0, "炝炒油麦菜", true, false, "dish", false, "lunch"),
        Food(0, "酸辣白菜", true, false, "dish", false, "lunch"),
        Food(0, "炒花菜", true, false, "dish", false, "lunch"),
        Food(0, "香菇油菜", true, false, "dish", false, "lunch"),
        Food(0, "蚝油生菜", true, false, "dish", false, "lunch"),
        Food(0, "清炒南瓜", true, false, "dish", false, "lunch"),
        Food(0, "蒜蓉粉丝娃娃菜", true, false, "dish", false, "lunch"),
        Food(0, "红烧茄子", true, false, "dish", false, "lunch"),
        Food(0, "炒杏鲍菇", true, false, "dish", false, "lunch"),
        Food(0, "炒蘑菇", true, false, "dish", false, "lunch"),
        Food(0, "醋溜土豆丝", true, false, "dish", false, "lunch"),
        Food(0, "泡椒土豆丝", true, false, "dish", false, "lunch"),
        Food(0, "青椒土豆丝", true, false, "dish", false, "lunch"),
        Food(0, "炒西葫芦", true, false, "dish", false, "lunch"),
        Food(0, "木耳炒青笋", true, false, "dish", false, "lunch"),
        Food(0, "凉拌耳丝", false, true, "dish", false, "lunch"),
        Food(0, "凉拌牛肉", false, true, "dish", false, "lunch"),
        Food(0, "凉拌皮蛋", false, true, "dish", false, "lunch"),
        Food(0, "凉拌肘子", false, true, "dish", false, "lunch"),
        Food(0, "手撕鸡", false, true, "dish", false, "lunch"),
        Food(0, "凉拌猪头肉", false, true, "dish", false, "lunch"),
        Food(0, "白灼虾", true, true, "dish", false, "lunch"),
        Food(0, "油焖大虾", true, true, "dish", false, "lunch"),
        Food(0, "孜然辣椒炒肉", true, true, "dish", false, "lunch"),
        Food(0, "辣椒炒火腿肠", true, true, "dish", false, "lunch"),
        Food(0, "麻辣花甲", true, true, "dish", false, "lunch"),
        Food(0, "蒜蓉花甲", true, true, "dish", false, "lunch"),
        Food(0, "麻辣小龙虾", true, true, "dish", false, "lunch"),
        Food(0, "蒜蓉小龙虾", true, true, "dish", false, "lunch"),
        Food(0, "黑椒牛柳", true, true, "dish", false, "lunch"),
        Food(0, "黑椒猪柳", true, true, "dish", false, "lunch"),
        Food(0, "干煸牛肉", true, true, "dish", false, "lunch"),
        Food(0, "芹菜炒肉", true, true, "dish", false, "lunch"),
        Food(0, "蘑菇炒肉", true, true, "dish", false, "lunch"),
        Food(0, "土豆咖喱鸡", true, true, "dish", false, "lunch"),
        Food(0, "黄焖鸡", true, true, "dish", false, "lunch"),
        Food(0, "大盘鸡", true, true, "dish", true, "lunch"),
        Food(0, "土豆烧排骨", true, true, "dish", true, "lunch"),
        Food(0, "黄焖排骨", true, true, "dish", true, "lunch"),
        Food(0, "红烧排骨", true, true, "dish", true, "lunch"),
        Food(0, "上汤娃娃菜汤", true, true, "soup", true, "lunch"),
        Food(0, "虾仁豆腐海带汤", true, true, "soup", true, "lunch"),
        Food(0, "紫菜蛋花汤", true, true, "soup", true, "lunch"),
        Food(0, "鸡蛋醪糟汤", true, true, "soup", true, "lunch"),
        Food(0, "牛奶鸡蛋醪糟", true, true, "soup", true, "lunch"),
        Food(0, "海带汤", true, true, "soup", true, "lunch"),
        Food(0, "鱼汤", true, true, "soup", true, "lunch"),
        Food(0, "玉米排骨汤", true, true, "soup", true, "lunch"),
        Food(0, "青菜豆腐汤", true, false, "soup", true, "lunch"),
        Food(0, "苹果", false, false, "other", true, "other"),
        Food(0, "梨", true, false, "other", true, "lunch"),
        Food(0, "草莓", true, false, "other", true, "lunch"),
        Food(0, "香蕉", true, false, "other", true, "lunch"),
        Food(0, "橙子", true, false, "other", true, "lunch"),
        Food(0, "西瓜", true, false, "other", true, "lunch"),
        Food(0, "葡萄", true, false, "other", true, "lunch"),
        Food(0, "火龙果", true, false, "other", true, "lunch"),
        Food(0, "桃", true, false, "other", true, "lunch")
    )

    var foodList: List<Food> = ArrayList<Food>()

    fun hotAndMeatList() =
        foodList.filter { food: Food -> food.foodType != "soup" && food.isHot && food.isMeat }

    fun hotAndVegetableList() =
        foodList.filter { food: Food -> food.foodType != "soup" && food.isHot && !food.isMeat }

    fun coldAndMeatList() =
        foodList.filter { food: Food -> food.foodType != "soup" && !food.isHot && food.isMeat }

    fun coldAndVegetableList() =
        foodList.filter { food: Food -> food.foodType != "soup" && !food.isHot && !food.isMeat }

    fun coldSoupList() = foodList.filter { food: Food -> food.foodType == "soup" }

}

