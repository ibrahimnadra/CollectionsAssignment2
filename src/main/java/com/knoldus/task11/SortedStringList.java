//Suppose you have a list of strings list and you want to sort it in ascending order.
// Write a code snippet using the Collections class that sorts the list.
package com.knoldus.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedStringList {
    public static void fillList(ArrayList<String> stringList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of strings : ");
        Integer count = scanner.nextInt();
        System.out.println("Enter the strings : ");
        while(count != 0){
            stringList.add(scanner.next());
            --count;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        fillList(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);
    }
}
