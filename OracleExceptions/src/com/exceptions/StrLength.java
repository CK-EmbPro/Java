package com.exceptions;

public class StrLength {
    public static void main(String args[]){
        String s = null;
//        System.out.println("The length is "+s.length());
        try {
            System.out.println("The length is "+s.length());
        }catch(NullPointerException e){
//            System.out.println(e);
            e.printStackTrace();
        }

    }

}
