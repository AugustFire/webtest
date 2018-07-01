package com.young.mvcwebdemo.web.demo.Demo1;

import java.util.concurrent.Callable;

/**
 * Project: multithread.
 * Author:YZX
 * Time:23:45 2018/7/1
 * Description:
 */
public class TaskB implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("taskB线程执行计算");
        Thread.sleep(2000);
        return 10;
    }
}
