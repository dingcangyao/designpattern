package com.yaoge.pattern.factory.factorymethod;



/**
 * create by yaoge
 * 2022/8/18 9:27
 */
public class ShandongCheesePizza extends Pizza {
    public ShandongCheesePizza() {
        this.name="芝士披萨";
        this.location="山东";
    }

    @Override
    public void prepare() {
        System.out.println("山东"+this.name+"：准备");
    }

    @Override
    public void bake() {
        System.out.println("山东"+ this.name+"：烘焙");

    }

    @Override
    public void cut() {
        System.out.println("山东"+ this.name+"：切块");

    }

    @Override
    public void box() {
        System.out.println("山东"+ this.name+"：打包");

    }
}
