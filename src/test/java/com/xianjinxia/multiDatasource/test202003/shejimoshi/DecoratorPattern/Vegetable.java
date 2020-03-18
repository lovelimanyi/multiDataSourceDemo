package com.xianjinxia.multiDatasource.test202003.shejimoshi.DecoratorPattern;

public class Vegetable extends Food {

    private Food basic_food;

    public Vegetable(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make() + "+蔬菜";
    }
}
