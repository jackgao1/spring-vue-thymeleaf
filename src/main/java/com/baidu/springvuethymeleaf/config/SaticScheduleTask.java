package com.baidu.springvuethymeleaf.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@EnableAsync
public class SaticScheduleTask {
//    @Async
//    @Scheduled(fixedDelay = 1000)  //间隔1秒
//    public void first() {
//        System.out.println("第一个定时任务开始");
//        System.out.println();
//    }
//
//    @Async
//    @Scheduled(fixedDelay = 2000)
//    public void second() {
//        System.out.println("第二个定时任务开始");
//        System.out.println();
//    }
}