package oopd4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList operations
        List<Integer> arrayList = new ArrayList<>();

        System.out.print("Enter the number of elements to add to the ArrayList: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter " + numElements + " elements:");
        
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            arrayList.add(element);
        }

        System.out.println("ArrayList size: " + arrayList.size());

        System.out.print("Enter the index of the element to remove: ");
        int indexToRemove = scanner.nextInt();
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            arrayList.remove(indexToRemove);
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("Invalid index. Element not removed.");
        }

        System.out.println("ArrayList elements:");
        for (int element : arrayList) {
            System.out.println(element);
        }

        scanner.close();
    }
}    
