package ru.inno.course.oop.notification;

import ru.inno.course.oop.User;

public class EmailNotifier implements Notifier{
    @Override
    public void notifyUser(User user, String text) {
        String email = user.getEmail();
        System.out.println("Уведомляем пользователя " + user.getName() + " по " + email +": " + text);
    }

    @Override
    public int getStatus() {
        return 0;
    }
}
