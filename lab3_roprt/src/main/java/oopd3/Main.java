package oopd3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("  ");
        System.out.println("^_^_^_^_^_^_^_^_^_^");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine();
        System.out.println("  ");

        Book[] books = new Book[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Genre: ");
            String genre = scanner.nextLine();

            System.out.println("  ");

            books[i] = new Book(title, author, year, genre);
        }

        System.out.println("\nBook Details:");
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }
        // Using a for each loop here to iterate through the objects I created,In  for each loop we first palce the type name then the name of the object and then the list of the collection(here array)

        Book.displayTotalBooks();
        
        System.out.println("  ");
        System.out.println("^_^_^_^_^_^_^_^_^_^");

        System.out.print("\nEnter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("  ");

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("University: ");
            String university = scanner.nextLine();
            System.out.println("  ");

            students[i] = new Student(id, name, department, cgpa, university);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }
        // Using a for each loop here to iterate through the objects I created,In  for each loop we first palce the type name then the name of the object and then the list of the collection(here array)
        
        Student.displayTotalStudents();

        System.out.println("  ");
        System.out.println("^_^_^_^_^_^_^_^_^_^");
        System.out.println("  "); 
        System.out.println("  ");

        scanner.close();
    }
}

