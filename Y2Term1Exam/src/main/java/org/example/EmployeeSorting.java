package org.example;

import java.util.*;



public class EmployeeSorting {
    public static void main(String[] args) {
        // Sample data
        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee("Mugisha", "Mike","Software Engineer", 20, 3000));
        employees.add(new Employee("Mugisha", "Marc","Database Administrator", 18, 2000));
        employees.add(new Employee("Mugisha", "Mike","Software Engineer", 20, 3000));
        employees.add(new Employee("Mugisha", "Moses","Software Developer", 20, 3000));
        employees.add(new Employee("Iradukunda", "Sandra","Database Administrator", 20, 3000));
        employees.add(new Employee("Iradukunda", "Gael","Software Engineer", 20, 3000));
        // Duplicate lastName

        // Display unsorted employees


        // Sorting using TreeSet (automatically sorted due to Comparable implementation)
        // TreeSet also ensures uniqueness based on lastName
        Set<Employee> sortedEmployees = new TreeSet<>(employees);


        // Display sorted employees
        System.out.println("\nSorted Employees:");
        for (Employee employee : sortedEmployees) {
            System.out.println(employee);
        }
    }
}
