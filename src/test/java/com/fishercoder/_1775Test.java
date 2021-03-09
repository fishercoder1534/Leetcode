package com.fishercoder;

import com.fishercoder.solutions._1775;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1775Test {
    private static _1775.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1775.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minOperations(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 1, 2, 2, 2, 2}));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.minOperations(new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{6}));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.minOperations(new int[]{6, 6}, new int[]{1}));
    }

}
