package com.fishercoder;

import com.fishercoder.solutions._1344;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1344Test {
    private static _1344.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1344.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(165, solution1.angleClock(12, 30), 0);
    }

    @Test
    public void test2() {
        assertEquals(75, solution1.angleClock(3, 30), 0);
    }

    @Test
    public void test3() {
        assertEquals(155, solution1.angleClock(4, 50), 0);
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.angleClock(12, 0), 0);
    }

    @Test
    public void test5() {
        assertEquals(76.5, solution1.angleClock(1, 57), 0);
    }

}