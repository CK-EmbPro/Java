package com.exceptions;

import java.io.File;
import java.io.IOException;

public class Ioexception {
    public static void main(String args[]) {
        try {
            File testFile = new File("//ExceptionEx1.java");
            testFile.createNewFile();
            System.out.println("Testfile exists " + testFile.exists());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
