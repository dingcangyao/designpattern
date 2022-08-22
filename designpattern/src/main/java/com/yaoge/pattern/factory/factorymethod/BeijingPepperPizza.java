package com.yaoge.pattern.factory.factorymethod;



/**
 * create by yaoge
 * 2022/8/18 9:27
 */
public class BeijingPepperPizza extends Pizza {
    public BeijingPepperPizza() {
        this.name="胡椒披萨";
        this.location="北京";
    }

    @Override
    public void prepare() {
        System.out.println(this.name+"北京 ：准备");
    }

    @Override
    public void bake() {
        System.out.println(this.name+"北京 ：烘焙");

    }

    @Override
    public void cut() {
        System.out.println(this.name+"北京 ：切块");

    }

    @Override
    public void box() {
        System.out.println(this.name+"北京 ：打包");

    }
}
