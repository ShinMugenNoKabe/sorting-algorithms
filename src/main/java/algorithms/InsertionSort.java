package algorithms;

/**
 * O(n^2)
 */
public class InsertionSort {

    public static void insertionSort(int[] numbers) {
        // The first element is already sorted
        for (int i = 1; i < numbers.length; i++) {
            int currentValue = numbers[i];

            // Walk back towards the beginning of the array
            // or until we run into a value thats greater than our current value
            int j = i - 1;

            while (j >= 0 && numbers[j] > currentValue) {
                // Shift the value to the right
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = currentValue;
        }
    }
    
}
