package com.yaoge.pattern.factory.chuantong;

/**
 * create by yaoge
 * 2022/8/18 9:24
 * 传统创建方式
 * 优缺点
 * 1.优点是比较好理解，简单易操作
 * 2.缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭，即当我们给类增加新功能的时候，尽量不修改代码
 *    或者尽可能少修改代码
 * 3.增加代码海东比较大
 *
 *
 * 改进思路
 * 分析：秀发i代码可以接受，但是如果我们在其他的地方也有创建Pizza的代码，就意味着，也需要修改，而创建Pizza的代码，往往有多出
 * 思路：把创建 Pizza 对象封装到一个类中，这样我们有新的Pizza种类时，只需要修改该类就可，其他创建 Pizza对象的代码就不需要修改了
 *      ----》简单工厂模式
 */
public class OrderPizza {

    public static void main(String[] args) {
        Pizza pizza=null;
        String orderType="greek";//订购披萨的类型
        if (orderType.equals("greek")) {

            pizza = new GreekPizza();

            pizza.setName(" 希腊披萨 ");

        } else if (orderType.equals("cheese")) {

            pizza = new CheesePizza();

            pizza.setName(" 奶酪披萨 ");

        }

//输出 pizza 制作过程

        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();
    }
}
