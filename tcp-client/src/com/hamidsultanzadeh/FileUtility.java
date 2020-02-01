package com.hamidsultanzadeh;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtility {

    public static void write(byte[] data,String fileName) throws Exception{
        Path filePath = Paths.get(fileName);
        Files.write(filePath, data);
    }

    public static byte[] read(String fileName) throws Exception{
        Path filePath = Paths.get(fileName);
        return Files.readAllBytes(filePath);
    }
}
