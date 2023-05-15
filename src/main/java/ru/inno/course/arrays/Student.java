package ru.inno.course.arrays;

public class Student {
    String name;
    String group;
    int age;
    String gender;
    String faculty;
    boolean isActive;

    // свойства класса тоже могут быть массивами
    String[] hobbies;

    public Student(String name, String group, int age, String gender, String faculty, boolean isActive) {
        this.name = name;
        this.group = group;
        this.age = age;
        this.gender = gender;
        this.faculty = faculty;
        this.isActive = isActive;
    }
}
