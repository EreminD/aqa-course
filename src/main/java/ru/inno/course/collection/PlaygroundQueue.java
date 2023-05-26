package ru.inno.course.collection;

import java.util.LinkedList;
import java.util.Queue;

public class PlaygroundQueue {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        q.add("test1");
        q.add("test2");
        q.add("test3");
        String element = q.poll();

        System.out.println(element);

                // queue - FIFO
                // stack - LIFO

    }
}
