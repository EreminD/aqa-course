package ru.inno.course.dates;

import ru.inno.course.dates.strategy.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class HumanReadableTimestampImpl implements HumanReadableTimestamp{

    private Map<String, HumanReadableUnit> parsers;

    public HumanReadableTimestampImpl() {
        parsers = new HashMap<>();
        parsers.put("m", new HumanReadableMinutes());
        parsers.put("h", new HumanReadableHours());
        parsers.put("d", new HumanReadableDays());
        parsers.put("w", new HumanReadableWeek());
    }

    @Override
    public String getTimestamp(LocalDateTime eventTimestamp) {
        checkDate(eventTimestamp);
        Duration duration = Duration.between(eventTimestamp, LocalDateTime.now());

        String key = "w";

        if (duration.toHours() == 0){
            key = "m";
        }

        if (duration.toDays() < 7) {
            key = "d";
        }

        if(duration.toDays() == 0){
            key = "h";
            new HumanReadableMinutes().parse(duration);
        }

        return parsers.get(key).parse(duration);
    }

    private void checkDate(LocalDateTime eventTimestamp) {
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(eventTimestamp)){
            throw new IllegalArgumentException("Передана дата из будущего. " + eventTimestamp);
        }
    }
}
