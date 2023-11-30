package com.equality;

import java.lang.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Integer a = new Integer(123);
//        Integer b = new Integer(1237);
//
//        Integer c = a;

        Student a = new Student(1,"cyiza", "kendeb@gmail.com");
        Student b = new Student(1,"cyiza", "kendeb@gmail.com");

        Student c = a;

//        For Integer reference equality
        if(a == b){
            System.out.println("a and b reference the same object");
        }else{
            System.out.println("a and b are not reference-same ");
        }

//        For object equality enforcing the obj content

        if (a.equals(b)) {
            System.out.println("a and b have same obj content the same object");
        }else{
            System.out.println("a and b are not objectContent-same ");
        }

        System.out.println(a.equals(b));

    }
}