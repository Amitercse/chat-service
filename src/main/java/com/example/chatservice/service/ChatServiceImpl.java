package com.example.chatservice.service;

import com.example.chatservice.exceptions.InvalidInputException;
import com.example.chatservice.gateway.ExternalServiceGateway;
import com.example.chatservice.util.StringUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    ExternalServiceGateway<String> chatGPTGateway;

    private void validateUserQuery(String query) {
        if (StringUtils.isNullOrEmpty(query)) {
            throw new InvalidInputException("input query is empty");
        }
    }

    public String getChatResponse(String query) {
        validateUserQuery(query);
        ResponseEntity<String> response = chatGPTGateway.makePostRequest(query);
        return formatGPTResponse(response.getBody());
    }

    private String formatGPTResponse(String jsonData) {
        JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();
        JsonObject chatResponse = jsonObject.get("choices").getAsJsonArray().get(0).getAsJsonObject();
        JsonObject responseMessage= chatResponse.getAsJsonObject("message");
        return responseMessage.get("content").getAsString();
    }
}
