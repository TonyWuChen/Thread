package com.krt02;

public class BlockedJoin02 {

    public static void main(String[] args) {

        System.out.println("儿子帮老爸买烟的故事");
        //new Thread(new Father()).start();
        Thread thread = new Thread(new Father());
        thread.start();
    }

}

class Father extends Thread{
    public void run() {
        System.out.println("没有烟");
        System.out.println("儿子去买");
        Thread thread = new Thread(new Son());
        thread.start();
        try {
            // father 被阻塞
            thread.join();
            System.out.println("把零钱给了儿子");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("儿子丢了");
        }

    }
}

class Son extends Thread{
    public void run() {
        System.out.println("接过老爸的钱出去了");
        System.out.println("路边有个游戏厅，玩了10s");
        for(int i=0 ; i<10; i++){
            System.out.println(i+"s");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("赶紧买烟");
        System.out.println("回来了");
    }
}