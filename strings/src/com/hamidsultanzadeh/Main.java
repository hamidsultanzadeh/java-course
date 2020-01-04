package com.hamidsultanzadeh;

public class Main {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Java");
        s.append(" is");
        s.append(" good");

        String result = s.toString();

        System.out.println(result);

        StringBuffer s1 = new StringBuffer();

        s1.append("Java");
        s1.append(" is");
        s1.append(" good");

        String result1 = s1.toString();

        System.out.println(result1);

        // read more https://sultanzadehh.blogspot.com/2020/01/stringbuilder-and-stringbuffer.html


    }
}
