package com.xrluo.consumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

// @Configuration
public class ExchangeConfig {

    @Bean
    public FanoutExchange exchange() {
        return new FanoutExchange("yxz.exchange");
    }

    @Bean
    public Queue queue1() {
        return new Queue("yxz.queque1");
    }

    @Bean
    public Queue queue3() {
        return new Queue("simple.queue", false);
    }

    @Bean
    public Binding bindingExchangeQueue1(Queue queue1, FanoutExchange exchange) {
        return BindingBuilder
                .bind(queue1)
                .to(exchange);
    }

    @Bean
    public Queue queue2() {
        return new Queue("yxz.queque2");
    }

    @Bean
    public Binding bindingExchangeQueue2(Queue queue2, FanoutExchange exchange) {
        return BindingBuilder
                .bind(queue2)
                .to(exchange);
    }


}
