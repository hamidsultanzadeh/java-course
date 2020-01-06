package com.system;

import com.bean.Student;


import static com.system.Local.*;

public class OperationsUtils {

    public static void select() {

        int op = 0;

        while (op != 6) {
            op = getInteger("Select");

            switch (op) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    listStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Wrong operation, try again!");
                    break;
            }
            System.out.println("********************");
        }
        System.out.println("System exit...");
    }

    private static void registerStudent() {
        String name = getString("Name");
        String surname = getString("Surname");
        Integer age = getInteger("Age");
        Student student = new Student(name, surname, age);
        students.add(student);
        System.out.println("New student : "+student);
    }


    private static void editStudent() {

        Integer id = utility();

        if(id != null){
            if(id == -1) return ;
            System.out.println("Found");
            String newName = getString("New name");
            String newSurname = getString("New surname");
            Integer newAge = getInteger("New age");
            Student student = new Student(newName,newSurname,newAge);
            students.set(id,student);
            System.out.println("Edited student : " + student);
        } else {
            System.out.println("Not found");
        }

    }

    private static Integer searchUtil(String name, String surname, Integer age) {
        System.out.println("Searching...");
        for(int i = 0 ; i < students.size() ; i++){
            if(name.equals(students.get(i).getName()) && surname.equals(students.get(i).getSurname()) && age.equals(students.get(i).getAge())){
                return i;
            }
        }
        return null;
    }

    private static void listStudent() {
        if(ListIsEmpty()){
            System.out.println("There are not students");
            return;
        }
        for (Student s : students){
            System.out.println(s);
        }
    }

    private static void removeStudent() {

        Integer id = utility();

        if(id != null){
            if(id == -1) return ;
            System.out.println("Found");

            students.remove(id.intValue());
            System.out.println("Removed");
        } else {
            System.out.println("Not found");
        }
    }

    private static void search() {
        String name = getString("Name");
        String surname = getString("Surname");
        Integer age = getInteger("Age");

        Integer id = searchUtil(name,surname, age);
        if(id!=null){
            Student student = students.get(id);
            System.out.println("Search done : "+student);
        } else {
            System.out.println("Not found");
        }
    }

    private static Integer utility(){
        if(ListIsEmpty()) {
            System.out.println("There are not students");
            return -1;
        }
        String name = getString("Name");
        String surname = getString("Surname");
        Integer age = getInteger("Age");

        return searchUtil(name,surname,age);
    }

    private static boolean ListIsEmpty(){
        return students.isEmpty();
    }



}
