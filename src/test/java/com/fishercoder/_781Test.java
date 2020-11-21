package com.fishercoder;

import com.fishercoder.solutions._781;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _781Test {
    private static _781.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _781.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.numRabbits(new int[]{1, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(11, solution1.numRabbits(new int[]{10, 10, 10}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.numRabbits(new int[]{}));
    }

    @Test
    public void test4() {
        assertEquals(5, solution1.numRabbits(new int[]{1, 0, 1, 0, 0}));
    }

    @Test
    public void test5() {
        assertEquals(7, solution1.numRabbits(new int[]{1, 1, 1, 2, 2, 2}));
    }

    @Test
    public void test6() {
        assertEquals(13, solution1.numRabbits(new int[]{2, 1, 2, 2, 2, 2, 2, 2, 1, 1}));
    }
}
