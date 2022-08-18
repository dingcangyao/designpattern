package com.yaoge.pattern.factory.chuantong;

/**
 * create by yaoge
 * 2022/8/18 9:28
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
