package com.fishercoder;

import com.fishercoder.solutions._1018;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class _1018Test {
    private static _1018.Solution1 solution1;
    private static int[] A;

    @BeforeClass
    public static void setup() {
        solution1 = new _1018.Solution1();
    }

    @Test
    public void test1() {
        A = new int[]{0, 1, 1};
        assertEquals(Arrays.asList(true, false, false), solution1.prefixesDivBy5(A));
    }

    @Test
    public void test2() {
        A = new int[]{1, 1, 1};
        assertEquals(Arrays.asList(false, false, false), solution1.prefixesDivBy5(A));
    }

    @Test
    public void test3() {
        A = new int[]{0, 1, 1, 1, 1, 1};
        assertEquals(Arrays.asList(true, false, false, false, true, false), solution1.prefixesDivBy5(A));
    }

    @Test
    public void test4() {
        A = new int[]{1, 1, 1, 0, 1};
        assertEquals(Arrays.asList(false, false, false, false, false), solution1.prefixesDivBy5(A));
    }

    @Test
    public void test5() {
        A = new int[]{1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        assertEquals(Arrays.asList(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, true, true, true, false), solution1.prefixesDivBy5(A));
    }

}