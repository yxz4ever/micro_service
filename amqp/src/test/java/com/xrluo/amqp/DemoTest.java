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

    @Test
    public void testSendExchange() {
        String queuename = "测试exchange";
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("yxz.demo", "", queuename + ":" + i);
        }
    }
}
