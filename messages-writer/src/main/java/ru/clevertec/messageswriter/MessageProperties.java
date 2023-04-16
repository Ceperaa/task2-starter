package ru.clevertec.messageswriter;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "print.message")
public class MessageProperties {

    private boolean enabled;
    private String text;
}
