package com.hamidsultanzadeh;

import com.hamidsultanzadeh.thread.MyThread;

public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();

        myThread.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();


    }
}
