package com.fishercoder;

import com.fishercoder.solutions._1186;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _1186Test {
    private static _1186.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1186.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{1, -2, 0, 3};
        assertEquals(4, solution1.maximumSum(arr));
    }

    @Test
    public void test2() {
        arr = new int[]{1, -2, -2, 3};
        assertEquals(3, solution1.maximumSum(arr));
    }

    @Test
    public void test3() {
        arr = new int[]{-1, -1, -1, -1};
        assertEquals(-1, solution1.maximumSum(arr));
    }

    @Test
    public void test4() {
        arr = new int[]{0, 3, -1, 2, 3, -9, 3};
        assertEquals(10, solution1.maximumSum(arr));
    }

    @Test
    public void test5() {
        arr = new int[]{0, 3, -1, 2, 3, -1, 3};
        assertEquals(10, solution1.maximumSum(arr));
    }

    @Test
    public void test6() {
        arr = new int[]{0, 3, -1, 2, 3, -1, -3};
        assertEquals(8, solution1.maximumSum(arr));
    }

}