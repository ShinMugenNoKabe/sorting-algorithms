package algorithms;

/**
 * O(n log n)
 */
public class MergeSort {

    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        // If the array is already empty of has only 1 element, there is no need
        // to split if in half, it is already sorted
        if (inputLength < 2) {
            return;
        }

        // Split array in half
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        // Fill the arrays
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputArray.length; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        // Recursively merge sort every half
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge both halfs
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0; // Iterator for left half
        int j = 0; // Iterator for right half
        int k = 0; // Iterator for the merged array

        // Iterate until we run out of elements in the left size,
        // or we run out of elements in the right size
        while (i < leftSize && j < rightSize) {
            // Compare the lowest element and add it to the merged array
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }

            k++;
        }

        // Add all the numbers at the left of right array if there is any
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}
