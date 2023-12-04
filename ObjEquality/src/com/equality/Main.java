package com.equality;

import java.lang.*;
import java.util.*;

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

        Student d = new Student(123, "ck", "ckwihaye@gmail.com");
        Student e = new Student(123, "kenny", "kenny@gmail.com");
        Student f = new Student(123, "debrice", "debrice@gmail.com");
        Student g = new Student(123, "debman", "debman@gmail.com");

        Set<Student> students = new TreeSet<Student>();
        students.add(a);
        students.add(b);
//        students.add(c);
        students.add(d);
        students.add(e);
        students.add(f);
        students.add(g);

//        Collections.sort(students);
        for(Student obj: students){
            System.out.println(obj);
        }

        HashSet<String> stus = new HashSet<>();
        stus.add("Gasabo");
        stus.add("Gasabo");
//        students.add(c);
        stus.add("Kicukiro");
        stus.add("Nyamagabe");
        stus.add("Muhanga");
        stus.add("Kamonyi");

        System.out.println("The size of arraylist is "+stus.size());
        System.out.println("The hascodes are as follows");
        System.out.println("a="+a.hashCode()+"j content");

        if (a.equals(b)) {
            System.out.println("a and b have same obj content the same object");
        }else{
            System.out.println("a and b are not objectContent-same ");
        }

        System.out.println(a.equals(b));

    }
}