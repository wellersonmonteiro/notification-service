package br.ms.email.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListeners;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {
    @RabbitListeners(queues = "${broker.queue.email.nome}")
    public void
}
