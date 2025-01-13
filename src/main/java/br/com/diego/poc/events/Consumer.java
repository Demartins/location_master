package br.com.diego.poc.events;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "./bin/zkCli.sh -server localhost:2181", groupId = "group-1")
    public void receiveMessage(String message) {
        // Process the received message
        System.out.println("Consumer Message: " + message);
    }

}