package com.krt;

/**
 * 共享资源,并发
 */
public class Web12306 implements Runnable  {
   // 票数
    private int ticketNums = 99;
    @Override
    public void run() {

        while(true){
            if(ticketNums<0){
                break;
            }
            // 延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"==>"+ticketNums--);
        }
    }

    public static void main(String[] args) {
       // 一份资源，多个代理
        Web12306 web12306 = new Web12306();
        System.out.println(Thread.currentThread().getName());
        // 对个代理
        new Thread(web12306,"码农").start();
        new Thread(web12306,"码瑝").start();
        new Thread(web12306,"码畜").start();
    }
}
