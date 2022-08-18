package com.yaoge.pattern.singleton.enumtest;

/**
 * create by yaoge
 * 2022/8/18 8:48
 * 枚举实现单例模式
 * 优缺点说明：
 *  1.这借助JDK1.5中添加的枚举来实现单例模式，不仅能避免多线程同步问题
 *    而且还能防止反序列化重新创建新的对象
 *  2.这种方式是 Effective Java作者 Josh Bloch提倡的方式
 *
 *  结论：推荐使用
 *
 */
public class SingletonTest8 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOK();
    }
}
//使用枚举，可以实现单例，推荐
enum Singleton{
    INSTANCE;//属性

    /**
     * 我之前就说过，所谓的枚举就是指定了对象的类
     * 所以只要只指定一个 实例对象就可以实现单例模式
     */


    public void sayOK() {
        System.out.println("ok.....");
    }
}