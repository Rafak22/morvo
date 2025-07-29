package com.morvo.nodes;

import ai.langgraph.sdk.StateNode;
import com.morvo.state.MORVOState;
import com.morvo.llm.PersonaPromptBuilder;

public class LLMNode implements StateNode<MORVOState> {

    @Override
    public MORVOState invoke(MORVOState state) {
        String prompt = PersonaPromptBuilder.buildPrompt(state, state.getLastUserInput());

        // Simulate Claude response (later you'll call real Claude API)
        String simulatedReply = "🤖 [Claude says]: Based on what you shared, I recommend boosting Instagram engagement with daily interactive polls and stories. Want a checklist?";

        // Update state
        state.setLastReply(simulatedReply);
        return state;
    }
} 