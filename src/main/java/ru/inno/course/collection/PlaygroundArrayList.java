package ru.inno.course.collection;

import java.util.ArrayList;
import java.util.List;

public class PlaygroundArrayList {

    public static void main(String[] args) {
//        long[] nums = new long[1_000_000_000]; 8 Gb

        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings.size());



        for (String s: strings){
            System.out.println(s);
        }

        String s = strings.get(1);
        System.out.println("s = " + s);


        List<Point> points = new ArrayList<>();
        points.add( new Point(2,3));
        points.add( new Point(1,4));

        System.out.println(points.contains( new Point(1,4)));
//      points.remove(1);
//      points.remove(new Point(1,4));

        for (Point point : points) {
            System.out.println(point);
        }

        System.out.println("-====-=-=-=-=-");

        points.add(1, new Point(6,7));
        for (Point point : points) {
            System.out.println(point);
        }


    }
}
