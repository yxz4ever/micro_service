package com.xrluo.consumer.listener;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ConsumerRabbitListener {

    @RabbitListener(bindings = {
            @QueueBinding(value = @Queue(value = "simple.queue", durable = "false"),
                    exchange = @Exchange(value = "yxz.demo", durable = "false", type = ExchangeTypes.FANOUT)),
    })
    public void simpleQueueMessage(String msg) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("simple.queue   当前时间==========>【" + time.toString() + "】,获取到的msg【" + msg + "】");
    }

    @RabbitListener(bindings = {
            @QueueBinding(value = @Queue(value = "simple.queue1", durable = "false"), exchange = @Exchange(value = "yxz.demo", durable = "false", type = ExchangeTypes.FANOUT)),
    })
    public void simpleQueueMessage1(String msg) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("simple.queue1   当前时间==========>【" + time.toString() + "】,获取到的msg【" + msg + "】");
    }

    // 手动创建队列，否则报错
    // @RabbitListener(queues = "yxz.queque1")
    @RabbitListener(queuesToDeclare = {
            @Queue("yxz.queque1")
    })
    public void exchangeMessage1(String msg) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("yxz.queque1 当前时间==========>【" + time.toString() + "】,获取到的msg【" + msg + "】");
    }

    @RabbitListener(queuesToDeclare = {
            @Queue("yxz.queque2")
    })
    public void exchangeMessage2(String msg) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("yxz.queque2 当前时间==========>【" + time.toString() + "】,获取到的msg【" + msg + "】");
    }
}
