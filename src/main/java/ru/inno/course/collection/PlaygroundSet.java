package ru.inno.course.collection;

import java.util.HashSet;
import java.util.Set;

public class PlaygroundSet {

    public static void main(String[] args) {

        Set<Point> points = new HashSet<>();

        points.add(new Point(1,2));
        points.add(new Point(1,3));
        points.add(new Point(1,4));
        points.add(new Point(1,5));
        points.add(new Point(1,2));

        System.out.println(points.size());

        for (Point point : points) {
            System.out.println(point);
        }


    }
}
