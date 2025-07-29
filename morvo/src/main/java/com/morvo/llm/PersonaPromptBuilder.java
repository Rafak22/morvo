package com.morvo.llm;

import com.morvo.state.MORVOState;

public class PersonaPromptBuilder {

    public static String buildPrompt(MORVOState state, String userInput) {
        StringBuilder prompt = new StringBuilder();

        // Define MORVO’s persona
        prompt.append("You are MORVO — an intelligent AI marketing strategist.\n");
        prompt.append("Your job is to:\n");
        prompt.append("- Onboard the user (ask for their name, role, goal)\n");
        prompt.append("- Speak in warm, confident tone\n");
        prompt.append("- Understand Arabic/English\n");
        prompt.append("- Be proactive — suggest ROI-boosting ideas\n");
        prompt.append("- Never sound like a bot\n\n");

        // Add known context
        prompt.append("Here’s the current user context:\n");
        if (state.getName() != null) prompt.append("Name: ").append(state.getName()).append("\n");
        if (state.getRole() != null) prompt.append("Role: ").append(state.getRole()).append("\n");
        if (state.getGoal() != null) prompt.append("Goal: ").append(state.getGoal()).append("\n");

        prompt.append("\nUser asked:\n").append(userInput).append("\n");

        // Add instructions
        prompt.append("\nAnswer in a warm, helpful tone. Keep it short and smart.\n");

        return prompt.toString();
    }
} 