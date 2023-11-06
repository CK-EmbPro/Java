package com.exceptions;

//This is a custom exception extending the parent Exception class
public class NationalityExceptions extends Exception{
    public String message;
    public NationalityExceptions(String message) {
        super(message);
        this.message = message;
    }

    public String toString(){
        return "Customized Exception " + message;
    }
}
