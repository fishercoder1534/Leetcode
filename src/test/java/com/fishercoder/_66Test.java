package com.fishercoder;

import com.fishercoder.solutions._66;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _66Test {
    private static _66.Solution1 solution1;
    private static int[] digits;

    @BeforeClass
    public static void setup() {
        solution1 = new _66.Solution1();
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
}
