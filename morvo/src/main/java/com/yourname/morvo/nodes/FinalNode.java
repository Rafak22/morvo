package com.yourname.morvo.nodes;

import com.yourname.morvo.state.MORVOState;
import dev.langchain4j.langgraph.*;

public class FinalNode extends StateNode<MORVOState> {
    @Override
    public MORVOState run(MORVOState state) {
        System.out.println("🗣️ MORVO: " + state.get("response"));
        return state;
    }
} 