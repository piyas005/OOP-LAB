package oopd4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class App {
    public static void main(String[] args) {
        
        //1D Array problem
        // int[] array = new int[5];
        // Scanner scanner1 = new Scanner(System.in);

        // System.out.println("Enter 5 values:");
        // for (int i = 0; i < 5; i++) {
        //     System.out.print("Enter the value of index " + i + ": ");
        //     array[i] = scanner1.nextInt();
        // }

        // System.out.println("Array values:");
        // System.out.print("[");
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(array[i]);
        //     if (i < 4) {
        //         System.out.print(", ");
        //     }
        // }
        // System.out.println("]");

        // scanner1.close();

        //2D Array problem
        // int[][] array2 = new int[4][2];
        // Scanner scanner2 = new Scanner(System.in);
        
        // System.out.println("Enter 8 values for the 2D array:");
        // for (int i = 0; i < array2.length; i++) {
        //     for (int j = 0; j < array2[i].length; j++) {
        //         System.out.print("Enter the value of index [" + i + "][" + j + "]: ");
        //         array2[i][j] = scanner2.nextInt();
        //     }
        // }
        
        // System.out.println("2D Array values:");
        // for (int i = 0; i < array2.length; i++) {
        //     for (int j = 0; j < array2[i].length; j++) {
        //         System.out.print(array2[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        // scanner2.close();
    
    
    // problem-1: avg of array numbers
    // int[] array = new int[5];
    // Scanner scanner3 = new Scanner(System.in);

    // System.out.println("Enter 5 values:");
    // for (int i = 0; i < 5; i++) {
    //     System.out.print("Enter the value of index " + i + ": ");
    //     array[i] = scanner3.nextInt();
    // }

    // int sum = 0;
    // for (int i = 0; i < array.length; i++) {
    //     sum += array[i];
    // }

    // double average = (double) sum / array.length;
    // System.out.println("Average of the array numbers: " + average);

    // scanner3.close();
    

    // problem-2: transpose matrix 
    // int[][] array4 = new int[3][3];
    // Scanner scanner4 = new Scanner(System.in);

    // System.out.println("Enter 9 values for the matrix:");
    // for (int i = 0; i < array4.length; i++) {
    //     for (int j = 0; j < array4[i].length; j++) {
    //         System.out.print("Enter the value of index [" + i + "][" + j + "]: ");
    //         array4[i][j] = scanner4.nextInt();
    //     }
    // }

    // System.out.println("Original Matrix:");
    // for (int i = 0; i < array4.length; i++) {
    //     for (int j = 0; j < array4[i].length; j++) {
    //         System.out.print(array4[i][j] + " ");
    //     }
    //     System.out.println();
    // }

    // int[][] transposedMatrix = new int[array4[0].length][array4.length];
    // for (int i = 0; i < array4.length; i++) {
    //     for (int j = 0; j < array4[i].length; j++) {
    //         transposedMatrix[j][i] = array4[i][j];
    //     }
    // }

    // System.out.println("Transposed Matrix:");
    // for (int i = 0; i < transposedMatrix.length; i++) {
    //     for (int j = 0; j < transposedMatrix[i].length; j++) {
    //         System.out.print(transposedMatrix[i][j] + " ");
    //     }
    //     System.out.println();
    // }

    // scanner4.close();

    // problem-3:String operations
    // Scanner scanner5 = new Scanner(System.in);

    // System.out.print("Enter a string: ");
    // String inputString = scanner5.nextLine();

    // System.out.println("Length of the string: " + inputString.length());

    // System.out.print("Enter a character to search in the string: ");
    // char searchChar = scanner5.next().charAt(0);
    // int charCount = 0;
    // for (int i = 0; i < inputString.length(); i++) {
    //     if (inputString.charAt(i) == searchChar) {
    //         charCount++;
    //     }
    // }
    // System.out.println("Number of occurrences of the character '" + searchChar + "': " + charCount);

    // System.out.print("Enter a substring to search in the string: ");
    // String searchSubstring = scanner5.next();
    // if (inputString.contains(searchSubstring)) {
    //     System.out.println("Substring found in the string.");
    // } else {
    //     System.out.println("Substring not found in the string.");
    // }

    // System.out.print("Enter a character to replace in the string: ");
    // char replaceChar = scanner5.next().charAt(0);
    // System.out.print("Enter a character to replace with: ");
    // char replacementChar = scanner5.next().charAt(0);
    // String replacedString = inputString.replace(replaceChar, replacementChar);
    // System.out.println("String after replacement: " + replacedString);

    // System.out.print("Enter a substring to replace in the string: ");
    // String replaceSubstring = scanner5.next();
    // System.out.print("Enter a substring to replace with: ");
    // String replacementSubstring = scanner5.next();
    // String replacedSubstring = inputString.replace(replaceSubstring, replacementSubstring);
    // System.out.println("String after substring replacement: " + replacedSubstring);

    // System.out.println("Concatenated string: " + inputString.concat(replacedSubstring));

    // System.out.println("Lowercase string: " + inputString.toLowerCase());

    // System.out.println("Uppercase string: " + inputString.toUpperCase());

    // System.out.print("Enter another string for comparison: ");
    // String comparisonString = scanner5.next();
    // if (inputString.equals(comparisonString)) {
    //     System.out.println("The strings are equal.");
    // } else {
    //     System.out.println("The strings are not equal.");
    // }

    // int comparisonResult = inputString.compareTo(comparisonString);
    // if (comparisonResult == 0) {
    //     System.out.println("The strings are equal.");
    // } else if (comparisonResult < 0) {
    //     System.out.println("The first string is lexicographically smaller than the second string.");
    // } else {
    //     System.out.println("The first string is lexicographically greater than the second string.");
    // }

    // scanner5.close();

    // problem-4: Create a Book class with properties such as title, author, year, genre. Implement a parameterized constructor to initialize 3 objects. Store the objects in an array and then display them. Remove a particular object and then display the existing objects.

    // Scanner scanner6 = new Scanner(System.in);

    // class Book {
    //     private String title;
    //     private String author;
    //     private int year;
    //     private String genre;

    //     public Book(String title, String author, int year, String genre) {
    //         this.title = title;
    //         this.author = author;
    //         this.year = year;
    //         this.genre = genre;
    //     }

    //     public String getTitle() {
    //         return title;
    //     }

    //     public void setTitle(String title) {
    //         this.title = title;
    //     }

    //     public String getAuthor() {
    //         return author;
    //     }

    //     public void setAuthor(String author) {
    //         this.author = author;
    //     }

    //     public int getYear() {
    //         return year;
    //     }

    //     public void setYear(int year) {
    //         this.year = year;
    //     }

    //     public String getGenre() {
    //         return genre;
    //     }

    //     public void setGenre(String genre) {
    //         this.genre = genre;
    //     }
    // }

    // Book[] books = new Book[3];

    // for (int i = 0; i < 3; i++) {
    //     System.out.println("Enter details for Book " + (i + 1) + ":");
    //     System.out.print("Title: ");
    //     String title = scanner6.nextLine();
    //     System.out.print("Author: ");
    //     String author = scanner6.nextLine();
    //     System.out.print("Year: ");
    //     int year = scanner6.nextInt();
    //     scanner6.nextLine(); // Consume the newline character
    //     System.out.print("Genre: ");
    //     String genre = scanner6.nextLine();

    //     books[i] = new Book(title, author, year, genre);
    // }

    // System.out.println("Books:");
    // for (int i = 0; i < 3; i++) {
    //     System.out.println("Book " + (i + 1) + ":");
    //     System.out.println("Title: " + books[i].getTitle());
    //     System.out.println("Author: " + books[i].getAuthor());
    //     System.out.println("Year: " + books[i].getYear());
    //     System.out.println("Genre: " + books[i].getGenre());
    // }

    // System.out.print("Enter the index of the book to remove: ");
    // int indexToRemove = scanner6.nextInt();
    // scanner6.nextLine(); 

    // if (indexToRemove >= 0 && indexToRemove < 3) {
    //     for (int i = indexToRemove; i < 2; i++) {
    //         books[i] = books[i + 1];
    //     }
    //     books[2] = null;

    //     System.out.println("Books after removing Book " + (indexToRemove + 1) + ":");
    //     for (int i = 0; i < 3; i++) {
    //         if (books[i] != null) {
    //             System.out.println("Book " + (i + 1) + ":");
    //             System.out.println("Title: " + books[i].getTitle());
    //             System.out.println("Author: " + books[i].getAuthor());
    //             System.out.println("Year: " + books[i].getYear());
    //             System.out.println("Genre: " + books[i].getGenre());
    //         }
    //     }
    // } else {
    //     System.out.println("Invalid index!");
    // }

    // scanner6.close();

    //problem-5: write a program to create an arraylist and a linked list of integers. Apply various methods such as add, size, get, set, remove and sort.
   
    Scanner scanner7 = new Scanner(System.in);

    List<Integer> arrayList = new ArrayList<>();

    System.out.print("Enter the number of elements to add to the ArrayList: ");
    int numElements = scanner7.nextInt();

    System.out.println("Enter " + numElements + " elements:");
    for (int i = 0; i < numElements; i++) {
        System.out.print("Enter element " + (i + 1) + ": ");
        int element = scanner7.nextInt();
        arrayList.add(element);
    }

    System.out.println("ArrayList elements: " + arrayList);

    System.out.println("Size of the ArrayList: " + arrayList.size());

    System.out.print("Enter the index of the element to get: ");
    int getIndex = scanner7.nextInt();
    if (getIndex >= 0 && getIndex < arrayList.size()) {
        int element = arrayList.get(getIndex);
        System.out.println("Element at index " + getIndex + ": " + element);
    } else {
        System.out.println("Invalid index!");
    }

    System.out.print("Enter the index of the element to set: ");
    int setIndex = scanner7.nextInt();
    if (setIndex >= 0 && setIndex < arrayList.size()) {
        System.out.print("Enter the new value: ");
        int newValue = scanner7.nextInt();
        arrayList.set(setIndex, newValue);
        System.out.println("ArrayList after setting element at index " + setIndex + ": " + arrayList);
    } else {
        System.out.println("Invalid index!");
    }

    System.out.print("Enter the index of the element to remove: ");
    int removeIndex = scanner7.nextInt();
    if (removeIndex >= 0 && removeIndex < arrayList.size()) {
        int removedElement = arrayList.remove(removeIndex);
        System.out.println("Removed element at index " + removeIndex + ": " + removedElement);
        System.out.println("ArrayList after removing element at index " + removeIndex + ": " + arrayList);
    } else {
        System.out.println("Invalid index!");
    }

    Collections.sort(arrayList);
    System.out.println("ArrayList after sorting: " + arrayList);

    // Create a LinkedList of integers
    List<Integer> linkedList = new LinkedList<>();

    System.out.print("Enter the number of elements to add to the LinkedList: ");
    numElements = scanner7.nextInt();

    System.out.println("Enter " + numElements + " elements:");
    for (int i = 0; i < numElements; i++) {
        System.out.print("Enter element " + (i + 1) + ": ");
        int element = scanner7.nextInt();
        linkedList.add(element);
    }

    System.out.println("LinkedList elements: " + linkedList);

    System.out.println("Size of the LinkedList: " + linkedList.size());

    System.out.print("Enter the index of the element to get: ");
    getIndex = scanner7.nextInt();
    if (getIndex >= 0 && getIndex < linkedList.size()) {
        int element = linkedList.get(getIndex);
        System.out.println("Element at index " + getIndex + ": " + element);
    } else {
        System.out.println("Invalid index!");
    }

    System.out.print("Enter the index of the element to set: ");
    setIndex = scanner7.nextInt();
    if (setIndex >= 0 && setIndex < linkedList.size()) {
        System.out.print("Enter the new value: ");
        int newValue = scanner7.nextInt();
        linkedList.set(setIndex, newValue);
        System.out.println("LinkedList after setting element at index " + setIndex + ": " + linkedList);
    } else {
        System.out.println("Invalid index!");
    }

    System.out.print("Enter the index of the element to remove: ");
    removeIndex = scanner7.nextInt();
    if (removeIndex >= 0 && removeIndex < linkedList.size()) {
        int removedElement = linkedList.remove(removeIndex);
        System.out.println("Removed element at index " + removeIndex + ": " + removedElement);
        System.out.println("LinkedList after removing element at index " + removeIndex + ": " + linkedList);
    } else {
        System.out.println("Invalid index!");
    }

    Collections.sort(linkedList);
    System.out.println("LinkedList after sorting: " + linkedList);

    scanner7.close();
    }
}
