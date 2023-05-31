package ru.inno.course.dates.strategy;

import java.time.Duration;

public interface HumanReadableUnit {

    String parse(Duration d);
}
