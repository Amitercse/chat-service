package com.example.chatservice.util;

public class StringUtils {

    private StringUtils()
    {

    }

    public static boolean isNullOrEmpty(String data) {
        return (null == data || "".equals(data.trim()));
    }
}
