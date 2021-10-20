package com.example.apachekafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

    @KafkaListener(topics = "send_message", groupId = "group-id")
    public void consumeMessage(String message) {
        log.info(String.format("### Message -> %s", message));
    }
}
