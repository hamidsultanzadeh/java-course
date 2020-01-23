package com.hamidsultanzadeh.proxy_pattern.other;

public class ProxyConnector implements Connector {

    private HeavyConnector heavyConnector;

    public ProxyConnector() {

    }

    @Override
    public void connect() {
        if(heavyConnector == null){
            heavyConnector = new HeavyConnector();
        }
        heavyConnector.connect();
    }
}
