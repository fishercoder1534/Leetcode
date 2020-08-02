package com.fishercoder;

import com.fishercoder.solutions._1535;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1535Test {
    private static _1535.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1535.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{2, 1, 3, 5, 4, 6, 7};
        assertEquals(5, solution1.getWinner(arr, 2));
    }

    @Test
    public void test2() {
        arr = new int[]{1, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        assertEquals(99, solution1.getWinner(arr, 100));
    }

    @Test
    public void test3() {
        arr = new int[]{1, 9, 8, 2, 3, 7, 6, 4, 5};
        assertEquals(9, solution1.getWinner(arr, 7));
    }

}