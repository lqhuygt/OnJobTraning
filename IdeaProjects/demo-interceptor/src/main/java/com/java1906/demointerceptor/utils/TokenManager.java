package com.java1906.demointerceptor.utils;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class TokenManager {

    public static TokenManager tokenManager;

    public static TokenManager getInstance() {
        return tokenManager;
    }

    @PostConstruct
    public void setup() {
        tokenManager = this;
    }

    private Map<String, String> storedTokens = new HashMap<>();

    public String createToken(String sessionId) {
        String uuidToken = UUID.randomUUID().toString();
        storedTokens.put(sessionId, uuidToken);
        return uuidToken;
    }

    public boolean isAuthenticated(String sessionId, String token) {
        if (storedTokens.get(sessionId) != null && storedTokens.get(sessionId).equals(token)) {
            return true;
        } return false;
    }
}
