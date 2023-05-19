package ru.inno.course.conditions;

public class ComplexCondition {

    public static void main(String[] args) {

        boolean wantToReceiveNotifications = true;
        boolean smsNotifications = true;
        boolean emailNotifications = true;

        if (wantToReceiveNotifications) {
            if (smsNotifications) {
                System.out.println("Отправляем смс-уведомление");
            } else {
                System.out.println("Отправляем email");
            }
        } else {
            System.out.println("Никак не уведомили пользователя");
        }
    }
}
