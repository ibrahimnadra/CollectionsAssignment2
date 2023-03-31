//Suppose you have a list of integers list and you want to find the maximum value in the list. Write a code snippet using the Collections class that finds the maximum value.
package com.knoldus.task12;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumValue {
    public static void fillList(ArrayList<Integer> integerList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of integers : ");
        Integer count = scanner.nextInt();
        System.out.println("Enter the integers : ");
        while(count != 0){
            integerList.add(scanner.nextInt());
            --count;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        fillList(integerList);
        Integer maximumValue = Integer.MIN_VALUE;
        for (Integer iterator: integerList){
            if(iterator > maximumValue) maximumValue = iterator;
        }
        System.out.println("Maximum value in the list : " + maximumValue);
    }
}
