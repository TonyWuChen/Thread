package com.krt;

import java.util.concurrent.*;

/**
 *实现线程方式3
 * 实现Callable接口，实现call()方法
 *
 *
 */
public class ImplCallable implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ImplCallable implCallable = new ImplCallable();

        // 创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 提交执行
        Future<Boolean> submit = executorService.submit(implCallable);
        //获取结果
        Boolean aBoolean = submit.get();
        // 关闭服务
        executorService.shutdownNow();

        for(int j=0; j<10; j++){
            System.out.println("====");
        }
    }
}
