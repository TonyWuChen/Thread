package com.krt;

import org.apache.commons.io.FileUtils;

/**
 * 创建线程
 * 1 创建 ： 继承Thread+重写run
 * 2 创建子类对象 + start
 */
public class StartThread extends Thread {

    /**
     * 线程入口点
     */
    @Override
    public void run() {
       for(int i=0; i<20; i++){
           System.out.println("一遍听歌");
       }

    }

    public static void main(String[] args) {

        // 启动线程
        StartThread startThread = new StartThread();
        startThread.start();
        for(int i=0; i<20; i++){
            System.out.println("一遍敲代码");
        }
    }
}
