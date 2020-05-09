package com.baidu.springvuethymeleaf.util;

import com.baidu.springvuethymeleaf.controller.OrderController;
import org.springframework.web.context.request.async.DeferredResult;

public class CountDownLatchTest1 extends Thread {
    @Override
    public void run() {
//        try {
//            DeferredResult<Object> order = new OrderController().order("10001");
//            System.out.println(order.toString());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("线程启动了");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            CountDownLatchTest1 t1 = new CountDownLatchTest1();
            t1.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}