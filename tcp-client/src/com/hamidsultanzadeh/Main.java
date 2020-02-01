package com.hamidsultanzadeh;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main {

    public static void main(String[] args)  throws Exception{
        String url = "test.png";

        byte[] bytes = FileUtility.read(url);

        Socket socket = new Socket("localhost",1234);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();
    }
}
