package com.krt02;

/**
 * 终止线程
 * 1,线程正常执行完毕--》次数
 * 2,外部干涉--》加入标识
 * 不要使用stop  destroy方法  不安全
 *
 */
public class TerminalThread implements Runnable {

    // 1加入标识 标记线程体是否可以运行
    private boolean flag = true;
    private String name;

    public TerminalThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // 2关联标识 true-->运行
        int i=0;
        while(flag){
            System.out.println(name+"-->"+i);
        }

    }

    //3 对外提供方法改变标识
    public void terminate(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TerminalThread maxi = new TerminalThread("MAXI");
        new Thread(maxi).start();

        for(int j=0;j<99;j++){
            System.out.println("main"+j);
            if(j==55){
                // 线程终止
                maxi.terminate();
                System.out.println("maxi over");
            }
        }
    }
}
