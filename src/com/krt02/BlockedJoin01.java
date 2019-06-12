package com.krt02;

/**
 * join合并线程
 *
 */
public class BlockedJoin01 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(
                () -> {
                    for (int i = 0; i < 100; i++) {
                        System.out.println("Lam" + i);
                    }
                }
        );
        thread.start();

        for(int i=0; i<100; i++){
            if(i==0){
                thread.join(); //插队
            }
            System.out.println("main...");
        }

    }
}
