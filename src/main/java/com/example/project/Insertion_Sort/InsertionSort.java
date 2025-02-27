package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int i = 1; i < elements.length; i++) {
            int currentElement = elements[i];
            int j = i - 1;
            while (j >= 0 && elements[j] > currentElement) {
                count++;
                elements[j + 1] = elements[j];
                j--;
            }
            
            elements[j + 1] = currentElement;
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return elements;
        
    }
    

   
    public static void selectionSort(int[] elements) {
        int count = 0;
        for (int i = 0; i < elements.length; i++){
            int min = i;
            for (int j = i + 1; j < elements.length; j++){
                if (elements[j] < elements[min]) {
                    min = j;
                }
                count++;
            }
            int temp = elements[i];
            elements[i] = elements[min];
            elements[min] = temp;
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int counter = 0;
        for (int i = 1; i < words.size(); i++) {
            String key = words.get(i);
            int j = i - 1;
            while (j >= 0 && words.get(j).compareTo(key) > 0) {
                words.set(j + 1, words.get(j));
                j--;
                counter++;
            }
            words.set(j + 1, key);
        }
        System.out.println("INSERTION SORT: Number of loop iterations" + counter);
        return words;
    }

    

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int i = 0; i < words.size() - 1; i++) { 
            int min = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(min)) < 0) { 
                    min = j;
                }
                count++;
            }
            String temp = words.get(i); 
            words.set(i, words.get(min)); 
            words.set(min, temp); 
        }
        System.out.println("SELECTION SORT: Number of loop iterations" + count);
        return words;
    }
}