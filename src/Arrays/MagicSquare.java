package Arrays;

/**
 * Class created by Krish
 */

public class MagicSquare {

    public static void main(String[] args) {
        
        int[][] magicSquare = constructMagicSquare(5);

        for (int[] row : magicSquare) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
        
    }
    
    private static int[][] constructMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];
        int number = 1;
        int row = 0;
        int column = n / 2;
        int current_row;
        int current_column;

        while (number <= Math.pow(n, 2)) {
            magicSquare[row][column] = number;
            number++;
            current_row = row;
            current_column = column;
            row--;
            column++;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = current_row + 1;
                column = current_column;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
        return magicSquare;
    }

}

