//Suppose you have a HashMap that maps words to the number of times they appear in a document.
// You want to find the top 10 most frequent words. Write code to find the top 10 most frequent words.
package com.knoldus.task5;

import java.util.*;

public class TopKFrequentWords {
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
    public static List<String> topKFrequentWords(HashMap<String, Integer> wordCountMap, int k) {
        // Initialize a priority queue with a custom comparator that orders elements based on their counts
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(k,
                new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                        return a.getValue().compareTo(b.getValue());
                    }
                }
        );

        // Iterate over the entries in the wordCountMap and add them to the priority queue
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Extract the words from the priority queue in reverse order (highest frequency first)
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(0, pq.poll().getKey());
        }
        return result;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> wordsCountMap = new HashMap<>();
        getEntries(wordsCountMap);
        List<String> freqWords = topKFrequentWords(wordsCountMap, 10);
        System.out.println(freqWords);
    }

}