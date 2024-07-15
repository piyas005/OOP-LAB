package oopd4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pacticeproblem8 {
    public static void main(String[] args) {
        Book book1 = new Book("Title1", "Author1", 2001, "Genre1");
        Book book2 = new Book("Title2", "Author2", 2002, "Genre2");
        Book book3 = new Book("Title3", "Author3", 2003, "Genre3");

        List<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);

        System.out.println("Books in ArrayList:");
        for (Book book : bookArrayList) {
            System.out.println(book);
        }

        bookArrayList.remove(book2);

        System.out.println("\nBooks in ArrayList after removing book2:");
        for (Book book : bookArrayList) {
            System.out.println(book);
        }

        List<Book> bookLinkedList = new LinkedList<>();
        bookLinkedList.add(book1);
        bookLinkedList.add(book2);
        bookLinkedList.add(book3);

        System.out.println("\nBooks in LinkedList:");
        for (Book book : bookLinkedList) {
            System.out.println(book);
        }

        bookLinkedList.remove(book2);

        System.out.println("\nBooks in LinkedList after removing book2:");
        for (Book book : bookLinkedList) {
            System.out.println(book);
        }
    }
}

class Book {
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}
