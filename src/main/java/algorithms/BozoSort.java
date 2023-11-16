package algorithms;

import java.util.Random;

import main.Main;

/**
 * O(n!)
 */
public class BozoSort {

    public static void bozoSort(int[] numbers) {
        // Keep swapping two random indexes of the array until it is sorteds
        Random random = new Random();

        while (!Main.isArraySorted(numbers)) {
            int randomIndex1 = random.nextInt(numbers.length);
            int randomIndex2 = random.nextInt(numbers.length);

            Main.swap(numbers, randomIndex1, randomIndex2);
        }
    }
    
}
