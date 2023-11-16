package algorithms;

import java.util.Random;

import main.Main;

/**
 * O(n log n)
 */
public class QuickSort {
    
    public static void quickSort(int[] numbers) {
        int lowIndex = 0;
        int highIndex = numbers.length - 1;

        quickSort(numbers, lowIndex, highIndex);
    }

    private static void quickSort(int[] numbers, int lowIndex, int highIndex) {
        // If the low index and high index meet,
        if (lowIndex >= highIndex) {
            return;
        }

        // Fint the pivot at random to increase the time complexity in the average case
        Random random = new Random();
        int pivotIndex = random.nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = numbers[pivotIndex];

        // Swap the pivot with the highest element
        Main.swap(numbers, pivotIndex, highIndex);

        int middlePointer = partition(numbers, lowIndex, highIndex, pivot);

        // Quick sort the left and right part of the array
        quickSort(numbers, lowIndex, middlePointer - 1);
        quickSort(numbers, middlePointer + 1, highIndex);
    }

    private static int partition(int[] numbers, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        // Loop through the array until the left and right pointer meet each other
        while (leftPointer < rightPointer) {
            // If the number at the left pointer is smaller than the pivot, move the pointer to the right
            // to find a number higher than the pivot
            while (numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // If the number at the right pointer is higher than the pivot, move the pointer to the left
            // to find a number lower than the pivot
            while (numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            // Swap the indexes of the two pointers (move the lower number to the right and the higher number to the left)
            Main.swap(numbers, leftPointer, rightPointer);
        }

        // Check if the latest element is sorted correctly
        if (numbers[leftPointer] > numbers[highIndex]) {
            Main.swap(numbers, leftPointer, highIndex);
        } else {
            leftPointer = highIndex;
        }

        return leftPointer;
    }

}
