package com.yaoge.pattern.factory.abstractfac;

import com.yaoge.pattern.factory.factorymethod.BeijingCheesePizza;
import com.yaoge.pattern.factory.factorymethod.BeijingPepperPizza;
import com.yaoge.pattern.factory.factorymethod.Pizza;

/**
 * create by yaoge
 * 2022/8/22 9:04
 * 这是工厂子类
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~ 使用的是抽象工厂模式~");

        Pizza pizza=null;
        if (orderType.equals("chesse")){
            pizza=new BeijingCheesePizza();

        }else if (orderType.equals("pepper")){
            pizza= new BeijingPepperPizza();
        }
        return pizza;
    }
}
