package br.com.diego.poc.events;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.verify;

class ProducerTest {

    @InjectMocks
    private Producer producer;

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sendMessage_shouldSendMessageToKafka() {
        String message = "Test message";

        producer.sendMessage(message);

        verify(kafkaTemplate).send("intercab.squad.locationref.topic.internal.any.v1", message);
    }

    @Test
    void sendMessage_withEmptyMessage_shouldSendMessageToKafka() {
        String message = "";

        producer.sendMessage(message);

        verify(kafkaTemplate).send("intercab.squad.locationref.topic.internal.any.v1", message);
    }

    @Test
    void sendMessage_withNullMessage_shouldSendMessageToKafka() {
        String message = null;

        producer.sendMessage(message);

        verify(kafkaTemplate).send("intercab.squad.locationref.topic.internal.any.v1", message);
    }
}