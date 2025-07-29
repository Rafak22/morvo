package com.morvo.state;

import java.util.HashMap;
import java.util.Map;

public class MORVOState {

    private String name;
    private String role;
    private String goal;
    private String lastUserInput;
    private String lastReply;

    public MORVOState() {}

    // Getters + setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getGoal() { return goal; }
    public void setGoal(String goal) { this.goal = goal; }

    public String getLastUserInput() { return lastUserInput; }
    public void setLastUserInput(String lastUserInput) { this.lastUserInput = lastUserInput; }

    public String getLastReply() { return lastReply; }
    public void setLastReply(String lastReply) { this.lastReply = lastReply; }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("role", role);
        map.put("goal", goal);
        map.put("lastUserInput", lastUserInput);
        map.put("lastReply", lastReply);
        return map;
    }
} 