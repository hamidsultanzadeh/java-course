package com.interfaceLesson;

public class Main {

    public static void main(String[] args) {
        Car car = new BMW();
        Phone phone = new Xiaomi();

        car.start();
        car.stop();

        phone.start();
        phone.stop();

        Xiaomi xiaomi = new Xiaomi();
        System.out.println(xiaomi.model);

        xiaomi.start();
        xiaomi.stop();

        Startable[] startables = {new BMW(),new Xiaomi()};
    }
}
