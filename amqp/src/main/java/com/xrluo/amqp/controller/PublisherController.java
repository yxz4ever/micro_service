package com.xrluo.amqp.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/send")
    public String send() {
        String queueName = "simple.queue";
        String message   = "hello" + System.currentTimeMillis();
        rabbitTemplate.convertAndSend(queueName, message);
        return "发送成功";
    }
}
