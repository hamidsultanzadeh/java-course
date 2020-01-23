package com.hamidsultanzadeh.proxy_pattern;

import com.hamidsultanzadeh.proxy_pattern.other.Connector;
import com.hamidsultanzadeh.proxy_pattern.other.ProxyConnector;

public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("hamid.jpg"); // Sadece ProxyImage yaradilib
        image.display(); // RImage yaradilir.
        image.display(); // Yaradilan RImage istifade olunur.

        /*
        Image image2 = new RImage("hamid.jpg");
        image2.display();
        image2.display();
        */

        Connector connector = new ProxyConnector();
        connector.connect();

        connector.connect();
    }
}
