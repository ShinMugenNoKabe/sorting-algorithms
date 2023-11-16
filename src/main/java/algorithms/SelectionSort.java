package algorithms;

import main.Main;

/**
 * O(n^2)
 */
public class SelectionSort {

    public static void selectionSort(int[] numbers) {
        int length = numbers.length;

        // For every element in the change, change the indexes with the
        // lowest element found in the array
        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;

            // Check the lowest number in the next elements of the array
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }

            // Swap the current index with the lowest found number index
            Main.swap(numbers, i, indexOfMin);
        }
    }
    
}
