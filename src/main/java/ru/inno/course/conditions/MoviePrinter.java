package ru.inno.course.conditions;

public class MoviePrinter {

    public static void main(String[] args) {

        Movie movie = new Movie("Форма воды", 2016, true);
        //new Movie("Знакомьтесь, Джо Блэк", 1999, false);


        if (movie.hasOscar) {
            System.out.println("[OSCAR] " + movie.title + " (" + movie.year + ")");
        } else {
            System.out.println(movie.title + " (" + movie.year + ")");
        }

    }
}
