package ru.inno.course.oop.notification;

import ru.inno.course.oop.User;

public class Processor {

    public static void main(String[] args) {
        String notificationType = "email";
        User usr = new User("Ivan", "r@r.ri", "+345677i675432", "@tg-testsr");

        Notifier notifier = null;

        switch (notificationType) {
            case "sms":
                notifier = new SmsNotifier();
                break;
            case "email":
                notifier = new EmailNotifier();
                break;
            case "tg":
                notifier = new TgNotifier();
                break;
            default:
                System.out.println("Nothing to do");
        }

        notifier.notifyUser(usr, "все хорошо");
        notifier.test();

    }
}
