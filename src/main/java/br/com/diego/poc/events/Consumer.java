package br.com.diego.poc.events;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @Value("${kafka.topic}")
    private String topic;

    @KafkaListener(topics = "#{@environment.getProperty('kafka.topic')}", groupId = "group-1")
    public void receiveMessage(String message) {
        // Process the received message
        System.out.println("Consumer Message: " + message);
    }

}