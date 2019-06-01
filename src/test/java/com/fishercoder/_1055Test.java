package com.fishercoder;

import com.fishercoder.solutions._1055;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1055Test {
    private static _1055.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1055.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.fixedPoint(new int[]{-10, -5, 0, 3, 7}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.fixedPoint(new int[]{0, 2, 5, 8, 17}));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.fixedPoint(new int[]{-10, -5, 3, 4, 7, 9}));
    }

}