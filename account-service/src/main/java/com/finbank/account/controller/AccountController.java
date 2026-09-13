package com.finbank.account.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/info")
    public Map<String, Object> getInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("service", "ACCOUNT-SERVICE");
        response.put("port", serverPort);
        response.put("status", "UP");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }
}