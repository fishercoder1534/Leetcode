package com.fishercoder;

import com.fishercoder.solutions._1185;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1185Test {
    private static _1185.Solution1 solution1;

    @BeforeClass
    public static void setup() {
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