package com.fishercoder;

import com.fishercoder.solutions._650;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _650Test {
    private static _650.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _650.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minSteps(3));
    }

    @Test
    public void test2() {
        assertEquals(9, solution1.minSteps(20));
    }

    @Test
    public void test3() {
        assertEquals(19, solution1.minSteps(19));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.minSteps(1));
    }

    @Test
    public void test5() {
        assertEquals(35, solution1.minSteps(741));
    }
}
