package com.hamidsultanzadeh;

import com.hamidsultanzadeh.FileUtility;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws Exception  {
        readAsByte();
    }

    public static void readAsByte() throws Exception{

        ServerSocket serverSocket = new ServerSocket(1234);

        while(true){
            Socket connection = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(connection.getInputStream());

            byte[] arr = readMessage(dataInputStream);

            FileUtility.write(arr,"test1.png");
            System.out.println("Done");
        }
    }

    public static byte[] readMessage(DataInputStream d) throws Exception{
        int msgLen = d.readInt();//1
        //System.out.println("message length1="+msgLen);//500
        byte[] msg = new byte[msgLen];
        d.readFully(msg);
        return msg;
    }

    public static void readAsString() throws Exception{
        ServerSocket serverSocket = new ServerSocket(1234);

        while(true){
            Socket connection = serverSocket.accept();
            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String messageFromClient = bufferedReader.readLine();
            System.out.println("Message from client : " + messageFromClient);

        }
    }


}
