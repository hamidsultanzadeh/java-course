package com.hamidsultanzadeh;

public class User {
    public String name;
    public String username;
    public int age;

    public static String test;

    public void foo(){}

    public static void foo2(){}

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
