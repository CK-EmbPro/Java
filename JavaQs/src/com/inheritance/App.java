package com.inheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String string = "2005-02-12";
        LocalDate dob = LocalDate.parse(string,
                DateTimeFormatter.ISO_DATE);
        //Person peter=new Person(12,"Mugisha","Davis",dob);
        //System.out.println(peter);
        Person p1=new Employee();
        p1.setDob(dob);
        p1.setFirstName("MUGISHA");
        p1.setLastName("Davis");
        p1.setAge(17);
        System.out.println(p1.getFirstName());
        Employee p2=new Employee();
        p2.setAge(14);
        p2.setDob(dob);
        p2.setFirstName("Mahoro");
        p2.setLastName("Dan");
        p2.setInstitution("RCA");
        p2.setSalary(120);
        p2.setPosition("Instructor");
        System.out.println(p2.getFirstName());
        System.out.println(p2.getInstitution());
        System.out.println(p2.getLastName());
        System.out.println(p2.getPosition());
        System.out.println(p2.getInstitution());

        Person emp = new Employee("RCA" , "teacher" , 20000 , "Lorie" , "Angela" , 45 ,dob);
        System.out.println(emp.toString());

    }

}
