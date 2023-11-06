package com.ckDebrice;

public class Main{
    public static void main(String[] args){
//        int x = 4, y=3, n=8;
//        double doubledNum= 3.02838349439;
//        boolean isStudent = true;
//        String name = "debrice";
//        String name2 = "kenny";
//        boolean result;
//        result = name.equals(name2);
//        System.out.println(name.concat(" "+name2));
        int num2 = -16;
        String[] names = {"cyiza", "kenny", "debrice"};
        String myName = "I'm debrice";
        System.out.println("The length of myName is: "+myName.length());
        System.out.println("The length of names array is: "+ names.length);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i:cars){
            System.out.println(i);
        }
        int randomNumber = (int)(Math.random()*100);
        
        System.out.println(randomNumber);

    }

}
