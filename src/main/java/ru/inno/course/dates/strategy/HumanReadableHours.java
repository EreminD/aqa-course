package ru.inno.course.dates.strategy;

import java.time.Duration;


public class HumanReadableHours implements HumanReadableUnit {

    @Override
    public String parse(Duration duration) {
        long hours = duration.toHours();
        String hoursAsAString = Long.toString(hours);

        if (hours == 1 || hours == 21) {
            return hoursAsAString + " час назад";
        }

        if ((hours > 1 && hours < 5) || (hours > 21 && hours < 24 )) {
            return hours + " часа назад";
        }

        return hours + " часов назад";
    }

}
