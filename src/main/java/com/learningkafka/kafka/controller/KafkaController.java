package com.learningkafka.kafka.controller;

import com.learningkafka.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class KafkaController{
    @Autowired
    private Producer producer;

    @PostMapping("/update")
    public ResponseEntity<?> updateKafkaMessage(@RequestParam String message){
        this.producer.updateKafka(message);
        return new ResponseEntity<>(Map.of("message","Message updated"), HttpStatus.OK);
    }
}
