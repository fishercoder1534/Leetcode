package com.fishercoder;

import com.fishercoder.solutions._1287;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1287Test {
    private static _1287.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1287.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.findSpecialInteger(new int[]{1}));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.findSpecialInteger(new int[]{1, 2, 3, 3}));
    }

}
