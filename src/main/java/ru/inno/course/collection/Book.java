package ru.inno.course.collection;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private String title;
    private String[] authors;
    private String ISBN;
    private String genre;
    private int price;

    private int pageCount;

    public Book(String title, String[] authors, String ISBN, String genre, int price, int pageCount) {
        this.title = title;
        this.authors = authors;
        this.ISBN = ISBN;
        this.genre = genre;
        this.price = price;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String[] getAuthor() {
        return authors;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.hashCode() != o.hashCode()) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && pageCount == book.pageCount && Objects.equals(title, book.title) && Arrays.equals(authors, book.authors) && Objects.equals(ISBN, book.ISBN) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, ISBN, genre, price, pageCount);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", ISBN='" + ISBN + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", pageCount=" + pageCount +
                '}';
    }
}
