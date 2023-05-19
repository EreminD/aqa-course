package ru.inno.course.oop;

public class MyProgram {

    public static void main(String[] args) {

        User ivan = new User("ivan@mail.ru", "Ivan", 36);
        System.out.println(ivan.name);
        System.out.println(ivan.isOnline);
        System.out.println(ivan.rating);
        System.out.println(ivan.nickname);

        User alena = new User("aleana@mail.ru", "Alena", 18);
        System.out.println(alena.name);
        System.out.println(alena.isOnline);
        System.out.println(alena.rating);

        Smartphone iphone = new Smartphone();
        iphone.brand = "Apple";
        iphone.model = "5S";
        iphone.os = "iOs";
    }
}
