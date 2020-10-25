package com.fishercoder;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fishercoder.solutions._66;

public class _66Test {
    private static _66.Solution1 solution1;
    private static _66.Solution2 solution2;
    private static int[] digits;

    @BeforeClass
    public static void setup() {
        solution1 = new _66.Solution1();
        solution2 = new _66.Solution2();
    }

    @Test
    public void test1() {
        digits = new int[]{9, 9, 9, 9};
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, solution1.plusOne(digits));
    }

    @Test
    public void test2() {
        digits = new int[]{8, 9, 9, 9};
        assertArrayEquals(new int[]{9, 0, 0, 0}, solution1.plusOne(digits));
    }

    @Test
    public void test3() {
        digits = new int[]{2, 4, 9, 3, 9};
        assertArrayEquals(new int[]{2, 4, 9, 4, 0}, solution1.plusOne(digits));
    }

    @Test
    public void test4() {
        digits = new int[]{9, 9, 9, 9, 9};
        assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0}, solution2.plusOne(digits));
    }

    @Test
    public void test5() {
        digits = new int[]{8, 9, 9, 9, 9};
        assertArrayEquals(new int[]{9, 0, 0, 0, 0}, solution2.plusOne(digits));
    }

    @Test
    public void test6() {
        digits = new int[]{2, 4, 9, 4, 9};
        assertArrayEquals(new int[]{2, 4, 9, 5, 0}, solution2.plusOne(digits));
    }

}
