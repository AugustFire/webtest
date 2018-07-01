package com.young.mvcwebdemo.web.demo.Demo1;

import java.util.concurrent.Callable;

/**
 * Project: multithread.
 * Author:YZX
 * Time:23:28 2018/7/1
 * Description:
 */
public class TaskA implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("taskA的线程执行计算");
        Thread.sleep(8000);
        return 1;
    }
}
