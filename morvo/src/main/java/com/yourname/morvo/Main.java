package com.yourname.morvo;

import com.yourname.morvo.graph.MorvoGraphBuilder;
import com.yourname.morvo.state.MORVOState;
import dev.langchain4j.langgraph.Graph;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Graph<MORVOState> graph = MorvoGraphBuilder.buildGraph();
        Scanner scanner = new Scanner(System.in);
        MORVOState state = new MORVOState();

        System.out.println("🚀 MORVO is starting...\n");

        while (true) {
            System.out.print("🧠 You: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            state.set("user_input", input);
            state = graph.run(state);

            System.out.println("🤖 MORVO: " + state.get("response"));
        }

        System.out.println("👋 Goodbye!");
    }
} 