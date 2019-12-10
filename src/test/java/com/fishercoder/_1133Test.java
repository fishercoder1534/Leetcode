package com.fishercoder;

import com.fishercoder.solutions._1133;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1133Test {
    private static _1133.Solution1 solution1;
    private static _1133.Solution2 solution2;
    private static int[] A;

    @BeforeClass
    public static void setup() {
        solution1 = new _1133.Solution1();
        solution2 = new _1133.Solution2();
    }

    @Test
    public void test1() {
        A = new int[]{5, 7, 3, 9, 4, 9, 8, 3, 1};
        assertEquals(8, solution1.largestUniqueNumber(A));
        assertEquals(8, solution2.largestUniqueNumber(A));
    }

    @Test
    public void test2() {
        A = new int[]{9, 9, 8, 8};
        assertEquals(-1, solution1.largestUniqueNumber(A));
        assertEquals(-1, solution2.largestUniqueNumber(A));
    }

}