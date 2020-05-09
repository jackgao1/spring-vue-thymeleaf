package com.baidu.springvuethymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringVueThymeleafApplication {//extends ResourceServerConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(SpringVueThymeleafApplication.class, args);
    }

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/test1").permitAll()
//                .anyRequest().authenticated();
//    }
}
