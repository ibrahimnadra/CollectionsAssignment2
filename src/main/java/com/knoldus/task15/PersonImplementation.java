//Suppose you have a class Person with fields name and age. Write a Comparator implementation that sorts Person objects by age in ascending order.

package com.knoldus.task15;

import java.util.*;

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Comparator implementation for sorting Person objects by age
    public static Comparator<Person> ageComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    };

    @Override
    public String toString(){
        return "(" +getName() + ", " + getAge() + ")";
    }
}

public class PersonImplementation {
    public static void getPersonList(List<Person> PersonList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of Persons : ");
        Integer count = scanner.nextInt();

        while(count != 0){
            Person Person = new Person();
            System.out.println("Enter the name : ");
            Person.setName(scanner.next());
            System.out.println("Enter the age : ");
            Person.setAge(scanner.nextInt());
            PersonList.add(Person);
            --count;
        }
        scanner.close();
    }
    public static void main(String[] args) {
        // Suppose we have a list of Person objects called Persons
        List<Person> personList = new ArrayList<>();
        getPersonList(personList);

        // Sort the list by author, then by price
        Collections.sort(personList, Person.ageComparator);
        System.out.println(personList);
    }


}