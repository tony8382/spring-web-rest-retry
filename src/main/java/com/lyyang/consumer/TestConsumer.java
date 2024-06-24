package com.lyyang.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Service
public class TestConsumer {

    @Retryable(value = RestClientException.class, maxAttempts = 4, backoff = @Backoff(delay = 500))
    public String demoRestTemplate(String path) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8080/api/" + path, String.class);
    }

}