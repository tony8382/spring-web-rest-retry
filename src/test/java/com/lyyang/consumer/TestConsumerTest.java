package com.lyyang.consumer;

import com.lyyang.SpringProjectApplicationTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestClientException;

class TestConsumerTest extends SpringProjectApplicationTests {

    @Autowired
    private TestConsumer testConsumer;

    @Test
    void response200() {
        testConsumer.demoRestTemplate("200");
    }

    @Test
    void response400() {

        Assertions.assertThrows(RestClientException.class, () -> testConsumer.demoRestTemplate("400"));
    }

    @Test
    void response500() {
        Assertions.assertThrows(RestClientException.class, () -> testConsumer.demoRestTemplate("500"));
    }
}