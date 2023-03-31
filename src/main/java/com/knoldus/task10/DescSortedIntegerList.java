//Suppose you have a PriorityQueue of integers. Write code to sort the integers in descending
// order and store them in a new ArrayList.

package com.knoldus.task10;

import java.util.*;

public class DescSortedIntegerList {
    public static void fillQueue(PriorityQueue<Integer> numbersQueue){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of numbers : ");
        Integer count = scanner.nextInt();
        System.out.println("Enter the numbers : ");
        while(count != 0){
            numbersQueue.add(scanner.nextInt());
            --count;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> numbersQueue = new PriorityQueue<>();
        fillQueue(numbersQueue);

        ArrayList<Integer> sortedList = new ArrayList<>(numbersQueue);
        Collections.sort(sortedList);
        System.out.println(sortedList);

    }
}
