package com.hamidsultanzadeh;

public class MyArrays {


    public static String toString(int arr[]) {
        String s="{";
        for(int i = 0 ; i < arr.length ; i++){
            s+=arr[i];
            if(i<arr.length-1){
                s+=",";
            }
        }
        s+="} (c) Hamid Sultanzadeh";
        return s;
    }
}
