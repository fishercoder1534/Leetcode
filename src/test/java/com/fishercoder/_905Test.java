package com.fishercoder;

import com.fishercoder.solutions._905;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class _905Test {
    private static _905.Solution1 solution1;
    private static _905.Solution2 solution2;
    private static int[] A;
    private static int[] actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _905.Solution1();
        solution2 = new _905.Solution2();
    }

    @Test
    public void test1() {
        A = new int[]{3, 1, 2, 4};
        actual = solution1.sortArrayByParity(A);
        assertEquals(A, actual);
        actual = solution2.sortArrayByParity(A);
        assertEquals(A, actual);
    }

    @Test
    public void test2() {
        A = new int[]{1, 3};
        actual = solution1.sortArrayByParity(A);
        assertEquals(A, actual);
        actual = solution2.sortArrayByParity(A);
        assertEquals(A, actual);
    }
}
