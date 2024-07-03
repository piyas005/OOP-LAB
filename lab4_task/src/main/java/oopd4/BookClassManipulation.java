package oopd4;

import java.util.Scanner;

public class BookClassManipulation {
    static class Book {
        private String title;
        private String author;
        private int year;
        private String genre;

        public Book(String title, String author, int year, String genre) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.genre = genre;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Genre: ");
            String genre = scanner.nextLine();

            books[i] = new Book(title, author, year, genre);
        }

        System.out.println("Books:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Year: " + books[i].getYear());
            System.out.println("Genre: " + books[i].getGenre());
        }

        System.out.print("Enter the index of the book to remove: ");
        int indexToRemove = scanner.nextInt();
        scanner.nextLine(); 

        if (indexToRemove >= 0 && indexToRemove < 3) {
            for (int i = indexToRemove; i < 2; i++) {
                books[i] = books[i + 1];
            }
            books[2] = null;

            System.out.println("Books after removing Book " + (indexToRemove + 1) + ":");
            for (int i = 0; i < 3; i++) {
                if (books[i] != null) {
                    System.out.println("Book " + (i + 1) + ":");
                    System.out.println("Title: " + books[i].getTitle());
                    System.out.println("Author: " + books[i].getAuthor());
                    System.out.println("Year: " + books[i].getYear());
                    System.out.println("Genre: " + books[i].getGenre());
                }
            }
        } else {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}

