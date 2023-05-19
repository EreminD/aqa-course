package ru.inno.course.conditions;

public class Notifier {

    public static void main(String[] args) {

        // sms email push telegram-bot call none post
        String notificationType = "tg";

        switch (notificationType) {
            case "sms":
                System.out.println("по смс");
                break;
            case "email":
                System.out.println("по email");
                break;
            case "push":
                System.out.println("push");
                break;
            case "tg":
                System.out.println("tg");
                break;
            case "call":
                System.out.println("manager calls");
                break;
            default:
                System.out.println("Nothing to do");
        }

        System.out.println("Finish");

    }
}


//
//        if (notificationType.equals("sms")){
//        } else {
//            if (notificationType.equals("email")){
//
//            } else {
//                if (notificationType.equals("push")){
//
//                } else {
//
//                }
//            }
//        }
