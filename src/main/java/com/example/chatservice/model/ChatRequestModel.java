package com.example.chatservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ChatRequestModel {
    String userQuery;
}
