package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2409;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2409Test {
    private _2409.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2409.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.countDaysTogether("08-15", "08-18", "08-16", "08-19"));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }

    @Test
    public void test3() {
        assertEquals(49, solution1.countDaysTogether("09-01", "10-19", "06-19", "10-20"));
    }

    @Test
    public void test4() {
        assertEquals(27, solution1.countDaysTogether("08-06", "12-08", "08-06", "09-01"));
    }

    @Test
    public void test5() {
        assertEquals(27, solution1.countDaysTogether("08-06", "12-08", "02-04", "09-01"));
    }

}
