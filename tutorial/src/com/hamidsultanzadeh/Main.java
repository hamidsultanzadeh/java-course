package com.hamidsultanzadeh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "Hello Guys  how are you     ";
        System.out.println(s.trim());

        int[] arr = {1,2,3,4};

        System.out.println("Memory : "+arr);
        System.out.println("My Library : "+MyArrays.toString(arr));
        System.out.println("JDK : "+Arrays.toString(arr));
    }
}
