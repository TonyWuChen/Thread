package com.krt;

/**
 * 模拟龟兔赛跑
 */

public class Racer implements Runnable{
    // 胜利者
    private static String winner;
    @Override
    public synchronized void run() {
        for(int steps=1; steps<=100; steps++){
            // 模拟休息
            if(Thread.currentThread().getName().equals("rabbit")){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(steps>10||steps<90){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                notifyAll();
            }

            System.out.println(Thread.currentThread().getName()+"==>"+steps);
            // 判断比赛是否结束
            boolean flag = gameOver(steps);
            if(flag){
                break;
            }
        }
    }

    private boolean gameOver(int steps){
     if(winner!=null){ //存在胜利者
         return true;
     }else {
         if(steps==100){
             winner = Thread.currentThread().getName();
             System.out.println("胜利者"+winner);
             return true;
         }
     }
     return false;
    }

    public static void main(String[] args) {
        Racer racer = new Racer();
        new Thread(racer,"tortoies").start();
        new Thread(racer,"rabbit").start();
    }
}
