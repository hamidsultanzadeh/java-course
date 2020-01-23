package com.hamidsultanzadeh.proxy_pattern.other;

public class HeavyConnector implements Connector{

    public HeavyConnector() {
        heavyConnect();
    }

    @Override
    public void connect() {
        System.out.println("Connected");
    }

    public void heavyConnect(){
        System.out.println("Heavy connecting...");
    }
}
