package oopd3;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        // System.out.print("Enter an integer: ");
        // int number = sc.nextInt();

       
        // if (PalindromeChecker.isPalindrome(number)) {
        //     System.out.println(number + " is a palindrome.");
        // } else {
        //     System.out.println(number + " is not a palindrome.");
        // }
        String str = scanner.nextLine();

        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
        newStr = newStr + str.charAt(i);
        }

        System.out.println("Input string => " + str);
        System.out.println("Reversed string => " + newStr);
       
        scanner.close();


       
    }
}

