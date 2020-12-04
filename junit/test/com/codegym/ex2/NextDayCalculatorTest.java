package com.codegym.ex2;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {

    @Test
    void testCalculateNextDay1() {
        LocalDate localDate = LocalDate.of(2018, 1, 1);
        LocalDate expected = LocalDate.of(2018, 1, 2);
        LocalDate result = NextDayCalculator.calculateNextDay(localDate, 1);
        assertEquals(expected.getYear(), result.getYear());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getDayOfMonth(), result.getDayOfMonth());
    }

    @Test
    void testCalculateNextDay2() {
        LocalDate localDate = LocalDate.of(2018, 1, 31);
        LocalDate expected = LocalDate.of(2018, 2, 1);
        LocalDate result = NextDayCalculator.calculateNextDay(localDate, 1);
        assertEquals(expected.getYear(), result.getYear());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getDayOfMonth(), result.getDayOfMonth());
    }

    @Test
    void testCalculateNextDay3() {
        LocalDate localDate = LocalDate.of(2018, 4, 30);
        LocalDate expected = LocalDate.of(2018, 5, 1);
        LocalDate result = NextDayCalculator.calculateNextDay(localDate, 1);
        assertEquals(expected.getYear(), result.getYear());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getDayOfMonth(), result.getDayOfMonth());
    }

    @Test
    void testCalculateNextDay4() {
        LocalDate localDate = LocalDate.of(2018, 2, 28);
        LocalDate expected = LocalDate.of(2018, 3, 1);
        LocalDate result = NextDayCalculator.calculateNextDay(localDate, 1);
        assertEquals(expected.getYear(), result.getYear());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getDayOfMonth(), result.getDayOfMonth());
    }

    @Test
    void testCalculateNextDay5() {
        LocalDate localDate = LocalDate.of(2020, 2, 29);
        LocalDate expected = LocalDate.of(2020, 3, 1);
        LocalDate result = NextDayCalculator.calculateNextDay(localDate, 1);
        assertEquals(expected.getYear(), result.getYear());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getDayOfMonth(), result.getDayOfMonth());
    }

    @Test
    void testCalculateNextDay6() {
        LocalDate localDate = LocalDate.of(2018, 12, 31);
        LocalDate expected = LocalDate.of(2019, 1, 1);
        LocalDate result = NextDayCalculator.calculateNextDay(localDate, 1);
        assertEquals(expected.getYear(), result.getYear());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getDayOfMonth(), result.getDayOfMonth());
    }
}