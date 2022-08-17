package com.yaoge.pattern.singleton.ehan2;

/**
 * create by yaoge
 * 2022/8/16 9:35
 * 和饿汉式（静态变量）其实是一样的，知识把类实例化的过程放在了静态代码块中。优缺点和上面一样
 *
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);//证明获取的就是一个对象
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance1.hashCode="+instance1.hashCode());

    }
}

//饿汉式（静态代码块）
class Singleton{
    //1. 构造器私有化，外部不能new
    private  Singleton(){

    }

    //2.本类内部创建对象实例
    private final static Singleton instance;

    static {//在静态代码中，创建单例对象

        instance=new Singleton();

    }
    //3.提供一个公有的静态方法，返回实例对象

    public static Singleton getInstance() {
        return instance;
    }
}