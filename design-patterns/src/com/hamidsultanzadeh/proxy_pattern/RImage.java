package com.hamidsultanzadeh.proxy_pattern;

public class RImage implements Image {

    private String name;

    public RImage(String name) {
        this.name = name;
        loadFromServer();
    }

    @Override
    public void display() {
        System.out.println("Displayed : "+name);
    }

    private void loadFromServer(){
        System.out.println("Downloading...");
    }
}
