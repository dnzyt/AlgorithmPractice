package com.imooc.problems;

/**
 * Created by ningzeda on 11/15/2015.
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        //第一次初始化时同时有两个线程初始化
        if (instance == null) {
            synchronized (Singleton.class) {
                //这个if确保第二个线程进来时不会再次初始化
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
