package com.fishercoder;

import com.fishercoder.solutions._961;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _961Test {
    private static _961.Solution1 solution1;
    private static int[] A;

    @BeforeClass
    public static void setup() {
        solution1 = new _961.Solution1();
    }

    @Test
    public void test1() {
        A = new int[]{1, 2, 3, 3};
        assertEquals(3, solution1.repeatedNTimes(A));
    }

    @Test
    public void test2() {
        A = new int[]{2, 1, 2, 5, 3, 2};
        assertEquals(2, solution1.repeatedNTimes(A));
    }

    @Test
    public void test3() {
        A = new int[]{5, 1, 5, 2, 5, 3, 5, 4};
        assertEquals(5, solution1.repeatedNTimes(A));
    }

}