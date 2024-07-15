package oopd4;

import java.util.Scanner;

public class Sortings {

// Bubble Sort =>
// Start with an unsorted array of elements.
// Iterate through the array from the first element to the second-to-last element using the outer loop.
// Within the outer loop, iterate through the array from the first element to the (n - i - 1) element using the inner loop. Here, 'n' represents the length of the array and 'i' represents the current iteration of the outer loop.
// Compare each pair of adjacent elements in the inner loop.
// If the elements are in the wrong order (the current element is greater than the next element), swap them.
// Repeat steps 3-5 until the inner loop completes.
// Repeat steps 2-6 until the outer loop completes.
// The array is now sorted in ascending order.


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

//Selection Sort =>
// The selectionSort method takes an array of integers (arr) as input and performs the selection sort algorithm on it.

// It starts by initializing a variable n with the length of the array, which represents the number of elements in the array.

// The outer loop runs from i = 0 to n - 1. This loop selects the current minimum element and places it in the correct position.

// Inside the outer loop, we initialize a variable minIndex with the value of i. This variable keeps track of the index of the minimum element found so far.

// The inner loop runs from j = i + 1 to n. It compares each element in the unsorted part of the array with the current minimum element (arr[minIndex]). If a smaller element is found, we update minIndex to the index of that element.

// After the inner loop finishes, we have found the minimum element in the unsorted part of the array. We then swap this minimum element with the element at index i, effectively placing it in the correct position in the sorted part of the array.

// This swapping is done using a temporary variable temp. We store the value of arr[i] in temp, assign the value of arr[minIndex] to arr[i], and finally assign the value of temp to arr[minIndex].

// The outer loop continues until all elements are sorted, and the array is sorted in ascending order.
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Merge Sort =>
    // The mergeSort method takes an array of integers (arr), the left index (left), and the right index (right) as input and performs the merge sort algorithm on the specified range of the array.

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        bubbleSort(arr);
        System.out.println("Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(arr);
        System.out.println("Selection Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Merge Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
