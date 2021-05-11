package com.example.eatinghelper

object Cook {

    fun recommendHotAndMeat(): String {
        return "【 热 - 荤菜 】 " + Menu.hotAndMeatList.random().name
    }

    fun recommendHotAndVegetable(): String {
        return "【 热 - 素菜 】 " + Menu.hotAndVegetableList.random().name
    }

    fun recommendColdAndMeat(): String {
        return "【 凉 - 荤菜 】 " + Menu.coldAndMeatList.random().name
    }

    fun recommendColdAndVegetable(): String {
        return "【 凉 - 素菜 】 " + Menu.coldAndVegetableList.random().name
    }

    fun recommendSoup(): String {
        return "【 汤 - 任意 】 " + Menu.coldSoupList.random().name
    }

    fun menuToday(): String {
        return "  ====== 今日份四菜一汤 ======" + "\n\n" +
                recommendHotAndMeat() + "\n\n" +
                recommendHotAndVegetable() + "\n\n" +
                recommendColdAndMeat() + "\n\n" +
                recommendColdAndVegetable() + "\n\n" +
                recommendSoup()
    }
}

