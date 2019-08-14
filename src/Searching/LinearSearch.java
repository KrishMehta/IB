package Searching;

/**
 * Class created by Krish
 */

public class LinearSearch {

    // Time complexity: O(n)

    public static
    int linearSearch(Object[] objects, Object target) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Object[] objects = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(linearSearch(objects, 9));
    }

}
