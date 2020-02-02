package com.hamidsultanzadeh.thread;

import java.util.UUID;

public class MyThread extends Thread {

    @Override
    public void run(){
        for(int i = 0 ; i < 30 ; i++){
            System.out.println(i+ " " +UUID.randomUUID().toString());

        }
    }

}
