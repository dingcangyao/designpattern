package com.yaoge.pattern.factory.factorymethod;

/**
 * create by yaoge
 * 2022/8/18 9:28
 */
public abstract class Pizza {

    protected String name;
    protected String location;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location+"的"+name+"给你了";
    }
}
