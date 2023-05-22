package ru.inno.course.oop.polymorph;

public class Playground {

    public static void main(String[] args) {
//        Circle circle = new Circle(4);
//        double Scircle = circle.area();
//
//        Rect rect = new Rect(4,5);
//        int Srect = rect.getArea();
//
//        System.out.println(Scircle);
//        System.out.println(Srect);

        HasArea[] shapes = new HasArea[2];
        shapes[0] = new Rect(4,5);
        shapes[1] = new Circle(3);

        for (HasArea shape : shapes) {
            System.out.println(shape.area());
        }

    }
}
