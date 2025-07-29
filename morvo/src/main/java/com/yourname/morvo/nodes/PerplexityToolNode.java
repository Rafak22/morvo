package com.yourname.morvo.nodes;

import com.yourname.morvo.state.MORVOState;
import dev.langchain4j.langgraph.*;

public class PerplexityToolNode extends ToolNode<MORVOState> {
    @Override
    public MORVOState run(MORVOState state) {
        String query = (String) state.get("userQuery");
        System.out.println("🧠 Searching Perplexity for: " + query);
        // Simulated response
        state.set("response", "Simulated Perplexity answer for: " + query);
        return state;
    }
} 