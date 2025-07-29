package com.yourname.morvo.graph;

import com.yourname.morvo.nodes.*;
import com.yourname.morvo.state.MORVOState;
import dev.langchain4j.langgraph.Graph;
import dev.langchain4j.langgraph.GraphBuilder;

public class MorvoGraphBuilder {
    public static Graph<MORVOState> buildGraph() {

        return GraphBuilder.<MORVOState>builder()
            .addNode("onboarding", new OnboardingNode())
            .addNode("llm", new LLMNode())
            .addNode("perplexity", new PerplexityToolNode())
            .addNode("final", new FinalNode())

            .addEdge("onboarding", "llm")
            .addEdge("llm", "perplexity")
            .addEdge("perplexity", "final")

            .buildWithEntryPoint("onboarding");
    }
} 