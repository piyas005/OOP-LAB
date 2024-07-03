package oopd3;

import java.util.*;

public class stringRevarse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String value = sc.nextLine();

        
        int x = value.length();
        String c = "";

        for (int i = x - 1; i >= 0; i--) {
            c = c+value.charAt(i);
        }

        System.out.println("Reversed string: " + c);
        sc.close();
        }
    }
    
 