package com.baidu.springvuethymeleaf.mq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
//        User user=new User();    //实现Serializable接口
//        user.setName("Lucy");
//        user.setPassword("123");
//        //1、使用JSONObject
//        String jsonUser = JSONObject.toJSONString(user);
        rabbitTemplate.convertAndSend("queue", "Hello,Rabbit!"); //direct类型
//        rabbitTemplate.convertAndSend("exchange", "topic.message", "Hello,Rabbit!"); //topic类型
//        rabbitTemplate.convertAndSend("fanoutExchange", "", "Hello,Rabbit!"); //fanout类型
    }

}
