//Suppose you have a LinkedList of custom objects that have a "name" field of type String.
// Write code to sort the LinkedList in alphabetical order by the "name" field.
package com.knoldus.task9;

import java.util.*;

public class SortedNameList {
    public static void fillList(LinkedList<String> nameList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of names : ");
        Integer count = scanner.nextInt();
        System.out.println("Enter the names : ");
        while(count != 0){
            nameList.add(scanner.next());
            --count;
        }
        scanner.close();
    }
    public static void main(String[] args) {
        LinkedList<String> nameList = new LinkedList<>();
        fillList(nameList);
        Collections.sort(nameList);
        System.out.println(nameList);
    }
}
