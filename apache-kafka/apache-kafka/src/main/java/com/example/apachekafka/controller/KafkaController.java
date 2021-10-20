package com.example.apachekafka.controller;

import com.example.apachekafka.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final ProducerService producerService;

    @PostMapping
    public void sendMessage(@RequestParam("message") String message) {

        producerService.sendMessage(message);
    }
}
