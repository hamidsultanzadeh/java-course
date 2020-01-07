package com.hamidsultanzadeh;

import com.inhertance.*;

public class Main {

    public static void main(String[] args) {
        Teacher t = new Teacher("Hamid","Sultanzadeh",32,2300.0);
        System.out.println(t.getName());

        Student s = new Student("New","Student",19);
        System.out.println(s.getName());

        checkIt(t);
        checkIt(s);

        Person p1 = new Student("hamid","hamid",213);
        Person p2 = new Teacher("hh","hh",12,23.0);

        System.out.println(p1);
        System.out.println(p2);

        /* ************** */

        Car[] cars = {new Lada(),new BMW()};
        driveAll(cars);
    }

    public static void driveAll(Car[] cars) {
        for (Car c : cars){
            c.drive();
        }
    }

    public static void checkIt(Person p){
        if(p instanceof Teacher){
            Teacher t = (Teacher) p;
            System.out.println("Teacher : "+t);
        } else if(p instanceof Student){
            Student s = (Student) p;
            System.out.println("Student : "+s);
        }
    }
}
