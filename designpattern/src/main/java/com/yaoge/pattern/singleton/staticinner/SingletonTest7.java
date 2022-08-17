package com.yaoge.pattern.singleton.staticinner;

/**
 * create by yaoge
 * 2022/8/17 9:38
 * 静态内部类的方式
 * 1.这种方式采用了类装载的机制类保证初始化实例时只有一个线程
 * 2.静态内部类方式在 Singleton 类被装载的时候，并不会立即实例化，而是在需要实例化的时候，调用getInstance 方法
 *   次啊会装载SingletonInstance类，从而完成 Singleton的实例化
 * 3.类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化的时候
 *   别的线程是无法进入的
 * 优点：避免了线程的不安全，利用静态内部类特点实现延迟加载，效率高
 * 结论：推荐使用
 */
public class SingletonTest7 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    //写一个静态内部类，该类中有一个静态属性 Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }

    //提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}