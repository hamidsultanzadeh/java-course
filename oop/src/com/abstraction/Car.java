package com.abstraction;

public abstract class Car {

    public abstract void start();

    public abstract void stop();

    public void startAndStop(){
        start();
        stop();
    }
}
