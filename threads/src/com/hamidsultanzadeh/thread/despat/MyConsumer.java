package com.hamidsultanzadeh.thread.despat;

public class MyConsumer implements Runnable {
    @Override
    public void run() {
        while(true){
            int lastIndex = Base.list.size()-1;
            if(lastIndex > -1){
                String s = Base.list.remove(lastIndex);
                System.out.println("lastindex : " + lastIndex + " value " + s);
            }
        }
    }
}
