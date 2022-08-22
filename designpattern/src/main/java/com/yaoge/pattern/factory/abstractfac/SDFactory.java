package com.yaoge.pattern.factory.abstractfac;

import com.yaoge.pattern.factory.factorymethod.Pizza;
import com.yaoge.pattern.factory.factorymethod.ShandongCheesePizza;
import com.yaoge.pattern.factory.factorymethod.ShandongPepperPizza;

/**
 * create by yaoge
 * 2022/8/22 9:11
 */
public class SDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if ("cheese".equals(orderType)){
            pizza= new ShandongCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza=new ShandongPepperPizza();
        }
        return pizza;
    }
}
