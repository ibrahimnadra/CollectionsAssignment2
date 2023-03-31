//Suppose you have a HashMap that maps student names to their grades. You want to find
//the average grade for all students in the HashMap. Write code to calculate the average grade.
package com.knoldus.task2;

import com.knoldus.map_helper.MapUtils;

import java.util.HashMap;
import java.util.Map;

public class AverageGrade {

    public static void main(String[] args) {
        //Entries
        Map<String, Float> studentGradeMap = new HashMap<>();

        System.out.println("Fill Hashmap of student name and grade ->");
        //user-defined class which provides utilities functions for hash map
        new MapUtils<String, Float>().fillMap(studentGradeMap);

        //Calculating average
        Float averageGrade = 0f;
        Integer numberOfStudents = 0;
        for(Map.Entry mapEntry : studentGradeMap.entrySet()){
            averageGrade += Float.valueOf(mapEntry.getValue().toString());
            numberOfStudents++;
        }
        averageGrade /= numberOfStudents;
        System.out.println("Average grade : " + averageGrade);
    }
}
