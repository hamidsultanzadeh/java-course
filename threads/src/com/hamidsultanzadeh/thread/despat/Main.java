package com.hamidsultanzadeh.thread.despat;

public class Main {

    public static void main(String[] args) {

        Thread my1 = new Thread(new MyProducer());
        Thread my2 = new Thread(new MyProducer());

        Thread my01 = new Thread(new MyConsumer());
        Thread my02 = new Thread(new MyConsumer());
        Thread my03 = new Thread(new MyConsumer());

        my1.start();my2.start();
        my01.start();my02.start();my03.start();

    }
}
