package ru.inno.course.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Dates {

    public static void main(String[] args) {

        String asAString = "2023-05-29"; // "2023-05-30"
        int i = Integer.parseInt(asAString.substring(8)) + 3;
        System.out.println(i); // 32

        LocalDate date = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2023, 5, 28);
        LocalDate tomorrow = LocalDate.parse("2023-05-30");

        System.out.println(date.isAfter(tomorrow));
        System.out.println(yesterday);
        System.out.println(tomorrow);
        System.out.println(date.minusMonths(2));

        LocalTime time = LocalTime.now();
        System.out.println(time.minusHours(4));
        System.out.println(time.plusSeconds(4));
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());

        // продолжительность между двумя точками
        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        System.out.println(duration.toDays());

        // dd - days
        // MM - months
        // yyyy - years
        // HH - hours
        // mm - minutes
        // ss - seconds
        // SSSSSS - nano
    }
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MM . | yy | HH____mm");
//
//        System.out.println(formatter.format(dateTime));
//
//
//        System.out.println(LocalDateTime.now().ofEpochSecond(90000000, 0, ZoneOffset.MAX));
//
//    }


}
