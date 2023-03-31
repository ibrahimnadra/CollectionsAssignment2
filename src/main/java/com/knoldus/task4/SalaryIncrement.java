//Suppose you have a HashMap that maps employee names to their salaries.
// You want to give a 5% raise to all employees who earn less than $50,000 per year.
// Write code to update the salaries in the HashMap.

package com.knoldus.task4;

import com.knoldus.map_helper.MapUtils;

import java.util.HashMap;
import java.util.Map;

public class SalaryIncrement {
    public static void main(String[] args) {
        HashMap<String, Float> employeeSalaryMap = new HashMap<>();

        System.out.println("Fill Hashmap of employee name and their salary ->");
        //user-defined class which provides utilities functions for hash map
        new MapUtils<String, Float>().fillMap(employeeSalaryMap);

        //give a 5% raise to all employees who earn less than $50,000 per year.
        for(Map.Entry mapEntry : employeeSalaryMap.entrySet()){
            Double salary = Double.valueOf(mapEntry.getValue().toString());
            if(salary < 50000)
                salary += salary * 0.05;
            mapEntry.setValue(salary);
        }

        System.out.println(employeeSalaryMap);
    }
}
