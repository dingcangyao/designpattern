package com.yaoge.pattern.factory.factorymethod;

import java.io.InputStream;
import java.util.Scanner;

/**
 * create by yaoge
 * 2022/8/19 8:50
 *
 *   工厂方法模式
 *   新的需求
 *   ： 客户在点披萨的时候，可以点不同口味的披萨，比如 北京的奶酪 pizza、北京的胡椒 pizza 或
 *      者是伦敦的奶酪 pizza、伦敦的胡椒 pizza
 *
 *   思路1：可以接着使用简单工厂模式，但是这样对应的工厂类会过多，不方便维护
 *
 *   工厂方法模式是对简单工厂模式的进一步的抽象，如果你想要创建的产品有进一步的分类
 *   那么只使用简单工厂模式，会导致简单工厂类变多，而这些简单工厂类由于生产的大产品都是一样的，所以大部分操作也都是一样的
 *   所以可以对简单工厂方法进行抽象，把相同的步骤抽离出来。不同的做成抽象方法，由子类实现
 *
 */
public class OrderPizza3 {
    public static void main(String[] args) {
        System.out.println("请输入城市");
        Scanner scanner = new Scanner(System.in);
        String location = scanner.nextLine();
        System.out.println("请输入口味");
        String type = scanner.nextLine();
        MethodFactory factory=null;
        if ("beijing".equals(location)){
            factory=new BeijingFactory();
        }else if ("shandong".equals(location)){
            factory=new ShandongFactory();
        }
        Pizza pizza = factory.cretePizza(type);
        System.out.println(pizza);
    }
}
