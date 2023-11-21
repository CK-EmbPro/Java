package org.example;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static  void  main(String[] args){
        TreeSet<String> ts = new TreeSet<String >();
        ts.add("cyiza");
        ts.add("kenny");
        ts.add("debrice");
        ts.add("debrice");

        Iterator<String> it = ts.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        }
    }
