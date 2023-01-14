package com.fishercoder;

import com.fishercoder.solutions._2433;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _2433Test {
    private static _2433.Solution1 solution1;
    private static int[] pref;

    @BeforeClass
    public static void setup() {
        solution1 = new _2433.Solution1();
    }

    @Test
    public void test1() {
        pref = new int[]{5, 2, 0, 3, 1};
        assertArrayEquals(new int[]{5, 7, 2, 3, 2}, solution1.findArray(pref));
    }

}