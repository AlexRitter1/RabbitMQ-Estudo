package com.ritter.mail_ms.configurations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

    @Value("${broker.queue.mail.name}")
    private String queue;

    @Bean
    public Queue queue (){
        return new Queue(queue, true);
    }

    @Bean
    public Jackson2JsonMessageConverter jsonMessageConverter(){
        ObjectMapper mapper = new ObjectMapper();
        return new Jackson2JsonMessageConverter(mapper);
    }

}
