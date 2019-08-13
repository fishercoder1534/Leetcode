package com.fishercoder;

import com.fishercoder.solutions._1089;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1089Test {
    private static _1089.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1089.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        solution1.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr);
    }

    @Test
    public void test2() {
        arr = new int[]{1, 2, 3};
        solution1.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

}
