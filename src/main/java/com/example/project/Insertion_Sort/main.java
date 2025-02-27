package com.example.project.Insertion_Sort;

import java.util.Arrays;

public class main {
        public static void main(String[] args) {
        int[] arrA = {15,26,30,95,4,5,86,44,2,67,16,11,97,19,57,96,65,32,17,62,70,69,83,53,98,42,45,33,91,60,88,9,101,38,34,73,80,25,94,99};
InsertionSort.selectionSort(arrA);
System.out.println(Arrays.toString(arrA));
System.out.println();
int[] arrB = {15,26,30,95,4,5,86,44,2,67,16,11,97,19,57,96,65,32,17,62,70,69,83,53,98,42,45,33,91,60,88,9,101,38,34,73,80,25,94,99};
InsertionSort.insertionSort(arrB);
System.out.println(Arrays.toString(arrB));

    }
}
