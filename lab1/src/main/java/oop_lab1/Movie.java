package oop_lab1;

public class Movie {
    private String title;
    private String genre;
    private String leadActor;
    private String director;
    private int releaseYear;
    private double rating;
    private String review;

    public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        setReview();
    }

    private void setReview() {
        if (this.rating < 5) {
            this.review = "Not Good";
        } else {
            this.review = "Good";
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
    }
}
