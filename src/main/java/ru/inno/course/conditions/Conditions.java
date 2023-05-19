package ru.inno.course.conditions;

public class Conditions {

    public static void main(String[] args) {
        System.out.println("start");

        int x = 1; // присваивание
        boolean isEqual = x == 2; // проверка на равенство

        boolean smsNotifications = true;
        boolean emailNotifications = true;

        if ( smsNotifications ) { // если true
            System.out.println("Отправляем смс-уведомление");
        }

        if (emailNotifications) {
            System.out.println("Отправляем email");
        } else {
            System.out.println("Никак не уведомили пользователя");
        }

        System.out.println("finish");
    }

}
