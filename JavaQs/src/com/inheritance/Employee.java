package com.inheritance;

import java.time.LocalDate;

public class Employee  extends Person{
    private String institution;
    private String position;
    private long salary;

    //default constructor is needed bcz without it the app will run with errors
    public Employee() {

    };

    //Parameterized constructor

    public Employee(String inst , String pos , long money , String firstname , String lastname , int ageEmployee , LocalDate dobEmployee ) {
        this.institution = inst;
        this.position = pos;
        this.salary = money;
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = ageEmployee;
        this.dob = dobEmployee;
    }

    /**
     * @return the institution
     */
    public String getInstitution() {
        return institution;
    }
    /**
     * @param institution the institution to set
     */
    public void setInstitution(String institution) {
        this.institution = institution;
    }
    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }
    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }
    /**
     * @return the salary
     */
    public long getSalary() {
        return salary;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(long salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [institution=" + institution + ", position=" + position + ", salary=" + salary + ", age=" + age
                + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", getInstitution()="
                + getInstitution() + ", getPosition()=" + getPosition() + ", getSalary()=" + getSalary() + ", getAge()="
                + getAge() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getDob()="
                + getDob() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }



}