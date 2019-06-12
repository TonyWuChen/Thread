package com.krt02;

/**
 * sleep 模拟网络延时
 *
 *
 */
public class BlockedSleep implements Runnable {
    private Integer ticketNums=100;
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
        BlockedSleep bk = new BlockedSleep();
        System.out.println(Thread.currentThread().getName());
        // 对个代理
        new Thread(bk,"码农").start();
        new Thread(bk,"码瑝").start();
        new Thread(bk,"码畜").start();
    }
}
