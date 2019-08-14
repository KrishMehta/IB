package Sorting;

/**
 * Class created by Krish
 */

public class BubbleSort {

    // Best: O(n)
    // Average: O(n²)
    // Worst: O(n²)

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 1, 3, 18, 0, 9, 6};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] a) {
        boolean loopMore;
        do {
            loopMore = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    // swap a[i] and a[i + 1]
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    loopMore = true;
                }
            }
        } while (loopMore);
    }

}