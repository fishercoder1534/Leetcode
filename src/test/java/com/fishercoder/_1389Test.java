package com.fishercoder;

import com.fishercoder.solutions._1389;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1389Test {
    private static _1389.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1389.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 4, 1, 3, 2}, solution1.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, solution1.createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1}, solution1.createTargetArray(new int[]{1}, new int[]{0}));
    }

}