package com.imooc.problems;

/**
 * Created by ningzeda on 11/15/2015.
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        //��һ�γ�ʼ��ʱͬʱ�������̳߳�ʼ��
        if (instance == null) {
            synchronized (Singleton.class) {
                //���ifȷ���ڶ����߳̽���ʱ�����ٴγ�ʼ��
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
