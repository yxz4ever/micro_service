package com.xrluo.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ConsumerRabbitListener {

    @RabbitListener(queues = "simple.queue")
    public void simpleQueueMessage(String msg) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("当前时间==========>【" + time.toString() + "】,获取到的msg【" + msg + "】");
    }

    @RabbitListener(queues = "yxz.queque1")
    public void exchangeMessage1(String msg) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("yxz.queque1 当前时间==========>【" + time.toString() + "】,获取到的msg【" + msg + "】");
    }

    @RabbitListener(queues = "yxz.queque2")
    public void exchangeMessage2(String msg) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("yxz.queque2 当前时间==========>【" + time.toString() + "】,获取到的msg【" + msg + "】");
    }
}
