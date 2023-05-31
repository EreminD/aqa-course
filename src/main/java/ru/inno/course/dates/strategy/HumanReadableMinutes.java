package ru.inno.course.dates.strategy;

import java.time.Duration;

public class HumanReadableMinutes implements HumanReadableUnit{
    @Override
    public String parse(Duration d) {
        long minutes = d.toMinutes();
        String minsAsAString = Long.toString(minutes);

        if (minutes == 0) {
             return "только что";
        }

        if (minutes > 4 && minutes < 21){
            return  minutes + " минут назад";
        }

        if(minsAsAString.endsWith("1")){ // 11 ???
            return minsAsAString + " минуту назад";
        }

        if (minsAsAString.endsWith("2") || minsAsAString.endsWith("3") || minsAsAString.endsWith("4")){
            return  minutes + " минуты назад";
        }

        return  minutes + " минут назад";
    }
}
