package ru.inno.course.oop.polymorph;

public class Circle implements HasArea {

    public int r;

    private double Pi = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    public double area(){
        return Pi * r * r;
    }
}
