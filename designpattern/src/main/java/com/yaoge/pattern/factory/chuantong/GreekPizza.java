package com.yaoge.pattern.factory.chuantong;

/**
 * create by yaoge
 * 2022/8/18 9:27
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(this.name+" ：准备");
    }

    @Override
    public void bake() {
        System.out.println(this.name+" ：烘焙");

    }

    @Override
    public void cut() {
        System.out.println(this.name+" ：切块");

    }

    @Override
    public void box() {
        System.out.println(this.name+" ：打包");

    }
}
