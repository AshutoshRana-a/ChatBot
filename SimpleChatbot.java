package SimpleNlpChatbot;

import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        SimpleChatbot chatbot = new SimpleChatbot();
        chatbot.startChat();
    }

    public void startChat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I am a simple chatbot. How can I assist you today?");
        System.out.println("Type 'exit' to end the chat.");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }
            String response = getResponse(userInput);
            System.out.println("Chatbot: " + response);
        }
        scanner.close();
    }

    private String getResponse(String input) {
        // Normalize input: lowercase, trim spaces, remove punctuation
        input = input.toLowerCase().trim().replaceAll("[^a-zA-Z0-9\\s]", "");

        if (input.contains("hello") || input.contains("hi")) {
            return "Hi there! How can I help you?";
        } else if (input.contains("how are you")) {
            return "I'm just a program, but thanks for asking!";
        } else if (input.contains("name")) {
            return "I am a simple chatbot created to assist you.";
        } else if (input.contains("joke")) {
            return "Why did the scarecrow win an award? Because he was outstanding in his field!";
        } else if (input.contains("meaning of life") || input.contains("life meaning")) {
            return "The meaning of life is subjective, but many say it's 42!";
        } else if (input.contains("thank")) {
            return "You're welcome!";
        } else {
            return "I'm sorry, I don't quite understand that. Can you try asking differently?";
        }
    }
}
