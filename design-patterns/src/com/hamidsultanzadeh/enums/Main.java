package com.hamidsultanzadeh.enums;

public class Main {

    public static void main(String[] args) {
        OPERATION op = OPERATION.TOPLA;
        double netice = op.hesabla(10,1);
        System.out.println(netice);

    }

}
