
//Suppose you have a HashMap that maps stock symbols to their current prices. You want to find the stock with the highest price.
// Write code to find the stock symbol with the highest price

package com.knoldus.task3;

import com.knoldus.map_helper.MapUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestPriceStock {
    public static void main(String[] args) {
        Map<String, Float> stockPriceMap = new HashMap<>();

        System.out.println("Fill Hashmap of stock symbol and price ->");
        //user-defined class which provides utilities functions for hash map
        new MapUtils<String, Float>().fillMap(stockPriceMap);

        //Finding the stock with the highest price
        Float highestPrice = -Float.MIN_VALUE;
        String stockWithHighestPrice = "";
        for(Map.Entry mapEntry : stockPriceMap.entrySet()){
            Float stockPrice = Float.valueOf(mapEntry.getValue().toString());
            if(highestPrice < stockPrice){
                highestPrice = stockPrice;
                stockWithHighestPrice = mapEntry.getKey().toString();
            }
        }
        System.out.println("Stock with highest price : " + stockWithHighestPrice);
    }
}
