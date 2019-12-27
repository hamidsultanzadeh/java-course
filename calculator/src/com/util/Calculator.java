package com.util;

import java.util.Scanner;

public class Calculator {

    public static double execute(){

        Scanner sc = new Scanner(System.in);

        System.out.print("1. :");
        double a = sc.nextDouble();
        System.out.print("2. :");
        double b = sc.nextDouble();

        System.out.print("Emeliyyati daxil edin : (1,2,3,4)");
        int op = sc.nextInt();
        double netice = 0;

        switch (op) {
            case 1:
                netice = MathUtil.topla(a, b);
                break;
            case 2:
                netice = MathUtil.chix(a, b);
                break;
            case 3:
                netice = MathUtil.vur(a, b);
                break;
            case 4:
                netice = MathUtil.bol(a, b);
                break;
            default:

        }

        return netice;
    }


}
