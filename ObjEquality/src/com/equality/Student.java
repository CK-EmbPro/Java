/**
 * rw.ac.rca.collections The group of classes on collections
 */
package com.equality;

import java.util.Objects;

/**
 * The stduent class with compareTo method to facilitate sorting, hashCode, equals overriden from the Object
 * The student has detailed information about names and identification
 * @author ckdebman2
 */

public class Student{

    /**
     * Code unique code for student
     */

    private Integer  code;

    /**
     * Firstname Religious name
     */
    private String firstname;
    /**
     * Email of the student
     */
    private String email;

    /**
     * Default constructor
     */

    public  Student(){
        super();
    }

    /**
     * @param code Code for the studnet
     * @param firstname Religious name for the student
     * @param email Email associated with Student
     * Parameterised constructor for the Student class
     */
    public Student(int code, String firstname, String email) {
        super();
        this.code = code;
        this.firstname = firstname;
        this.email = email;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "com.equality.Student{" +
                "code=" + code +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

//    Without including the getters and setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(code, student.code) && Objects.equals(firstname, student.firstname) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, firstname, email);
    }

//Without including the subclasses

//    public boolean equals(Object obj){
//        Student student = (Student) obj;
//
//        return this.code.equals(student.code);
//    }

//    public int hashCode(){
//        return this.code.hashCode()+this.firstname.hashCode()+this.email.hashCode();
//    }

//    @Override
//    public int compareTo(Object o) {
//        Student st = (Student) o;
//        if(this.code.compareTo(st.code)!=0)
//            return this.code.compareTo(st.code);
//        if(this.firstname.compareTo(st.firstname)!=0)
//            return this.firstname.compareTo(st.firstname);
//        return this.email.compareTo(st.email);
//    }
}
