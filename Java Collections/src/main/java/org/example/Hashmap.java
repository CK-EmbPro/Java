package org.example;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "cyiza");
        hm.put(2, "kenny");
        hm.put(3, "debrice");
        hm.put(4, "ck");

        System.out.println("The value for key 1 "+hm.get(1));

        for(Map.Entry<Integer, String> e: hm.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }
    }
}
