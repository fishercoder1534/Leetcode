package com.fishercoder;

import com.fishercoder.solutions._1904;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1904Test {
    private static _1904.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1904.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.numberOfRounds("12:01", "12:44"));
    }

    @Test
    public void test2() {
        assertEquals(95, solution1.numberOfRounds("00:01", "00:00"));
    }

    @Test
    public void test3() {
        assertEquals(40, solution1.numberOfRounds("20:00", "06:00"));
    }

    @Test
    public void test4() {
        assertEquals(55, solution1.numberOfRounds("04:54", "18:51"));
    }

    @Test
    public void test5() {
        assertEquals(0, solution1.numberOfRounds("23:46", "00:01"));
    }

    @Test
    public void test6() {
        assertEquals(39, solution1.numberOfRounds("18:51", "04:54"));
    }

    @Test
    public void test9() {
        assertEquals(39, solution1.numberOfRounds("18:51", "04:50"));
    }

    @Test
    public void test7() {
        assertEquals(2, solution1.numberOfRounds("00:01", "00:57"));
    }

    @Test
    public void test8() {
        assertEquals(6, solution1.numberOfRounds("00:01", "01:57"));
    }

}