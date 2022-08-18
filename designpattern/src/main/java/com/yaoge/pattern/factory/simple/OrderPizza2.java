package com.yaoge.pattern.factory.simple;

import com.yaoge.pattern.factory.chuantong.Pizza;

/**
 * create by yaoge
 * 2022/8/18 18:53
 * 用来进行pizza 点餐
 * 如果说增加了一种品类
 * order的这一端几乎没有任何代码的改变，改变的饿代码几种在SimpleFacotory
 */
public class OrderPizza2 {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
//        Pizza pizza = simpleFactory.cretePizza("greek");
        Pizza pizza = SimpleFactory.cretePizza2("china");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
