package com.equality;

public class Student {

    private int  code;
    private String firstname;
    private String email;

    public Student(int code, String firstname, String email) {
        this.code = code;
        this.firstname = firstname;
        this.email = email;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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


}
