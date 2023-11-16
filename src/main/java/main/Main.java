package main;

import java.util.Arrays;
import java.util.Random;

import algorithms.BogoSort;
import algorithms.BozoSort;
import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100_000);
        }

        System.out.println("Before:");
        printArray(numbers);

        long startTime = System.currentTimeMillis();

        BogoSort.bogoSort(numbers);

        long endTime = System.currentTimeMillis();

        System.out.println("After:");
        printArray(numbers);

        long processTimeInMilliseconds = (endTime - startTime);
        long processTimeInSeconds = processTimeInMilliseconds / 1_000;

        System.out.println("Sorting took " + processTimeInMilliseconds + " milliseconds (" + processTimeInSeconds + " seconds)");
    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        // System.out.println();
    }

    public static void swap(int[] numbers, int index1, int index2) {
        if (index1 == index2) {
            return;
        }

        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    public static void shuffleArray(int[] numbers) {
        Random random = new Random();
        
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = random.nextInt(i + 1);
            swap(numbers, i, randomIndex);
        }
    }

    public static boolean isArraySorted(int[] numbers) {
        if (numbers == null) {
            return true;
        }

        int length = numbers.length;

        if (length <= 1) {
            return true;
        }

        for (int i = 0; i < length - 1; i++) {
            int num = numbers[i];
            int nextNum = numbers[i + 1];

            if (num > nextNum) {
                return false;
            }
        }

        return true;
    }

}