package br.ms.email.consumer;

import br.ms.email.dto.EmailRecordDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.nome}")
    public void listenEmailQueue(@Payload EmailRecordDto emailRecordDto) {
        System.out.println(emailRecordDto.emailTo());
    }
}
