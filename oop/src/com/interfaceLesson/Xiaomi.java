package com.interfaceLesson;

public class Xiaomi extends Phone {

    public String model = "A2";

    @Override
    public void start() {
        System.out.println("Xiaomi started");
    }

    @Override
    public void stop() {
        System.out.println("Xiaomi stopped");
    }
}
