//Suppose you have a list of names and corresponding ages. You want to create a HashMap
// where the name is the key and the age is the value.
// Write code to create the HashMap and add the following entries to it:
package com.knoldus.task1;

//user-defined package
import com.knoldus.map_helper.MapUtils;

import java.util.HashMap;
import java.util.Map;

public class NameAgeMap {
    public static void main(String[] args) {
        Map<String, Integer> nameAgeMap = new HashMap<>();

        System.out.println("Fill Hashmap of student name and age ->");
        //user-defined class which provides utilities functions for hash map
        new MapUtils<String, Integer>().fillMap(nameAgeMap);
        System.out.println(nameAgeMap);
    }
}
