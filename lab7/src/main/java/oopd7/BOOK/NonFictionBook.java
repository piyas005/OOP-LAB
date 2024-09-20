package oopd7.BOOK;

public class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, double price, String subject) {
        super(title, author, price);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Subject: " + subject);
    }
}
