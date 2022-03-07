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
}
