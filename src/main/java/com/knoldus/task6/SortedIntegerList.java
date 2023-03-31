//Suppose you have an ArrayList of integers. Write code to sort the ArrayList in ascending order
package com.knoldus.task6;

import com.knoldus.list_helper.ListUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortedIntegerList {
    public static void fillList(ArrayList<Integer> numberList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of numbers : ");
        Integer count = scanner.nextInt();
        System.out.println("Enter the numbers : ");
        while(count != 0){
            numberList.add(scanner.nextInt());
            --count;
        }
        scanner.close();
    }

    //bubble-sort
    public static void sortList(ArrayList<Integer> numberList){
        int n = numberList.size();
        for (int currentIndex = 0; currentIndex < n - 1; currentIndex++) {
            for (int comparisonIndex = 0; comparisonIndex < n - currentIndex - 1; comparisonIndex++) {
                int currentNumber = numberList.get(comparisonIndex);
                int nextNumber = numberList.get(comparisonIndex + 1);
                if (currentNumber > nextNumber) {
                    // swap currentNumber and nextNumber
                    numberList.set(comparisonIndex, nextNumber);
                    numberList.set(comparisonIndex + 1, currentNumber);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        fillList(numberList);

        //sort the list
        sortList(numberList);
        System.out.println(numberList);
    }
}
