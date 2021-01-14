package com.fishercoder;

import com.fishercoder.solutions._881;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _881Test {
    private static _881.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _881.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.numRescueBoats(new int[]{1, 2}, 3));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.numRescueBoats(new int[]{3, 2, 2, 1}, 3));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.numRescueBoats(new int[]{3, 5, 3, 4}, 5));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.numRescueBoats(new int[]{2, 4}, 5));
    }

    @Test
    public void test5() {
        assertEquals(29, solution1.numRescueBoats(new int[]{4, 9, 3, 1, 1, 7, 6, 10, 10, 10, 1, 8, 8, 7, 8, 10, 7, 4, 6, 3, 6, 1, 2, 4, 8, 8, 4, 7, 1, 2, 10, 3, 4, 6, 3, 5, 3, 1, 2, 6, 1, 5, 4, 5, 1, 10, 5, 9, 10, 4}, 10));
    }

}