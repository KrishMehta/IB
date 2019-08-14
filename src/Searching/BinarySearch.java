package Searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class created by Krish
 */

public class BinarySearch {

    // Time complexity: O(log n)

    private static int binarySearch(int[] objects, int target) {
        int lb = 0;
        int ub = objects.length - 1;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (objects[mid] == target) {
                return mid;
            } else if (target > objects[mid]) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] objects, int target, int lb, int ub) {
        if (lb >= ub) {
            return -1;
        }
        int mid = (lb + ub) / 2;
        if (objects[mid] == target) {
            return mid;
        } else if (target > objects[mid]) {
            return binarySearch(objects, target, mid + 1, ub);
        } else {
            return binarySearch(objects, target, lb, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] objects = {1, 4, 8, 7, 3, 9, 15, 13};
        List list = Arrays.asList(objects);
        Collections.sort(list);
        System.out.println(binarySearch(objects, 15));
    }

}
