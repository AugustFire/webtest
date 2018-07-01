package com.young.mvcwebdemo.web.demo.Demo1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * Project: multithread.
 * Author:YZX
 * Time:23:21 2018/7/1
 * Description:等待多个线程的结果并汇总
 */
public class CountDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(System.currentTimeMillis());
        CountDownLatch latch = new CountDownLatch(2){
            @Override
            public void await() throws InterruptedException {
                //设置超时时间
                super.await(1, TimeUnit.SECONDS);
            }
        };
        TaskA taskA = new TaskA();
        TaskB taskB = new TaskB();
        FutureTask<Integer> futureTaskA = new FutureTask<>(taskA);
        FutureTask<Integer> futureTaskB = new FutureTask<>(taskB);
        Thread threadA = new Thread(futureTaskA);
        Thread threadB = new Thread(futureTaskB);
        threadA.start();
        threadB.start();
        Integer num1 = futureTaskA.get();
        Integer num2 = futureTaskB.get();
        System.out.println(num1 + num2);
        System.out.println(System.currentTimeMillis());
    }
}
