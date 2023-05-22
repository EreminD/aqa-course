package ru.inno.course.arrays;

import java.sql.SQLOutput;

public class ArrayGames {

    public static void main(String[] args) {
//        // Базовые типы. Вспоминаем
//        String name = "Dima";
//        int number = 0;
//        // перезаписали переменную
//        number = 10;
//
//        // массивы.
//        // 1. указывается тип данных в массиве int[]
//        // 2. Указывается размер массива new int[10]
//        int[] numbers = new int[10];
//
//        // Как объявить массив строк
//        String[] students = new String[8];
//
//        // 3. Индексация идет от 0 до [размер-1]
//        students[0] = "Алена";
//        students[1] = "Андрей Федоров";
//        students[2] = "Гульжан Худайбергенова";
//        students[3] = "Евгения Ремхе";
//        students[4] = "Иван Дудоров";
//        students[5] = "Светлана";
//        students[6] = "Сергей Есин";
//        students[7] = "Ярослав Андропов";
//        System.out.println(students[7]);
//
//        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};
//        System.out.println(letters[7]);
//
//        int[] points = {5, 4, 3, 5, 4, 3, 5, 5, 5, 4, 3, 5, 5, 3};
//        System.out.println(points[10]);
//
//        // Можно создавать массивы со своим типом данных
//        Student[] group = new Student[3];
//        group[0] = new Student("Alex", "312", 21, "male", "History", true);
//        group[1] = new Student("Mary", "312", 20, "female", "History", true);
//        group[2] = new Student("Greg", "312", 22, "male", "History", false);
//        // ===== Аналогично
//        Student alex = new Student("Alex", "312", 21, "male", "History", true);
//        group[0] = alex;
//        Student mary = new Student("Mary", "312", 20, "female", "History", true);
//        group[1] = mary;
//        Student greg = new Student("Greg", "312", 22, "male", "History", false);
//        group[2] = greg;
//
//        System.out.println(mary.name);
//        // ===== Аналогично
//        System.out.println(group[1].name);
//
//        Student Alex = group[0];
//        Alex.hobbies = new String[3];
//        Alex.hobbies[0] = "football";
//        Alex.hobbies[1] = "fishing";
//        Alex.hobbies[2] = "poker";
////        Alex.hobbies = new String[] {"football", "fishing", "poker"};
//
//        // можно узнать размер списка - length
//        System.out.println(group.length);
//        System.out.println(group[0].hobbies.length);
//
//        // массив массивов (табличка)
//        int[][] matrix = new int[3][4];
//        matrix[1][2] = 4;
//        //        | | | | |
//        //        | | |4| |
//        //        | | | | |
//
//        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8}, {9, 10, 11, 12}};
//        // 1, 2, 3
//        // 4, 5, 6
//        // 7, 8
//        // 9, 10, 11, 12
//        System.out.println(matrix2[3][3]);
//
//        // и дальше
//        int[][][] cube = new int[3][3][3];
//
//        // Задача про массив книг
//        String[] books = {"Три мушкетера", "Капитанская дочка", "Java для начинающих"};
//        System.out.println(books[2]);
//
//        String[] favoriteBooks = new String[3];
//        favoriteBooks[0] = "Три мушкетера";
//        favoriteBooks[1] = "Капитанская дочка";
//        favoriteBooks[2] = "Java для начинающих";
//        System.out.println(favoriteBooks[1]);

        // Задача про гараж
        Car car1 = new Car("red", "Opel", "Zarina", 120, "A111AA177");
        Car car2 = new Car("black", "BMW", "X1", 150, "A112BC122");
        Car car3 = new Car("white", "Fiat", "500", 101, "X324AA145");
        Car car4 = new Car("yellow", "Mazda", "MX-5", 131, "M456BC145");
        Car car5 = new Car("green", "камаз", "1", 10000, "P234ET02");

        Car[] garage = new Car[5];
        Car[] garage1 = {car1, car2, car3, car4, car5};
        Car[] garage2 = new Car[5];
        garage2[0] = car1;


        int i = car1.getHp();
        System.out.println("i = " + i);

        car1.boost(200);


        i = car1.getHp();


    }
}
