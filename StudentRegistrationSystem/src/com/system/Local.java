package com.system;

import com.bean.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Local {

    public static final String[] nms = {"Hamid","NM2","NM3"};
    public static final String[] snms = {"Sultanzadeh","SNM2","SNM3"};
    public static final String[] usn = {"mm1","mm2","mm3"};
    public static final String[] pass = {"mm1","mm2","mm3"};

    public static List<Student> students = new ArrayList<>();

    public static String getString(String title){
        System.out.print(title + " : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static Integer getInteger(String title){
        System.out.print(title + " : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
