package com.knoldus.list_helper;

import java.util.ArrayList;
import java.util.Scanner;

public class ListUtils<T> {
    public void fillList(ArrayList<T> integerList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of integers : ");
        Integer count = scanner.nextInt();
        System.out.println("Enter the integers : ");
        while(count != 0){
            integerList.add((T)scanner.next());
            --count;
        }
        scanner.close();
    }
}
