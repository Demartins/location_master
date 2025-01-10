package br.com.diego.poc;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LocationProducer {
  private final KafkaTemplate<String, String> kafkaTemplate;

  public LocationProducer(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(String message) {
    kafkaTemplate.send("intercab.squad.locationref.topic.internal.any.v1", message);
  }
}
