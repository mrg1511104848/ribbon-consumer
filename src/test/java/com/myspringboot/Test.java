package com.myspringboot;

import org.springframework.boot.autoconfigure.jackson.JacksonProperties;

import java.time.Instant;

public class Test {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println(timestamp);
    }
}
