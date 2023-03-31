//Suppose you have a map of strings to integers map and you want to sort it in descending order
// by value. Write a code snippet using the Collections class that sorts the map.
package com.knoldus.task14;

import java.util.*;
import java.util.Map.Entry;
public class SortedIntegerMap{
    public static void getEntries(HashMap<String, Integer> wordsCountMap){
        Scanner scanner = new Scanner(System.in);
        Character exit = 'n';
        while((exit == 'n') || (exit == 'N')){
            System.out.println("Enter words and their count (in the next line): ");
            wordsCountMap.put(scanner.next(), scanner.nextInt());
            System.out.println("Exit(y or n)?");
            exit = scanner.next().charAt(0);
        }
        scanner.close();
    }
    public static void main(String[] args) {

        // Suppose we have a map of strings to integers called unsortedMap
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        getEntries(unsortedMap);

        // Create a list from the entries of the unsorted map
        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortedMap.entrySet());

        // Sort the list by value in descending order
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Create a new LinkedHashMap to hold the sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();

        // Add the sorted entries to the LinkedHashMap
        for (Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);

    }

}




