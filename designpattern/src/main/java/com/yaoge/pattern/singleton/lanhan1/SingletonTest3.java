package com.yaoge.pattern.singleton.lanhan1;

/**
 * create by yaoge
 * 2022/8/16 9:41
 * 优缺点说明：
 *  1.起到了懒加载的效果，但是只能在单线程下使用
 *  2.如果在多线程下，一个线程进入了 if(singleton==null)判断语句块，还没有来得及往下执行，另一个线程也进入了这个判断语句，
 *    这个时候就会产生多个实例。所以在多线程环境下不可使用这种方式
 *  3.结论：在实际开发中，不要使用这种方式
 *
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        System.out.println("懒汉式 1 ， 线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

//懒汉式（线程不安全）
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    //提供一个静态的公有方法，当使用者到该方法时，才去创建 instance
    //即懒汉式

    public static Singleton getInstance() {
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}