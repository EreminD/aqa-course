package ru.inno.course.basics;

import ru.inno.course.arrays.Car;
import ru.inno.course.oop.User;

import java.util.Scanner;

public class Values {

    public static void main(String[] args) {
//        int x = 5;
//        int y = x;
//        x = 6;
//
//        boolean X = true;
//        boolean Y = X;
//        X = false;
//
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//
//        System.out.println("X = " + X);
//        System.out.println("Y = " + Y);
//        Car car = new Car("red", "Opel", "Zarina", 120, "A111AA177");
//
//        int x = 1000;
//
//        car.setHp(x);
//        int hp = car.getHp();
//
//        System.out.println("hp = " + hp);
//        System.out.println("x = " + x);

//        Car carX = new Car("red", "Opel", "Zarina", 120, "A111AA177");
//        Car carY = carX;
//        Car carZ = null;
//
//        carX.setBrand("Honda");
//
//        System.out.println("carY = " + carY.getBrand());

        Scanner sc = new Scanner(System.in);

//        String s1 = sc.nextLine();
//        String s2 = s1;
//        s1 = "test";
//
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);

        int[] nums1 = {10,20,30};
        int[] nums2 = nums1;
        nums1[1] = 40;

        System.out.println("nums1[1] = " + nums1[1]);
        System.out.println("nums2[1] = " + nums2[1]);




    }
}
