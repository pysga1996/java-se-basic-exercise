package com.codegym.ex2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NextDayCalculator {

    public static LocalDate calculateNextDay(LocalDate localDate, long unit) {
        return localDate.plus(unit, ChronoUnit.DAYS);
    }
}
