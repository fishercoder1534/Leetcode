package com.fishercoder;

import com.fishercoder.solutions._1207;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1207Test {
    private static _1207.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1207.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{1, 2, 2, 1, 1, 3};
        assertEquals(true, solution1.uniqueOccurrences(arr));
    }

    @Test
    public void test2() {
        arr = new int[]{1, 2};
        assertEquals(false, solution1.uniqueOccurrences(arr));
    }

    @Test
    public void test3() {
        arr = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        assertEquals(true, solution1.uniqueOccurrences(arr));
    }
}
