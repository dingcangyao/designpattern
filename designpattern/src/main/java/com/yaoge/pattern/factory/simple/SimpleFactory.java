package com.yaoge.pattern.factory.simple;

import com.yaoge.pattern.factory.chuantong.CheesePizza;
import com.yaoge.pattern.factory.chuantong.ChinaPizza;
import com.yaoge.pattern.factory.chuantong.GreekPizza;
import com.yaoge.pattern.factory.chuantong.Pizza;

/**
 * create by yaoge
 * 2022/8/18 18:22
 * 简单工厂类
 * 也就是说，使用者和被使用者之间 隔了一个工厂
 * 使用者把创建交给工厂就行了
 *
 * 可以使用对象工厂（就是需要创建对象）
 * 也可以使用静态工厂模式，不需要创建对象
 */
public class SimpleFactory {

    public Pizza cretePizza(String orderType){
        Pizza pizza=null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊披萨");
        }else if ("cheese".equals(orderType)){
            pizza=new CheesePizza();
            pizza.setName("芝士披萨");
        }else if ("china".equals(orderType)){
            pizza=new ChinaPizza();
            pizza.setName("中国披萨");
        }
        return pizza;
    }
    public static Pizza cretePizza2(String orderType){
        Pizza pizza=null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊披萨");
        }else if ("cheese".equals(orderType)){
            pizza=new CheesePizza();
            pizza.setName("芝士披萨");
        }else if ("china".equals(orderType)){
            pizza=new ChinaPizza();
            pizza.setName("中国披萨");
        }
        return pizza;
    }
}
