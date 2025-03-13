package br.ms.email.config;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbiMQConfig {
    @Value("${broker.queue.email.nome}")
    private String queue;

    @Bean
    public Queue queue() {
        return new Queue(queue, true, false, false);
    }
}
