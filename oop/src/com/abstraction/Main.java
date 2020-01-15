package com.abstraction;

public class Main {

    public static void main(String[] args) {
	    Car car = new BMW();
	    car.start();

	    Car abstractCar = new Car() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
    }
}
