package org.example;

import java.util.HashSet;
import java.util.Iterator;


public class Hashset<S> {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("name1");
        hs.add("name1");
        hs.add("name3");
        hs.add("name4");

        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
