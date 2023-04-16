package ru.clevertec.messageswriter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import ru.clevertec.messageswriter.conditional.ConditionalOnMyCustom;

import javax.annotation.PostConstruct;

@Configuration
@ConditionalOnProperty(prefix = "print.message", name = "enabled", havingValue = "true")
@ConditionalOnMyCustom
@Slf4j
public class MessagesWriterAutoConfiguration {

    @PostConstruct
    public void init() {
        log.info("starter started");
    }
}
