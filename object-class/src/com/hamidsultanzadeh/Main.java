package com.hamidsultanzadeh;

public class Main {

    public static void main(String[] args) {
	    User.test = "test text"; // static deyisen
	    User.foo2(); // static method

        System.out.println(User.test);

        User u = new User();
        u.name="Hamid";
        u.username="hamidsultanzadeh";
        u.age=123;

        System.out.println(u.toString());

        //read more : https://sultanzadehh.blogspot.com/2019/12/object-class-static-keyword-memory-java.html
    }
}
