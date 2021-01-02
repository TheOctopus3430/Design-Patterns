package com.example.callback.demo2;

public class Callback {
    public static void main(String[] args) {
        Caller mycaller = new Caller(new MyImplement());
        mycaller.call();
    }
}
