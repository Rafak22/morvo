package com.yourname.morvo.state;

import java.util.HashMap;
import java.util.Map;

public class MORVOState {
    private Map<String, Object> memory = new HashMap<>();

    public void set(String key, Object value) {
        memory.put(key, value);
    }

    public Object get(String key) {
        return memory.get(key);
    }

    public boolean isOnboarded() {
        return memory.containsKey("userName");
    }
} 