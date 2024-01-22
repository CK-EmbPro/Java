package org.example;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String lastName;
    private String firstName;
    private String position;
    private Integer age;
    private Integer salary;

    public Employee(String lastName, String firstName,String position, Integer age, Integer salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    // Implement Comparable interface based on the last name
    @Override
    public int compareTo(Employee other) {
        if(this.lastName.compareTo(other.lastName) !=0)
            return this.lastName.compareTo(other.lastName);

        if(this.firstName.compareTo(other.firstName)!=0)
            return this.firstName.compareTo(other.firstName);


        return this.position.compareTo(other.position);
    }

    // Override equals and hashCode to ensure uniqueness in TreeSet
    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;

        return this.lastName.equals(emp.lastName) && this.firstName.equals(emp.firstName) && this.position.equals(emp.position) && this.age.equals(emp.age) && this.salary.equals(emp.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
