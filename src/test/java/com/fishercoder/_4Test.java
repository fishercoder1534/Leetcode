package com.fishercoder;

import com.fishercoder.solutions._4;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _4Test {
    private static _4.Solution1 solution1;
    private static _4.Solution2 solution2;
    private static int[] A;
    private static int[] B;

    @BeforeClass
    public static void setup() {
        solution1 = new _4.Solution1();
        solution2 = new _4.Solution2();
    }

    @Test
    public void test1() {
        A = new int[]{1, 3};
        B = new int[]{2};
        assertEquals(2.0, solution1.findMedianSortedArrays(A, B), 0.0);
        assertEquals(2.0, solution2.findMedianSortedArrays(A, B), 0.0);
    }

    @Test
    public void test2() {
        A = new int[]{1, 2};
        B = new int[]{3, 4};
        assertEquals(2.5, solution1.findMedianSortedArrays(A, B), 0.0);
        assertEquals(2.5, solution2.findMedianSortedArrays(A, B), 0.0);
    }

}