package com.fishercoder;

import com.fishercoder.solutions._29;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _29Test {
    private static _29.Solution1 solution1;
    private static _29.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _29.Solution1();
        solution2 = new _29.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.divide(4, 3));
    }

    @Test
    public void test2() {
        assertEquals(Integer.MAX_VALUE, solution1.divide(Integer.MIN_VALUE, -1));
    }

    @Test
    public void test3() {
        assertEquals(3, solution2.divide(10, 3));
    }
}
