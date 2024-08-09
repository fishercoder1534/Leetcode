package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1185;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1185Test {
    private _1185.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1185.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("Saturday", solution1.dayOfTheWeek(3, 8, 2019));
    }

    @Test
    public void test2() {
        assertEquals("Sunday", solution1.dayOfTheWeek(18, 7, 1999));
    }

    @Test
    public void test3() {
        assertEquals("Sunday", solution1.dayOfTheWeek(15, 8, 1993));
    }

}