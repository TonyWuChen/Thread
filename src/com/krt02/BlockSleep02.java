package com.krt02;

/**
 * 阻塞
 * sleep 模拟倒计时
 *
 */
public class BlockSleep02  {

    public static void main(String[] args) throws InterruptedException {
        int num = 10;
        boolean flag = true;
        while (flag){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num==0){
                flag=false;
                System.out.println("时间到");
            }
        }
    }
}
