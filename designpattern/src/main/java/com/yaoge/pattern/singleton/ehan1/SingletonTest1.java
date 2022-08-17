package com.yaoge.pattern.singleton.ehan1;

/**
 * create by yaoge
 * 2022/8/16 9:25
 *
 * 缺点：
 *      在类装载的时候就完成实例化，没有达到 Lazy Loading的效果。如果从始至终未使用过这个实例，
 *      则会造成内存的浪费
 */
public class SingletonTest1 {

    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);//证明获取的就是一个对象
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance1.hashCode="+instance1.hashCode());

    }
}

//饿汉式（静态变量）
class Singleton{

    //1. 构造器私有化，外部不能new
    private  Singleton(){

    }

    //2.本类内部创建对象实例
    private final static Singleton instance=new Singleton();


    //3.提供一个共有的静态方法，返回实例对象

    public static Singleton getInstance() {
        return instance;
    }
}