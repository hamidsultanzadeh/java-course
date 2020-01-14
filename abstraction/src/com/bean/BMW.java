package com.bean;

public class BMW extends Car {


    @Override
    public void start() {
        System.out.println("bmw started");
    }

    @Override
    public void stop() {
        System.out.println("bmw stopped");
    }
}
