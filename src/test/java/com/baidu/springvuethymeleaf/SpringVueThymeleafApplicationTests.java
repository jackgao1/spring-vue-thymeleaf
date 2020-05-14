package com.baidu.springvuethymeleaf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringVueThymeleafApplicationTests {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Test
    public void hello() {

    }
}