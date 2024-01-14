package com.fishercoder;

import com.fishercoder.solutions._2224;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2224Test {
    private static _2224.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2224.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.convertTime("02:30", "04:35"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.convertTime("11:00", "11:01"));
    }

}
