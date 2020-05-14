package com.baidu.springvuethymeleaf;

import com.baidu.springvuethymeleaf.mq.service.HelloSender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringVueThymeleafApplicationTests {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Autowired
    private HelloSender helloSender;

    @Test
    public void asdasdasdasdasd() {
        helloSender.send();
    }
}