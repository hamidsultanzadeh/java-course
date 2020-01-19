package com.interfaceLesson;

public class BMW extends Car{

    @Override
    public void start() {
        System.out.println("BMW started");
    }

    @Override
    public void stop() {
        System.out.println("BMW stopped");
    }
}
