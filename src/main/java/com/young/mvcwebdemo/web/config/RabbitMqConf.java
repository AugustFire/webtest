package com.young.mvcwebdemo.web.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMqConf {
    private final static String QUEUENAME = "queue.demo";


    @Bean
     Queue queue() {
        return new Queue(QUEUENAME,false);
    }


    @Bean
    TopicExchange topicExchange() {
        TopicExchange exchange = new TopicExchange("spring-boot-topic-exchange");
        return exchange;
    }


    @Bean
    Binding bindingQueueAndTopicExchange(Queue queue, TopicExchange topicExchange) {
        return BindingBuilder.bind(queue).to(topicExchange).with("queue.#");
    }
}
