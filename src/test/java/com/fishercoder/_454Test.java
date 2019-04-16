package com.fishercoder;

import com.fishercoder.solutions._454;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _454Test {
    private static _454.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[] A;
    private static int[] B;
    private static int[] C;
    private static int[] D;

    @BeforeClass
    public static void setup() {
        solution1 = new _454.Solution1();
    }

    @Test
    public void test1() {
        A = new int[]{1, 2};
        B = new int[]{-2, -1};
        C = new int[]{-1, 2};
        D = new int[]{0, 2};
        expected = 2;
        actual = solution1.fourSumCount(A, B, C, D);
        assertEquals(expected, actual);

    }
}
