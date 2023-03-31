//uppose you have a class Employee with fields name, id, and salary. Write a Comparable implementation for Employee that sorts by id in ascending order.

package com.knoldus.task16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Employee implements Comparable<Employee> {

    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Implementing the compareTo() method from Comparable interface
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }
    @Override
    public String toString(){
        return "(" +getName() + ", " + getId() + ", " + getSalary() + ")";
    }
}

public class EmployeeImplementation{

    public static void getEmployeeList(List<Employee> employeeList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of Employees : ");
        Integer count = scanner.nextInt();

        while(count != 0){
            Employee employee = new Employee();
            System.out.println("Enter the name : ");
            employee.setName(scanner.next());
            System.out.println("Enter the id : ");
            employee.setId(scanner.nextInt());
            System.out.println("Enter the salary : ");
            employee.setSalary(scanner.nextDouble());
            employeeList.add(employee);
            --count;
        }
        scanner.close();
    }
    public static void main(String[] args) {
        // Suppose we have a list of Employee objects called Employees
        List<Employee> employeeList = new ArrayList<>();
        getEmployeeList(employeeList);

        // Sort the list by author, then by price
        Collections.sort(employeeList);
        System.out.println(employeeList);
    }
}
