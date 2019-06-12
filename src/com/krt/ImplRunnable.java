package com.krt;


/**
 * 创建线程方式2
 * 1. 创建：实现Runnable + 重写run
 * 2. 启动  创建实现类对象+ Thread对象+start方法
 *
 * 推荐，避免单继承的局限性，优先使用接口
 * 方便共享资源
 */
public class ImplRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // 实现类对象
        ImplRunnable implRunnable = new ImplRunnable();
        // 代理类对象
        Thread thread = new Thread(implRunnable);
        // 启动
        thread.start();

        // 启动方式2
        new Thread(new ImplRunnable()).start();
        for(int j=0; j<10; j++){
            System.out.println("=====");
        }
    }
}
