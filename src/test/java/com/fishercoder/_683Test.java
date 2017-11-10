package com.fishercoder;

import com.fishercoder.solutions._683;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _683Test {
    private static _683.Solution1 solution1;
    private static int[] flowers;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _683.Solution1();
    }

    @Test
    public void test1() {
        flowers = new int[]{1, 3, 2};
        k = 1;
        assertEquals(2, solution1.kEmptySlots(flowers, k));
    }

    @Test
    public void test2() {
        flowers = new int[]{1, 2, 3};
        k = 1;
        assertEquals(-1, solution1.kEmptySlots(flowers, k));
    }

}