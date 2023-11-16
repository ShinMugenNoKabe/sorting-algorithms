package algorithms;

import main.Main;

/**
 * O(n^2)
 */
public class BubbleSort {
 
    public static void bubbleSort(int[] numbers) {
        // Continue looping through the array until something no swaps are made
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                // Swap the current element with the next element if it is greater than
                // the next element
                if (numbers[i] > numbers[i + 1]) {
                    Main.swap(numbers, i, i + 1);
                    swappedSomething = true;
                }
            }
        }
    }

}
