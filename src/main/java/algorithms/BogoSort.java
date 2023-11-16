package algorithms;

import main.Main;

/**
 * O(n!)
 */
public class BogoSort {
    
    public static void bogoSort(int[] numbers) {
        // Keep shuffling the array until it is sorted
        while (!Main.isArraySorted(numbers)) {
            Main.shuffleArray(numbers);
        }
    }

}
