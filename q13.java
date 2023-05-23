/*public class q13 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        // Finding the transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Displaying the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Displaying the transpose of the matrix
        System.out.println("Transpose Matrix:");
        displayMatrix(transpose);
    }

    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        try {
            File file = new File("filename.txt"); // Replace "filename.txt" with the actual file path
            Scanner scanner = new Scanner(file);

            int wordCount = 0;
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }

            System.out.println("Number of words: " + wordCount);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
