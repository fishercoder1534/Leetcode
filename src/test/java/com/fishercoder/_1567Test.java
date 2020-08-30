package com.fishercoder;

import com.fishercoder.solutions._1567;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1567Test {
    private static _1567.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1567.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.getMaxLen(new int[]{1, -2, -3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.getMaxLen(new int[]{0, 1, -2, -3, -4}));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.getMaxLen(new int[]{-1, -2, -3, 0, 1}));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.getMaxLen(new int[]{-1, 2}));
    }

    @Test
    public void test5() {
        assertEquals(4, solution1.getMaxLen(new int[]{1, 2, 3, 5, -6, 4, 0, 10}));
    }

    @Test
    public void test6() {
        assertEquals(0, solution1.getMaxLen(new int[]{-1}));
    }

}