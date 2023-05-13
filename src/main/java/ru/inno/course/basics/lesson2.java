package ru.inno.course.basics;

public class lesson2 {

    public static void main(String[] args){
        // true | false
        boolean wantToReceiveNotifications = true;
        boolean acceptPolitics = false;

        // булева алгебра
        boolean isKnownLogin = false;
        boolean correctPassword = false;
        System.out.println( isKnownLogin && correctPassword  );

        // целые числа
        byte peopleOnWebinar = 8;
        short bytesInKilobyte = 1024;
        int russiaPopulation = 146000000;
        long worldPopulation = 8000000000L;

        // дробные числа
        float pi = 3.14f;
        double piAccur = 3.14159265359;
        System.out.println(peopleOnWebinar);


        int peopleInRoom = 1;
        System.out.println(peopleInRoom);

        char i = 'я';

        String myName = "Дима любит шоколад";
        String blank = " ";
        String empty = "";
        String zipCode = "127034";
        System.out.println(empty);
//        System.out.println(myName);

        //а чем тогда числа отличаются в переменных стринг?
        // арифметика
        int currentYear = 2023;
        int oneYear = 1;
        int oruel = 1984;

        int difference = currentYear - oruel;
        int nextYear = currentYear + oneYear;
        int divided = currentYear / 4; // *
        int r = 14 % 3; // = 4 остаток 2
        System.out.println(r);

        boolean isMoreThanFive = 5 != 5; // > | < | >= | <= | !=
        System.out.println(isMoreThanFive);





    }


}
