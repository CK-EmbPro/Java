package com.exceptions;

import java.util.Scanner;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int a=100, res;

        try {
            System.out.println("Enter the value for b");
            Scanner console = new Scanner(System.in);
            int b = console.nextInt();
            System.out.println("Enter the value for c");
            int c = console.nextInt();
            res = a/(b-c);
            System.out.println("The result is "+res);
        }

        catch(Exception e){
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        }
    }
}