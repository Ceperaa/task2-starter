package ru.clevertec.messageswriter;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConditionalOnProperty(prefix = "print.message", name = "enabled", havingValue = "true")
@EnableConfigurationProperties(MessageProperties.class)
@Slf4j
@RequiredArgsConstructor
public class MessagesWriterAutoConfiguration {

    private final MessageProperties messageProperties;

    @PostConstruct
    public void init() {
        log.info(messageProperties.getText());
    }
}
