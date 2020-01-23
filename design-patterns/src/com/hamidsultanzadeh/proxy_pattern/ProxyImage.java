package com.hamidsultanzadeh.proxy_pattern;

public class ProxyImage implements Image {

    private static RImage rImage = null;
    private String name;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if(rImage == null) {
            rImage = new RImage(name);
        }
        rImage.display();
    }
}
