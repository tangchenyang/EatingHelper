package com.example.eatinghelper

object Menu {

    var defaultFoodList = listOf(
        // 热 素
        Food(name = "西红柿炒鸡蛋", isHot = true, isMeat = false),
        Food(name = "炒土豆丝", isHot = true, isMeat = false),
        Food(name = "手撕包菜", isHot = true, isMeat = false),
        Food(name = "红烧茄子", isHot = true, isMeat = false),


        // 凉 素
        Food(name = "醋溜豆芽", isHot = false, isMeat = false),
        Food(name = "拍黄瓜", isHot = false, isMeat = false),
        Food(name = "糖拌西红柿", isHot = false, isMeat = false),
        Food(name = "糖拌黄瓜", isHot = false, isMeat = false),
        Food(name = "蔬菜蘸酱", isHot = false, isMeat = false),

        // 热 荤
        Food(name = "炒花甲", isHot = true, isMeat = true),
        Food(name = "香辣虾", isHot = true, isMeat = true),
        Food(name = "黄焖鸡", isHot = true, isMeat = true),
        Food(name = "土豆烧排骨", isHot = true, isMeat = true),
        Food(name = "大盘鸡", isHot = true, isMeat = true),
        Food(name = "炒血块", isHot = true, isMeat = true),
        Food(name = "青椒肉丝", isHot = true, isMeat = true),
        Food(name = "黑椒牛柳", isHot = true, isMeat = true),
        Food(name = "孜然炒肉", isHot = true, isMeat = true),

        // 凉 荤
        Food(name = "凉拌牛肉", isHot = false, isMeat = true),
        Food(name = "凉拌猪头肉", isHot = false, isMeat = true),
        Food(name = "红油耳丝", isHot = false, isMeat = true),

        // 汤
        Food(name = "海带豆腐汤", isHot = false, isMeat = true, isSoup = true),
        Food(name = "鸡蛋醪糟", isHot = false, isMeat = true, isSoup = true),
        Food(name = "绿豆南瓜", isHot = false, isMeat = true, isSoup = true),
        Food(name = "虫草参鸡汤", isHot = false, isMeat = true, isSoup = true),
        Food(name = "清炖鲫鱼汤", isHot = false, isMeat = true, isSoup = true),
        Food(name = "冬瓜排骨汤", isHot = false, isMeat = true, isSoup = true),
        Food(name = "虾仁豆腐汤", isHot = false, isMeat = true, isSoup = true),
        Food(name = "西红柿疙瘩汤", isHot = false, isMeat = true, isSoup = true),
        Food(name = "红豆甜疙瘩汤", isHot = false, isMeat = true, isSoup = true)


    )

    var foodList: List<Food> = ArrayList<Food>()

    fun hotAndMeatList() = foodList.filter { food: Food -> !food.isSoup && food.isHot && food.isMeat }

    fun hotAndVegetableList() =
        foodList.filter { food: Food -> !food.isSoup && food.isHot && !food.isMeat }

    fun coldAndMeatList() =
        foodList.filter { food: Food -> !food.isSoup && !food.isHot && food.isMeat }

    fun coldAndVegetableList() =
        foodList.filter { food: Food -> !food.isSoup && !food.isHot && !food.isMeat }

    fun coldSoupList() = foodList.filter { food: Food -> food.isSoup }

}

class Food(
    var name: String = "unknown",
    var isHot: Boolean = false,
    var isMeat: Boolean = false,
    var isSoup: Boolean = false
) {
    override fun toString(): String {
        return this.name + "," +
                this.isHot + "," +
                this.isMeat + "," +
                this.isSoup
    }
}