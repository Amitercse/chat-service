package com.example.chatservice.gateway;

import org.springframework.http.ResponseEntity;

public interface ExternalServiceGateway<T> {

    ResponseEntity<String> makePostRequest(T requestBody);
}
