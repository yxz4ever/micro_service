package com.xrluo.amqp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    // @Test
    // public void testSend() {
    //     String queuename = "simple.queue";
    //     for (int i = 0; i < 10; i++) {
    //         // rabbitTemplate.convertSendAndReceive("exchange_fanout", "", "测试发布订阅模型：" + i);
    //         rabbitTemplate.convertAndSend(queuename, "测试发布订阅模型：" + i);
    //     }
    // }

    @Test
    public void testSendExchange() {
        String queuename = "测试exchange";
        for (int i = 0; i < 10; i++) {
            // rabbitTemplate.convertSendAndReceive("exchange_fanout", "", "测试发布订阅模型：" + i);
            rabbitTemplate.convertAndSend("yxz.exchange", "", queuename + ":" + i);
        }
    }
}
