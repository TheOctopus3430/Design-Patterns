package com.example.dp.behavioral.strategy.example2;

public class Client {


    public static void main(String[] args) {
        ContextFactory contextFactory = new ContextFactory("A");
        contextFactory.contextInterface();
    }
}
