package com.inheritance;

public class Student extends Person {
    private String grade;
    private String school;
    private String combination;

    //generate getters and setters

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getCombination() {
        return combination;
    }
    public void setCombination(String combination) {
        this.combination = combination;
    }
    @Override
    public String toString() {
        return "Student [grade=" + grade + ", school=" + school + ", combination=" + combination + ", age=" + age
                + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", getGrade()=" + getGrade()
                + ", getSchool()=" + getSchool() + ", getCombination()=" + getCombination() + ", getAge()=" + getAge()
                + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getDob()=" + getDob()
                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + "]";
    }


}