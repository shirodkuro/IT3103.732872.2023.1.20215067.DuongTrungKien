// Exercises: 6.6 AddMatrix.java

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();

        System.out.print("Enter number columns: ");
        int column = scanner.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] addMatrix = new int[row][column];

        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = scanner.nextInt();
                addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the two matrices: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(addMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}