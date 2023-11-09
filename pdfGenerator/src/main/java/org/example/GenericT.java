package org.example;

class Cat{
    String sound;

    public Cat(String sound){
        this.sound= sound;
    }

    public void getSound(){
        System.out.println(sound);
    }

};
public class GenericT {
    public static void main(String[] args){
        shout("John");
        shout("57");
        shout(new Cat("meow"));
    }

    private static<T> void shout(T sound){
        System.out.println(sound + "!!!!");
    }
};


