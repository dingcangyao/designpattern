package com.yaoge.pattern.singleton.doublecheck;

/**
 * create by yaoge
 * 2022/8/17 9:24
 * 优缺点：
 *  1.Double-Check 概念是多线程开发中尝试用到的，如代码中所示，我们进行了两次
 *    if（singleton==null）检查，这样就可以保证线程安全
 *  2.这样，实例化代码只用执行一次，后面再次访问时，判断if(singleton==null),直接return实例化对象，
 *    也避免反复的进行方法同步
 *  3.线程安全：延迟加载，效率过高
 *  4.结论：在实际开发中推荐使用这种单例设计模式
 */
public class SingletonTest5 {
    public static void main(String[] args) {

        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
//懒汉式（线程安全，双重检查）
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决贤臣安全问题，保证懒加载
     * 同时保证了效率，推荐使用
     * @return
     */
    public static Singleton getInstance() {
        if (instance==null){//第一重检查保证效率
            synchronized (Singleton.class){
                if (instance==null){//第二重检查，保证只进行一次实例化（线程安全）
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}