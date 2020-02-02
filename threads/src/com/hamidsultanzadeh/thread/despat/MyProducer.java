package com.hamidsultanzadeh.thread.despat;

import java.util.UUID;

public class MyProducer implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            Base.list.add(UUID.randomUUID().toString());
        }
    }
}
