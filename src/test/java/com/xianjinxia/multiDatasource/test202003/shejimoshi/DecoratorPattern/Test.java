package com.xianjinxia.multiDatasource.test202003.shejimoshi.DecoratorPattern;

public class Test {

    public static void main(String[] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());
    }
}
