package com.exceptions;

import java.io.*;
public class FilesInputStrm  {
    public static void main(String args[]) throws FileNotFoundException {
        try {
            System.out.println("Below is the demo for finally");
        }finally {
            System.out.println("I execute whether the ex is found or not");
        }
    }
}
