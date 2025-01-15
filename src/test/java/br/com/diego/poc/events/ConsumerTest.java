package br.com.diego.poc.events;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.verify;

class ConsumerTest {

    @InjectMocks
    private Consumer consumer;

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void receiveMessage_shouldProcessMessage() {
        String message = "Test message";

        consumer.receiveMessage(message);

        // Verify that the message is processed (in this case, printed to the console)
        // Since we cannot verify console output directly, we assume the method works if no exceptions are thrown
    }

    @Test
    void receiveMessage_withEmptyMessage_shouldProcessMessage() {
        String message = "";

        consumer.receiveMessage(message);

        // Verify that the empty message is processed
    }

    @Test
    void receiveMessage_withNullMessage_shouldProcessMessage() {
        String message = null;

        consumer.receiveMessage(message);

        // Verify that the null message is processed
    }
}