package com.fishercoder;

import com.fishercoder.solutions._84;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _84Test {
    private static _84.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _84.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, (solution1.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3})));
    }

}
