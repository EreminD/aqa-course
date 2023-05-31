package ru.inno.course.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

import org.threeten.extra.AmountFormats;

public class TestClass {

    public static void main(String[] args) {

        HumanReadableTimestamp service = new HumanReadableTimestampImpl();

        LocalDateTime timestamp = LocalDateTime.of(LocalDate.now(), LocalTime.now());


        String test = AmountFormats.wordBased(Duration.between(timestamp.minusHours(3).minusMinutes(12), LocalDateTime.now()), Locale.ENGLISH);
        System.out.println(test);
        for (int i = 0; i< 24; i++){
            String message = service.getTimestamp(timestamp.minusHours(i));
            System.out.println(message);
        }


    }
}
