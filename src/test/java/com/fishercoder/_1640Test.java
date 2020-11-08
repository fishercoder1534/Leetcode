package com.fishercoder;

import com.fishercoder.solutions._1640;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1640Test {
    private static _1640.Solution1 solution1;
    private static int[] arr;
    private static int[][] pieces;

    @BeforeClass
    public static void setup() {
        solution1 = new _1640.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{85};
        pieces = new int[][]{{85}};
        assertEquals(true, solution1.canFormArray(arr, pieces));
    }

    @Test
    public void test2() {
        arr = new int[]{91, 4, 64, 78};
        pieces = new int[][]{{78}, {4, 64}, {91}};
        assertEquals(true, solution1.canFormArray(arr, pieces));
    }

    @Test
    public void test3() {
        arr = new int[]{49, 18, 16};
        pieces = new int[][]{{16, 18, 49}};
        assertEquals(false, solution1.canFormArray(arr, pieces));
    }
}