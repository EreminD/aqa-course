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

        // 1. Задание со *
        // String cardNumber = "1234 5678 9012 3456"; -> "**** **** **** 3456"

        // 1. Создать класс Flat(квартира)
        // 2. Перечислить поля класса
        // 3. Создайте класс MyProgram + psvm
        // 4. Создать объек типа Квартира. Указать значение полей

        // 1. Создать класс Item (товар интернет-магазина)
        // 2. Добавить в констрктор обязательные параметры:
            // - название
            // - артикул
            // - цена
            // - количество.
        // 3. В классе MyProgram создать объект типа Товар (5 товаров)
        // 4. Вывести в консоль инфо по каждому товару в формате "Арткул - Название - цена - количество - [Цвет]"



    }
}
