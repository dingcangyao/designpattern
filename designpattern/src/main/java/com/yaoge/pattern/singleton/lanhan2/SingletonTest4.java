package com.yaoge.pattern.singleton.lanhan2;

/**
 * create by yaoge
 * 2022/8/17 8:51
 * 优缺点
 * 1.解决了线程安全问题
 * 2.效率太低了，每个线程在想获得类的实例的时候，执行getInstance（）方法都要进行同步。
 *    而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了，发发进行同步效率太低
 * 3. 结论：在实际开发中，不推荐使用这种方式
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        System.out.println("懒汉式 2 ， 线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

//懒汉式（线程安全，同步方法）

class Singleton{
    private static Singleton instance;
    //构造器私有化
    private Singleton(){}


    /**
     * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
     * 即懒汉式
     * @return
     */
    public static synchronized Singleton getInstance() {
       if (instance==null){
           instance=new Singleton();
       }
        return instance;
    }
}