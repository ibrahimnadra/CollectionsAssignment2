package com.knoldus.map_helper;

import java.util.Map;
import java.util.Scanner;

public class MapUtils<T, U>{

    //method to insert the entries into the map
    public void fillMap(Map<T, U> hashMap){
        Scanner scanner = new Scanner(System.in);
        Character exit = 'n';
        while((exit == 'n') || (exit == 'N')){
            System.out.println("Enter key and value(in the next line): ");
            hashMap.put((T)scanner.next(), (U)scanner.next());
            System.out.println("Exit(y or n)?");
            exit = scanner.next().charAt(0);
        }
        scanner.close();
    }

}
