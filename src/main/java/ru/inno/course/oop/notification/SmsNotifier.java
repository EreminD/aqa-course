package ru.inno.course.oop.notification;

import ru.inno.course.oop.User;

public class SmsNotifier implements Notifier{
    @Override
    public void notifyUser(User user, String text) {
        String phone = user.getPhone();
        System.out.println("Уведомляем пользователя " + user.getName() + " по " + phone  +": " + text);
    }

    @Override
    public int getStatus() {
        return 0;
    }
}
