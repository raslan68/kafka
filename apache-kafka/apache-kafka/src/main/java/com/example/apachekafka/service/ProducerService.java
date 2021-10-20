package com.example.apachekafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private static final String SEND_MESSAGE = "send_message";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {

        kafkaTemplate.send(SEND_MESSAGE, message);
    }
}
