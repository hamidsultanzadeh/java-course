package com.bean;

public class Mercedes extends Car {

    @Override
    public void start() {
        System.out.println("mercedes started");
    }

    @Override
    public void stop() {
        System.out.println("mercedes stopped");
    }
}
