package com.krt;

/**
 * Lambda表达式， 简化线程（用一次）的使用
 *
 * LambdaThread类不使用不会编译
 */
public class LambdaThread {

    // 静态内部类
    static class Test implements Runnable{

        @Override
        public void run() {
            for(int i=0; i<10; i++){
                System.out.println("===>"+i);
            }
        }
    }

    public static void main(String[] args) {
        //new Thread(new Test()).start();

        // 局部内部类
        class Test2 implements Runnable{
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("===>");
                }
            }
        }
      //  new Thread(new Test2()).start();

        // 匿名内部类，必须借助接口或者父类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("===-->");
                }
            }
        }).start();

        // jdk简化，lambda表达式
        new Thread(()->{
            for(int i=0; i<10; i++){
                System.out.println("===-->");}
        }).start();
    }
}
