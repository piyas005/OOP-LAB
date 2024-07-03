package oopd4;

import java.util.Scanner;

public class AverageOfArrayNumbers {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the value of index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;
        System.out.println("Average of the array numbers: " + average);

        scanner.close();
    }
}
