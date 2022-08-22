package com.yaoge.pattern.factory.abstractfac;

import com.yaoge.pattern.factory.factorymethod.BeijingFactory;
import com.yaoge.pattern.factory.factorymethod.MethodFactory;
import com.yaoge.pattern.factory.factorymethod.Pizza;
import com.yaoge.pattern.factory.factorymethod.ShandongFactory;

import java.util.Scanner;

/**
 * create by yaoge
 * 2022/8/19 8:50
 * 抽象工厂模式
 */
public class OrderPizza4 {
    public static void main(String[] args) {
        System.out.println("请输入城市");
        Scanner scanner = new Scanner(System.in);
        String location = scanner.nextLine();
        System.out.println("请输入口味");
        String type = scanner.nextLine();
        AbsFactory factory=null;
        if ("beijing".equals(location)){
            factory=new BJFactory();
        }else if ("shandong".equals(location)){
            factory=new SDFactory();
        }
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza);
    }
}
