package com.ritter.mail_ms.consumers;

import com.ritter.mail_ms.dtos.MailDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MailConsumer {

    @RabbitListener(queues = "${broker.queue.mail.name}")
    public void listenEmailQueue(@Payload MailDTO email) {
        System.out.println(email.emailTo());
    }

}
