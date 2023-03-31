//Suppose you have a list of integers list and you want to shuffle the order of the elements. Write a code snippet using the Collections class that shuffles the list.
package com.knoldus.task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffledList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // Shuffle the list using the Collections class
        Collections.shuffle(integerList);

        // Print the shuffled list
        System.out.println(integerList);
    }
}
