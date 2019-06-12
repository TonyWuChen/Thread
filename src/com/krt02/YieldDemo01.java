package com.krt02;

/**
 * yield 礼让线程，暂停线程，直接进入就绪状态
 *
 */
public class YieldDemo01 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"-->end");

    }

    public static void main(String[] args) {
        YieldDemo01 yieldDemo01 = new YieldDemo01();
        new Thread(yieldDemo01,"a1").start();
        new Thread(yieldDemo01,"b1").start();
    }
}
