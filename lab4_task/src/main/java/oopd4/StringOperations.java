
package oopd4;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Length of the string: " + inputString.length());

        System.out.print("Enter a character to search in the string: ");
        char searchChar = scanner.next().charAt(0);
        int charCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                charCount++;
            }
        }
        System.out.println("Number of occurrences of the character '" + searchChar + "': " + charCount);

        System.out.print("Enter a substring to search in the string: ");
        String searchSubstring = scanner.next();
        if (inputString.contains(searchSubstring)) {
            System.out.println("Substring found in the string.");
        } else {
            System.out.println("Substring not found in the string.");
        }

        System.out.print("Enter a character to replace in the string: ");
        char replaceChar = scanner.next().charAt(0);
        System.out.print("Enter a character to replace with: ");
        char replacementChar = scanner.next().charAt(0);
        String replacedString = inputString.replace(replaceChar, replacementChar);
        System.out.println("String after replacement: " + replacedString);

        System.out.print("Enter a substring to replace in the string: ");
        String replaceSubstring = scanner.next();
        System.out.print("Enter a substring to replace with: ");
        String replacementSubstring = scanner.next();
        String replacedSubstring = inputString.replace(replaceSubstring, replacementSubstring);
        System.out.println("String after substring replacement: " + replacedSubstring);

        System.out.println("Concatenated string: " + inputString.concat(replacedSubstring));

        System.out.println("Lowercase string: " + inputString.toLowerCase());

        System.out.println("Uppercase string: " + inputString.toUpperCase());

        System.out.print("Enter another string for comparison: ");
        String comparisonString = scanner.next();
        if (inputString.equals(comparisonString)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        int comparisonResult = inputString.compareTo(comparisonString);
        if (comparisonResult == 0) {
            System.out.println("The strings are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("The first string is lexicographically smaller than the second string.");
        } else {
            System.out.println("The first string is lexicographically greater than the second string.");
        }

        scanner.close();
    }
}

