package com.fishercoder;

import com.fishercoder.solutions._836;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _836Test {
    private static _836.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _836.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}));
    }
}
