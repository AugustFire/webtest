package com.young.mvcwebdemo.web.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MConsumer {

    @SyncListener
    @Async
    public void handMessage(String str) {
        System.out.println("----------<<<<<<<");
        System.out.println("receive:"+str);
        System.out.println("ok!");
    }
}
