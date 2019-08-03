package com.fishercoder;

import com.fishercoder.solutions._1122;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1122Test {
    private static _1122.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1122.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}, solution1.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6}));
    }

}