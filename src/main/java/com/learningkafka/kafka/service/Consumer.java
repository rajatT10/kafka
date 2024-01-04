package com.learningkafka.kafka.service;

import com.learningkafka.kafka.config.AppConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = AppConstants.LEARN_KAFKA,groupId = AppConstants.GROUP_ID)
    public void consumingMessage(String value){
        System.out.println(value);
    }
}
