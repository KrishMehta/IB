package Recursion;

import java.util.Scanner;

/**
 * Class created by Krish
 */

public class Bowling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of rows");
        int rows = scanner.nextInt();
        System.out.println("The number of pins is " + getPins(rows));
    }

    private static int getPins(int rows) {
        if (rows == 1)
            return 1;
        else
            return rows + getPins(rows - 1);
    }

}
