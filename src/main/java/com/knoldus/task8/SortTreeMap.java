//Suppose you have a TreeMap that maps strings to integers. Write code to sort the entries in the
// TreeMap by their values in descending order and store them in a new LinkedHashMap.

package com.knoldus.task8;

import java.util.*;

public class SortTreeMap {
    public static void getEntries(TreeMap<String, Integer> unsortedMap){
        Scanner scanner = new Scanner(System.in);
        Character exit = 'n';
        while((exit == 'n') || (exit == 'N')){
            System.out.println("Enter a string and an integer (in the next line): ");
            unsortedMap.put(scanner.next(), scanner.nextInt());
            System.out.println("Exit(y or n)?");
            exit = scanner.next().charAt(0);
        }
        scanner.close();
    }

    public static LinkedHashMap<String, Integer> sortMap(TreeMap<String, Integer> unsortedMap){
        // Sort the entries in the TreeMap by values in descending order
        Comparator<String> valueComparator = new Comparator<String>() {
            public int compare(String firstString, String secondString) {
                return unsortedMap.get(secondString).compareTo(unsortedMap.get(firstString));
            }
        };
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        return sortedMap;
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> unsortedMap = new TreeMap<>();
        getEntries(unsortedMap);

        // Print the sorted LinkedHashMap to the console
        System.out.println(sortMap(unsortedMap));
    }
}
