package oopd2;

public class Book {
    private String title;
    private String author;
    private int year;
    private static String genre;
    private static int totalBooks = 0;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        totalBooks++;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    public static void setGenre(String genre) {
        Book.genre = genre;
    }

    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }
}
