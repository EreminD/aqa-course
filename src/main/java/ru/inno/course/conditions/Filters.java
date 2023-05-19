package ru.inno.course.conditions;

public class Filters {

    public static void main(String[] args) {

        Movie[] movies = new Movie[50];
        // сгенеритьь тестовые данные
        for (int i = 0; i < 50; i++) {
            movies[i] = new Movie("Фильм_" + i, 1965 + i, i % 3 == 0);
        }

        // Задача: ввести на экран только фильмы с оскаром. hasOscar == true
        for (Movie movie : movies) {
            if (movie.hasOscar) {
                System.out.println(movie.title);
            }
        }
    }
}
