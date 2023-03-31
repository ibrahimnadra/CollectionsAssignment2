//Suppose you have a HashSet of strings. Write code to sort the strings in descending order
// and store them in a new ArrayList.
package com.knoldus.task7;

import java.util.*;

public class DescSortedStringList {
    public static void fillSet(HashSet<String> stringSet){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of strings : ");
        Integer count = scanner.nextInt();
        System.out.println("Enter the strings : ");
        while(count != 0){
            stringSet.add(scanner.next());
            --count;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();

        //get the entries into the set
        fillSet(stringSet);

        // Sort the strings in descending order and store them in a new ArrayList
        List<String> sortedList = new ArrayList<>(stringSet);
        Collections.sort(sortedList, Collections.reverseOrder());

        // Print the sorted ArrayList to the console
        System.out.println(sortedList);
    }

}
