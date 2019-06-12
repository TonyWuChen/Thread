package com.krt03;

/**
 * 线程的优先级1-10
 * 1.NORM_PRIORITY   5(默认)
 * 2.MIN_PRIORITY     1
 * 3.MAX_PRIORITY     10
 * 概率  不代表绝对的先后顺序
 */
public class PriorityTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
    }
}

