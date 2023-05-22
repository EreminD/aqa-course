package ru.inno.course.oop;

public class CardTest {

    public static void main(String[] args) {
        Card card = new Card("1234 5678 9012 3456", "5623");
        String number = card.getNumber();
        String unmasked = card.getNumber("5623");
        System.out.println("number = " + number);
        System.out.println("unmasked = " + unmasked);

    }
}
