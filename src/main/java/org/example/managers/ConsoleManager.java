package org.example.managers;


public class ConsoleManager {
    private String[] tokens;

    public String[] getTokens() {
        return tokens;
    }

    public String getToken(int i) {
        return tokens[i];
    }

    public void setTokens(String[] tokens) {
        this.tokens = tokens;
    }
}
