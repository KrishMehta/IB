package Sorting;

/**
 * Class created by Krish
 */

public class SelectionSort {

    // All cases: O(n²)

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 1, 3, 18, 0, 9, 6};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] a) {
        int min, minIndex;
        for (int i = 0; i < a.length; i++) {
            min = a[i];
            minIndex = i;
            // find minimum
            for (int j = i + 1; j < a.length; j++) {
                // salient feature
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            // swap
            a[minIndex] = a[i];
            a[i] = min;
        }
    }

}
