package ru.inno.course.record;

public class playground {


    public static void main(String[] args) {

        UserClass userClass = new UserClass(1, "Nick", 100);
        System.out.println(userClass);

        UserRecord userRecord1 = new UserRecord(2, "Mike", 101);
        UserRecord userRecord2 = new UserRecord(2, "Mike", 101);

        System.out.println(userRecord1 == userRecord2);
        System.out.println(userRecord1.equals(userRecord2));
        System.out.println(userRecord1);
        System.out.println(userRecord2.name());
        userRecord2.printBalance();

        UserRecord max = new UserRecord(3, "Max", 0);
        max = max.addBalance(100);
        System.out.println(max);


    }
}
