package com.yaoge.pattern.factory.factorymethod;

/**
 * create by yaoge
 * 2022/8/19 9:16
 */
public abstract class MethodFactory {




    public Pizza cretePizza(String name){
        Pizza pizza = createProto(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza createProto(String name);
}
