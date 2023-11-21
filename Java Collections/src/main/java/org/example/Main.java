package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("cyiza");
        names.add("cyiza");
        names.add(new Date());
        names.add(19);

        String fName = (String) names.get(0);
        String lname = (String) names.get(1);
        Date today = (Date) names.get(2);
        Integer num = (Integer) names.get(3);
        System.out.println(fName);
        System.out.println(lname);
        System.out.println(today);
        System.out.println(num);

//        for (Object o : names) {
//            System.out.println(o);
//        }


        }
    }
