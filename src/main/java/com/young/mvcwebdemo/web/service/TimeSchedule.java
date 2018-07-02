package com.young.mvcwebdemo.web.service;


import org.joda.time.DateTime;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class TimeSchedule {


//    @Scheduled(cron = "0/5 * * * * ?")
    @Scheduled(fixedRate = 10000)
    public void sayHello() {
        System.out.println(new DateTime().toString("HHmmss"));
    }
}
