package com.learningkafka.kafka.service;

import com.learningkafka.kafka.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public void updateKafka(String message){
        this.kafkaTemplate.send(AppConstants.LEARN_KAFKA,message);
    }
}
