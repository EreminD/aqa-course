package ru.inno.course.collection;

public class Playground {

    public static void main(String[] args) {

        // 1. DB
        Book bookFromDb = new Book("12 стульев", new String[]{"И. Ильф", "Е. Петров"}, "124-3452214-43523", "Роман", 199, 350);

        // 2. XML
        Book bookFromXML = new Book("12 стульев",  new String[]{"И. Ильф", "Е. Петров"}, "124-3452214-43523", "Роман", 199, 350);

        // 3. Проверить, что это одна и та же книга
//        System.out.println(bookFromDb == bookFromXML); некорректное сравнение объектов

        // самый простой (не лучший) способ сравнить 2 объекта
//        System.out.println(bookFromDb.getTitle().equals(bookFromXML.getTitle()));
//        System.out.println(bookFromDb.getAuthor().equals(bookFromXML.getAuthor()));
//        System.out.println(bookFromDb.getISBN().equals(bookFromXML.getISBN()));
//        System.out.println(bookFromDb.getGenre().equals(bookFromXML.getGenre()));
//        System.out.println(bookFromDb.getPrice() == bookFromXML.getPrice());


//        bookFromDb.equals(bookFromXML) ==> bookFromDb == bookFromXML
//        System.out.println(bookFromDb.equals(bookFromXML));
//
//        System.out.println(bookFromDb.hashCode());
//        System.out.println(bookFromXML.hashCode());


        // коллизия
        Point p1 = new Point(1,4);
        Point p2 = new Point(4,1);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());


    }
}
