package com.exceptions;
import java.util.Objects;

public class CheckNational {

    public static void check(String country) throws NationalityExceptions {

        if(country != "Rwanda")
            throw new NationalityExceptions("You are not a Rwandan");
        else{
            System.out.println("You are a rwandan");
        }

//        if(Objects.equals(country, "Rwanda")){
//            System.out.println("You are a Rwanda");
//        }else{
//            System.out.println("You are not a Rwandan");
//        };
    };

    public static void main(String ags[]){
        try {
            check("Rwanda");
        }catch (NationalityExceptions e){
            System.out.println(e.toString());
        }finally {
            System.out.println("Thanks for applying");
        }
    };

}
