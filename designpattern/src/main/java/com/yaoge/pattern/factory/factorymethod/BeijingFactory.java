package com.yaoge.pattern.factory.factorymethod;

/**
 * create by yaoge
 * 2022/8/19 9:20
 */
public class BeijingFactory extends MethodFactory{
    @Override
    public Pizza createProto(String name) {
        Pizza pizza=null;
        if ("cheese".equals(name)){
          pizza= new BeijingCheesePizza();
          pizza.setName("芝士披萨");
        }else if ("pepper".equals(name)){
            pizza= new BeijingPepperPizza();
            pizza.setName("胡椒披萨");
        }
        pizza.setLocation("北京");
        return pizza;
    }
}
