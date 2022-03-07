package com.xrluo.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AMQPApplication {

    public static void main(String[] args) {
        SpringApplication.run(AMQPApplication.class, args);
    }

    @Bean
    public Queue queueMessage() {
        return new Queue("simple.queue", false);
    }
}
