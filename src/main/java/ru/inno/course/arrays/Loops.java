package ru.inno.course.arrays;

public class Loops {

    public static void main(String[] args) {

        // Напечатать имена всех студентов
        Student[] group = new Student[4];
        group[0] = new Student("Alex", "312", 21, "male", "History", true);
        group[1] = new Student("Mary", "312", 20, "female", "History", true);
        group[2] = new Student("Greg", "312", 22, "male", "History", false);
        group[3] = new Student("Kate", "312", 21, "female", "History", false);

        // для каждого std типа Student из group сделать...
        for (Student std : group){ // тело цикла
            std.age++;
            System.out.println( std.name );
            System.out.println( std.age );
        }

        System.out.println("закончили");

        //для счтчик = 0; пока счетчик меньше длины массива; каждый раз увеличивать на 1
        for (int i = 0; i < group.length; i++) { // тело цикла
            System.out.println(group[i].name);
        }

        // строка - это массив букв
        String test = "test";
        int l = test.length();
        for (int i=0; i<l; i++){
            System.out.println( test.charAt(i) );
        }

    }
}
