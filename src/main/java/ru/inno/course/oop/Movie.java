package ru.inno.course.oop;

public class Movie {
    private String title;
    private double rating;

    private int counter;

    public Movie(String title) {
        this.title = title;
        rating = 0;
        counter = 0;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public int getCounter() {
        return counter;
    }

    public void rate(double rating){
        // if rating > 10
        // if rating < 10
        double newVal = this.rating + rating;
        int newCounter = this.counter+=1;
        this.rating = newVal / newCounter;
    }
}
