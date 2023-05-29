package ru.inno.course.exceptions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class Playground {

    public static void main(String[] args) throws IOException {


        try {
            List<String> lines = Files.readAllLines(Path.of("/Users/eremin/Documents/java-projects/myFirstApp/src/main/resources/tasks/arrays.md"));
            for (String line : lines) {
                System.out.println(line);

            }

        } catch (Exception ex) {
            System.out.println("Finish");
        }


//
//        LinkedList<String> s = new LinkedList<>();
//        s.add("test");
//        s.get(10);


    }
}
