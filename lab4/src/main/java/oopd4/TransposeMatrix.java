
package oopd4;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 9 values for the matrix:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter the value of index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transposedMatrix[j][i] = array[i][j];
            }
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
