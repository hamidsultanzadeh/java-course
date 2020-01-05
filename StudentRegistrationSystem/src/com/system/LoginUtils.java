package com.system;

import com.bean.Teacher;
import static com.system.Local.*;
import java.util.Scanner;


public class LoginUtils {

    public static void login(){
        while(!check()){
            System.out.println("Username or password wrong, please try again ! :(");
        }
    }

    private static boolean check(){
        System.out.print("Username : ");
        String username = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();

        int id = checkInTheSystem(username, password);
        if(id!=-1){
            showMenu(id);
            return true;
        }
        return false;
    }

    private static int checkInTheSystem(String username, String password) {
        for(int i = 0 ; i < usn.length ; i++){
            if(username.equals(usn[i]) && password.equals(pass[i])){
                return i;
            }
        }
        return -1;
    }

    private static void showMenu(int id){
        Teacher teacher = getTeacher(id);
        System.out.println("Welcome "+teacher+"!");
        System.out.println("What you want to do ?");
        System.out.println(
                "1. Register Student\n" +
                "2. Edit Student\n" +
                "3. List Student\n" +
                "4. Remove Student\n" +
                "5. Search\n" +
                "6. Exit\n");
    }

    private static Teacher getTeacher(int id){
        return new Teacher(nms[id],snms[id],usn[id],pass[id]);
    }
}
