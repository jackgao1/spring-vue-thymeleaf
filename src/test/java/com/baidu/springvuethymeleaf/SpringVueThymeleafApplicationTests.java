package com.baidu.springvuethymeleaf;

import com.baidu.springvuethymeleaf.mq.service.HelloSender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringVueThymeleafApplicationTests {
    public int i = 0;
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Autowired
    private HelloSender helloSender;

    @Test
    public void test1() {
        helloSender.send();
    }

    @Test
    public void test2() {
        TestThread web = new TestThread();
        //多个代理
        new Thread(web, "如花").start();
        new Thread(web, "包租婆").start();
        new Thread(web, "小李").start();
    }
}

class TestThread implements Runnable {
    private int ticteksNums = 20;//票数

    @Override
    public void run() {
        synchronized (this) {
            for (; ; ) {
                if (ticteksNums < 0) {
                    break;
                }
                try {
                    System.out.println("正在打印车票，请稍后...");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "又抢了一张票，目前还剩" + ticteksNums-- + "张票。");
            }
        }
    }
}