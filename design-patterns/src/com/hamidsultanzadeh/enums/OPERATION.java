package com.hamidsultanzadeh.enums;

public enum OPERATION {
    TOPLA('+'),
    CIX('-'),
    VUR('*'),
    BOL('/');

    private char op;

    OPERATION(char op){
        this.op = op;
    }

    public double hesabla(double a, double b){
        if(op == '+'){
            return a+b;
        } else if(op == '-'){
            return a-b;
        } else if(op == '*'){
            return a*b;
        } else if(op == '/'){
            return a/b;
        }
        return -1;
    }
}
