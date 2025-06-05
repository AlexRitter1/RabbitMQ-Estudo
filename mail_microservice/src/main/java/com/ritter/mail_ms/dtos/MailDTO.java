package com.ritter.mail_ms.dtos;

import java.util.UUID;

public record MailDTO(UUID userId,
                      String emailTo,
                      String subject,
                      String text) {
}
