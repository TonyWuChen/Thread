package com.krt02;

/**
 *所有线程状态
 *
 */
public class AllState {

    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    for(int i=0; i<5; i++){
                        System.out.println("....");
                    }
                }
        );
        // 观察状态
        Thread.State state = thread.getState();
        System.out.println(state);

        thread.start();
        System.out.println(state);
    }
}
