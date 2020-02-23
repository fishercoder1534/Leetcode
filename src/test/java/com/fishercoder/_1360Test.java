package com.fishercoder;

import com.fishercoder.solutions._1360;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1360Test {
    private static _1360.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1360.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    @Test
    public void test2() {
        assertEquals(15, solution1.daysBetweenDates("2020-01-15", "2019-12-31"));
    }

}