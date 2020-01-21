package com.hamidsultanzadeh.singleton_pattern;

public class Connector {

    private Connector(){

    }

    private static Connector connector = null;

    public static Connector instance(){
        if(connector == null) {
            connector = new Connector();
        }
        return connector;
    }

}
