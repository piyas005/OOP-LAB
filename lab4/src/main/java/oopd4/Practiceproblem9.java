package oopd4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Practiceproblem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ...
        scanner.close();

        System.out.println("Enter details for 3 books (title, author, year, genre):");
        List<Book> booksArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter genre: ");
            String genre = scanner.nextLine();
            booksArrayList.add(new Book(title, author, year, genre));
        }

        System.out.println("\nBooks in ArrayList:");
        for (Book book : booksArrayList) {
            book.displayDetails();
        }
        Book.displayTotalBooks();

        List<Book> booksLinkedList = new LinkedList<>(booksArrayList);

        System.out.println("\nBooks in LinkedList:");
        for (Book book : booksLinkedList) {
            book.displayDetails();
        }

        System.out.println("\nEnter details for 3 students (id, name, department, cgpa, university):");
        List<Student> studentsArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter department: ");
            String department = scanner.nextLine();
            System.out.print("Enter cgpa: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter university: ");
            String university = scanner.nextLine();
            studentsArrayList.add(new Student(id, name, department, cgpa, university));
        }

        System.out.println("\nStudents in ArrayList:");
        for (Student student : studentsArrayList) {
            student.displayDetails();
        }
        Student.displayTotalStudents();

        List<Student> studentsLinkedList = new LinkedList<>(studentsArrayList);

        System.out.println("\nStudents in LinkedList:");
        for (Student student : studentsLinkedList) {
            student.displayDetails();
        }
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private static String genre;
    private static int bookCount = 0;

    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        Book.genre = genre;
        bookCount++;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year + ", Genre: " + genre);
    }

    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + bookCount);
    }
}

class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;
    private static String university;
    private static int studentCount = 0;

    public Student(int id, String name, String department, double cgpa, String university) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        Student.university = university;
        studentCount++;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", CGPA: " + cgpa + ", University: " + university);
    }

    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + studentCount);
    }
}
